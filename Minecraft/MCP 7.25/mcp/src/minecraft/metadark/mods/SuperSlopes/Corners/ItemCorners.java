package metadark.mods.SuperSlopes.Corners;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemCorners extends ItemBlock
{
    private static final String[] Kaevator_Materials = new String[] {"QuadriCornerDown", "QuadriCornerDown", "QuadriCornerDown", "QuadriCornerDown", "QuadriCornerUp", "QuadriCornerUp", "QuadriCornerUp", "QuadriCornerUp", "TriCornerDown", "TriCornerDown", "TriCornerDown", "TriCornerDown", "TriCornerUp", "TriCornerUp", "TriCornerUp", "TriCornerUp"};
    private String material;

    public ItemCorners(final int itemID, final String material) {
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

        if (Corners.props.getBoolean("BlockInversion"))
            items.add(new ItemStack(itemID, 1, 4));

        items.add(new ItemStack(itemID, 1, 8));

        if (Corners.props.getBoolean("BlockInversion"))
            items.add(new ItemStack(itemID, 1, 12));
    }
}
