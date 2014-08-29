package metadark.mods.SuperSlopes.IntCorners;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import java.util.List;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;

public class ItemIntCorners extends ItemBlock
{
    public static final String[] Kaevator_Materials = new String[] {"TruncCornerDown", "TruncCornerDown", "TruncCornerDown", "TruncCornerDown", "TruncCornerUp", "TruncCornerUp", "TruncCornerUp", "TruncCornerUp", "InvCornerDown", "InvCornerDown", "InvCornerDown", "InvCornerDown", "InvCornerUp", "InvCornerUp", "InvCornerUp", "InvCornerUp"};
    private String material;

    public ItemIntCorners(int var1, String var2)
    {
        super(var1);
        this.material = var2;
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    public int func_77647_b(int var1)
    {
        return var1;
    }

    public String func_77667_c(ItemStack var1)
    {
        return "Kaev" + this.material + "Slopes" + Kaevator_Materials[var1.getItemDamage()];
    }

    @SideOnly(Side.CLIENT)
    public CreativeTabs func_77640_w()
    {
        return CreativeTabs.tabBlock;
    }

    @SideOnly(Side.CLIENT)
    public void func_77633_a(int var1, CreativeTabs var2, List var3)
    {
        var3.add(new ItemStack(var1, 1, 0));

        if (IntCorners.props.getBoolean("BlockInversion"))
        {
            var3.add(new ItemStack(var1, 1, 4));
        }

        var3.add(new ItemStack(var1, 1, 8));

        if (IntCorners.props.getBoolean("BlockInversion"))
        {
            var3.add(new ItemStack(var1, 1, 12));
        }
    }
}
