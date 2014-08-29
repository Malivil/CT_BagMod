package metadark.mods.SuperSlopes.Corners;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockCorners extends Block {
    protected BlockCorners(final int blockID, final int meta, final Material material) {
        super(blockID, meta, material);
        this.setLightOpacity(Corners.LightOpacity);
    }

    @Override
    public int getRenderType() {
        return Corners.CornersRenderID;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public boolean shouldSideBeRendered(final IBlockAccess block, final int x, final int y, final int z, final int side) {
        return true;
    }

    @Override
    public void onBlockPlacedBy(final World world, final int x, final int y, final int z, final EntityLiving entityLiving) {
        final int meta = world.getBlockMetadata(x, y, z);
        final int side = MathHelper.floor_double((double)(entityLiving.rotationYaw * 4.0F / 360.0F)) & 3;

        if (side == 0)
            world.setBlockMetadataWithNotify(x, y, z, 2 + meta);
        else if (side == 1)
            world.setBlockMetadataWithNotify(x, y, z, 1 + meta);
        else if (side == 2)
            world.setBlockMetadataWithNotify(x, y, z, 3 + meta);
        else if (side == 3)
            world.setBlockMetadataWithNotify(x, y, z, 0 + meta);
    }

    @Override
    public int damageDropped(final int meta) {
        return meta != 0 && meta != 1 && meta != 2 && meta != 3 ? (meta != 4 && meta != 5 && meta != 6 && meta != 7 ? (meta != 8 && meta != 9 && meta != 10 && meta != 11 ? (meta != 12 && meta != 13 && meta != 14 && meta != 15 ? meta : 12) : 8) : 4) : 0;
    }

    @Override
    public void addCollidingBlockToList(final World world, final int x, final int y, final int z, final AxisAlignedBB axis, final List boxList, final Entity entity) {
        final int meta = world.getBlockMetadata(x, y, z) % 8;

        if (meta == 0) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, boxList, entity);
            this.setBlockBounds(0.5F, 0.5F, 0.5F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, boxList, entity);
        }
        else if (meta == 1) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, boxList, entity);
            this.setBlockBounds(0.0F, 0.5F, 0.0F, 0.5F, 1.0F, 0.5F);
            super.addCollidingBlockToList(world, x, y, z, axis, boxList, entity);
        }
        else if (meta == 2) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, boxList, entity);
            this.setBlockBounds(0.0F, 0.5F, 0.5F, 0.5F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, boxList, entity);
        }
        else if (meta == 3) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, boxList, entity);
            this.setBlockBounds(0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 0.5F);
            super.addCollidingBlockToList(world, x, y, z, axis, boxList, entity);
        }
        else if (meta == 4) {
            this.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, boxList, entity);
            this.setBlockBounds(0.5F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, boxList, entity);
        }
        else if (meta == 5) {
            this.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, boxList, entity);
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.5F);
            super.addCollidingBlockToList(world, x, y, z, axis, boxList, entity);
        }
        else if (meta == 6) {
            this.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, boxList, entity);
            this.setBlockBounds(0.0F, 0.0F, 0.5F, 0.5F, 0.5F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, boxList, entity);
        }
        else if (meta == 7) {
            this.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, boxList, entity);
            this.setBlockBounds(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
            super.addCollidingBlockToList(world, x, y, z, axis, boxList, entity);
        }

        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    @Override
    public void onBlockClicked(final World world, final int x, final int y, final int z, final EntityPlayer entityPlayer) {
        final int blockID = world.getBlockId(x, y, z);

        // If this is a wool-based block, let it be recolored by using a dye on it
        if (blockID == Corners.BlockKaevBlackWoolCorners.blockID     ||
            blockID == Corners.BlockKaevRedWoolCorners.blockID         ||
            blockID == Corners.BlockKaevGreenWoolCorners.blockID     ||
            blockID == Corners.BlockKaevBrownWoolCorners.blockID     ||
            blockID == Corners.BlockKaevBlueWoolCorners.blockID         ||
            blockID == Corners.BlockKaevPurpleWoolCorners.blockID     ||
            blockID == Corners.BlockKaevCyanWoolCorners.blockID         ||
            blockID == Corners.BlockKaevLightGrayWoolCorners.blockID     ||
            blockID == Corners.BlockKaevGrayWoolCorners.blockID         ||
            blockID == Corners.BlockKaevPinkWoolCorners.blockID         ||
            blockID == Corners.BlockKaevLimeWoolCorners.blockID         ||
            blockID == Corners.BlockKaevYellowWoolCorners.blockID     ||
            blockID == Corners.BlockKaevLightBlueWoolCorners.blockID ||
            blockID == Corners.BlockKaevMagentaWoolCorners.blockID     ||
            blockID == Corners.BlockKaevOrangeWoolCorners.blockID     ||
            blockID == Corners.BlockKaevWhiteWoolCorners.blockID) {
            final ItemStack item = entityPlayer.inventory.getCurrentItem();

            // If the user is holding an item, and it's dye
            if ((item != null) && (item.itemID == Item.dyePowder.shiftedIndex)) {
                final int meta = world.getBlockMetadata(x, y, z);

                // Set the ID of this block to the correct ID and the same meta, but only if the target type is enabled
                if ((item.getItemDamage() == 0) && (Corners.BlockKaevBlackWoolCorners.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevBlackWoolCorners.blockID, meta);
                else if ((item.getItemDamage() == 1) && (Corners.BlockKaevRedWoolCorners.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevRedWoolCorners.blockID, meta);
                else if ((item.getItemDamage() == 2) && (Corners.BlockKaevGreenWoolCorners.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevGreenWoolCorners.blockID, meta);
                else if ((item.getItemDamage() == 3) && (Corners.BlockKaevBrownWoolCorners.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevBrownWoolCorners.blockID, meta);
                else if ((item.getItemDamage() == 4) && (Corners.BlockKaevBlueWoolCorners.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevBlueWoolCorners.blockID, meta);
                else if ((item.getItemDamage() == 5) && (Corners.BlockKaevPurpleWoolCorners.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevPurpleWoolCorners.blockID, meta);
                else if ((item.getItemDamage() == 6) && (Corners.BlockKaevCyanWoolCorners.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevCyanWoolCorners.blockID, meta);
                else if ((item.getItemDamage() == 7) && (Corners.BlockKaevLightGrayWoolCorners.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevLightGrayWoolCorners.blockID, meta);
                else if ((item.getItemDamage() == 8) && (Corners.BlockKaevGrayWoolCorners.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevGrayWoolCorners.blockID, meta);
                else if ((item.getItemDamage() == 9) && (Corners.BlockKaevPinkWoolCorners.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevPinkWoolCorners.blockID, meta);
                else if ((item.getItemDamage() == 10) && (Corners.BlockKaevLimeWoolCorners.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevLimeWoolCorners.blockID, meta);
                else if ((item.getItemDamage() == 11) && (Corners.BlockKaevYellowWoolCorners.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevYellowWoolCorners.blockID, meta);
                else if ((item.getItemDamage() == 12) && (Corners.BlockKaevLightBlueWoolCorners.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevLightBlueWoolCorners.blockID, meta);
                else if ((item.getItemDamage() == 13) && (Corners.BlockKaevMagentaWoolCorners.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevMagentaWoolCorners.blockID, meta);
                else if ((item.getItemDamage() == 14) && (Corners.BlockKaevOrangeWoolCorners.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevOrangeWoolCorners.blockID, meta);
                else if ((item.getItemDamage() == 15) && (Corners.BlockKaevWhiteWoolCorners.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevWhiteWoolCorners.blockID, meta);
            }
        }
    }
}
