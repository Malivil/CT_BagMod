package metadark.mods.SuperSlopes.IntCorners;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemIntCorners extends ItemBlock
{
    private static final String[] Kaevator_Materials = new String[] {"TruncCornerDown", "TruncCornerDown", "TruncCornerDown", "TruncCornerDown", "TruncCornerUp", "TruncCornerUp", "TruncCornerUp", "TruncCornerUp", "InvCornerDown", "InvCornerDown", "InvCornerDown", "InvCornerDown", "InvCornerUp", "InvCornerUp", "InvCornerUp", "InvCornerUp"};
    private String material;

    public ItemIntCorners(final int itemID, final String material) {
        super(itemID);
        this.material = material;
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    @Override
    public int getMetadata(final int meta) {
        return meta;
    }

    @Override
    public String getItemNameIS(final ItemStack item) {
        return "Kaev" + this.material + "Slopes" + Kaevator_Materials[item.getItemDamage()];
    }

    @SideOnly(Side.CLIENT)
    @Override
    public CreativeTabs getCreativeTab() {
        return CreativeTabs.tabBlock;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void getSubItems(final int itemID, final CreativeTabs tabs, final List items) {
        items.add(new ItemStack(itemID, 1, 0));

        if (IntCorners.props.getBoolean("BlockInversion"))
            items.add(new ItemStack(itemID, 1, 4));

        items.add(new ItemStack(itemID, 1, 8));

        if (IntCorners.props.getBoolean("BlockInversion"))
            items.add(new ItemStack(itemID, 1, 12));
    }
}
