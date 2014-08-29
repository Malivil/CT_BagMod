package metadark.mods.SuperSlopes.Corners;

import java.util.List;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.MathHelper;
import net.minecraft.src.World;

public class BlockCorners extends Block {
    protected BlockCorners(int var1, int var2, Material var3) {
        super(var1, var2, var3);
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
    public boolean shouldSideBeRendered(IBlockAccess var1, int var2, int var3, int var4, int var5) {
        return true;
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLiving entityLiving) {
        int meta = world.getBlockMetadata(x, y, z);
        int side = MathHelper.floor_double((double)(entityLiving.rotationYaw * 4.0F / 360.0F)) & 3;

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
    protected int damageDropped(int var1) {
        return var1 != 0 && var1 != 1 && var1 != 2 && var1 != 3 ? (var1 != 4 && var1 != 5 && var1 != 6 && var1 != 7 ? (var1 != 8 && var1 != 9 && var1 != 10 && var1 != 11 ? (var1 != 12 && var1 != 13 && var1 != 14 && var1 != 15 ? var1 : 12) : 8) : 4) : 0;
    }

    @Override
    public void addCollidingBlockToList(World world, int x, int y, int z, AxisAlignedBB var5, List var6, Entity var7) {
        int meta = world.getBlockMetadata(x, y, z) % 8;

        if (meta == 0) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, var5, var6, var7);
            this.setBlockBounds(0.5F, 0.5F, 0.5F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, var5, var6, var7);
        }
        else if (meta == 1) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, var5, var6, var7);
            this.setBlockBounds(0.0F, 0.5F, 0.0F, 0.5F, 1.0F, 0.5F);
            super.addCollidingBlockToList(world, x, y, z, var5, var6, var7);
        }
        else if (meta == 2) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, var5, var6, var7);
            this.setBlockBounds(0.0F, 0.5F, 0.5F, 0.5F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, var5, var6, var7);
        }
        else if (meta == 3) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, var5, var6, var7);
            this.setBlockBounds(0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 0.5F);
            super.addCollidingBlockToList(world, x, y, z, var5, var6, var7);
        }
        else if (meta == 4) {
            this.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, var5, var6, var7);
            this.setBlockBounds(0.5F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, var5, var6, var7);
        }
        else if (meta == 5) {
            this.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, var5, var6, var7);
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.5F);
            super.addCollidingBlockToList(world, x, y, z, var5, var6, var7);
        }
        else if (meta == 6) {
            this.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, var5, var6, var7);
            this.setBlockBounds(0.0F, 0.0F, 0.5F, 0.5F, 0.5F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, var5, var6, var7);
        }
        else if (meta == 7) {
            this.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, var5, var6, var7);
            this.setBlockBounds(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
            super.addCollidingBlockToList(world, x, y, z, var5, var6, var7);
        }

        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    @Override
    public void onBlockClicked(World world, int x, int y, int z, EntityPlayer entityPlayer) {
        int blockID = world.getBlockId(x, y, z);

        if (blockID == Corners.BlockKaevBlackWoolCorners.blockID	 ||
            blockID == Corners.BlockKaevRedWoolCorners.blockID		 ||
            blockID == Corners.BlockKaevGreenWoolCorners.blockID	 ||
            blockID == Corners.BlockKaevBrownWoolCorners.blockID	 ||
            blockID == Corners.BlockKaevBlueWoolCorners.blockID		 ||
            blockID == Corners.BlockKaevPurpleWoolCorners.blockID	 ||
            blockID == Corners.BlockKaevCyanWoolCorners.blockID		 ||
            blockID == Corners.BlockKaevSilverWoolCorners.blockID	 ||
            blockID == Corners.BlockKaevGrayWoolCorners.blockID		 ||
            blockID == Corners.BlockKaevPinkWoolCorners.blockID		 ||
            blockID == Corners.BlockKaevLimeWoolCorners.blockID		 ||
            blockID == Corners.BlockKaevYellowWoolCorners.blockID	 ||
            blockID == Corners.BlockKaevLightBlueWoolCorners.blockID ||
            blockID == Corners.BlockKaevMagentaWoolCorners.blockID	 ||
            blockID == Corners.BlockKaevOrangeWoolCorners.blockID	 ||
            blockID == Corners.BlockKaevWhiteWoolCorners.blockID) {
            ItemStack item = entityPlayer.inventory.getCurrentItem();

            if (item != null && item.itemID == Item.dyePowder.shiftedIndex) {
                int meta = world.getBlockMetadata(x, y, z);

                if (item.getItemDamage() == 0 && Corners.BlockKaevBlackWoolCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevBlackWoolCorners.blockID, meta);
                else if (item.getItemDamage() == 1 && Corners.BlockKaevRedWoolCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevRedWoolCorners.blockID, meta);
                else if (item.getItemDamage() == 2 && Corners.BlockKaevGreenWoolCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevGreenWoolCorners.blockID, meta);
                else if (item.getItemDamage() == 3 && Corners.BlockKaevBrownWoolCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevBrownWoolCorners.blockID, meta);
                else if (item.getItemDamage() == 4 && Corners.BlockKaevBlueWoolCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevBlueWoolCorners.blockID, meta);
                else if (item.getItemDamage() == 5 && Corners.BlockKaevPurpleWoolCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevPurpleWoolCorners.blockID, meta);
                else if (item.getItemDamage() == 6 && Corners.BlockKaevCyanWoolCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevCyanWoolCorners.blockID, meta);
                else if (item.getItemDamage() == 7 && Corners.BlockKaevSilverWoolCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevSilverWoolCorners.blockID, meta);
                else if (item.getItemDamage() == 8 && Corners.BlockKaevGrayWoolCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevGrayWoolCorners.blockID, meta);
                else if (item.getItemDamage() == 9 && Corners.BlockKaevPinkWoolCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevPinkWoolCorners.blockID, meta);
                else if (item.getItemDamage() == 10 && Corners.BlockKaevLimeWoolCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevLimeWoolCorners.blockID, meta);
                else if (item.getItemDamage() == 11 && Corners.BlockKaevYellowWoolCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevYellowWoolCorners.blockID, meta);
                else if (item.getItemDamage() == 12 && Corners.BlockKaevLightBlueWoolCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevLightBlueWoolCorners.blockID, meta);
                else if (item.getItemDamage() == 13 && Corners.BlockKaevMagentaWoolCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevMagentaWoolCorners.blockID, meta);
                else if (item.getItemDamage() == 14 && Corners.BlockKaevOrangeWoolCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevOrangeWoolCorners.blockID, meta);
                else if (item.getItemDamage() == 15 && Corners.BlockKaevWhiteWoolCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Corners.BlockKaevWhiteWoolCorners.blockID, meta);
            }
        }
    }
}
