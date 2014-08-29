package metadark.mods.SuperSlopes.Slopes;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import java.util.List;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;

public class ItemSlopes extends ItemBlock
{
    public static final String[] Kaevator_Materials = new String[] {"StairsUp", "StairsUp", "StairsUp", "StairsUp", "SlopeDown", "SlopeDown", "SlopeDown", "SlopeDown", "SlopeUp", "SlopeUp", "SlopeUp", "SlopeUp", "SlopeSide", "SlopeSide", "SlopeSide", "SlopeSide"};
    private String material;

    public ItemSlopes(int var1, String var2)
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
        if (this.material != "Wood" && this.material != "Cobblestone" && this.material != "Sandstone" && this.material != "Bricks" && Slopes.props.getBoolean("BlockInversion"))
        {
            var3.add(new ItemStack(var1, 1, 0));
        }

        var3.add(new ItemStack(var1, 1, 4));

        if (Slopes.props.getBoolean("BlockInversion"))
        {
            var3.add(new ItemStack(var1, 1, 8));
        }

        var3.add(new ItemStack(var1, 1, 12));
    }
}
