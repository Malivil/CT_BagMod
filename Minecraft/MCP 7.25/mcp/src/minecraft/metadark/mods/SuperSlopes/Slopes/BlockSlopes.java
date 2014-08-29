package metadark.mods.SuperSlopes.Slopes;

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

public class BlockSlopes extends Block {
    protected BlockSlopes(final int blockID, final int meta, final Material material) {
        super(blockID, meta, material);
        this.setLightOpacity(Slopes.LightOpacity);
    }

    @Override
    public int getRenderType() {
        return Slopes.SlopesRenderID;
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
    public boolean shouldSideBeRendered(final IBlockAccess world, final int x, final int y, final int z, final int entityPlayer) {
        return true;
    }

    @Override
    public void onBlockPlacedBy(final World world, final int x, final int y, final int z, final EntityLiving entityLiving) {
        final int meta = world.getBlockMetadata(x, y, z);
        int side;

        if (meta == 12)
            side = MathHelper.floor_double((double)(entityLiving.rotationYaw * 4.0F / 360.0F)) & 3;
        else
            side = MathHelper.floor_double((double)(entityLiving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

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
    public void addCollidingBlockToList(final World world, final int x, final int y, final int z, final AxisAlignedBB axis, final List blockID, final Entity entity) {
        final int meta = world.getBlockMetadata(x, y, z);

        if (meta == 0) {
            this.setBlockBounds(0.0F, 0.5F, 0.0F, 0.5F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, blockID, entity);
            this.setBlockBounds(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, blockID, entity);
        }
        else if (meta == 1) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, blockID, entity);
            this.setBlockBounds(0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, blockID, entity);
        }
        else if (meta == 2) {
            this.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 0.5F);
            super.addCollidingBlockToList(world, x, y, z, axis, blockID, entity);
            this.setBlockBounds(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, blockID, entity);
        }
        else if (meta == 3) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
            super.addCollidingBlockToList(world, x, y, z, axis, blockID, entity);
            this.setBlockBounds(0.0F, 0.5F, 0.5F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, blockID, entity);
        }
        else if (meta == 4) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, blockID, entity);
            this.setBlockBounds(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, blockID, entity);
        }
        else if (meta == 5) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, blockID, entity);
            this.setBlockBounds(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, blockID, entity);
        }
        else if (meta == 6) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
            super.addCollidingBlockToList(world, x, y, z, axis, blockID, entity);
            this.setBlockBounds(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, blockID, entity);
        }
        else if (meta == 7) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
            super.addCollidingBlockToList(world, x, y, z, axis, blockID, entity);
            this.setBlockBounds(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, blockID, entity);
        }
        else if (meta == 8) {
            this.setBlockBounds(0.0F, 0.5F, 0.0F, 0.5F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, blockID, entity);
            this.setBlockBounds(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, blockID, entity);
        }
        else if (meta == 9) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, blockID, entity);
            this.setBlockBounds(0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, blockID, entity);
        }
        else if (meta == 10) {
            this.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 0.5F);
            super.addCollidingBlockToList(world, x, y, z, axis, blockID, entity);
            this.setBlockBounds(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, blockID, entity);
        }
        else if (meta == 11) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
            super.addCollidingBlockToList(world, x, y, z, axis, blockID, entity);
            this.setBlockBounds(0.0F, 0.5F, 0.5F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, blockID, entity);
        }
        else if (meta == 12) {
            this.setBlockBounds(0.5F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, blockID, entity);
        }
        else if (meta == 13) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 0.5F);
            super.addCollidingBlockToList(world, x, y, z, axis, blockID, entity);
        }
        else if (meta == 14)  {
            this.setBlockBounds(0.0F, 0.0F, 0.5F, 0.5F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, axis, blockID, entity);
        }
        else if (meta == 15) {
            this.setBlockBounds(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
            super.addCollidingBlockToList(world, x, y, z, axis, blockID, entity);
        }

        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    @Override
    public void onBlockClicked(final World world, final int x, final int y, final int z, final EntityPlayer entityPlayer) {
        final int blockID = world.getBlockId(x, y, z);

        // If this is a wool-based block, let it be recolored by using a dye on it
        if (blockID == Slopes.BlockKaevBlackWoolSlopes.blockID        ||
            blockID == Slopes.BlockKaevRedWoolSlopes.blockID        ||
            blockID == Slopes.BlockKaevGreenWoolSlopes.blockID        ||
            blockID == Slopes.BlockKaevBrownWoolSlopes.blockID        ||
            blockID == Slopes.BlockKaevBlueWoolSlopes.blockID        ||
            blockID == Slopes.BlockKaevPurpleWoolSlopes.blockID        ||
            blockID == Slopes.BlockKaevCyanWoolSlopes.blockID        ||
            blockID == Slopes.BlockKaevLightGrayWoolSlopes.blockID        ||
            blockID == Slopes.BlockKaevGrayWoolSlopes.blockID        ||
            blockID == Slopes.BlockKaevPinkWoolSlopes.blockID        ||
            blockID == Slopes.BlockKaevLimeWoolSlopes.blockID        ||
            blockID == Slopes.BlockKaevYellowWoolSlopes.blockID        ||
            blockID == Slopes.BlockKaevLightBlueWoolSlopes.blockID    ||
            blockID == Slopes.BlockKaevMagentaWoolSlopes.blockID    ||
            blockID == Slopes.BlockKaevOrangeWoolSlopes.blockID        ||
            blockID == Slopes.BlockKaevWhiteWoolSlopes.blockID) {
            final ItemStack item = entityPlayer.inventory.getCurrentItem();

            // If the user is holding an item, and it's dye
            if ((item != null) && (item.itemID == Item.dyePowder.shiftedIndex)) {
                final int meta = world.getBlockMetadata(x, y, z);

                // Set the ID of this block to the correct ID and the same meta, but only if the target type is enabled
                if ((item.getItemDamage() == 0) && (Slopes.BlockKaevBlackWoolSlopes.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevBlackWoolSlopes.blockID, meta);
                else if ((item.getItemDamage() == 1) && (Slopes.BlockKaevRedWoolSlopes.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevRedWoolSlopes.blockID, meta);
                else if ((item.getItemDamage() == 2) && (Slopes.BlockKaevGreenWoolSlopes.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevGreenWoolSlopes.blockID, meta);
                else if ((item.getItemDamage() == 3) && (Slopes.BlockKaevBrownWoolSlopes.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevBrownWoolSlopes.blockID, meta);
                else if ((item.getItemDamage() == 4) && (Slopes.BlockKaevBlueWoolSlopes.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevBlueWoolSlopes.blockID, meta);
                else if ((item.getItemDamage() == 5) && (Slopes.BlockKaevPurpleWoolSlopes.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevPurpleWoolSlopes.blockID, meta);
                else if ((item.getItemDamage() == 6) && (Slopes.BlockKaevCyanWoolSlopes.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevCyanWoolSlopes.blockID, meta);
                else if ((item.getItemDamage() == 7) && (Slopes.BlockKaevLightGrayWoolSlopes.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevLightGrayWoolSlopes.blockID, meta);
                else if ((item.getItemDamage() == 8) && (Slopes.BlockKaevGrayWoolSlopes.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevGrayWoolSlopes.blockID, meta);
                else if ((item.getItemDamage() == 9) && (Slopes.BlockKaevPinkWoolSlopes.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevPinkWoolSlopes.blockID, meta);
                else if ((item.getItemDamage() == 10) && (Slopes.BlockKaevLimeWoolSlopes.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevLimeWoolSlopes.blockID, meta);
                else if ((item.getItemDamage() == 11) && (Slopes.BlockKaevYellowWoolSlopes.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevYellowWoolSlopes.blockID, meta);
                else if ((item.getItemDamage() == 12) && (Slopes.BlockKaevLightBlueWoolSlopes.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevLightBlueWoolSlopes.blockID, meta);
                else if ((item.getItemDamage() == 13) && (Slopes.BlockKaevMagentaWoolSlopes.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevMagentaWoolSlopes.blockID, meta);
                else if ((item.getItemDamage() == 14) && (Slopes.BlockKaevOrangeWoolSlopes.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevOrangeWoolSlopes.blockID, meta);
                else if ((item.getItemDamage() == 15) && (Slopes.BlockKaevWhiteWoolSlopes.blockID != Block.stone.blockID))
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevWhiteWoolSlopes.blockID, meta);
            }
        }
    }
}
