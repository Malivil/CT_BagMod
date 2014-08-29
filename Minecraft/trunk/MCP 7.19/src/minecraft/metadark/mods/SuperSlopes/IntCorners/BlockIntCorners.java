package metadark.mods.SuperSlopes.IntCorners;

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

public class BlockIntCorners extends Block {
    protected BlockIntCorners(int var1, int var2, Material var3) {
        super(var1, var2, var3);
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
	public int damageDropped(int var1) {
        return var1 != 0 && var1 != 1 && var1 != 2 && var1 != 3 ? (var1 != 4 && var1 != 5 && var1 != 6 && var1 != 7 ? (var1 != 8 && var1 != 9 && var1 != 10 && var1 != 11 ? (var1 != 12 && var1 != 13 && var1 != 14 && var1 != 15 ? var1 : 12) : 8) : 4) : 0;
    }

    @Override
    public void addCollidingBlockToList(World var1, int var2, int var3, int var4, AxisAlignedBB var5, List var6, Entity item) {
        int meta = var1.getBlockMetadata(var2, var3, var4) % 8;

        if (meta == 0) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.addCollidingBlockToList(var1, var2, var3, var4, var5, var6, item);
            this.setBlockBounds(0.5F, 0.5F, 0.5F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(var1, var2, var3, var4, var5, var6, item);
        }
        else if (meta == 1) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.addCollidingBlockToList(var1, var2, var3, var4, var5, var6, item);
            this.setBlockBounds(0.0F, 0.5F, 0.0F, 0.5F, 1.0F, 0.5F);
            super.addCollidingBlockToList(var1, var2, var3, var4, var5, var6, item);
        }
        else if (meta == 2) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.addCollidingBlockToList(var1, var2, var3, var4, var5, var6, item);
            this.setBlockBounds(0.0F, 0.5F, 0.5F, 0.5F, 1.0F, 1.0F);
            super.addCollidingBlockToList(var1, var2, var3, var4, var5, var6, item);
        }
        else if (meta == 3) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.addCollidingBlockToList(var1, var2, var3, var4, var5, var6, item);
            this.setBlockBounds(0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 0.5F);
            super.addCollidingBlockToList(var1, var2, var3, var4, var5, var6, item);
        }
        else if (meta == 4) {
            this.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(var1, var2, var3, var4, var5, var6, item);
            this.setBlockBounds(0.5F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
            super.addCollidingBlockToList(var1, var2, var3, var4, var5, var6, item);
        }
        else if (meta == 5) {
            this.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(var1, var2, var3, var4, var5, var6, item);
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.5F);
            super.addCollidingBlockToList(var1, var2, var3, var4, var5, var6, item);
        }
        else if (meta == 6) {
            this.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(var1, var2, var3, var4, var5, var6, item);
            this.setBlockBounds(0.0F, 0.0F, 0.5F, 0.5F, 0.5F, 1.0F);
            super.addCollidingBlockToList(var1, var2, var3, var4, var5, var6, item);
        }
        else if (meta == 7) {
            this.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(var1, var2, var3, var4, var5, var6, item);
            this.setBlockBounds(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
            super.addCollidingBlockToList(var1, var2, var3, var4, var5, var6, item);
        }

        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    @Override
    public void onBlockClicked(World world, int x, int y, int z, EntityPlayer entityPlayer) {
        int blockID = world.getBlockId(x, y, z);

        if (blockID == IntCorners.BlockKaevBlackWoolIntCorners.blockID 		||
        	blockID == IntCorners.BlockKaevRedWoolIntCorners.blockID 		||
        	blockID == IntCorners.BlockKaevGreenWoolIntCorners.blockID 		||
        	blockID == IntCorners.BlockKaevBrownWoolIntCorners.blockID 		||
        	blockID == IntCorners.BlockKaevBlueWoolIntCorners.blockID 		||
        	blockID == IntCorners.BlockKaevPurpleWoolIntCorners.blockID 	||
        	blockID == IntCorners.BlockKaevCyanWoolIntCorners.blockID 		||
        	blockID == IntCorners.BlockKaevSilverWoolIntCorners.blockID 	||
        	blockID == IntCorners.BlockKaevGrayWoolIntCorners.blockID 		||
        	blockID == IntCorners.BlockKaevPinkWoolIntCorners.blockID 		||
        	blockID == IntCorners.BlockKaevLimeWoolIntCorners.blockID 		||
        	blockID == IntCorners.BlockKaevYellowWoolIntCorners.blockID 	||
        	blockID == IntCorners.BlockKaevLightBlueWoolIntCorners.blockID 	||
        	blockID == IntCorners.BlockKaevMagentaWoolIntCorners.blockID 	||
        	blockID == IntCorners.BlockKaevOrangeWoolIntCorners.blockID 	||
        	blockID == IntCorners.BlockKaevWhiteWoolIntCorners.blockID) {
        	ItemStack item = entityPlayer.inventory.getCurrentItem();

            if (item != null && item.itemID == Item.dyePowder.shiftedIndex)
            {
                int var8 = world.getBlockMetadata(x, y, z);

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
                else if (item.getItemDamage() == 7 && IntCorners.BlockKaevSilverWoolIntCorners.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, IntCorners.BlockKaevSilverWoolIntCorners.blockID, var8);
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
