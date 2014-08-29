package morePistons;

import net.minecraft.src.Block;
import net.minecraft.src.BlockPistonExtension;
import net.minecraft.src.Facing;
import net.minecraft.src.World;

public class BlockMorePistonsExtension extends BlockPistonExtension
{
    private int headTexture = -1;
    public boolean northSouth = false;
    public boolean upDown = false;

    public BlockMorePistonsExtension(int var1, int var2)
    {
        super(var1, var2);
        this.setStepSound(soundStoneFootstep);
        this.setHardness(0.5F);
        this.setRequiresSelfNotify();
    }

    /**
     * ejects contained items into the world, and notifies neighbours of an update, as appropriate
     */
    public void breakBlock(World var1, int var2, int var3, int var4, int var5, int var6)
    {
        super.breakBlock(var1, var2, var3, var4, var5, var6);
        int var7 = Monty_Util.extraDisp;
        int var8 = 1 + var7;
        int var9 = var1.getBlockMetadata(var2, var3, var4);
        int var10 = getDirectionMeta(var9);
        int var11 = var2;
        int var12 = var3;
        int var13 = var4;
        int var14;

        for (var14 = 0; var14 < var8; ++var14)
        {
            var1.getBlockId(var11, var12, var13);
            int var16 = var1.getBlockMetadata(var11, var12, var13);
            int var17 = getDirectionMeta(var16);

            if (var17 >= 0 && var17 <= Facing.faceToSide.length - 1)
            {
                int var18 = Facing.faceToSide[var17];
                var11 += Facing.offsetsXForSide[var18];
                var12 += Facing.offsetsYForSide[var18];
                var13 += Facing.offsetsZForSide[var18];
                int var19 = var1.getBlockId(var11, var12, var13);

                if (var19 == MorePistons.doublePistonBase.blockID || var19 == MorePistons.doubleStickyPistonBase.blockID || var19 == MorePistons.gravitationalPistonBase.blockID)
                {
                    int var20 = var1.getBlockMetadata(var11, var12, var13);

                    if (BlockDoublePistonBase.isExtended(var20))
                    {
                        this.dropBlockAsItem(var1, var11, var12, var13, var9, 0);
                        var1.setBlockWithNotify(var11, var12, var13, 0);
                    }

                    break;
                }

                if (var19 == MorePistons.pistonRod.blockID || var19 == MorePistons.pistonExtension.blockID)
                {
                    var1.setBlockWithNotify(var11, var12, var13, 0);
                }
            }
        }

        for (var14 = 0; var14 < var8; ++var14)
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
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World var1, int var2, int var3, int var4, int var5)
    {
        int var6 = getDirectionMeta(var1.getBlockMetadata(var2, var3, var4));
        int var10000 = var2 - Facing.offsetsXForSide[var6];
        var10000 = var3 - Facing.offsetsYForSide[var6];
        var10000 = var4 - Facing.offsetsZForSide[var6];
        int var10 = var1.getBlockId(var2 - Facing.offsetsXForSide[var6], var3 - Facing.offsetsYForSide[var6], var4 - Facing.offsetsZForSide[var6]);

        if (var10 != Block.pistonBase.blockID && var10 != Block.pistonStickyBase.blockID)
        {
            if (Monty_Util.extraDisp == 0)
            {
                var1.setBlockWithNotify(var2, var3, var4, 0);
            }
            else if (var10 == Block.pistonExtension.blockID && var10 != MorePistons.pistonExtension.blockID)
            {
                ;
            }
        }
        else
        {
            Block.blocksList[var10].onNeighborBlockChange(var1, var2 - Facing.offsetsXForSide[var6], var3 - Facing.offsetsYForSide[var6], var4 - Facing.offsetsZForSide[var6], var5);
        }
    }

    /**
     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
     */
    public int idPicked(World var1, int var2, int var3, int var4)
    {
        return 0;
    }
}
