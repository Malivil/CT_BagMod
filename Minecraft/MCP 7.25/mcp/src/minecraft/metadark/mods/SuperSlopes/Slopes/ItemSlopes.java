package metadark.mods.SuperSlopes.Slopes;

import java.util.Arrays;
import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSlopes extends ItemBlock {
    private static final String[] Kaevator_Materials = new String[] {"StairsUp", "StairsUp", "StairsUp", "StairsUp", "SlopeDown", "SlopeDown", "SlopeDown", "SlopeDown", "SlopeUp", "SlopeUp", "SlopeUp", "SlopeUp", "SlopeSide", "SlopeSide", "SlopeSide", "SlopeSide"};
    private static final String[] Vanilla_Stair_Materials = new String[] {"Wood", "Sandstone", "Cobblestone", "Bricks", "StoneBrick", "NetherBrick"};
    private String material;

    public ItemSlopes(final int itemID, final String material) {
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
        // Don't add stair sub-items for materials that already have vanilla stairs
        if (Slopes.props.getBoolean("BlockInversion") && !Arrays.asList(Vanilla_Stair_Materials).contains(this.material))
            items.add(new ItemStack(itemID, 1, 0));

        items.add(new ItemStack(itemID, 1, 4));

        if (Slopes.props.getBoolean("BlockInversion"))
            items.add(new ItemStack(itemID, 1, 8));

        items.add(new ItemStack(itemID, 1, 12));
    }
}
