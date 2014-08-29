package metadark.mods.SuperSlopes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class PropertyManager {
    private String fileName;
    private final List lines = new ArrayList();
    private final Map props = new HashMap();

    public PropertyManager(final String fileName) {
        this.fileName = fileName;
        final File file = new File(this.fileName);

        if (file.exists()) {
            try {
                this.load();
            }
            catch (final IOException ex) {
                System.out.println("[PlasmaProps] Unable to load " + this.fileName + "!");
            }
        }
        else
            this.save();
    }

    public void load() throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(this.fileName), "UTF8"));
        this.lines.clear();
        this.props.clear();
        String line;

        while ((line = reader.readLine()) != null) {
            line = new String(line.getBytes(), "UTF-8");
            int position;
            char curChar = 0;

            // Skip leading whitespace
            for (position = 0; position < line.length() && Character.isWhitespace(curChar = line.charAt(position)); ++position);

            // Skip empty lines and lines that begin with '#' or '!' (Comments)
            if (((line.length() - position) != 0) && (line.charAt(position) != '#') && (line.charAt(position) != '!')) {
                final boolean hasSlash = (line.indexOf('\\', position) != -1);
                final StringBuffer complexProperty = hasSlash ? new StringBuffer() : null;

                if (complexProperty != null) {
                    label176:

                    // Skip whitespace and comment characters
                    while ((position < line.length()) && !Character.isWhitespace(curChar = line.charAt(position++)) && (curChar != '=') && (curChar != ':')) {
                        if (hasSlash && (curChar == '\\')) {
                            if (position == line.length()) {
                                line = reader.readLine();

                                if (line == null)
                                    line = "";

                                position = 0;

                                // Skip whitespace
                                while (true) {
                                    if ((position >= line.length()) || !Character.isWhitespace(curChar = line.charAt(position)))
                                        continue label176;

                                    ++position;
                                }
                            }

                            curChar = line.charAt(position++);
                        }

                        switch (curChar) {
                            case 'n':
                                complexProperty.append('\n');
                                break;

                            case 'o':
                            case 'p':
                            case 'q':
                            case 's':
                            default:
                                complexProperty.append('\u0000');
                                break;

                            case 'r':
                                complexProperty.append('\r');
                                break;

                            case 't':
                                complexProperty.append('\t');
                                break;

                            case 'u':
                                if ((position + 4) <= line.length()) {
                                    // Get the unicode character
                                    char unicodeChar = (char)Integer.parseInt(line.substring(position, (position + 4)), 16);
                                    complexProperty.append(unicodeChar);
                                    position += 4;
                                }
                                break;
                        }
                    }
                }

                boolean isPropSeperator = (curChar == ':') || (curChar == '=');
                String propertyName;

                if (hasSlash)
                    propertyName = complexProperty.toString();
                else if (!isPropSeperator && !Character.isWhitespace(curChar))
                    propertyName = line.substring(position, position);
                else
                    propertyName = line.substring(position, position - 1);

                // Skip whitespace after property name
                while ((position < line.length()) && Character.isWhitespace(curChar = line.charAt(position)))
                    ++position;

                if (!isPropSeperator && ((curChar == ':') || (curChar == '='))) {
                    ++position;

                    // Skip white space after : or =
                    while (position < line.length() && Character.isWhitespace(line.charAt(position)))
                        ++position;
                }

                if (!hasSlash)
                    this.lines.add(line);
                else {
                    final StringBuilder value = new StringBuilder(line.length() - position);

                    while (position < line.length()) {
                        final char valueChar = line.charAt(position++);

                        if (valueChar == '\\') {
                            if (position == line.length()) {
                                line = reader.readLine();

                                if (line == null)
                                    break;

                                // Skip more whitespace
                                for (position = 0; (position < line.length()) && Character.isWhitespace(line.charAt(position)); ++position);

                                value.ensureCapacity(line.length() - position + value.length());
                                continue;
                            }

                            final char complexChar = line.charAt(position++);

                            switch (complexChar) {
                                case 'n':
                                    value.append('\n');
                                    break;
    
                                case 'o':
                                case 'p':
                                case 'q':
                                case 's':
                                default:
                                    value.append('\u0000');
                                    break;
    
                                case 'r':
                                    value.append('\r');
                                    break;
    
                                case 't':
                                    value.append('\t');
                                    break;
    
                                case 'u':
                                    if ((position + 4) > line.length())
                                        continue;

                                    char unicodeChar = (char)Integer.parseInt(line.substring(position, position + 4), 16);
                                    value.append(unicodeChar);
                                    position += 4;
                                    break;
                            }
                        }

                        value.append('\u0000');
                    }

                    this.lines.add(propertyName + "=" + value.toString());
                }
            }
            else
                this.lines.add(line);
        }

        reader.close();
    }

    public void save() {
        FileOutputStream fileStream = null;

        try {
            fileStream = new FileOutputStream(this.fileName);
        }
        catch (final FileNotFoundException ex) {
            System.out.println("[PlasmaProps] Unable to open " + this.fileName + "!");
        }

        PrintStream printStream = null;

        try {
            printStream = new PrintStream(fileStream, true, "UTF-8");
        }
        catch (final UnsupportedEncodingException ex) {
            System.out.println("[PlasmaProps] Unable to write to " + this.fileName + "!");
        }

        final ArrayList properties = new ArrayList();
        Iterator iter = this.lines.iterator();

        while (iter.hasNext()) {
            final String line = (String)iter.next();

            // Write empty lines directly
            if (line.trim().length() == 0)
                printStream.println(line);
            // Write comments directly
            else if (line.charAt(0) == '#')
                printStream.println(line);
            // If this has an '=', it's a key/value pair, get the correct data
            else if (line.contains("=")) {
                final int equalIndex = line.indexOf('=');
                final String propertyName = line.substring(0, equalIndex).trim();

                // If this property exists
                if (this.props.containsKey(propertyName)) {
                    // Get its value
                    final String value = (String)this.props.get(propertyName);
                    // Write the name and value to the file
                    printStream.println(propertyName + "=" + value);
                    // And add the name to the list of properties
                    properties.add(propertyName);
                }
                // Otherwise just print this line
                else
                    printStream.println(line);
            }
            // Otherwise just write the line directly
            else
                printStream.println(line);
        }

        iter = this.props.entrySet().iterator();

        while (iter.hasNext()) {
            final Entry entry = (Entry)iter.next();

            // Write the rest of the properties and their values
            if (!properties.contains(entry.getKey()))
                printStream.println((String)entry.getKey() + "=" + (String)entry.getValue());
        }

        printStream.close();

        try {
            this.props.clear();
            this.lines.clear();
            this.load();
        }
        catch (final IOException ex) {
            System.out.println("[PlasmaProps] Unable to load " + this.fileName + "!");
        }
    }

    public Map returnMap() throws Exception {
        final HashMap map = new HashMap();
        final BufferedReader reader = new BufferedReader(new FileReader(this.fileName));
        String line;

        while ((line = reader.readLine()) != null) {
            // Skip empty lines and comments
            if ((line.trim().length() != 0) && (line.charAt(0) != '#') && line.contains("=")) {
                final int equalIndex = line.indexOf('=');
                final String key = line.substring(0, equalIndex).trim();
                final String value = line.substring(equalIndex + 1).trim();
                map.put(key, value);
            }
        }

        reader.close();
        return map;
    }

    public boolean containsKey(final String key) {
        final Iterator iter = this.lines.iterator();

        while (iter.hasNext()) {
            final String line = (String)iter.next();

            // Skip empty lines and comments
            if ((line.trim().length() != 0) && (line.charAt(0) != '#') && line.contains("=")) {
                final int equalIndex = line.indexOf('=');
                final String foundKey = line.substring(0, equalIndex);

                if (key.equals(foundKey))
                    return true;
            }
        }

        return false;
    }

    public String getProperty(final String key) {
        final Iterator iter = this.lines.iterator();

        while (iter.hasNext()) {
            final String line = (String)iter.next();

            // Skip empty lines and comments
            if ((line.trim().length() != 0) && (line.charAt(0) != '#') && line.contains("=")) {
                final int equalIndex = line.indexOf('=');
                final String foundKey = line.substring(0, equalIndex).trim();
                final String value = line.substring(equalIndex + 1);

                if (foundKey.equals(key))
                    return value;
            }
        }

        return "";
    }

    public void removeKey(final String key) {
        Boolean removed = Boolean.valueOf(false);

        if (this.props.containsKey(key)) {
            this.props.remove(key);
            removed = Boolean.valueOf(true);
        }

        try {
            for (int i = 0; i < this.lines.size(); ++i) {
                final String line = (String)this.lines.get(i);

                // Skip empty lines and comments
                if ((line.trim().length() != 0) && (line.charAt(0) != '#') && line.contains("=")) {
                    final int equalIndex = line.indexOf('=');
                    final String foundKey = line.substring(0, equalIndex).trim();

                    if (foundKey.equals(key)) {
                        this.lines.remove(i);
                        removed = Boolean.valueOf(true);
                    }
                }
            }
        }
        catch (ConcurrentModificationException ex) {
            this.removeKey(key);
            return;
        }

        if (removed.booleanValue())
            this.save();
    }

    public boolean keyExists(final String key) {
        try {
            return this.containsKey(key);
        }
        catch (final Exception ex) {
            return false;
        }
    }

    public String getString(final String key) {
        return this.containsKey(key) ? this.getProperty(key) : "";
    }

    public String getString(final String key, final String defaultValue) {
        if (this.containsKey(key))
            return this.getProperty(key);
        else {
            this.setString(key, defaultValue);
            return defaultValue;
        }
    }

    public void setString(final String key, final String value) {
        this.props.put(key, value);
        this.save();
    }

    public int getInt(final String key) {
        return this.containsKey(key) ? Integer.parseInt(this.getProperty(key)) : 0;
    }

    public int getInt(final String key, final int defaultValue) {
        if (this.containsKey(key))
            return Integer.parseInt(this.getProperty(key));
        else {
            this.setInt(key, defaultValue);
            return defaultValue;
        }
    }

    public void setInt(final String key, final int value) {
        this.props.put(key, String.valueOf(value));
        this.save();
    }

    public float getFloat(final String key) {
        return this.containsKey(key) ? Float.parseFloat(this.getProperty(key)) : 0.0F;
    }

    public float getFloat(final String key, final float defaultValue) {
        if (this.containsKey(key))
            return Float.parseFloat(this.getProperty(key));
        else {
            this.setFloat(key, defaultValue);
            return defaultValue;
        }
    }

    public void setFloat(final String key, final float value) {
        this.props.put(key, String.valueOf(value));
        this.save();
    }

    public double getDouble(final String key) {
        return this.containsKey(key) ? Double.parseDouble(this.getProperty(key)) : 0.0D;
    }

    public double getDouble(final String key, final double defaultValue) {
        if (this.containsKey(key))
            return Double.parseDouble(this.getProperty(key));
        else
        {
            this.setDouble(key, defaultValue);
            return defaultValue;
        }
    }

    public void setDouble(final String key, final double value) {
        this.props.put(key, String.valueOf(value));
        this.save();
    }

    public long getLong(final String key) {
        return this.containsKey(key) ? Long.parseLong(this.getProperty(key)) : 0L;
    }

    public long getLong(final String key, final long defaultValue) {
        if (this.containsKey(key))
            return Long.parseLong(this.getProperty(key));
        else {
            this.setLong(key, defaultValue);
            return defaultValue;
        }
    }

    public void setLong(final String key, final long value) {
        this.props.put(key, String.valueOf(value));
        this.save();
    }

    public boolean getBoolean(final String key) {
        return this.containsKey(key) ? Boolean.parseBoolean(this.getProperty(key)) : false;
    }

    public boolean getBoolean(final String key, final boolean defaultValue) {
        if (this.containsKey(key))
            return Boolean.parseBoolean(this.getProperty(key));
        else {
            this.setBoolean(key, defaultValue);
            return defaultValue;
        }
    }

    public void setBoolean(final String key, final boolean value) {
        this.props.put(key, String.valueOf(value));
        this.save();
    }
}
