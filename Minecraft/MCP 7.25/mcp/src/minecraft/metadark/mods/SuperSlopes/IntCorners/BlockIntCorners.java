package metadark.mods.SuperSlopes.IntCorners;

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

public class BlockIntCorners extends Block {
    protected BlockIntCorners(final int blockId, final int meta, final Material material) {
        super(blockId, meta, material);
        this.setLightOpacity(IntCorners.LightOpacity);
    }

    @Override
    public int getRenderType() {
        return IntCorners.IntCornersRenderID;
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
        if (blockID == IntCorners.BlockKaevBlackWoolIntCorners.blockID         ||
            blockID == IntCorners.BlockKaevRedWoolIntCorners.blockID         ||
            blockID == IntCorners.BlockKaevGreenWoolIntCorners.blockID         ||
            blockID == IntCorners.BlockKaevBrownWoolIntCorners.blockID         ||
            blockID == IntCorners.BlockKaevBlueWoolIntCorners.blockID         ||
            blockID == IntCorners.BlockKaevPurpleWoolIntCorners.blockID     ||
            blockID == IntCorners.BlockKaevCyanWoolIntCorners.blockID         ||
            blockID == IntCorners.BlockKaevLightGrayWoolIntCorners.blockID     ||
            blockID == IntCorners.BlockKaevGrayWoolIntCorners.blockID         ||
            blockID == IntCorners.BlockKaevPinkWoolIntCorners.blockID         ||
            blockID == IntCorners.BlockKaevLimeWoolIntCorners.blockID         ||
            blockID == IntCorners.BlockKaevYellowWoolIntCorners.blockID     ||
            blockID == IntCorners.BlockKaevLightBlueWoolIntCorners.blockID     ||
            blockID == IntCorners.BlockKaevMagentaWoolIntCorners.blockID     ||
            blockID == IntCorners.BlockKaevOrangeWoolIntCorners.blockID     ||
            blockID == IntCorners.BlockKaevWhiteWoolIntCorners.blockID) {
            final ItemStack item = entityPlayer.inventory.getCurrentItem();

            // If the user is holding an item, and it's dye
            if ((item != null) && (item.itemID == Item.dyePowder.shiftedIndex)) {
                final int var8 = world.getBlockMetadata(x, y, z);

                // Set the ID of this block to the correct ID and the same meta, but only if the target type is enabled
                if (item.getItemDamage() == 0 && IntCorners.BlockKaevBlackWoolIntCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, IntCorners.BlockKaevBlackWoolIntCorners.blockID, var8);
                else if (item.getItemDamage() == 1 && IntCorners.BlockKaevRedWoolIntCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, IntCorners.BlockKaevRedWoolIntCorners.blockID, var8);
                else if (item.getItemDamage() == 2 && IntCorners.BlockKaevGreenWoolIntCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, IntCorners.BlockKaevGreenWoolIntCorners.blockID, var8);
                else if (item.getItemDamage() == 3 && IntCorners.BlockKaevBrownWoolIntCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, IntCorners.BlockKaevBrownWoolIntCorners.blockID, var8);
                else if (item.getItemDamage() == 4 && IntCorners.BlockKaevBlueWoolIntCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, IntCorners.BlockKaevBlueWoolIntCorners.blockID, var8);
                else if (item.getItemDamage() == 5 && IntCorners.BlockKaevPurpleWoolIntCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, IntCorners.BlockKaevPurpleWoolIntCorners.blockID, var8);
                else if (item.getItemDamage() == 6 && IntCorners.BlockKaevCyanWoolIntCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, IntCorners.BlockKaevCyanWoolIntCorners.blockID, var8);
                else if (item.getItemDamage() == 7 && IntCorners.BlockKaevLightGrayWoolIntCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, IntCorners.BlockKaevLightGrayWoolIntCorners.blockID, var8);
                else if (item.getItemDamage() == 8 && IntCorners.BlockKaevGrayWoolIntCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, IntCorners.BlockKaevGrayWoolIntCorners.blockID, var8);
                else if (item.getItemDamage() == 9 && IntCorners.BlockKaevPinkWoolIntCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, IntCorners.BlockKaevPinkWoolIntCorners.blockID, var8);
                else if (item.getItemDamage() == 10 && IntCorners.BlockKaevLimeWoolIntCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, IntCorners.BlockKaevLimeWoolIntCorners.blockID, var8);
                else if (item.getItemDamage() == 11 && IntCorners.BlockKaevYellowWoolIntCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, IntCorners.BlockKaevYellowWoolIntCorners.blockID, var8);
                else if (item.getItemDamage() == 12 && IntCorners.BlockKaevLightBlueWoolIntCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, IntCorners.BlockKaevLightBlueWoolIntCorners.blockID, var8);
                else if (item.getItemDamage() == 13 && IntCorners.BlockKaevMagentaWoolIntCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, IntCorners.BlockKaevMagentaWoolIntCorners.blockID, var8);
                else if (item.getItemDamage() == 14 && IntCorners.BlockKaevOrangeWoolIntCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, IntCorners.BlockKaevOrangeWoolIntCorners.blockID, var8);
                else if (item.getItemDamage() == 15 && IntCorners.BlockKaevWhiteWoolIntCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, IntCorners.BlockKaevWhiteWoolIntCorners.blockID, var8);
            }
        }
    }
}
