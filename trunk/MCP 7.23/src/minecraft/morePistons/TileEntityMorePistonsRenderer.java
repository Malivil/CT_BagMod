package morePistons;

import net.minecraft.client.Minecraft;
import net.minecraft.src.Block;
import net.minecraft.src.BlockPistonBase;
import net.minecraft.src.RenderBlocks;
import net.minecraft.src.RenderHelper;
import net.minecraft.src.Tessellator;
import net.minecraft.src.TileEntity;
import net.minecraft.src.TileEntityPiston;
import net.minecraft.src.TileEntityRendererPiston;
import net.minecraft.src.World;
import org.lwjgl.opengl.GL11;

public class TileEntityMorePistonsRenderer extends TileEntityRendererPiston
{
    private RenderBlocks blockRenderer;

    public void renderPiston(TileEntityPiston var1, double var2, double var4, double var6, float var8)
    {
        Block var9 = Block.blocksList[var1.getStoredBlockID()];

        if (var9 != null && var1.getProgress(var8) < 1.0F)
        {
            Tessellator var10 = Tessellator.instance;
            this.bindTextureByName("/morePistons/blocks/block_textures.png");
            RenderHelper.disableStandardItemLighting();
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glDisable(GL11.GL_CULL_FACE);

            if (Minecraft.isAmbientOcclusionEnabled())
            {
                GL11.glShadeModel(GL11.GL_SMOOTH);
            }
            else
            {
                GL11.glShadeModel(GL11.GL_FLAT);
            }

            var10.startDrawingQuads();
            var10.setTranslation((double)((float)var2 - (float)var1.xCoord + var1.getOffsetX(var8)), (double)((float)var4 - (float)var1.yCoord + var1.getOffsetY(var8)), (double)((float)var6 - (float)var1.zCoord + var1.getOffsetZ(var8)));
            var10.setColorOpaque(1, 1, 1);

            if (var9 == MorePistons.pistonExtension && var1.getProgress(var8) < 0.5F)
            {
                this.blockRenderer.renderPistonExtensionAllFaces(var9, var1.xCoord, var1.yCoord, var1.zCoord, true);
            }
            else if (var1.shouldRenderHead() && !var1.isExtending())
            {
                Block.pistonExtension.setHeadTexture(((BlockPistonBase)var9).getPistonExtensionTexture());
                this.blockRenderer.renderPistonExtensionAllFaces(Block.pistonExtension, var1.xCoord, var1.yCoord, var1.zCoord, var1.getProgress(var8) < 0.5F);
                Block.pistonExtension.clearHeadTexture();
                var10.setTranslation((double)((float)var2 - (float)var1.xCoord), (double)((float)var4 - (float)var1.yCoord), (double)((float)var6 - (float)var1.zCoord));
                this.blockRenderer.renderPistonBaseAllFaces(var9, var1.xCoord, var1.yCoord, var1.zCoord);
            }
            else
            {
                this.blockRenderer.renderBlockAllFaces(var9, var1.xCoord, var1.yCoord, var1.zCoord);
            }

            var10.setTranslation(0.0D, 0.0D, 0.0D);
            var10.draw();
            RenderHelper.enableStandardItemLighting();
        }
    }

    /**
     * Called when the ingame world being rendered changes (e.g. on world -> nether travel) due to using one renderer
     * per tile entity type, rather than instance
     */
    public void onWorldChange(World var1)
    {
        this.blockRenderer = new RenderBlocks(var1);
    }

    public void renderTileEntityAt(TileEntity var1, double var2, double var4, double var6, float var8)
    {
        this.renderPiston((TileEntityPiston)var1, var2, var4, var6, var8);
    }
}
