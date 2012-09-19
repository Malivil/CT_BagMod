package metadark.mods.SuperSlopes.Slopes;

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

public class BlockSlopes extends Block
{
    protected BlockSlopes(int world, int x, Material y)
    {
        super(world, x, y);
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
    public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int entityPlayer) {
        return true;
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLiving entityLiving) {
        int meta = world.getBlockMetadata(x, y, z);
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
    protected int damageDropped(int var1) {
        return var1 != 0 && var1 != 1 && var1 != 2 && var1 != 3 ? (var1 != 4 && var1 != 5 && var1 != 6 && var1 != 7 ? (var1 != 8 && var1 != 9 && var1 != 10 && var1 != 11 ? (var1 != 12 && var1 != 13 && var1 != 14 && var1 != 15 ? var1 : 12) : 8) : 4) : 0;
    }

    @Override
    public void addCollidingBlockToList(World world, int x, int y, int z, AxisAlignedBB entityPlayer, List blockID, Entity var7) {
        int var8 = world.getBlockMetadata(x, y, z);

        if (var8 == 0) {
            this.setBlockBounds(0.0F, 0.5F, 0.0F, 0.5F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, entityPlayer, blockID, var7);
            this.setBlockBounds(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, entityPlayer, blockID, var7);
        }
        else if (var8 == 1) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, entityPlayer, blockID, var7);
            this.setBlockBounds(0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, entityPlayer, blockID, var7);
        }
        else if (var8 == 2) {
            this.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 0.5F);
            super.addCollidingBlockToList(world, x, y, z, entityPlayer, blockID, var7);
            this.setBlockBounds(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, entityPlayer, blockID, var7);
        }
        else if (var8 == 3) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
            super.addCollidingBlockToList(world, x, y, z, entityPlayer, blockID, var7);
            this.setBlockBounds(0.0F, 0.5F, 0.5F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, entityPlayer, blockID, var7);
        }
        else if (var8 == 4) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, entityPlayer, blockID, var7);
            this.setBlockBounds(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, entityPlayer, blockID, var7);
        }
        else if (var8 == 5) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, entityPlayer, blockID, var7);
            this.setBlockBounds(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, entityPlayer, blockID, var7);
        }
        else if (var8 == 6) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
            super.addCollidingBlockToList(world, x, y, z, entityPlayer, blockID, var7);
            this.setBlockBounds(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, entityPlayer, blockID, var7);
        }
        else if (var8 == 7) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
            super.addCollidingBlockToList(world, x, y, z, entityPlayer, blockID, var7);
            this.setBlockBounds(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, entityPlayer, blockID, var7);
        }
        else if (var8 == 8) {
            this.setBlockBounds(0.0F, 0.5F, 0.0F, 0.5F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, entityPlayer, blockID, var7);
            this.setBlockBounds(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, entityPlayer, blockID, var7);
        }
        else if (var8 == 9) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, entityPlayer, blockID, var7);
            this.setBlockBounds(0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, entityPlayer, blockID, var7);
        }
        else if (var8 == 10) {
            this.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 0.5F);
            super.addCollidingBlockToList(world, x, y, z, entityPlayer, blockID, var7);
            this.setBlockBounds(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, entityPlayer, blockID, var7);
        }
        else if (var8 == 11) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
            super.addCollidingBlockToList(world, x, y, z, entityPlayer, blockID, var7);
            this.setBlockBounds(0.0F, 0.5F, 0.5F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, entityPlayer, blockID, var7);
        }
        else if (var8 == 12) {
            this.setBlockBounds(0.5F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, entityPlayer, blockID, var7);
        }
        else if (var8 == 13) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 0.5F);
            super.addCollidingBlockToList(world, x, y, z, entityPlayer, blockID, var7);
        }
        else if (var8 == 14)  {
            this.setBlockBounds(0.0F, 0.0F, 0.5F, 0.5F, 1.0F, 1.0F);
            super.addCollidingBlockToList(world, x, y, z, entityPlayer, blockID, var7);
        }
        else if (var8 == 15) {
            this.setBlockBounds(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
            super.addCollidingBlockToList(world, x, y, z, entityPlayer, blockID, var7);
        }

        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    @Override
    public void onBlockClicked(World world, int x, int y, int z, EntityPlayer entityPlayer) {
        int blockID = world.getBlockId(x, y, z);

        if (blockID == Slopes.BlockKaevBlackWoolSlopes.blockID		||
    		blockID == Slopes.BlockKaevRedWoolSlopes.blockID		||
    		blockID == Slopes.BlockKaevGreenWoolSlopes.blockID		||
    		blockID == Slopes.BlockKaevBrownWoolSlopes.blockID		||
    		blockID == Slopes.BlockKaevBlueWoolSlopes.blockID		||
    		blockID == Slopes.BlockKaevPurpleWoolSlopes.blockID		||
    		blockID == Slopes.BlockKaevCyanWoolSlopes.blockID		||
    		blockID == Slopes.BlockKaevSilverWoolSlopes.blockID		||
    		blockID == Slopes.BlockKaevGrayWoolSlopes.blockID		||
    		blockID == Slopes.BlockKaevPinkWoolSlopes.blockID		||
    		blockID == Slopes.BlockKaevLimeWoolSlopes.blockID		||
    		blockID == Slopes.BlockKaevYellowWoolSlopes.blockID		||
    		blockID == Slopes.BlockKaevLightBlueWoolSlopes.blockID	||
    		blockID == Slopes.BlockKaevMagentaWoolSlopes.blockID	||
    		blockID == Slopes.BlockKaevOrangeWoolSlopes.blockID		||
    		blockID == Slopes.BlockKaevWhiteWoolSlopes.blockID) {
            ItemStack item = entityPlayer.inventory.getCurrentItem();

            if (item != null && item.itemID == Item.dyePowder.shiftedIndex) {
                int var8 = world.getBlockMetadata(x, y, z);

                if (item.getItemDamage() == 0 && Slopes.BlockKaevBlackWoolSlopes.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevBlackWoolSlopes.blockID, var8);
                else if (item.getItemDamage() == 1 && Slopes.BlockKaevRedWoolSlopes.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevRedWoolSlopes.blockID, var8);
                else if (item.getItemDamage() == 2 && Slopes.BlockKaevGreenWoolSlopes.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevGreenWoolSlopes.blockID, var8);
                else if (item.getItemDamage() == 3 && Slopes.BlockKaevBrownWoolSlopes.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevBrownWoolSlopes.blockID, var8);
                else if (item.getItemDamage() == 4 && Slopes.BlockKaevBlueWoolSlopes.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevBlueWoolSlopes.blockID, var8);
                else if (item.getItemDamage() == 5 && Slopes.BlockKaevPurpleWoolSlopes.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevPurpleWoolSlopes.blockID, var8);
                else if (item.getItemDamage() == 6 && Slopes.BlockKaevCyanWoolSlopes.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevCyanWoolSlopes.blockID, var8);
                else if (item.getItemDamage() == 7 && Slopes.BlockKaevSilverWoolSlopes.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevSilverWoolSlopes.blockID, var8);
                else if (item.getItemDamage() == 8 && Slopes.BlockKaevGrayWoolSlopes.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevGrayWoolSlopes.blockID, var8);
                else if (item.getItemDamage() == 9 && Slopes.BlockKaevPinkWoolSlopes.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevPinkWoolSlopes.blockID, var8);
                else if (item.getItemDamage() == 10 && Slopes.BlockKaevLimeWoolSlopes.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevLimeWoolSlopes.blockID, var8);
                else if (item.getItemDamage() == 11 && Slopes.BlockKaevYellowWoolSlopes.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevYellowWoolSlopes.blockID, var8);
                else if (item.getItemDamage() == 12 && Slopes.BlockKaevLightBlueWoolSlopes.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevLightBlueWoolSlopes.blockID, var8);
                else if (item.getItemDamage() == 13 && Slopes.BlockKaevMagentaWoolSlopes.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevMagentaWoolSlopes.blockID, var8);
                else if (item.getItemDamage() == 14 && Slopes.BlockKaevOrangeWoolSlopes.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevOrangeWoolSlopes.blockID, var8);
                else if (item.getItemDamage() == 15 && Slopes.BlockKaevWhiteWoolSlopes.blockID != Block.stone.blockID)
                    world.setBlockAndMetadataWithNotify(x, y, z, Slopes.BlockKaevWhiteWoolSlopes.blockID, var8);
            }
        }
    }
}
