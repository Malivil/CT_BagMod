package morePistons;

import java.util.Iterator;
import java.util.List;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.BlockContainer;
import net.minecraft.src.BlockPistonBase;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Facing;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.MathHelper;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;

public class BlockGravitationalPistonBase extends BlockPistonBase
{
    private boolean isSticky;
    private static boolean ignoreUpdates;
    public double power = 1.35D;

    public BlockGravitationalPistonBase(int var1, int var2, boolean var3)
    {
        super(var1, var2, var3);
        this.isSticky = var3;
        this.setRequiresSelfNotify();
    }

    public String getTextureFile()
    {
        return "/morePistons/blocks/block_textures.png";
    }

    /**
     * Return the either 106 or 107 as the texture index depending on the isSticky flag. This will actually never get
     * called by TileEntityRendererPiston.renderPiston() because TileEntityPiston.shouldRenderHead() will always return
     * false.
     */
    public int getPistonExtensionTexture()
    {
        return !this.isSticky ? 1 : 0;
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public int getBlockTextureFromSideAndMetadata(int var1, int var2)
    {
        int var3 = getOrientation(var2);
        return var3 > 5 ? (!this.isSticky ? 1 : 0) : (var1 == var3 ? (!isExtended(var2) && this.minX <= 0.0D && this.minY <= 0.0D && this.minZ <= 0.0D && this.maxX >= 1.0D && this.maxY >= 1.0D && this.maxZ >= 1.0D ? (!this.isSticky ? 1 : 0) : 26) : (var1 == Facing.faceToSide[var3] ? 25 : 27));
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 16;
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer var5)
    {
        return false;
    }

    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World var1, int var2, int var3, int var4, EntityLiving var5)
    {
        int var6 = determineOrientation(var1, var2, var3, var4, (EntityPlayer)var5);
        var1.setBlockMetadataWithNotify(var2, var3, var4, var6);

        if (!ignoreUpdates)
        {
            this.updatePistonState(var1, var2, var3, var4);
        }
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World var1, int var2, int var3, int var4, int var5)
    {
        if (!ignoreUpdates)
        {
            this.updatePistonState(var1, var2, var3, var4);
        }
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World var1, int var2, int var3, int var4)
    {
        if (var1.getBlockTileEntity(var2, var3, var4) == null && !ignoreUpdates)
        {
            this.updatePistonState(var1, var2, var3, var4);
        }
    }

    private void updatePistonState(World var1, int var2, int var3, int var4)
    {
        int var5 = var1.getBlockMetadata(var2, var3, var4);
        int var6 = getOrientation(var5);
        boolean var7 = this.isIndirectlyPowered(var1, var2, var3, var4, var6);

        if (var5 != 7)
        {
            if (var7 && !isExtended(var5))
            {
                if (canExtend(var1, var2, var3, var4, var6))
                {
                    var1.setBlockMetadata(var2, var3, var4, var6 | 8);
                    var1.addBlockEvent(var2, var3, var4, this.blockID, 0, var6);
                }
            }
            else if (!var7 && isExtended(var5))
            {
                var1.setBlockMetadata(var2, var3, var4, var6);
                var1.addBlockEvent(var2, var3, var4, this.blockID, 1, var6);
            }
        }
    }

    private boolean isIndirectlyPowered(World var1, int var2, int var3, int var4, int var5)
    {
        return var5 != 0 && var1.isBlockIndirectlyProvidingPowerTo(var2, var3 - 1, var4, 0) ? true : (var5 != 1 && var1.isBlockIndirectlyProvidingPowerTo(var2, var3 + 1, var4, 1) ? true : (var5 != 2 && var1.isBlockIndirectlyProvidingPowerTo(var2, var3, var4 - 1, 2) ? true : (var5 != 3 && var1.isBlockIndirectlyProvidingPowerTo(var2, var3, var4 + 1, 3) ? true : (var5 != 5 && var1.isBlockIndirectlyProvidingPowerTo(var2 + 1, var3, var4, 5) ? true : (var5 != 4 && var1.isBlockIndirectlyProvidingPowerTo(var2 - 1, var3, var4, 4) ? true : (var1.isBlockIndirectlyProvidingPowerTo(var2, var3, var4, 0) ? true : (var1.isBlockIndirectlyProvidingPowerTo(var2, var3 + 2, var4, 1) ? true : (var1.isBlockIndirectlyProvidingPowerTo(var2, var3 + 1, var4 - 1, 2) ? true : (var1.isBlockIndirectlyProvidingPowerTo(var2, var3 + 1, var4 + 1, 3) ? true : (var1.isBlockIndirectlyProvidingPowerTo(var2 - 1, var3 + 1, var4, 4) ? true : var1.isBlockIndirectlyProvidingPowerTo(var2 + 1, var3 + 1, var4, 5)))))))))));
    }

    /**
     * Called when the block receives a BlockEvent - see World.addBlockEvent. By default, passes it on to the tile
     * entity at this location. Args: world, x, y, z, blockID, EventID, event parameter
     */
    public void onBlockEventReceived(World var1, int var2, int var3, int var4, int var5, int var6)
    {
        ignoreUpdates = true;
        int var7 = var6;

        if (var5 == 0)
        {
            if (this.tryExtend(var1, var2, var3, var4, var6))
            {
                var1.setBlockMetadataWithNotify(var2, var3, var4, var6 | 8);
                var1.playSoundEffect((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "tile.piston.out", 0.5F, var1.rand.nextFloat() * 0.25F + 0.6F);
            }
            else
            {
                var1.setBlockMetadata(var2, var3, var4, var6);
            }
        }
        else if (var5 == 1)
        {
            TileEntity var8 = var1.getBlockTileEntity(var2 + Facing.offsetsXForSide[var6], var3 + Facing.offsetsYForSide[var6], var4 + Facing.offsetsZForSide[var6]);

            if (var8 != null && var8 instanceof TileEntityMorePistons)
            {
                ((TileEntityMorePistons)var8).clearPistonTileEntity();
            }

            var1.setBlockAndMetadata(var2, var3, var4, Block.pistonMoving.blockID, var6);
            var1.setBlockTileEntity(var2, var3, var4, mod_MorePistons.getTileEntity(this.blockID, var6, var6, false, true));

            if (this.isSticky)
            {
                int var9 = var2 + Facing.offsetsXForSide[var6] * 2;
                int var10 = var3 + Facing.offsetsYForSide[var6] * 2;
                int var11 = var4 + Facing.offsetsZForSide[var6] * 2;
                int var12 = var1.getBlockId(var9, var10, var11);
                int var13 = var1.getBlockMetadata(var9, var10, var11);
                boolean var14 = false;

                if (var12 == Block.pistonMoving.blockID)
                {
                    TileEntity var15 = var1.getBlockTileEntity(var9, var10, var11);

                    if (var15 != null && var15 instanceof TileEntityMorePistons)
                    {
                        TileEntityMorePistons var16 = (TileEntityMorePistons)var15;

                        if (var16.getPistonOrientation() == var6 && var16.isExtending())
                        {
                            var16.clearPistonTileEntity();
                            var12 = var16.getStoredBlockID();
                            var13 = var16.getBlockMetadata();
                            var14 = true;
                        }
                    }
                }

                boolean var17;

                for (var17 = false; !var14 && var12 > 0 && canPushBlock(var12, var1, var9, var10, var11, false) && (Block.blocksList[var12].getMobilityFlag() == 0 || var12 == Block.pistonBase.blockID || var12 == Block.pistonStickyBase.blockID); var13 = var1.getBlockMetadata(var9, var10, var11))
                {
                    var2 += Facing.offsetsXForSide[var7];
                    var3 += Facing.offsetsYForSide[var7];
                    var4 += Facing.offsetsZForSide[var7];
                    var1.setBlockAndMetadata(var2, var3, var4, Block.pistonMoving.blockID, var13);
                    var1.setBlockTileEntity(var2, var3, var4, mod_MorePistons.getTileEntity(var12, var13, var7, false, false));
                    ignoreUpdates = false;
                    var1.setBlockWithNotify(var9, var10, var11, 0);
                    ignoreUpdates = true;
                    var17 = true;

                    if (var12 != Block.pistonStickyBase.blockID || var13 != (var7 & 7))
                    {
                        break;
                    }

                    var9 = var2 + Facing.offsetsXForSide[var7] * 2;
                    var10 = var3 + Facing.offsetsYForSide[var7] * 2;
                    var11 = var4 + Facing.offsetsZForSide[var7] * 2;
                    var12 = var1.getBlockId(var9, var10, var11);
                }

                if (!var14 && !var17)
                {
                    ignoreUpdates = false;
                    var1.setBlockWithNotify(var2 + Facing.offsetsXForSide[var7], var3 + Facing.offsetsYForSide[var7], var4 + Facing.offsetsZForSide[var7], 0);
                    ignoreUpdates = true;
                }
            }
            else
            {
                ignoreUpdates = false;
                var1.setBlockWithNotify(var2 + Facing.offsetsXForSide[var6], var3 + Facing.offsetsYForSide[var6], var4 + Facing.offsetsZForSide[var6], 0);
                ignoreUpdates = true;
            }

            var1.playSoundEffect((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "tile.piston.in", 0.5F, var1.rand.nextFloat() * 0.15F + 0.6F);
        }

        ignoreUpdates = false;
    }

    /**
     * Updates the blocks bounds based on its current state. Args: world, x, y, z
     */
    public void setBlockBoundsBasedOnState(IBlockAccess var1, int var2, int var3, int var4)
    {
        int var5 = var1.getBlockMetadata(var2, var3, var4);

        if (isExtended(var5))
        {
            switch (getOrientation(var5))
            {
                case 0:
                    this.setBlockBounds(0.0F, 0.25F, 0.0F, 1.0F, 1.0F, 1.0F);
                    break;

                case 1:
                    this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
                    break;

                case 2:
                    this.setBlockBounds(0.0F, 0.0F, 0.25F, 1.0F, 1.0F, 1.0F);
                    break;

                case 3:
                    this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.75F);
                    break;

                case 4:
                    this.setBlockBounds(0.25F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
                    break;

                case 5:
                    this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.75F, 1.0F, 1.0F);
            }
        }
        else
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }
    }

    /**
     * Sets the block's bounds for rendering it as an item
     */
    public void setBlockBoundsForItemRender()
    {
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World var1, int var2, int var3, int var4)
    {
        this.setBlockBoundsBasedOnState(var1, var2, var3, var4);
        return super.getCollisionBoundingBoxFromPool(var1, var2, var3, var4);
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public static int getOrientation(int var0)
    {
        return var0 & 7;
    }

    public static boolean isExtended(int var0)
    {
        return (var0 & 8) != 0;
    }

    public static int determineOrientation(World var0, int var1, int var2, int var3, EntityPlayer var4)
    {
        if (MathHelper.abs((float)var4.posX - (float)var1) < 2.0F && MathHelper.abs((float)var4.posZ - (float)var3) < 2.0F)
        {
            double var5 = var4.posY + 1.82D - (double)var4.yOffset;

            if (var5 - (double)var2 > 2.0D)
            {
                return 1;
            }

            if ((double)var2 - var5 > 0.0D)
            {
                return 0;
            }
        }

        int var7 = MathHelper.floor_double((double)(var4.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
        return var7 == 0 ? 2 : (var7 == 1 ? 5 : (var7 == 2 ? 3 : (var7 == 3 ? 4 : 0)));
    }

    private static boolean canPushBlock(int var0, World var1, int var2, int var3, int var4, boolean var5)
    {
        boolean var6 = false;

        if (var0 == Block.obsidian.blockID)
        {
            return false;
        }
        else if (var0 != MorePistons.pistonRod.blockID && var0 != MorePistons.pistonExtension.blockID)
        {
            for (int var7 = 0; var7 < MorePistons.pistonList.length; ++var7)
            {
                if (var0 == MorePistons.pistonList[var7])
                {
                    var6 = true;
                    break;
                }

                if (var6)
                {
                    if (isExtended(var1.getBlockMetadata(var2, var3, var4)))
                    {
                        return false;
                    }
                }
                else if (var7 == MorePistons.pistonList.length - 1)
                {
                    var6 = false;
                }
            }

            return !var6 ? (Block.blocksList[var0].getBlockHardness(var1, var2, var3, var4) == -1.0F ? false : (Block.blocksList[var0].getMobilityFlag() == 2 ? false : (!var5 && Block.blocksList[var0].getMobilityFlag() == 1 ? false : !(Block.blocksList[var0] instanceof BlockContainer)))) : true;
        }
        else
        {
            return false;
        }
    }

    private static boolean canExtend(World var0, int var1, int var2, int var3, int var4)
    {
        int var5 = var1 + Facing.offsetsXForSide[var4];
        int var6 = var2 + Facing.offsetsYForSide[var4];
        int var7 = var3 + Facing.offsetsZForSide[var4];
        int var8 = 0;

        while (true)
        {
            if (var8 < 13)
            {
                if (var6 <= 0 || var6 >= 255)
                {
                    return false;
                }

                int var9 = var0.getBlockId(var5, var6, var7);

                if (var9 != 0)
                {
                    if (!canPushBlock(var9, var0, var5, var6, var7, true))
                    {
                        return false;
                    }

                    if (Block.blocksList[var9].getMobilityFlag() != 1)
                    {
                        if (var8 == 12)
                        {
                            return false;
                        }

                        var5 += Facing.offsetsXForSide[var4];
                        var6 += Facing.offsetsYForSide[var4];
                        var7 += Facing.offsetsZForSide[var4];
                        ++var8;
                        continue;
                    }
                }
            }

            return true;
        }
    }

    private boolean tryExtend(World var1, int var2, int var3, int var4, int var5)
    {
        int var6 = var2 + Facing.offsetsXForSide[var5];
        int var7 = var3 + Facing.offsetsYForSide[var5];
        int var8 = var4 + Facing.offsetsZForSide[var5];
        int var9 = 0;

        while (true)
        {
            if (var9 < 13)
            {
                if (var7 <= 0 || var7 >= 255)
                {
                    return false;
                }

                int var10 = var1.getBlockId(var6, var7, var8);

                if (var10 != 0)
                {
                    if (!canPushBlock(var10, var1, var6, var7, var8, true))
                    {
                        return false;
                    }

                    if (Block.blocksList[var10].getMobilityFlag() != 1)
                    {
                        if (var9 == 12)
                        {
                            return false;
                        }

                        var6 += Facing.offsetsXForSide[var5];
                        var7 += Facing.offsetsYForSide[var5];
                        var8 += Facing.offsetsZForSide[var5];
                        ++var9;
                        continue;
                    }

                    Block.blocksList[var10].dropBlockAsItem(var1, var6, var7, var8, var1.getBlockMetadata(var6, var7, var8), 0);
                    var1.setBlockWithNotify(var6, var7, var8, 0);
                }
            }

            List var18 = var1.getEntitiesWithinAABBExcludingEntity((Entity)null, AxisAlignedBB.getBoundingBox((double)var6, (double)var7, (double)var8, (double)var6 + 1.0D, (double)var7 + 1.0D, (double)var8 + 1.0D));
            Entity var12;

            if (!this.isSticky || var9 != 0)
            {
                for (Iterator var11 = var18.iterator(); var11.hasNext(); var12.motionZ += (double)Facing.offsetsZForSide[var5] * this.power)
                {
                    var12 = (Entity)var11.next();
                    var12.motionX += (double)Facing.offsetsXForSide[var5] * this.power;
                    var12.motionY += (double)Facing.offsetsYForSide[var5] * this.power;
                }
            }

            int var19;

            for (boolean var17 = false; var6 != var2 || var7 != var3 || var8 != var4; var8 = var19)
            {
                int var13 = var6 - Facing.offsetsXForSide[var5];
                int var14 = var7 - Facing.offsetsYForSide[var5];
                var19 = var8 - Facing.offsetsZForSide[var5];
                int var15 = var1.getBlockId(var13, var14, var19);
                int var16 = var1.getBlockMetadata(var13, var14, var19);

                if (var15 == this.blockID && var13 == var2 && var14 == var3 && var19 == var4)
                {
                    var1.setBlockAndMetadata(var6, var7, var8, Block.pistonMoving.blockID, var5 | (this.isSticky ? 8 : 0));
                    var1.setBlockTileEntity(var6, var7, var8, mod_MorePistons.getTileEntity(MorePistons.pistonExtension.blockID, var5 | (this.isSticky ? 8 : 0), var5, true, false));
                }
                else
                {
                    var17 = true;
                    var1.setBlockAndMetadata(var6, var7, var8, Block.pistonMoving.blockID, var16);
                    var1.setBlockTileEntity(var6, var7, var8, mod_MorePistons.getTileEntity(var15, var16, var5, true, false));
                }

                var6 = var13;
                var7 = var14;
            }

            return true;
        }
    }

    /**
     * ejects contained items into the world, and notifies neighbours of an update, as appropriate
     */
    public void breakBlock(World var1, int var2, int var3, int var4, int var5, int var6)
    {
        super.breakBlock(var1, var2, var3, var4, var5, var6);
        byte var7 = 1;
        var1.getBlockId(var2, var3, var4);
        int var9 = var1.getBlockMetadata(var2, var3, var4);
        int var10 = getDirectionMeta(var9);

        if (BlockDoublePistonBase.isExtended(var9))
        {
            int var11 = var2;
            int var12 = var3;
            int var13 = var4;

            for (int var14 = 0; var14 < var7; ++var14)
            {
                var11 += Facing.offsetsXForSide[var10];
                var12 += Facing.offsetsYForSide[var10];
                var13 += Facing.offsetsZForSide[var10];
                int var15 = var1.getBlockId(var11, var12, var13);

                if (var15 == MorePistons.pistonRod.blockID || var15 == MorePistons.pistonExtension.blockID)
                {
                    var1.setBlockWithNotify(var11, var12, var13, 0);
                }
            }

            var1.removeBlockTileEntity(var2, var3, var4);
        }
    }

    public static int getDirectionMeta(int var0)
    {
        return var0 & 7;
    }
}
