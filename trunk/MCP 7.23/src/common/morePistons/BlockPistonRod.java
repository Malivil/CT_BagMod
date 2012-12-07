package morePistons;

import java.util.List;
import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.BlockPistonBase;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityClientPlayerMP;
import net.minecraft.src.Facing;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.Material;
import net.minecraft.src.World;
import cpw.mods.fml.client.FMLClientHandler;

public class BlockPistonRod extends Block
{
    private int headTexture = -1;
    public boolean northSouth = false;
    public boolean upDown = false;
    public boolean broken = false;
    public static boolean pistonMoving2 = false;
    private int pistonRodSprTop = 32;
    private int pistonRodSprSide = 33;

    public BlockPistonRod(int var1, int var2)
    {
        super(var1, var2, Material.rock);
        this.setStepSound(soundStoneFootstep);
        this.setHardness(0.3F);
    }

    public String getTextureFile()
    {
        return "/morePistons/blocks/block_textures.png";
    }

    /**
     * Retrieves the block texture to use based on the display side. Args: iBlockAccess, x, y, z, side
     */
    @Override
    public int getBlockTexture(IBlockAccess var1, int var2, int var3, int var4, int var5)
    {
        return (var5 == 1 || var5 == 0) && this.northSouth ? this.pistonRodSprTop : ((var5 == 4 || var5 == 5) && this.northSouth ? this.pistonRodSprSide : ((var5 == 0 || var5 == 1 || var5 == 2 || var5 == 3) && !this.northSouth && !this.upDown ? this.pistonRodSprSide : ((var5 == 2 || var5 == 3 || var5 == 4 || var5 == 5) && this.upDown ? this.pistonRodSprTop : this.pistonRodSprTop)));
    }

    public void setHeadTexture(int var1)
    {
        this.headTexture = this.pistonRodSprSide;
    }

    public void clearHeadTexture()
    {
        this.headTexture = -1;
    }

    /**
     * ejects contained items into the world, and notifies neighbours of an update, as appropriate
     */
    @Override
    public void breakBlock(World world, int x, int y, int z, int blockId, int meta)
    {
        boolean var9 = false;
        boolean var10 = false;
        boolean var11 = false;
        super.breakBlock(world, x, y, z, blockId, meta);
        int var12 = world.getBlockMetadata(x, y, z);
        int var13 = Facing.faceToSide[getDirectionMeta(var12)];
        x += Facing.offsetsXForSide[var13];
        y += Facing.offsetsYForSide[var13];
        z += Facing.offsetsZForSide[var13];
        int var14 = world.getBlockId(x, y, z);

        if (!pistonMoving2)
        {
            int var15;

            for (var15 = 0; var15 < MorePistons.pistonList.length; ++var15)
            {
                if (var14 == MorePistons.pistonList[var15])
                {
                    var9 = true;
                    break;
                }

                if (var14 == MorePistons.pistonList.length - 1)
                {
                    var9 = false;
                }
            }

            if (var9)
            {
                var15 = world.getBlockMetadata(x, y, z);

                if (BlockPistonBase.isExtended(var15))
                {
                	Block.blocksList[var14].dropBlockAsItem(world, x, y, z, var15, 0);
                    world.setBlockWithNotify(x, y, z, 0);
                }
            }
            else if (var14 == MorePistons.pistonRod.blockID)
            {
                var15 = world.getBlockMetadata(x, y, z);
                int var16 = Facing.faceToSide[getDirectionMeta(var15)];
                x += Facing.offsetsXForSide[var16];
                y += Facing.offsetsYForSide[var16];
                z += Facing.offsetsZForSide[var16];
                int var17 = world.getBlockId(x, y, z);
                int var18;

                for (var18 = 0; var18 < MorePistons.pistonList.length; ++var18)
                {
                    if (var17 == MorePistons.pistonList[var18])
                    {
                        var10 = true;
                        break;
                    }

                    if (var17 == MorePistons.pistonList.length - 1)
                    {
                        var10 = false;
                    }
                }

                if (var10)
                {
                    var18 = world.getBlockMetadata(x, y, z);

                    if (BlockPistonBase.isExtended(var18))
                    {
                        Block.blocksList[var17].dropBlockAsItem(world, x, y, z, var18, 0);
                        world.setBlockWithNotify(x, y, z, 0);
                    }
                }
                else if (var14 == MorePistons.pistonRod.blockID)
                {
                    var18 = world.getBlockMetadata(x, y, z);
                    int var19 = Facing.faceToSide[getDirectionMeta(var18)];
                    x += Facing.offsetsXForSide[var19];
                    y += Facing.offsetsYForSide[var19];
                    z += Facing.offsetsZForSide[var19];
                    int var20 = world.getBlockId(x, y, z);
                    int var21;

                    for (var21 = 0; var21 < MorePistons.pistonList.length; ++var21)
                    {
                        if (var20 == MorePistons.pistonList[var21])
                        {
                            var11 = true;
                            break;
                        }

                        if (var20 == MorePistons.pistonList.length - 1)
                        {
                            var11 = false;
                        }
                    }

                    if (var11)
                    {
                        var21 = world.getBlockMetadata(x, y, z);

                        if (BlockPistonBase.isExtended(var21))
                        {
                            Block.blocksList[var20].dropBlockAsItem(world, x, y, z, var21, 0);
                            world.setBlockWithNotify(x, y, z, 0);
                        }
                    }
                }
            }
            else if (var14 == Block.pistonMoving.blockID)
            {
                pistonMoving2 = true;
            }
        }
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    @Override
    public int getBlockTextureFromSideAndMetadata(int var1, int var2)
    {
        int var3 = getDirectionMeta(var2);
        return var1 != Facing.faceToSide[var3] ? this.pistonRodSprTop : this.pistonRodSprSide;
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    @Override
    public boolean canPlaceBlockAt(World var1, int var2, int var3, int var4)
    {
        return false;
    }

    /**
     * checks to see if you can place this block can be placed on that side of a block: BlockLever overrides
     */
    @Override
    public boolean canPlaceBlockOnSide(World var1, int var2, int var3, int var4, int var5)
    {
        return false;
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    @Override
    public int quantityDropped(Random var1)
    {
        return 0;
    }

    /**
     * Sets the block's bounds for rendering it as an item
     */
    @Override
    public void setBlockBoundsForItemRender()
    {
        this.setBlockBounds(0.375F, 0.0F, 0.375F, 0.625F, 1.0F, 0.625F);
    }

    /**
     * if the specified block is in the given AABB, add its collision bounding box to the given list
     */
    @Override
    public void addCollidingBlockToList(World var1, int var2, int var3, int var4, AxisAlignedBB var5, List var6, Entity var7)
    {
        int var8 = var1.getBlockMetadata(var2, var3, var4);

        switch (getDirectionMeta(var8))
        {
            case 0:
                this.setBlockBounds(0.375F, 0.25F, 0.375F, 0.625F, 1.25F, 0.625F);
                super.addCollidingBlockToList(var1, var2, var3, var4, var5, var6, var7);
                break;

            case 1:
                this.setBlockBounds(0.375F, -0.25F, 0.375F, 0.625F, 0.75F, 0.625F);
                super.addCollidingBlockToList(var1, var2, var3, var4, var5, var6, var7);
                break;

            case 2:
                this.setBlockBounds(0.25F, 0.25F, 0.25F, 0.75F, 0.625F, 1.25F);
                super.addCollidingBlockToList(var1, var2, var3, var4, var5, var6, var7);
                break;

            case 3:
                this.setBlockBounds(0.25F, 0.375F, 0.25F, 0.75F, 0.625F, 0.75F);
                super.addCollidingBlockToList(var1, var2, var3, var4, var5, var6, var7);
                break;

            case 4:
                this.setBlockBounds(-0.25F, 0.25F, 0.25F, 1.25F, 0.75F, 0.75F);
                super.addCollidingBlockToList(var1, var2, var3, var4, var5, var6, var7);
                break;

            case 5:
                this.setBlockBounds(-0.25F, 0.375F, 0.25F, 0.75F, 0.625F, 0.75F);
                super.addCollidingBlockToList(var1, var2, var3, var4, var5, var6, var7);
        }

        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    /**
     * Updates the blocks bounds based on its current state. Args: world, x, y, z
     */
    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess var1, int var2, int var3, int var4)
    {
        int var5 = var1.getBlockMetadata(var2, var3, var4);

        switch (getDirectionMeta(var5))
        {
            case 0:
                this.upDown = true;
                this.northSouth = false;
                this.setBlockBounds(0.375F, 0.25F, 0.375F, 0.625F, 1.25F, 0.625F);
                break;

            case 1:
                this.upDown = true;
                this.northSouth = false;
                this.setBlockBounds(0.375F, -0.25F, 0.375F, 0.625F, 0.75F, 0.625F);
                break;

            case 2:
                this.upDown = false;
                this.northSouth = true;
                this.setBlockBounds(0.375F, 0.375F, 0.25F, 0.625F, 0.625F, 1.25F);
                break;

            case 3:
                this.upDown = false;
                this.northSouth = true;
                this.setBlockBounds(0.375F, 0.375F, -0.25F, 0.625F, 0.625F, 0.75F);
                break;

            case 4:
                this.upDown = false;
                this.northSouth = false;
                this.setBlockBounds(0.25F, 0.375F, 0.375F, 1.25F, 0.625F, 0.625F);
                break;

            case 5:
                this.upDown = false;
                this.northSouth = false;
                this.setBlockBounds(-0.25F, 0.375F, 0.375F, 0.75F, 0.625F, 0.625F);
        }
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    
    public void onNeighborBlockChange(World var1, int var2, int var3, int var4, int var5)
    {
        int var6 = getDirectionMeta(var1.getBlockMetadata(var2, var3, var4));
        int var7 = var1.getBlockId(var2 - Facing.offsetsXForSide[var6], var3 - Facing.offsetsYForSide[var6], var4 - Facing.offsetsZForSide[var6]);
        int var8 = 0;
        boolean var9 = false;

        for (int var10 = 0; var10 < MorePistons.pistonList.length; ++var10)
        {
            if (var7 != MorePistons.pistonList[var10])
            {
                ++var8;
            }

            if (var8 == MorePistons.pistonList.length)
            {
                var9 = true;
                break;
            }

            if (var7 != MorePistons.pistonList.length - 1)
            {
                var9 = false;
            }
        }

        if (var9 && var7 != MorePistons.pistonRod.blockID && var7 != MorePistons.pistonExtension.blockID)
        {
            var1.setBlockWithNotify(var2, var3, var4, 0);
        }
        else
        {
            Block.blocksList[var7].onNeighborBlockChange(var1, var2 - Facing.offsetsXForSide[var6], var3 - Facing.offsetsYForSide[var6], var4 - Facing.offsetsZForSide[var6], var5);
        }
    }

    public static int getDirectionMeta(int var0)
    {
        return var0 & 7;
    }
}
