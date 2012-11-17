package metadark.mods.SuperSlopes.Slopes;

import net.minecraft.client.Minecraft;
import net.minecraft.src.Block;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.RenderBlocks;
import net.minecraft.src.Tessellator;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class RenderSlopes implements ISimpleBlockRenderingHandler
{
    public static boolean field_27511_cfgGrassFix = true;
    public boolean enableAO = false;
    public float aoLightValueThis;
    public float aoLightValueXNeg;
    public float aoLightValueYNeg;
    public float aoLightValueZNeg;
    public float aoLightValueXPos;
    public float aoLightValueYPos;
    public float aoLightValueZPos;
    public float aoLightValueXNegYNegZNeg;
    public float aoLightValueXNegYNeg;
    public float aoLightValueXNegYNegZPos;
    public float aoLightValueYNegZNeg;
    public float aoLightValueYNegZPos;
    public float aoLightValueXPosYNegZNeg;
    public float aoLightValueXPosYNeg;
    public float aoLightValueXPosYNegZPos;
    public float aoLightValueXNegYPosZNeg;
    public float aoLightValueXNegYPos;
    public float aoLightValueXNegYPosZPos;
    public float aoLightValueYPosZNeg;
    public float aoLightValueXPosYPosZNeg;
    public float aoLightValueXPosYPos;
    public float aoLightValueYPosZPos;
    public float aoLightValueXPosYPosZPos;
    public float aoLightValueXNegZNeg;
    public float aoLightValueXPosZNeg;
    public float aoLightValueXNegZPos;
    public float aoLightValueXPosZPos;
    public int field_22352_G = 1;
    public float factorTop = 1.0F;
    public float factorBottom = 0.5F;
    public float factorEast = 0.8F;
    public float factorWest = 0.8F;
    public float factorNorth = 0.6F;
    public float factorSouth = 0.6F;
    public float colorRedTopLeft_TopFace;
    public float colorRedBottomLeft_TopFace;
    public float colorRedBottomRight_TopFace;
    public float colorRedTopRight_TopFace;
    public float colorGreenTopLeft_TopFace;
    public float colorGreenBottomLeft_TopFace;
    public float colorGreenBottomRight_TopFace;
    public float colorGreenTopRight_TopFace;
    public float colorBlueTopLeft_TopFace;
    public float colorBlueBottomLeft_TopFace;
    public float colorBlueBottomRight_TopFace;
    public float colorBlueTopRight_TopFace;
    public float colorRedTopLeft_BottomFace;
    public float colorRedBottomLeft_BottomFace;
    public float colorRedBottomRight_BottomFace;
    public float colorRedTopRight_BottomFace;
    public float colorGreenTopLeft_BottomFace;
    public float colorGreenBottomLeft_BottomFace;
    public float colorGreenBottomRight_BottomFace;
    public float colorGreenTopRight_BottomFace;
    public float colorBlueTopLeft_BottomFace;
    public float colorBlueBottomLeft_BottomFace;
    public float colorBlueBottomRight_BottomFace;
    public float colorBlueTopRight_BottomFace;
    public float colorRedTopLeft_EastFace;
    public float colorRedBottomLeft_EastFace;
    public float colorRedBottomRight_EastFace;
    public float colorRedTopRight_EastFace;
    public float colorGreenTopLeft_EastFace;
    public float colorGreenBottomLeft_EastFace;
    public float colorGreenBottomRight_EastFace;
    public float colorGreenTopRight_EastFace;
    public float colorBlueTopLeft_EastFace;
    public float colorBlueBottomLeft_EastFace;
    public float colorBlueBottomRight_EastFace;
    public float colorBlueTopRight_EastFace;
    public float colorRedTopLeft_WestFace;
    public float colorRedBottomLeft_WestFace;
    public float colorRedBottomRight_WestFace;
    public float colorRedTopRight_WestFace;
    public float colorGreenTopLeft_WestFace;
    public float colorGreenBottomLeft_WestFace;
    public float colorGreenBottomRight_WestFace;
    public float colorGreenTopRight_WestFace;
    public float colorBlueTopLeft_WestFace;
    public float colorBlueBottomLeft_WestFace;
    public float colorBlueBottomRight_WestFace;
    public float colorBlueTopRight_WestFace;
    public float colorRedTopLeft_NorthFace;
    public float colorRedBottomLeft_NorthFace;
    public float colorRedBottomRight_NorthFace;
    public float colorRedTopRight_NorthFace;
    public float colorGreenTopLeft_NorthFace;
    public float colorGreenBottomLeft_NorthFace;
    public float colorGreenBottomRight_NorthFace;
    public float colorGreenTopRight_NorthFace;
    public float colorBlueTopLeft_NorthFace;
    public float colorBlueBottomLeft_NorthFace;
    public float colorBlueBottomRight_NorthFace;
    public float colorBlueTopRight_NorthFace;
    public float colorRedTopLeft_SouthFace;
    public float colorRedBottomLeft_SouthFace;
    public float colorRedBottomRight_SouthFace;
    public float colorRedTopRight_SouthFace;
    public float colorGreenTopLeft_SouthFace;
    public float colorGreenBottomLeft_SouthFace;
    public float colorGreenBottomRight_SouthFace;
    public float colorGreenTopRight_SouthFace;
    public float colorBlueTopLeft_SouthFace;
    public float colorBlueBottomLeft_SouthFace;
    public float colorBlueBottomRight_SouthFace;
    public float colorBlueTopRight_SouthFace;
    public float colorRedSlopes;
    public float colorGreenSlopes;
    public float colorBlueSlopes;

    @Override
    public void renderInventoryBlock(Block block, int var2, int var3, RenderBlocks renderer) {
        Tessellator var5 = Tessellator.instance;

        if (var3 == this.getRenderId()) {
            if (var2 / 4 == 0) {
                for (int var6 = 0; var6 < 2; ++var6) {
                    if (var6 == 0) {
                        block.setBlockBounds(0.0F, 0.5F, 0.5F, 1.0F, 1.0F, 1.0F);
                    }

                    if (var6 == 1) {
                        block.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
                    }
                    renderer.func_83018_a(block);

                    GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
                    var5.startDrawingQuads();
                    var5.setNormal(0.0F, -1.0F, 0.0F);
                    renderer.renderBottomFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSide(0));
                    var5.draw();
                    var5.startDrawingQuads();
                    var5.setNormal(0.0F, 1.0F, 0.0F);
                    renderer.renderTopFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSide(1));
                    var5.draw();
                    var5.startDrawingQuads();
                    var5.setNormal(0.0F, 0.0F, -1.0F);
                    renderer.renderEastFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSide(2));
                    var5.draw();
                    var5.startDrawingQuads();
                    var5.setNormal(0.0F, 0.0F, 1.0F);
                    renderer.renderWestFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSide(3));
                    var5.draw();
                    var5.startDrawingQuads();
                    var5.setNormal(-1.0F, 0.0F, 0.0F);
                    renderer.renderNorthFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSide(4));
                    var5.draw();
                    var5.startDrawingQuads();
                    var5.setNormal(1.0F, 0.0F, 0.0F);
                    renderer.renderSouthFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSide(5));
                    var5.draw();
                    GL11.glTranslatef(0.5F, 0.5F, 0.5F);
                }
            }
            else {
                block.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
                renderer.func_83018_a(block);
                GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
                var5.startDrawingQuads();
                var5.setNormal(0.0F, -1.0F, 0.0F);
                this.renderSlopesBottomFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSide(0), var2 + 1, renderer, 240);
                var5.draw();
                var5.startDrawingQuads();
                var5.setNormal(0.0F, 1.0F, 0.0F);
                this.renderSlopesTopFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSide(1), var2 + 1, renderer, 240);
                var5.draw();
                var5.startDrawingQuads();
                var5.setNormal(0.0F, 0.0F, -1.0F);
                this.renderSlopesEastFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSide(2), var2 + 1, renderer, 240);
                var5.draw();
                var5.startDrawingQuads();
                var5.setNormal(0.0F, 0.0F, 1.0F);
                this.renderSlopesWestFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSide(3), var2 + 1, renderer, 240);
                var5.draw();
                var5.startDrawingQuads();
                var5.setNormal(-1.0F, 0.0F, 0.0F);
                this.renderSlopesNorthFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSide(4), var2 + 1, renderer, 240);
                var5.draw();
                var5.startDrawingQuads();
                var5.setNormal(1.0F, 0.0F, 0.0F);
                this.renderSlopesSouthFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSide(5), var2 + 1, renderer, 240);
                var5.draw();
                GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            }

            block.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }
    }

    @Override
    public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
        if (modelId == this.getRenderId()) {
            int meta = world.getBlockMetadata(x, y, z);
            return meta / 4 == 0 ? this.renderBlockStairsUp(block, x, y, z, renderer, world, meta) : this.renderBlockSlopes(block, x, y, z, renderer, world, meta);
        }
        else {
            return false;
        }
    }

    @Override
    public boolean shouldRender3DInInventory() {
        return true;
    }

    @Override
    public int getRenderId() {
        return Slopes.SlopesRenderID;
    }

    public boolean renderBlockStairsUp(Block block, int x, int y, int z, RenderBlocks renderer, IBlockAccess world, int meta) {
        int side = meta % 4;

        if (side == 0) {
            block.setBlockBounds(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            renderer.func_83018_a(block);
            renderer.renderStandardBlock(block, x, y, z);
            block.setBlockBounds(0.0F, 0.5F, 0.0F, 0.5F, 1.0F, 1.0F);
            renderer.func_83018_a(block);
            renderer.renderStandardBlock(block, x, y, z);
        }
        else if (side == 1) {
            block.setBlockBounds(0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            renderer.func_83018_a(block);
            renderer.renderStandardBlock(block, x, y, z);
            block.setBlockBounds(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
            renderer.func_83018_a(block);
            renderer.renderStandardBlock(block, x, y, z);
        }
        else if (side == 2) {
            block.setBlockBounds(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
            renderer.func_83018_a(block);
            renderer.renderStandardBlock(block, x, y, z);
            block.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 0.5F);
            renderer.func_83018_a(block);
            renderer.renderStandardBlock(block, x, y, z);
        }
        else if (side == 3) {
            block.setBlockBounds(0.0F, 0.5F, 0.5F, 1.0F, 1.0F, 1.0F);
            renderer.func_83018_a(block);
            renderer.renderStandardBlock(block, x, y, z);
            block.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
            renderer.func_83018_a(block);
            renderer.renderStandardBlock(block, x, y, z);
        }

        block.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        return false;
    }

    public boolean renderBlockSlopes(Block block, int x, int y, int z, RenderBlocks renderer, IBlockAccess world, int meta) {
        int color = block.colorMultiplier(world, x, y, z);
        float r = (float)(color >> 16 & 255) / 255.0F;
        float g = (float)(color >> 8 & 255) / 255.0F;
        float b = (float)(color & 255) / 255.0F;
        return Minecraft.isAmbientOcclusionEnabled() ? this.renderSlopesBlockWithAmbientOcclusion(block, x, y, z, r, g, b, meta, renderer, world) : this.renderSlopesBlockWithColorMultiplier(block, x, y, z, r, g, b, meta, renderer, world);
    }

    public boolean renderSlopesBlockWithAmbientOcclusion(Block block, int x, int y, int z, float r, float g, float b, int meta, RenderBlocks renderer, IBlockAccess world) {
        this.enableAO = true;
        boolean var11 = false;
        boolean var12 = true;
        boolean var13 = true;
        boolean var14 = true;
        boolean var15 = true;
        boolean var16 = true;
        boolean var17 = true;
        this.aoLightValueThis = block.getAmbientOcclusionLightValue(world, x, y, z);
        this.aoLightValueXNeg = block.getAmbientOcclusionLightValue(world, x - 1, y, z);
        this.aoLightValueYNeg = block.getAmbientOcclusionLightValue(world, x, y - 1, z);
        this.aoLightValueZNeg = block.getAmbientOcclusionLightValue(world, x, y, z - 1);
        this.aoLightValueXPos = block.getAmbientOcclusionLightValue(world, x + 1, y, z);
        this.aoLightValueYPos = block.getAmbientOcclusionLightValue(world, x, y + 1, z);
        this.aoLightValueZPos = block.getAmbientOcclusionLightValue(world, x, y, z + 1);
        this.aoLightValueXPosYPos = block.getAmbientOcclusionLightValue(world, x + 1, y + 1, z);
        this.aoLightValueXPosYNeg = block.getAmbientOcclusionLightValue(world, x + 1, y - 1, z);
        this.aoLightValueXPosZPos = block.getAmbientOcclusionLightValue(world, x + 1, y, z + 1);
        this.aoLightValueXPosZNeg = block.getAmbientOcclusionLightValue(world, x + 1, y, z - 1);
        this.aoLightValueXNegYPos = block.getAmbientOcclusionLightValue(world, x - 1, y + 1, z);
        this.aoLightValueXNegYNeg = block.getAmbientOcclusionLightValue(world, x - 1, y - 1, z);
        this.aoLightValueXNegZNeg = block.getAmbientOcclusionLightValue(world, x - 1, y, z - 1);
        this.aoLightValueXNegZPos = block.getAmbientOcclusionLightValue(world, x - 1, y, z + 1);
        this.aoLightValueYPosZPos = block.getAmbientOcclusionLightValue(world, x, y + 1, z + 1);
        this.aoLightValueYPosZNeg = block.getAmbientOcclusionLightValue(world, x, y + 1, z - 1);
        this.aoLightValueYNegZPos = block.getAmbientOcclusionLightValue(world, x, y - 1, z + 1);
        this.aoLightValueYNegZNeg = block.getAmbientOcclusionLightValue(world, x, y - 1, z - 1);
        this.aoLightValueXPosYPosZPos = block.getAmbientOcclusionLightValue(world, x + 1, y + 1, z + 1);
        this.aoLightValueXPosYNegZPos = block.getAmbientOcclusionLightValue(world, x + 1, y - 1, z + 1);
        this.aoLightValueXPosYPosZNeg = block.getAmbientOcclusionLightValue(world, x + 1, y + 1, z - 1);
        this.aoLightValueXPosYNegZNeg = block.getAmbientOcclusionLightValue(world, x + 1, y - 1, z - 1);
        this.aoLightValueXNegYPosZPos = block.getAmbientOcclusionLightValue(world, x - 1, y + 1, z + 1);
        this.aoLightValueXNegYNegZPos = block.getAmbientOcclusionLightValue(world, x - 1, y - 1, z + 1);
        this.aoLightValueXNegYPosZNeg = block.getAmbientOcclusionLightValue(world, x - 1, y + 1, z - 1);
        this.aoLightValueXNegYNegZNeg = block.getAmbientOcclusionLightValue(world, x - 1, y - 1, z - 1);

        if (block.blockIndexInTexture == 3) {
            var17 = false;
            var16 = false;
            var15 = false;
            var14 = false;
            var12 = false;
        }

        float var19;
        float var18;
        float var21;
        float var20;

        if (this.field_22352_G > 0) {
            var18 = (this.aoLightValueXNegYNegZPos + this.aoLightValueXNegYNeg + this.aoLightValueYNegZPos + this.aoLightValueYNeg) / 4.0F;
            var21 = (this.aoLightValueYNegZPos + this.aoLightValueYNeg + this.aoLightValueXPosYNegZPos + this.aoLightValueXPosYNeg) / 4.0F;
            var20 = (this.aoLightValueYNeg + this.aoLightValueYNegZNeg + this.aoLightValueXPosYNeg + this.aoLightValueXPosYNegZNeg) / 4.0F;
            var19 = (this.aoLightValueXNegYNeg + this.aoLightValueXNegYNegZNeg + this.aoLightValueYNeg + this.aoLightValueYNegZNeg) / 4.0F;
        }
        else {
            var21 = this.aoLightValueYNeg;
            var20 = this.aoLightValueYNeg;
            var19 = this.aoLightValueYNeg;
            var18 = this.aoLightValueYNeg;
        }

        this.colorRedTopLeft_BottomFace = this.colorRedBottomLeft_BottomFace = this.colorRedBottomRight_BottomFace = this.colorRedTopRight_BottomFace = (var12 ? r : 1.0F) * 0.5F;
        this.colorGreenTopLeft_BottomFace = this.colorGreenBottomLeft_BottomFace = this.colorGreenBottomRight_BottomFace = this.colorGreenTopRight_BottomFace = (var12 ? g : 1.0F) * 0.5F;
        this.colorBlueTopLeft_BottomFace = this.colorBlueBottomLeft_BottomFace = this.colorBlueBottomRight_BottomFace = this.colorBlueTopRight_BottomFace = (var12 ? b : 1.0F) * 0.5F;
        this.colorRedTopLeft_BottomFace *= var18;
        this.colorGreenTopLeft_BottomFace *= var18;
        this.colorBlueTopLeft_BottomFace *= var18;
        this.colorRedBottomLeft_BottomFace *= var19;
        this.colorGreenBottomLeft_BottomFace *= var19;
        this.colorBlueBottomLeft_BottomFace *= var19;
        this.colorRedBottomRight_BottomFace *= var20;
        this.colorGreenBottomRight_BottomFace *= var20;
        this.colorBlueBottomRight_BottomFace *= var20;
        this.colorRedTopRight_BottomFace *= var21;
        this.colorGreenTopRight_BottomFace *= var21;
        this.colorBlueTopRight_BottomFace *= var21;
        float var23;
        float var22;
        float var25;
        float var24;

        if (this.field_22352_G > 0) {
            var25 = (this.aoLightValueXNegYPosZPos + this.aoLightValueXNegYPos + this.aoLightValueYPosZPos + this.aoLightValueYPos) / 4.0F;
            var22 = (this.aoLightValueYPosZPos + this.aoLightValueYPos + this.aoLightValueXPosYPosZPos + this.aoLightValueXPosYPos) / 4.0F;
            var23 = (this.aoLightValueYPos + this.aoLightValueYPosZNeg + this.aoLightValueXPosYPos + this.aoLightValueXPosYPosZNeg) / 4.0F;
            var24 = (this.aoLightValueXNegYPos + this.aoLightValueXNegYPosZNeg + this.aoLightValueYPos + this.aoLightValueYPosZNeg) / 4.0F;
        }
        else {
            var25 = this.aoLightValueYPos;
            var24 = this.aoLightValueYPos;
            var23 = this.aoLightValueYPos;
            var22 = this.aoLightValueYPos;
        }

        this.colorRedTopLeft_TopFace = this.colorRedBottomLeft_TopFace = this.colorRedBottomRight_TopFace = this.colorRedTopRight_TopFace = var13 ? r : 1.0F;
        this.colorGreenTopLeft_TopFace = this.colorGreenBottomLeft_TopFace = this.colorGreenBottomRight_TopFace = this.colorGreenTopRight_TopFace = var13 ? g : 1.0F;
        this.colorBlueTopLeft_TopFace = this.colorBlueBottomLeft_TopFace = this.colorBlueBottomRight_TopFace = this.colorBlueTopRight_TopFace = var13 ? b : 1.0F;
        this.colorRedTopLeft_TopFace *= var22;
        this.colorGreenTopLeft_TopFace *= var22;
        this.colorBlueTopLeft_TopFace *= var22;
        this.colorRedBottomLeft_TopFace *= var23;
        this.colorGreenBottomLeft_TopFace *= var23;
        this.colorBlueBottomLeft_TopFace *= var23;
        this.colorRedBottomRight_TopFace *= var24;
        this.colorGreenBottomRight_TopFace *= var24;
        this.colorBlueBottomRight_TopFace *= var24;
        this.colorRedTopRight_TopFace *= var25;
        this.colorGreenTopRight_TopFace *= var25;
        this.colorBlueTopRight_TopFace *= var25;
        float var27;
        float var26;
        float var29;
        float var28;

        if (this.field_22352_G > 0) {
            var26 = (this.aoLightValueXNegZNeg + this.aoLightValueXNegYPosZNeg + this.aoLightValueZNeg + this.aoLightValueYPosZNeg) / 4.0F;
            var27 = (this.aoLightValueZNeg + this.aoLightValueYPosZNeg + this.aoLightValueXPosZNeg + this.aoLightValueXPosYPosZNeg) / 4.0F;
            var28 = (this.aoLightValueYNegZNeg + this.aoLightValueZNeg + this.aoLightValueXPosYNegZNeg + this.aoLightValueXPosZNeg) / 4.0F;
            var29 = (this.aoLightValueXNegYNegZNeg + this.aoLightValueXNegZNeg + this.aoLightValueYNegZNeg + this.aoLightValueZNeg) / 4.0F;
        }
        else {
            var29 = this.aoLightValueZNeg;
            var28 = this.aoLightValueZNeg;
            var27 = this.aoLightValueZNeg;
            var26 = this.aoLightValueZNeg;
        }

        this.colorRedTopLeft_EastFace = this.colorRedBottomLeft_EastFace = this.colorRedBottomRight_EastFace = this.colorRedTopRight_EastFace = (var14 ? r : 1.0F) * 0.8F;
        this.colorGreenTopLeft_EastFace = this.colorGreenBottomLeft_EastFace = this.colorGreenBottomRight_EastFace = this.colorGreenTopRight_EastFace = (var14 ? g : 1.0F) * 0.8F;
        this.colorBlueTopLeft_EastFace = this.colorBlueBottomLeft_EastFace = this.colorBlueBottomRight_EastFace = this.colorBlueTopRight_EastFace = (var14 ? b : 1.0F) * 0.8F;
        this.colorRedTopLeft_EastFace *= var26;
        this.colorGreenTopLeft_EastFace *= var26;
        this.colorBlueTopLeft_EastFace *= var26;
        this.colorRedBottomLeft_EastFace *= var27;
        this.colorGreenBottomLeft_EastFace *= var27;
        this.colorBlueBottomLeft_EastFace *= var27;
        this.colorRedBottomRight_EastFace *= var28;
        this.colorGreenBottomRight_EastFace *= var28;
        this.colorBlueBottomRight_EastFace *= var28;
        this.colorRedTopRight_EastFace *= var29;
        this.colorGreenTopRight_EastFace *= var29;
        this.colorBlueTopRight_EastFace *= var29;
        int var30 = block.getBlockTexture(world, x, y, z, 2);
        float var31;
        float var34;
        float var32;
        float var33;

        if (this.field_22352_G > 0) {
            var31 = (this.aoLightValueXNegZPos + this.aoLightValueXNegYPosZPos + this.aoLightValueZPos + this.aoLightValueYPosZPos) / 4.0F;
            var34 = (this.aoLightValueZPos + this.aoLightValueYPosZPos + this.aoLightValueXPosZPos + this.aoLightValueXPosYPosZPos) / 4.0F;
            var33 = (this.aoLightValueYNegZPos + this.aoLightValueZPos + this.aoLightValueXPosYNegZPos + this.aoLightValueXPosZPos) / 4.0F;
            var32 = (this.aoLightValueXNegYNegZPos + this.aoLightValueXNegZPos + this.aoLightValueYNegZPos + this.aoLightValueZPos) / 4.0F;
        }
        else {
            var34 = this.aoLightValueZPos;
            var33 = this.aoLightValueZPos;
            var32 = this.aoLightValueZPos;
            var31 = this.aoLightValueZPos;
        }

        this.colorRedTopLeft_WestFace = this.colorRedBottomLeft_WestFace = this.colorRedBottomRight_WestFace = this.colorRedTopRight_WestFace = (var15 ? r : 1.0F) * 0.8F;
        this.colorGreenTopLeft_WestFace = this.colorGreenBottomLeft_WestFace = this.colorGreenBottomRight_WestFace = this.colorGreenTopRight_WestFace = (var15 ? g : 1.0F) * 0.8F;
        this.colorBlueTopLeft_WestFace = this.colorBlueBottomLeft_WestFace = this.colorBlueBottomRight_WestFace = this.colorBlueTopRight_WestFace = (var15 ? b : 1.0F) * 0.8F;
        this.colorRedTopLeft_WestFace *= var31;
        this.colorGreenTopLeft_WestFace *= var31;
        this.colorBlueTopLeft_WestFace *= var31;
        this.colorRedBottomLeft_WestFace *= var32;
        this.colorGreenBottomLeft_WestFace *= var32;
        this.colorBlueBottomLeft_WestFace *= var32;
        this.colorRedBottomRight_WestFace *= var33;
        this.colorGreenBottomRight_WestFace *= var33;
        this.colorBlueBottomRight_WestFace *= var33;
        this.colorRedTopRight_WestFace *= var34;
        this.colorGreenTopRight_WestFace *= var34;
        this.colorBlueTopRight_WestFace *= var34;
        int var35 = block.getBlockTexture(world, x, y, z, 3);
        float var38;
        float var39;
        float var36;
        float var37;

        if (this.field_22352_G > 0) {
            var39 = (this.aoLightValueXNegYNeg + this.aoLightValueXNegYNegZPos + this.aoLightValueXNeg + this.aoLightValueXNegZPos) / 4.0F;
            var36 = (this.aoLightValueXNeg + this.aoLightValueXNegZPos + this.aoLightValueXNegYPos + this.aoLightValueXNegYPosZPos) / 4.0F;
            var37 = (this.aoLightValueXNegZNeg + this.aoLightValueXNeg + this.aoLightValueXNegYPosZNeg + this.aoLightValueXNegYPos) / 4.0F;
            var38 = (this.aoLightValueXNegYNegZNeg + this.aoLightValueXNegYNeg + this.aoLightValueXNegZNeg + this.aoLightValueXNeg) / 4.0F;
        }
        else {
            var39 = this.aoLightValueXNeg;
            var38 = this.aoLightValueXNeg;
            var37 = this.aoLightValueXNeg;
            var36 = this.aoLightValueXNeg;
        }

        this.colorRedTopLeft_NorthFace = this.colorRedBottomLeft_NorthFace = this.colorRedBottomRight_NorthFace = this.colorRedTopRight_NorthFace = (var16 ? r : 1.0F) * 0.6F;
        this.colorGreenTopLeft_NorthFace = this.colorGreenBottomLeft_NorthFace = this.colorGreenBottomRight_NorthFace = this.colorGreenTopRight_NorthFace = (var16 ? g : 1.0F) * 0.6F;
        this.colorBlueTopLeft_NorthFace = this.colorBlueBottomLeft_NorthFace = this.colorBlueBottomRight_NorthFace = this.colorBlueTopRight_NorthFace = (var16 ? b : 1.0F) * 0.6F;
        this.colorRedTopLeft_NorthFace *= var36;
        this.colorGreenTopLeft_NorthFace *= var36;
        this.colorBlueTopLeft_NorthFace *= var36;
        this.colorRedBottomLeft_NorthFace *= var37;
        this.colorGreenBottomLeft_NorthFace *= var37;
        this.colorBlueBottomLeft_NorthFace *= var37;
        this.colorRedBottomRight_NorthFace *= var38;
        this.colorGreenBottomRight_NorthFace *= var38;
        this.colorBlueBottomRight_NorthFace *= var38;
        this.colorRedTopRight_NorthFace *= var39;
        this.colorGreenTopRight_NorthFace *= var39;
        this.colorBlueTopRight_NorthFace *= var39;
        int var40 = block.getBlockTexture(world, x, y, z, 4);
        float var42;
        float var43;
        float var41;
        float var44;

        if (this.field_22352_G > 0) {
            var41 = (this.aoLightValueXPosYNeg + this.aoLightValueXPosYNegZPos + this.aoLightValueXPos + this.aoLightValueXPosZPos) / 4.0F;
            var44 = (this.aoLightValueXPos + this.aoLightValueXPosZPos + this.aoLightValueXPosYPos + this.aoLightValueXPosYPosZPos) / 4.0F;
            var43 = (this.aoLightValueXPosZNeg + this.aoLightValueXPos + this.aoLightValueXPosYPosZNeg + this.aoLightValueXPosYPos) / 4.0F;
            var42 = (this.aoLightValueXPosYNegZNeg + this.aoLightValueXPosYNeg + this.aoLightValueXPosZNeg + this.aoLightValueXPos) / 4.0F;
        }
        else {
            var44 = this.aoLightValueXPos;
            var43 = this.aoLightValueXPos;
            var42 = this.aoLightValueXPos;
            var41 = this.aoLightValueXPos;
        }

        this.colorRedTopLeft_SouthFace = this.colorRedBottomLeft_SouthFace = this.colorRedBottomRight_SouthFace = this.colorRedTopRight_SouthFace = (var17 ? r : 1.0F) * 0.6F;
        this.colorGreenTopLeft_SouthFace = this.colorGreenBottomLeft_SouthFace = this.colorGreenBottomRight_SouthFace = this.colorGreenTopRight_SouthFace = (var17 ? g : 1.0F) * 0.6F;
        this.colorBlueTopLeft_SouthFace = this.colorBlueBottomLeft_SouthFace = this.colorBlueBottomRight_SouthFace = this.colorBlueTopRight_SouthFace = (var17 ? b : 1.0F) * 0.6F;
        this.colorRedTopLeft_SouthFace *= var41;
        this.colorGreenTopLeft_SouthFace *= var41;
        this.colorBlueTopLeft_SouthFace *= var41;
        this.colorRedBottomLeft_SouthFace *= var42;
        this.colorGreenBottomLeft_SouthFace *= var42;
        this.colorBlueBottomLeft_SouthFace *= var42;
        this.colorRedBottomRight_SouthFace *= var43;
        this.colorGreenBottomRight_SouthFace *= var43;
        this.colorBlueBottomRight_SouthFace *= var43;
        this.colorRedTopRight_SouthFace *= var44;
        this.colorGreenTopRight_SouthFace *= var44;
        this.colorBlueTopRight_SouthFace *= var44;
        int var45 = block.getBlockTexture(world, x, y, z, 5);
        this.colorRedSlopes = r;
        this.colorGreenSlopes = g;
        this.colorBlueSlopes = b;

        if (renderer.renderAllFaces || block.shouldSideBeRendered(world, x, y - 1, z, 0)) {
            this.renderSlopesBottomFace(block, (double)x, (double)y, (double)z, block.getBlockTexture(world, x, y, z, 0), meta, renderer, block.getMixedBrightnessForBlock(world, x, y, z));
            var11 = true;
        }

        if (renderer.renderAllFaces || block.shouldSideBeRendered(world, x, y + 1, z, 1)) {
            this.renderSlopesTopFace(block, (double)x, (double)y, (double)z, block.getBlockTexture(world, x, y, z, 0), meta, renderer, block.getMixedBrightnessForBlock(world, x, y, z));
            var11 = true;
        }

        if (renderer.renderAllFaces || block.shouldSideBeRendered(world, x, y, z - 1, 2)) {
            this.renderSlopesEastFace(block, (double)x, (double)y, (double)z, var30, meta, renderer, block.getMixedBrightnessForBlock(world, x, y, z));

            if (field_27511_cfgGrassFix && var30 == 3) {
                this.colorRedTopLeft_EastFace *= r;
                this.colorRedBottomLeft_EastFace *= r;
                this.colorRedBottomRight_EastFace *= r;
                this.colorRedTopRight_EastFace *= r;
                this.colorGreenTopLeft_EastFace *= g;
                this.colorGreenBottomLeft_EastFace *= g;
                this.colorGreenBottomRight_EastFace *= g;
                this.colorGreenTopRight_EastFace *= g;
                this.colorBlueTopLeft_EastFace *= b;
                this.colorBlueBottomLeft_EastFace *= b;
                this.colorBlueBottomRight_EastFace *= b;
                this.colorBlueTopRight_EastFace *= b;
                this.renderSlopesEastFace(block, (double)x, (double)y, (double)z, 38, meta, renderer, block.getMixedBrightnessForBlock(world, x, y, z));
            }

            var11 = true;
        }

        if (renderer.renderAllFaces || block.shouldSideBeRendered(world, x, y, z + 1, 3)) {
            this.renderSlopesWestFace(block, (double)x, (double)y, (double)z, var35, meta, renderer, block.getMixedBrightnessForBlock(world, x, y, z));

            if (field_27511_cfgGrassFix && var35 == 3) {
                this.colorRedTopLeft_WestFace *= r;
                this.colorRedBottomLeft_WestFace *= r;
                this.colorRedBottomRight_WestFace *= r;
                this.colorRedTopRight_WestFace *= r;
                this.colorGreenTopLeft_WestFace *= g;
                this.colorGreenBottomLeft_WestFace *= g;
                this.colorGreenBottomRight_WestFace *= g;
                this.colorGreenTopRight_WestFace *= g;
                this.colorBlueTopLeft_WestFace *= b;
                this.colorBlueBottomLeft_WestFace *= b;
                this.colorBlueBottomRight_WestFace *= b;
                this.colorBlueTopRight_WestFace *= b;
                this.renderSlopesWestFace(block, (double)x, (double)y, (double)z, 38, meta, renderer, block.getMixedBrightnessForBlock(world, x, y, z));
            }

            var11 = true;
        }

        if (renderer.renderAllFaces || block.shouldSideBeRendered(world, x - 1, y, z, 4)) {
            this.renderSlopesNorthFace(block, (double)x, (double)y, (double)z, var40, meta, renderer, block.getMixedBrightnessForBlock(world, x, y, z));

            if (field_27511_cfgGrassFix && var40 == 3) {
                this.colorRedTopLeft_NorthFace *= r;
                this.colorRedBottomLeft_NorthFace *= r;
                this.colorRedBottomRight_NorthFace *= r;
                this.colorRedTopRight_NorthFace *= r;
                this.colorGreenTopLeft_NorthFace *= g;
                this.colorGreenBottomLeft_NorthFace *= g;
                this.colorGreenBottomRight_NorthFace *= g;
                this.colorGreenTopRight_NorthFace *= g;
                this.colorBlueTopLeft_NorthFace *= b;
                this.colorBlueBottomLeft_NorthFace *= b;
                this.colorBlueBottomRight_NorthFace *= b;
                this.colorBlueTopRight_NorthFace *= b;
                this.renderSlopesNorthFace(block, (double)x, (double)y, (double)z, 38, meta, renderer, block.getMixedBrightnessForBlock(world, x, y, z));
            }

            var11 = true;
        }

        if (renderer.renderAllFaces || block.shouldSideBeRendered(world, x + 1, y, z, 5)) {
            this.renderSlopesSouthFace(block, (double)x, (double)y, (double)z, var45, meta, renderer, block.getMixedBrightnessForBlock(world, x, y, z));

            if (field_27511_cfgGrassFix && var45 == 3) {
                this.colorRedTopLeft_SouthFace *= r;
                this.colorRedBottomLeft_SouthFace *= r;
                this.colorRedBottomRight_SouthFace *= r;
                this.colorRedTopRight_SouthFace *= r;
                this.colorGreenTopLeft_SouthFace *= g;
                this.colorGreenBottomLeft_SouthFace *= g;
                this.colorGreenBottomRight_SouthFace *= g;
                this.colorGreenTopRight_SouthFace *= g;
                this.colorBlueTopLeft_SouthFace *= b;
                this.colorBlueBottomLeft_SouthFace *= b;
                this.colorBlueBottomRight_SouthFace *= b;
                this.colorBlueTopRight_SouthFace *= b;
                this.renderSlopesSouthFace(block, (double)x, (double)y, (double)z, 38, meta, renderer, block.getMixedBrightnessForBlock(world, x, y, z));
            }

            var11 = true;
        }

        this.enableAO = false;
        return var11;
    }

    public boolean renderSlopesBlockWithColorMultiplier(Block var1, int var2, int var3, int var4, float var5, float var6, float var7, int var8, RenderBlocks var9, IBlockAccess var10) {
        Tessellator var11 = Tessellator.instance;
        boolean var12 = false;
        float var13 = 0.5F;
        float var14 = 1.0F;
        float var15 = 0.8F;
        float var16 = 0.6F;
        float var17 = var14 * var5;
        float var18 = var14 * var6;
        float var19 = var14 * var7;

        if (var1 == Block.grass) {
            var7 = 1.0F;
            var6 = 1.0F;
            var5 = 1.0F;
        }

        float var20 = var13 * var5;
        float var21 = var15 * var5;
        float var22 = var16 * var5;
        float var23 = var13 * var6;
        float var24 = var15 * var6;
        float var25 = var16 * var6;
        float var26 = var13 * var7;
        float var27 = var15 * var7;
        float var28 = var16 * var7;
        float var29 = var1.getAmbientOcclusionLightValue(var10, var2, var3, var4);
        float var30;

        if ((var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2, var3 - 1, var4, 0)) && var8 / 4 != 2) {
            var30 = var1.getAmbientOcclusionLightValue(var10, var2, var3 - 1, var4);
            var11.setColorOpaque_F(var20 * var30, var23 * var30, var26 * var30);
            this.renderSlopesBottomFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 0), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            var12 = true;
        }

        if ((var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2, var3 + 1, var4, 1)) && var8 / 4 != 1) {
            var30 = var1.getAmbientOcclusionLightValue(var10, var2, var3 + 1, var4);

            if (var1.getBlockBoundsMaxY() != 1.0D && !var1.blockMaterial.isLiquid()) {
                var30 = var29;
            }

            var11.setColorOpaque_F(var17 * var30, var18 * var30, var19 * var30);
            this.renderSlopesTopFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 1), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            var12 = true;
        }

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2, var3, var4 - 1, 2) || var8 == 6 || var8 == 10 || var8 == 12) {
            if (var8 == 6) {
                var11.setColorOpaque_F(var21 * var29, var24 * var29, var27 * var29);
                this.renderSlopesEastFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 1), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }
            else if (var8 == 10) {
                var11.setColorOpaque_F(var21 * var29, var24 * var29, var27 * var29);
                this.renderSlopesEastFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 0), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }
            else if (var8 == 12) {
                var11.setColorOpaque_F(var21 * var29, var24 * var29, var27 * var29);
                this.renderSlopesEastFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 2), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }
            else {
                var30 = var1.getAmbientOcclusionLightValue(var10, var2, var3, var4 - 1);
                var11.setColorOpaque_F(var21 * var30, var24 * var30, var27 * var30);
                this.renderSlopesEastFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 2), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }

            var12 = true;
        }

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2, var3, var4 + 1, 3) || var8 == 7 || var8 == 11 || var8 == 13) {
            if (var8 == 7) {
                var11.setColorOpaque_F(var21 * var29, var24 * var29, var27 * var29);
                this.renderSlopesWestFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 1), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }
            else if (var8 == 11) {
                var11.setColorOpaque_F(var21 * var29, var24 * var29, var27 * var29);
                this.renderSlopesWestFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 0), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }
            else if (var8 == 13) {
                var11.setColorOpaque_F(var21 * var29, var24 * var29, var27 * var29);
                this.renderSlopesWestFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 3), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }
            else {
                var30 = var1.getAmbientOcclusionLightValue(var10, var2, var3, var4 + 1);
                var11.setColorOpaque_F(var21 * var30, var24 * var30, var27 * var30);
                this.renderSlopesWestFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 3), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }

            var12 = true;
        }

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2 - 1, var3, var4, 4) || var8 == 4 || var8 == 8 || var8 == 15) {
            if (var8 == 4) {
                var11.setColorOpaque_F(var22 * var29, var25 * var29, var28 * var29);
                this.renderSlopesNorthFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 1), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }
            else if (var8 == 8) {
                var11.setColorOpaque_F(var22 * var29, var25 * var29, var28 * var29);
                this.renderSlopesNorthFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 0), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }
            else if (var8 == 15) {
                var11.setColorOpaque_F(var22 * var29, var25 * var29, var28 * var29);
                this.renderSlopesNorthFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 4), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }
            else {
                var30 = var1.getAmbientOcclusionLightValue(var10, var2 - 1, var3, var4);
                var11.setColorOpaque_F(var22 * var30, var25 * var30, var28 * var30);
                this.renderSlopesNorthFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 4), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }

            var12 = true;
        }

        if (var9.renderAllFaces || var1.shouldSideBeRendered(var10, var2 + 1, var3, var4, 5) || var8 == 5 || var8 == 9 || var8 == 14) {
            if (var8 == 5) {
                var11.setColorOpaque_F(var22 * var29, var25 * var29, var28 * var29);
                this.renderSlopesSouthFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 1), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }
            else if (var8 == 9) {
                var11.setColorOpaque_F(var22 * var29, var25 * var29, var28 * var29);
                this.renderSlopesSouthFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 0), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }
            else if (var8 == 14) {
                var11.setColorOpaque_F(var22 * var29, var25 * var29, var28 * var29);
                this.renderSlopesSouthFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 5), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }
            else {
                var30 = var1.getAmbientOcclusionLightValue(var10, var2 + 1, var3, var4);
                var11.setColorOpaque_F(var22 * var30, var25 * var30, var28 * var30);
                this.renderSlopesSouthFace(var1, (double)var2, (double)var3, (double)var4, var1.getBlockTexture(var10, var2, var3, var4, 5), var8, var9, var1.getMixedBrightnessForBlock(var10, var2, var3, var4));
            }

            var12 = true;
        }

        return var12;
    }

    public void renderSlopesBottomFace(Block var1, double var2, double var4, double var6, int var8, int var9, RenderBlocks var10, int var11) {
        Tessellator var12 = Tessellator.instance;
        var12.setBrightness(var11);

        if (var10.overrideBlockTexture >= 0) {
            var8 = var10.overrideBlockTexture;
        }

        int var13 = (var8 & 15) << 4;
        int var14 = var8 & 240;
        double var15 = ((double)var13 + var1.getBlockBoundsMinX() * 16.0D) / 256.0D;
        double var17 = ((double)var13 + var1.getBlockBoundsMaxX() * 16.0D - 0.01D) / 256.0D;
        double var19 = ((double)var14 + var1.getBlockBoundsMinZ() * 16.0D) / 256.0D;
        double var21 = ((double)var14 + var1.getBlockBoundsMaxZ() * 16.0D - 0.01D) / 256.0D;

        if (var1.getBlockBoundsMinX() < 0.0D || var1.getBlockBoundsMaxX() > 1.0D) {
            var15 = (double)(((float)var13 + 0.0F) / 256.0F);
            var17 = (double)(((float)var13 + 15.99F) / 256.0F);
        }

        if (var1.getBlockBoundsMinZ() < 0.0D || var1.getBlockBoundsMaxZ() > 1.0D) {
            var19 = (double)(((float)var14 + 0.0F) / 256.0F);
            var21 = (double)(((float)var14 + 15.99F) / 256.0F);
        }

        double var23 = var2 + var1.getBlockBoundsMinX();
        double var25 = var2 + var1.getBlockBoundsMaxX();
        double var27 = var4 + var1.getBlockBoundsMinY();
        double var29 = var6 + var1.getBlockBoundsMinZ();
        double var31 = var6 + var1.getBlockBoundsMaxZ();

        if (this.enableAO) {
            if (var9 != 4 && var9 != 5 && var9 != 6 && var9 != 7) {
                if (var9 == 12) {
                    var12.setColorOpaque_F(this.colorRedTopLeft_BottomFace, this.colorGreenTopLeft_BottomFace, this.colorBlueTopLeft_BottomFace);
                    var12.addVertexWithUV(var23, var27, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedBottomRight_BottomFace, this.colorGreenBottomRight_BottomFace, this.colorBlueBottomRight_BottomFace);
                    var12.addVertexWithUV(var25, var27, var29, var17, var19);
                    var12.setColorOpaque_F(this.colorRedBottomRight_BottomFace, this.colorGreenBottomRight_BottomFace, this.colorBlueBottomRight_BottomFace);
                    var12.addVertexWithUV(var25, var27, var29, var17, var19);
                    var12.setColorOpaque_F(this.colorRedTopRight_BottomFace, this.colorGreenTopRight_BottomFace, this.colorBlueTopRight_BottomFace);
                    var12.addVertexWithUV(var25, var27, var31, var17, var21);
                }
                else if (var9 == 13) {
                    var12.setColorOpaque_F(this.colorRedTopLeft_BottomFace, this.colorGreenTopLeft_BottomFace, this.colorBlueTopLeft_BottomFace);
                    var12.addVertexWithUV(var23, var27, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedBottomLeft_BottomFace, this.colorGreenBottomLeft_BottomFace, this.colorBlueBottomLeft_BottomFace);
                    var12.addVertexWithUV(var23, var27, var29, var15, var19);
                    var12.setColorOpaque_F(this.colorRedBottomRight_BottomFace, this.colorGreenBottomRight_BottomFace, this.colorBlueBottomRight_BottomFace);
                    var12.addVertexWithUV(var25, var27, var29, var17, var19);
                    var12.setColorOpaque_F(this.colorRedTopLeft_BottomFace, this.colorGreenTopLeft_BottomFace, this.colorBlueTopLeft_BottomFace);
                    var12.addVertexWithUV(var23, var27, var31, var15, var21);
                }
                else if (var9 == 14) {
                    var12.setColorOpaque_F(this.colorRedTopLeft_BottomFace, this.colorGreenTopLeft_BottomFace, this.colorBlueTopLeft_BottomFace);
                    var12.addVertexWithUV(var23, var27, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedBottomLeft_BottomFace, this.colorGreenBottomLeft_BottomFace, this.colorBlueBottomLeft_BottomFace);
                    var12.addVertexWithUV(var23, var27, var29, var15, var19);
                    var12.setColorOpaque_F(this.colorRedTopRight_BottomFace, this.colorGreenTopRight_BottomFace, this.colorBlueTopRight_BottomFace);
                    var12.addVertexWithUV(var25, var27, var31, var17, var21);
                    var12.setColorOpaque_F(this.colorRedTopRight_BottomFace, this.colorGreenTopRight_BottomFace, this.colorBlueTopRight_BottomFace);
                    var12.addVertexWithUV(var25, var27, var31, var17, var21);
                }
                else if (var9 == 15) {
                    var12.setColorOpaque_F(this.colorRedBottomLeft_BottomFace, this.colorGreenBottomLeft_BottomFace, this.colorBlueBottomLeft_BottomFace);
                    var12.addVertexWithUV(var23, var27, var29, var15, var19);
                    var12.setColorOpaque_F(this.colorRedBottomLeft_BottomFace, this.colorGreenBottomLeft_BottomFace, this.colorBlueBottomLeft_BottomFace);
                    var12.addVertexWithUV(var23, var27, var29, var15, var19);
                    var12.setColorOpaque_F(this.colorRedBottomRight_BottomFace, this.colorGreenBottomRight_BottomFace, this.colorBlueBottomRight_BottomFace);
                    var12.addVertexWithUV(var25, var27, var29, var17, var19);
                    var12.setColorOpaque_F(this.colorRedTopRight_BottomFace, this.colorGreenTopRight_BottomFace, this.colorBlueTopRight_BottomFace);
                    var12.addVertexWithUV(var25, var27, var31, var17, var21);
                }
            }
            else {
                var12.setColorOpaque_F(this.colorRedTopLeft_BottomFace, this.colorGreenTopLeft_BottomFace, this.colorBlueTopLeft_BottomFace);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.setColorOpaque_F(this.colorRedBottomLeft_BottomFace, this.colorGreenBottomLeft_BottomFace, this.colorBlueBottomLeft_BottomFace);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.setColorOpaque_F(this.colorRedBottomRight_BottomFace, this.colorGreenBottomRight_BottomFace, this.colorBlueBottomRight_BottomFace);
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.setColorOpaque_F(this.colorRedTopRight_BottomFace, this.colorGreenTopRight_BottomFace, this.colorBlueTopRight_BottomFace);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
            }
        }
        else if (var9 != 4 && var9 != 5 && var9 != 6 && var9 != 7) {
            if (var9 == 12) {
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
            }
            else if (var9 == 13) {
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
            }
            else if (var9 == 14) {
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
            }
            else if (var9 == 15) {
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
            }
        }
        else {
            var12.addVertexWithUV(var23, var27, var31, var15, var21);
            var12.addVertexWithUV(var23, var27, var29, var15, var19);
            var12.addVertexWithUV(var25, var27, var29, var17, var19);
            var12.addVertexWithUV(var25, var27, var31, var17, var21);
        }
    }

    public void renderSlopesTopFace(Block var1, double var2, double var4, double var6, int var8, int var9, RenderBlocks var10, int var11) {
        Tessellator var12 = Tessellator.instance;
        var12.setBrightness(var11);

        if (var10.overrideBlockTexture >= 0) {
            var8 = var10.overrideBlockTexture;
        }

        int var13 = (var8 & 15) << 4;
        int var14 = var8 & 240;
        double var15 = ((double)var13 + var1.getBlockBoundsMinX() * 16.0D) / 256.0D;
        double var17 = ((double)var13 + var1.getBlockBoundsMaxX() * 16.0D - 0.01D) / 256.0D;
        double var19 = ((double)var14 + var1.getBlockBoundsMinZ() * 16.0D) / 256.0D;
        double var21 = ((double)var14 + var1.getBlockBoundsMaxZ() * 16.0D - 0.01D) / 256.0D;

        if (var1.getBlockBoundsMinX() < 0.0D || var1.getBlockBoundsMaxX() > 1.0D) {
            var15 = (double)(((float)var13 + 0.0F) / 256.0F);
            var17 = (double)(((float)var13 + 15.99F) / 256.0F);
        }

        if (var1.getBlockBoundsMinZ() < 0.0D || var1.getBlockBoundsMaxZ() > 1.0D) {
            var19 = (double)(((float)var14 + 0.0F) / 256.0F);
            var21 = (double)(((float)var14 + 15.99F) / 256.0F);
        }

        double var23 = var2 + var1.getBlockBoundsMinX();
        double var25 = var2 + var1.getBlockBoundsMaxX();
        double var27 = var4 + var1.getBlockBoundsMaxY();
        double var29 = var6 + var1.getBlockBoundsMinZ();
        double var31 = var6 + var1.getBlockBoundsMaxZ();

        if (this.enableAO) {
            if (var9 != 8 && var9 != 9 && var9 != 10 && var9 != 11) {
                if (var9 == 12) {
                    var12.setColorOpaque_F(this.colorRedTopLeft_TopFace, this.colorGreenTopLeft_TopFace, this.colorBlueTopLeft_TopFace);
                    var12.addVertexWithUV(var25, var27, var31, var17, var21);
                    var12.setColorOpaque_F(this.colorRedBottomLeft_TopFace, this.colorGreenBottomLeft_TopFace, this.colorBlueBottomLeft_TopFace);
                    var12.addVertexWithUV(var25, var27, var29, var17, var19);
                    var12.setColorOpaque_F(this.colorRedTopRight_TopFace, this.colorGreenTopRight_TopFace, this.colorBlueTopRight_TopFace);
                    var12.addVertexWithUV(var23, var27, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedTopRight_TopFace, this.colorGreenTopRight_TopFace, this.colorBlueTopRight_TopFace);
                    var12.addVertexWithUV(var23, var27, var31, var15, var21);
                }
                else if (var9 == 13) {
                    var12.setColorOpaque_F(this.colorRedBottomLeft_TopFace, this.colorGreenBottomLeft_TopFace, this.colorBlueBottomLeft_TopFace);
                    var12.addVertexWithUV(var25, var27, var29, var17, var19);
                    var12.setColorOpaque_F(this.colorRedBottomLeft_TopFace, this.colorGreenBottomLeft_TopFace, this.colorBlueBottomLeft_TopFace);
                    var12.addVertexWithUV(var25, var27, var29, var17, var19);
                    var12.setColorOpaque_F(this.colorRedBottomRight_TopFace, this.colorGreenBottomRight_TopFace, this.colorBlueBottomRight_TopFace);
                    var12.addVertexWithUV(var23, var27, var29, var15, var19);
                    var12.setColorOpaque_F(this.colorRedTopRight_TopFace, this.colorGreenTopRight_TopFace, this.colorBlueTopRight_TopFace);
                    var12.addVertexWithUV(var23, var27, var31, var15, var21);
                }
                else if (var9 == 14) {
                    var12.setColorOpaque_F(this.colorRedTopLeft_TopFace, this.colorGreenTopLeft_TopFace, this.colorBlueTopLeft_TopFace);
                    var12.addVertexWithUV(var25, var27, var31, var17, var21);
                    var12.setColorOpaque_F(this.colorRedBottomRight_TopFace, this.colorGreenBottomRight_TopFace, this.colorBlueBottomRight_TopFace);
                    var12.addVertexWithUV(var23, var27, var29, var15, var19);
                    var12.setColorOpaque_F(this.colorRedBottomRight_TopFace, this.colorGreenBottomRight_TopFace, this.colorBlueBottomRight_TopFace);
                    var12.addVertexWithUV(var23, var27, var29, var15, var19);
                    var12.setColorOpaque_F(this.colorRedTopRight_TopFace, this.colorGreenTopRight_TopFace, this.colorBlueTopRight_TopFace);
                    var12.addVertexWithUV(var23, var27, var31, var15, var21);
                }
                else if (var9 == 15) {
                    var12.setColorOpaque_F(this.colorRedTopLeft_TopFace, this.colorGreenTopLeft_TopFace, this.colorBlueTopLeft_TopFace);
                    var12.addVertexWithUV(var25, var27, var31, var17, var21);
                    var12.setColorOpaque_F(this.colorRedBottomLeft_TopFace, this.colorGreenBottomLeft_TopFace, this.colorBlueBottomLeft_TopFace);
                    var12.addVertexWithUV(var25, var27, var29, var17, var19);
                    var12.setColorOpaque_F(this.colorRedBottomRight_TopFace, this.colorGreenBottomRight_TopFace, this.colorBlueBottomRight_TopFace);
                    var12.addVertexWithUV(var23, var27, var29, var15, var19);
                    var12.setColorOpaque_F(this.colorRedTopLeft_TopFace, this.colorGreenTopLeft_TopFace, this.colorBlueTopLeft_TopFace);
                    var12.addVertexWithUV(var25, var27, var31, var17, var21);
                }
            }
            else {
                var12.setColorOpaque_F(this.colorRedTopLeft_TopFace, this.colorGreenTopLeft_TopFace, this.colorBlueTopLeft_TopFace);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
                var12.setColorOpaque_F(this.colorRedBottomLeft_TopFace, this.colorGreenBottomLeft_TopFace, this.colorBlueBottomLeft_TopFace);
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.setColorOpaque_F(this.colorRedBottomRight_TopFace, this.colorGreenBottomRight_TopFace, this.colorBlueBottomRight_TopFace);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.setColorOpaque_F(this.colorRedTopRight_TopFace, this.colorGreenTopRight_TopFace, this.colorBlueTopRight_TopFace);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
            }
        }
        else if (var9 != 8 && var9 != 9 && var9 != 10 && var9 != 11) {
            if (var9 == 12) {
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
            }
            else if (var9 == 13) {
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
            }
            else if (var9 == 14) {
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
            }
            else if (var9 == 15) {
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
                var12.addVertexWithUV(var25, var27, var29, var17, var19);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
            }
        }
        else {
            var12.addVertexWithUV(var25, var27, var31, var17, var21);
            var12.addVertexWithUV(var25, var27, var29, var17, var19);
            var12.addVertexWithUV(var23, var27, var29, var15, var19);
            var12.addVertexWithUV(var23, var27, var31, var15, var21);
        }
    }

    public void renderSlopesEastFace(Block var1, double var2, double var4, double var6, int var8, int var9, RenderBlocks var10, int var11) {
        Tessellator var12 = Tessellator.instance;
        var12.setBrightness(var11);

        if (var10.overrideBlockTexture >= 0) {
            var8 = var10.overrideBlockTexture;
        }

        int var13 = (var8 & 15) << 4;
        int var14 = var8 & 240;
        double var15 = ((double)var13 + var1.getBlockBoundsMinX() * 16.0D) / 256.0D;
        double var17 = ((double)var13 + var1.getBlockBoundsMaxX() * 16.0D - 0.01D) / 256.0D;
        double var19 = ((double)var14 + var1.getBlockBoundsMinY() * 16.0D) / 256.0D;
        double var21 = ((double)var14 + var1.getBlockBoundsMaxY() * 16.0D - 0.01D) / 256.0D;
        double var23;

        if (var10.flipTexture) {
            var23 = var15;
            var15 = var17;
            var17 = var23;
        }

        if (var1.getBlockBoundsMinX() < 0.0D || var1.getBlockBoundsMaxX() > 1.0D) {
            var15 = (double)(((float)var13 + 0.0F) / 256.0F);
            var17 = (double)(((float)var13 + 15.99F) / 256.0F);
        }

        if (var1.getBlockBoundsMinY() < 0.0D || var1.getBlockBoundsMaxY() > 1.0D) {
            var19 = (double)(((float)var14 + 0.0F) / 256.0F);
            var21 = (double)(((float)var14 + 15.99F) / 256.0F);
        }

        var23 = var2 + var1.getBlockBoundsMinX();
        double var25 = var2 + var1.getBlockBoundsMaxX();
        double var27 = var4 + var1.getBlockBoundsMinY();
        double var29 = var4 + var1.getBlockBoundsMaxY();
        double var31 = var6 + var1.getBlockBoundsMinZ();
        double var33 = var6 + var1.getBlockBoundsMaxZ();

        if (this.enableAO) {
            if (var9 != 7 && var9 != 11 && var9 != 13 && var9 != 15) {
                if (var9 == 4) {
                    var12.setColorOpaque_F(this.colorRedTopRight_EastFace, this.colorGreenTopRight_EastFace, this.colorBlueTopRight_EastFace);
                    var12.addVertexWithUV(var23, var27, var31, var17, var21);
                    var12.setColorOpaque_F(this.colorRedBottomLeft_EastFace, this.colorGreenBottomLeft_EastFace, this.colorBlueBottomLeft_EastFace);
                    var12.addVertexWithUV(var25, var29, var31, var15, var19);
                    var12.setColorOpaque_F(this.colorRedBottomRight_EastFace, this.colorGreenBottomRight_EastFace, this.colorBlueBottomRight_EastFace);
                    var12.addVertexWithUV(var25, var27, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedTopRight_EastFace, this.colorGreenTopRight_EastFace, this.colorBlueTopRight_EastFace);
                    var12.addVertexWithUV(var23, var27, var31, var17, var21);
                }
                else if (var9 == 5) {
                    var12.setColorOpaque_F(this.colorRedTopLeft_EastFace, this.colorGreenTopLeft_EastFace, this.colorBlueTopLeft_EastFace);
                    var12.addVertexWithUV(var23, var29, var31, var17, var19);
                    var12.setColorOpaque_F(this.colorRedBottomRight_EastFace, this.colorGreenBottomRight_EastFace, this.colorBlueBottomRight_EastFace);
                    var12.addVertexWithUV(var25, var27, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedBottomRight_EastFace, this.colorGreenBottomRight_EastFace, this.colorBlueBottomRight_EastFace);
                    var12.addVertexWithUV(var25, var27, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedTopRight_EastFace, this.colorGreenTopRight_EastFace, this.colorBlueTopRight_EastFace);
                    var12.addVertexWithUV(var23, var27, var31, var17, var21);
                }
                else if (var9 == 6) {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var23, var29, var33, var17, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var25, var29, var33, var15, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var25, var27, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var23, var27, var31, var17, var21);
                }
                else if (var9 == 8) {
                    var12.setColorOpaque_F(this.colorRedTopLeft_EastFace, this.colorGreenTopLeft_EastFace, this.colorBlueTopLeft_EastFace);
                    var12.addVertexWithUV(var23, var29, var31, var17, var19);
                    var12.setColorOpaque_F(this.colorRedBottomLeft_EastFace, this.colorGreenBottomLeft_EastFace, this.colorBlueBottomLeft_EastFace);
                    var12.addVertexWithUV(var25, var29, var31, var15, var19);
                    var12.setColorOpaque_F(this.colorRedBottomRight_EastFace, this.colorGreenBottomRight_EastFace, this.colorBlueBottomRight_EastFace);
                    var12.addVertexWithUV(var25, var27, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedTopLeft_EastFace, this.colorGreenTopLeft_EastFace, this.colorBlueTopLeft_EastFace);
                    var12.addVertexWithUV(var23, var29, var31, var17, var19);
                }
                else if (var9 == 9) {
                    var12.setColorOpaque_F(this.colorRedTopLeft_EastFace, this.colorGreenTopLeft_EastFace, this.colorBlueTopLeft_EastFace);
                    var12.addVertexWithUV(var23, var29, var31, var17, var19);
                    var12.setColorOpaque_F(this.colorRedBottomLeft_EastFace, this.colorGreenBottomLeft_EastFace, this.colorBlueBottomLeft_EastFace);
                    var12.addVertexWithUV(var25, var29, var31, var15, var19);
                    var12.setColorOpaque_F(this.colorRedBottomLeft_EastFace, this.colorGreenBottomLeft_EastFace, this.colorBlueBottomLeft_EastFace);
                    var12.addVertexWithUV(var25, var29, var31, var15, var19);
                    var12.setColorOpaque_F(this.colorRedTopRight_EastFace, this.colorGreenTopRight_EastFace, this.colorBlueTopRight_EastFace);
                    var12.addVertexWithUV(var23, var27, var31, var17, var21);
                }
                else if (var9 == 10) {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var23, var29, var31, var17, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZNeg + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var25, var29, var31, var15, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var25, var27, var33, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var23, var27, var33, var17, var21);
                }
                else if (var9 == 12) {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegYPos) * (this.factorNorth + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegYPos) * (this.factorNorth + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegYPos) * (this.factorNorth + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var23, var29, var33, var17, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZNeg + this.aoLightValueYPosZNeg) * (this.factorNorth + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZNeg + this.aoLightValueYPosZNeg) * (this.factorNorth + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZNeg + this.aoLightValueYPosZNeg) * (this.factorNorth + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var25, var29, var31, var15, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZNeg + this.aoLightValueYNegZNeg) * (this.factorNorth + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZNeg + this.aoLightValueYNegZNeg) * (this.factorNorth + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZNeg + this.aoLightValueYNegZNeg) * (this.factorNorth + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var25, var27, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegYNeg) * (this.factorNorth + this.factorEast) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegYNeg) * (this.factorNorth + this.factorEast) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegYNeg) * (this.factorNorth + this.factorEast) / 4.0F);
                    var12.addVertexWithUV(var23, var27, var33, var17, var21);
                }
            }
            else {
                var12.setColorOpaque_F(this.colorRedTopLeft_EastFace, this.colorGreenTopLeft_EastFace, this.colorBlueTopLeft_EastFace);
                var12.addVertexWithUV(var23, var29, var31, var17, var19);
                var12.setColorOpaque_F(this.colorRedBottomLeft_EastFace, this.colorGreenBottomLeft_EastFace, this.colorBlueBottomLeft_EastFace);
                var12.addVertexWithUV(var25, var29, var31, var15, var19);
                var12.setColorOpaque_F(this.colorRedBottomRight_EastFace, this.colorGreenBottomRight_EastFace, this.colorBlueBottomRight_EastFace);
                var12.addVertexWithUV(var25, var27, var31, var15, var21);
                var12.setColorOpaque_F(this.colorRedTopRight_EastFace, this.colorGreenTopRight_EastFace, this.colorBlueTopRight_EastFace);
                var12.addVertexWithUV(var23, var27, var31, var17, var21);
            }
        }
        else if (var9 != 7 && var9 != 11 && var9 != 13 && var9 != 15) {
            if (var9 == 4) {
                var12.addVertexWithUV(var23, var27, var31, var17, var21);
                var12.addVertexWithUV(var25, var29, var31, var15, var19);
                var12.addVertexWithUV(var25, var27, var31, var15, var21);
                var12.addVertexWithUV(var23, var27, var31, var17, var21);
            }
            else if (var9 == 5) {
                var12.addVertexWithUV(var23, var29, var31, var17, var19);
                var12.addVertexWithUV(var25, var27, var31, var15, var21);
                var12.addVertexWithUV(var25, var27, var31, var15, var21);
                var12.addVertexWithUV(var23, var27, var31, var17, var21);
            }
            else if (var9 == 6) {
                var12.addVertexWithUV(var23, var29, var33, var17, var19);
                var12.addVertexWithUV(var25, var29, var33, var15, var19);
                var12.addVertexWithUV(var25, var27, var31, var15, var21);
                var12.addVertexWithUV(var23, var27, var31, var17, var21);
            }
            else if (var9 == 8) {
                var12.addVertexWithUV(var23, var29, var31, var17, var19);
                var12.addVertexWithUV(var25, var29, var31, var15, var19);
                var12.addVertexWithUV(var25, var27, var31, var15, var21);
                var12.addVertexWithUV(var23, var29, var31, var17, var19);
            }
            else if (var9 == 9) {
                var12.addVertexWithUV(var23, var29, var31, var17, var19);
                var12.addVertexWithUV(var25, var29, var31, var15, var19);
                var12.addVertexWithUV(var25, var29, var31, var15, var19);
                var12.addVertexWithUV(var23, var27, var31, var17, var21);
            }
            else if (var9 == 10) {
                var12.addVertexWithUV(var23, var29, var31, var17, var19);
                var12.addVertexWithUV(var25, var29, var31, var15, var19);
                var12.addVertexWithUV(var25, var27, var33, var15, var21);
                var12.addVertexWithUV(var23, var27, var33, var17, var21);
            }
            else if (var9 == 12) {
                var12.addVertexWithUV(var23, var29, var33, var17, var19);
                var12.addVertexWithUV(var25, var29, var31, var15, var19);
                var12.addVertexWithUV(var25, var27, var31, var15, var21);
                var12.addVertexWithUV(var23, var27, var33, var17, var21);
            }
        }
        else {
            var12.addVertexWithUV(var23, var29, var31, var17, var19);
            var12.addVertexWithUV(var25, var29, var31, var15, var19);
            var12.addVertexWithUV(var25, var27, var31, var15, var21);
            var12.addVertexWithUV(var23, var27, var31, var17, var21);
        }
    }

    public void renderSlopesWestFace(Block var1, double var2, double var4, double var6, int var8, int var9, RenderBlocks var10, int var11) {
        Tessellator var12 = Tessellator.instance;
        var12.setBrightness(var11);

        if (var10.overrideBlockTexture >= 0) {
            var8 = var10.overrideBlockTexture;
        }

        int var13 = (var8 & 15) << 4;
        int var14 = var8 & 240;
        double var15 = ((double)var13 + var1.getBlockBoundsMinX() * 16.0D) / 256.0D;
        double var17 = ((double)var13 + var1.getBlockBoundsMaxX() * 16.0D - 0.01D) / 256.0D;
        double var19 = ((double)var14 + var1.getBlockBoundsMinY() * 16.0D) / 256.0D;
        double var21 = ((double)var14 + var1.getBlockBoundsMaxY() * 16.0D - 0.01D) / 256.0D;
        double var23;

        if (var10.flipTexture) {
            var23 = var15;
            var15 = var17;
            var17 = var23;
        }

        if (var1.getBlockBoundsMinX() < 0.0D || var1.getBlockBoundsMaxX() > 1.0D) {
            var15 = (double)(((float)var13 + 0.0F) / 256.0F);
            var17 = (double)(((float)var13 + 15.99F) / 256.0F);
        }

        if (var1.getBlockBoundsMinY() < 0.0D || var1.getBlockBoundsMaxY() > 1.0D) {
            var19 = (double)(((float)var14 + 0.0F) / 256.0F);
            var21 = (double)(((float)var14 + 15.99F) / 256.0F);
        }

        var23 = var2 + var1.getBlockBoundsMinX();
        double var25 = var2 + var1.getBlockBoundsMaxX();
        double var27 = var4 + var1.getBlockBoundsMinY();
        double var29 = var4 + var1.getBlockBoundsMaxY();
        double var31 = var6 + var1.getBlockBoundsMaxZ();
        double var33 = var6 + var1.getBlockBoundsMinZ();

        if (this.enableAO) {
            if (var9 != 6 && var9 != 10 && var9 != 12 && var9 != 14) {
                if (var9 == 4) {
                    var12.setColorOpaque_F(this.colorRedBottomLeft_WestFace, this.colorGreenBottomLeft_WestFace, this.colorBlueBottomLeft_WestFace);
                    var12.addVertexWithUV(var23, var27, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedBottomLeft_WestFace, this.colorGreenBottomLeft_WestFace, this.colorBlueBottomLeft_WestFace);
                    var12.addVertexWithUV(var23, var27, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedBottomRight_WestFace, this.colorGreenBottomRight_WestFace, this.colorBlueBottomRight_WestFace);
                    var12.addVertexWithUV(var25, var27, var31, var17, var21);
                    var12.setColorOpaque_F(this.colorRedTopRight_WestFace, this.colorGreenTopRight_WestFace, this.colorBlueTopRight_WestFace);
                    var12.addVertexWithUV(var25, var29, var31, var17, var19);
                }
                else if (var9 == 5) {
                    var12.setColorOpaque_F(this.colorRedTopLeft_WestFace, this.colorGreenTopLeft_WestFace, this.colorBlueTopLeft_WestFace);
                    var12.addVertexWithUV(var23, var29, var31, var15, var19);
                    var12.setColorOpaque_F(this.colorRedBottomLeft_WestFace, this.colorGreenBottomLeft_WestFace, this.colorBlueBottomLeft_WestFace);
                    var12.addVertexWithUV(var23, var27, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedBottomRight_WestFace, this.colorGreenBottomRight_WestFace, this.colorBlueBottomRight_WestFace);
                    var12.addVertexWithUV(var25, var27, var31, var17, var21);
                    var12.setColorOpaque_F(this.colorRedBottomRight_WestFace, this.colorGreenBottomRight_WestFace, this.colorBlueBottomRight_WestFace);
                    var12.addVertexWithUV(var25, var27, var31, var17, var21);
                }
                else if (var9 == 7) {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueXNegYPos) * (this.factorTop + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var23, var29, var33, var15, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorTop + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var23, var27, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var25, var27, var31, var17, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueXPosYPos) * (this.factorTop + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var25, var29, var33, var17, var19);
                }
                else if (var9 == 8) {
                    var12.setColorOpaque_F(this.colorRedTopLeft_WestFace, this.colorGreenTopLeft_WestFace, this.colorBlueTopLeft_WestFace);
                    var12.addVertexWithUV(var23, var29, var31, var15, var19);
                    var12.setColorOpaque_F(this.colorRedTopLeft_WestFace, this.colorGreenTopLeft_WestFace, this.colorBlueTopLeft_WestFace);
                    var12.addVertexWithUV(var23, var29, var31, var15, var19);
                    var12.setColorOpaque_F(this.colorRedBottomRight_WestFace, this.colorGreenBottomRight_WestFace, this.colorBlueBottomRight_WestFace);
                    var12.addVertexWithUV(var25, var27, var31, var17, var21);
                    var12.setColorOpaque_F(this.colorRedTopRight_WestFace, this.colorGreenTopRight_WestFace, this.colorBlueTopRight_WestFace);
                    var12.addVertexWithUV(var25, var29, var31, var17, var19);
                }
                else if (var9 == 9) {
                    var12.setColorOpaque_F(this.colorRedTopLeft_WestFace, this.colorGreenTopLeft_WestFace, this.colorBlueTopLeft_WestFace);
                    var12.addVertexWithUV(var23, var29, var31, var15, var19);
                    var12.setColorOpaque_F(this.colorRedBottomLeft_WestFace, this.colorGreenBottomLeft_WestFace, this.colorBlueBottomLeft_WestFace);
                    var12.addVertexWithUV(var23, var27, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedTopRight_WestFace, this.colorGreenTopRight_WestFace, this.colorBlueTopRight_WestFace);
                    var12.addVertexWithUV(var25, var29, var31, var17, var19);
                    var12.setColorOpaque_F(this.colorRedTopRight_WestFace, this.colorGreenTopRight_WestFace, this.colorBlueTopRight_WestFace);
                    var12.addVertexWithUV(var25, var29, var31, var17, var19);
                }
                else if (var9 == 11) {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZPos + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var23, var29, var31, var15, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueXNegYNeg) * (this.factorBottom + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var23, var27, var33, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueXPosYNeg) * (this.factorBottom + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var25, var27, var33, var17, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var25, var29, var31, var17, var19);
                }
                else if (var9 == 13) {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZPos + this.aoLightValueYPosZPos) * (this.factorSouth + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZPos + this.aoLightValueYPosZPos) * (this.factorSouth + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZPos + this.aoLightValueYPosZPos) * (this.factorSouth + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var23, var29, var31, var15, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZPos + this.aoLightValueYNegZPos) * (this.factorSouth + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZPos + this.aoLightValueYNegZPos) * (this.factorSouth + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZPos + this.aoLightValueYNegZPos) * (this.factorSouth + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var23, var27, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXPos + this.aoLightValueXPosYNeg) * (this.factorSouth + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXPos + this.aoLightValueXPosYNeg) * (this.factorSouth + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXPos + this.aoLightValueXPosYNeg) * (this.factorSouth + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var25, var27, var33, var17, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXPos + this.aoLightValueXPosYPos) * (this.factorSouth + this.factorWest) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXPos + this.aoLightValueXPosYPos) * (this.factorSouth + this.factorWest) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXPos + this.aoLightValueXPosYPos) * (this.factorSouth + this.factorWest) / 4.0F);
                    var12.addVertexWithUV(var25, var29, var33, var17, var19);
                }
            }
            else {
                var12.setColorOpaque_F(this.colorRedTopLeft_WestFace, this.colorGreenTopLeft_WestFace, this.colorBlueTopLeft_WestFace);
                var12.addVertexWithUV(var23, var29, var31, var15, var19);
                var12.setColorOpaque_F(this.colorRedBottomLeft_WestFace, this.colorGreenBottomLeft_WestFace, this.colorBlueBottomLeft_WestFace);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.setColorOpaque_F(this.colorRedBottomRight_WestFace, this.colorGreenBottomRight_WestFace, this.colorBlueBottomRight_WestFace);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
                var12.setColorOpaque_F(this.colorRedTopRight_WestFace, this.colorGreenTopRight_WestFace, this.colorBlueTopRight_WestFace);
                var12.addVertexWithUV(var25, var29, var31, var17, var19);
            }
        }
        else if (var9 != 6 && var9 != 10 && var9 != 12 && var9 != 14) {
            if (var9 == 4) {
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
                var12.addVertexWithUV(var25, var29, var31, var17, var19);
            }
            else if (var9 == 5) {
                var12.addVertexWithUV(var23, var29, var31, var15, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
            }
            else if (var9 == 7) {
                var12.addVertexWithUV(var23, var29, var33, var15, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
                var12.addVertexWithUV(var25, var29, var33, var17, var19);
            }
            else if (var9 == 8) {
                var12.addVertexWithUV(var23, var29, var31, var15, var19);
                var12.addVertexWithUV(var23, var29, var31, var15, var19);
                var12.addVertexWithUV(var25, var27, var31, var17, var21);
                var12.addVertexWithUV(var25, var29, var31, var17, var19);
            }
            else if (var9 == 9) {
                var12.addVertexWithUV(var23, var29, var31, var15, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.addVertexWithUV(var25, var29, var31, var17, var19);
                var12.addVertexWithUV(var25, var29, var31, var17, var19);
            }
            else if (var9 == 11) {
                var12.addVertexWithUV(var23, var29, var31, var15, var19);
                var12.addVertexWithUV(var23, var27, var33, var15, var21);
                var12.addVertexWithUV(var25, var27, var33, var17, var21);
                var12.addVertexWithUV(var25, var29, var31, var17, var19);
            }
            else if (var9 == 13) {
                var12.addVertexWithUV(var23, var29, var31, var15, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var21);
                var12.addVertexWithUV(var25, var27, var33, var17, var21);
                var12.addVertexWithUV(var25, var29, var33, var17, var19);
            }
        }
        else {
            var12.addVertexWithUV(var23, var29, var31, var15, var19);
            var12.addVertexWithUV(var23, var27, var31, var15, var21);
            var12.addVertexWithUV(var25, var27, var31, var17, var21);
            var12.addVertexWithUV(var25, var29, var31, var17, var19);
        }
    }

    public void renderSlopesNorthFace(Block var1, double var2, double var4, double var6, int var8, int var9, RenderBlocks var10, int var11) {
        Tessellator var12 = Tessellator.instance;
        var12.setBrightness(var11);

        if (var10.overrideBlockTexture >= 0) {
            var8 = var10.overrideBlockTexture;
        }

        int var13 = (var8 & 15) << 4;
        int var14 = var8 & 240;
        double var15 = ((double)var13 + var1.getBlockBoundsMinZ() * 16.0D) / 256.0D;
        double var17 = ((double)var13 + var1.getBlockBoundsMaxZ() * 16.0D - 0.01D) / 256.0D;
        double var19 = ((double)var14 + var1.getBlockBoundsMinY() * 16.0D) / 256.0D;
        double var21 = ((double)var14 + var1.getBlockBoundsMaxY() * 16.0D - 0.01D) / 256.0D;
        double var23;

        if (var10.flipTexture) {
            var23 = var15;
            var15 = var17;
            var17 = var23;
        }

        if (var1.getBlockBoundsMinZ() < 0.0D || var1.getBlockBoundsMaxZ() > 1.0D) {
            var15 = (double)(((float)var13 + 0.0F) / 256.0F);
            var17 = (double)(((float)var13 + 15.99F) / 256.0F);
        }

        if (var1.getBlockBoundsMinY() < 0.0D || var1.getBlockBoundsMaxY() > 1.0D) {
            var19 = (double)(((float)var14 + 0.0F) / 256.0F);
            var21 = (double)(((float)var14 + 15.99F) / 256.0F);
        }

        var23 = var2 + var1.getBlockBoundsMinX();
        double var25 = var4 + var1.getBlockBoundsMinY();
        double var27 = var4 + var1.getBlockBoundsMaxY();
        double var29 = var6 + var1.getBlockBoundsMinZ();
        double var31 = var6 + var1.getBlockBoundsMaxZ();
        double var33 = var2 + var1.getBlockBoundsMaxX();

        if (this.enableAO) {
            if (var9 != 5 && var9 != 9 && var9 != 13 && var9 != 14) {
                if (var9 == 4) {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorNorth) / 4.0F);
                    var12.addVertexWithUV(var33, var27, var31, var17, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorNorth) / 4.0F);
                    var12.addVertexWithUV(var33, var27, var29, var15, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorTop + this.factorNorth) / 4.0F);
                    var12.addVertexWithUV(var23, var25, var29, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorTop + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorTop + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorTop + this.factorNorth) / 4.0F);
                    var12.addVertexWithUV(var23, var25, var31, var17, var21);
                }
                else if (var9 == 6) {
                    var12.setColorOpaque_F(this.colorRedTopLeft_NorthFace, this.colorGreenTopLeft_NorthFace, this.colorBlueTopLeft_NorthFace);
                    var12.addVertexWithUV(var23, var27, var31, var17, var19);
                    var12.setColorOpaque_F(this.colorRedBottomRight_NorthFace, this.colorGreenBottomRight_NorthFace, this.colorBlueBottomRight_NorthFace);
                    var12.addVertexWithUV(var23, var25, var29, var15, var21);
                    var12.setColorOpaque_F(this.colorRedBottomRight_NorthFace, this.colorGreenBottomRight_NorthFace, this.colorBlueBottomRight_NorthFace);
                    var12.addVertexWithUV(var23, var25, var29, var15, var21);
                    var12.setColorOpaque_F(this.colorRedTopRight_NorthFace, this.colorGreenTopRight_NorthFace, this.colorBlueTopRight_NorthFace);
                    var12.addVertexWithUV(var23, var25, var31, var17, var21);
                }
                else if (var9 == 7) {
                    var12.setColorOpaque_F(this.colorRedTopRight_NorthFace, this.colorGreenTopRight_NorthFace, this.colorBlueTopRight_NorthFace);
                    var12.addVertexWithUV(var23, var25, var31, var17, var21);
                    var12.setColorOpaque_F(this.colorRedBottomLeft_NorthFace, this.colorGreenBottomLeft_NorthFace, this.colorBlueBottomLeft_NorthFace);
                    var12.addVertexWithUV(var23, var27, var29, var15, var19);
                    var12.setColorOpaque_F(this.colorRedBottomRight_NorthFace, this.colorGreenBottomRight_NorthFace, this.colorBlueBottomRight_NorthFace);
                    var12.addVertexWithUV(var23, var25, var29, var15, var21);
                    var12.setColorOpaque_F(this.colorRedTopRight_NorthFace, this.colorGreenTopRight_NorthFace, this.colorBlueTopRight_NorthFace);
                    var12.addVertexWithUV(var23, var25, var31, var17, var21);
                }
                else if (var9 == 8) {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F);
                    var12.addVertexWithUV(var23, var27, var31, var17, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F);
                    var12.addVertexWithUV(var23, var27, var29, var15, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorNorth) / 4.0F);
                    var12.addVertexWithUV(var33, var25, var29, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorNorth) / 4.0F);
                    var12.addVertexWithUV(var33, var25, var31, var17, var21);
                }
                else if (var9 == 10) {
                    var12.setColorOpaque_F(this.colorRedTopLeft_NorthFace, this.colorGreenTopLeft_NorthFace, this.colorBlueTopLeft_NorthFace);
                    var12.addVertexWithUV(var23, var27, var31, var17, var19);
                    var12.setColorOpaque_F(this.colorRedBottomLeft_NorthFace, this.colorGreenBottomLeft_NorthFace, this.colorBlueBottomLeft_NorthFace);
                    var12.addVertexWithUV(var23, var27, var29, var15, var19);
                    var12.setColorOpaque_F(this.colorRedBottomLeft_NorthFace, this.colorGreenBottomLeft_NorthFace, this.colorBlueBottomLeft_NorthFace);
                    var12.addVertexWithUV(var23, var27, var29, var15, var19);
                    var12.setColorOpaque_F(this.colorRedTopRight_NorthFace, this.colorGreenTopRight_NorthFace, this.colorBlueTopRight_NorthFace);
                    var12.addVertexWithUV(var23, var25, var31, var17, var21);
                }
                else if (var9 == 11) {
                    var12.setColorOpaque_F(this.colorRedTopLeft_NorthFace, this.colorGreenTopLeft_NorthFace, this.colorBlueTopLeft_NorthFace);
                    var12.addVertexWithUV(var23, var27, var31, var17, var19);
                    var12.setColorOpaque_F(this.colorRedBottomLeft_NorthFace, this.colorGreenBottomLeft_NorthFace, this.colorBlueBottomLeft_NorthFace);
                    var12.addVertexWithUV(var23, var27, var29, var15, var19);
                    var12.setColorOpaque_F(this.colorRedBottomRight_NorthFace, this.colorGreenBottomRight_NorthFace, this.colorBlueBottomRight_NorthFace);
                    var12.addVertexWithUV(var23, var25, var29, var15, var21);
                    var12.setColorOpaque_F(this.colorRedTopLeft_NorthFace, this.colorGreenTopLeft_NorthFace, this.colorBlueTopLeft_NorthFace);
                    var12.addVertexWithUV(var23, var27, var31, var17, var19);
                }
                else if (var9 == 15) {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZPos + this.aoLightValueYPosZPos) * (this.factorWest + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZPos + this.aoLightValueYPosZPos) * (this.factorWest + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZPos + this.aoLightValueYPosZPos) * (this.factorWest + this.factorNorth) / 4.0F);
                    var12.addVertexWithUV(var33, var27, var31, var17, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegYPos) * (this.factorWest + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegYPos) * (this.factorWest + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegYPos) * (this.factorWest + this.factorNorth) / 4.0F);
                    var12.addVertexWithUV(var23, var27, var29, var15, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegYNeg) * (this.factorWest + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegYNeg) * (this.factorWest + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXNeg + this.aoLightValueXNegYNeg) * (this.factorWest + this.factorNorth) / 4.0F);
                    var12.addVertexWithUV(var23, var25, var29, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZPos + this.aoLightValueYNegZPos) * (this.factorWest + this.factorNorth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZPos + this.aoLightValueYNegZPos) * (this.factorWest + this.factorNorth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZPos + this.aoLightValueYNegZPos) * (this.factorWest + this.factorNorth) / 4.0F);
                    var12.addVertexWithUV(var33, var25, var31, var17, var21);
                }
            }
            else {
                var12.setColorOpaque_F(this.colorRedTopLeft_NorthFace, this.colorGreenTopLeft_NorthFace, this.colorBlueTopLeft_NorthFace);
                var12.addVertexWithUV(var23, var27, var31, var17, var19);
                var12.setColorOpaque_F(this.colorRedBottomLeft_NorthFace, this.colorGreenBottomLeft_NorthFace, this.colorBlueBottomLeft_NorthFace);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.setColorOpaque_F(this.colorRedBottomRight_NorthFace, this.colorGreenBottomRight_NorthFace, this.colorBlueBottomRight_NorthFace);
                var12.addVertexWithUV(var23, var25, var29, var15, var21);
                var12.setColorOpaque_F(this.colorRedTopRight_NorthFace, this.colorGreenTopRight_NorthFace, this.colorBlueTopRight_NorthFace);
                var12.addVertexWithUV(var23, var25, var31, var17, var21);
            }
        }
        else if (var9 != 5 && var9 != 9 && var9 != 13 && var9 != 14) {
            if (var9 == 4) {
                var12.addVertexWithUV(var33, var27, var31, var17, var19);
                var12.addVertexWithUV(var33, var27, var29, var15, var19);
                var12.addVertexWithUV(var23, var25, var29, var15, var21);
                var12.addVertexWithUV(var23, var25, var31, var17, var21);
            }
            else if (var9 == 6) {
                var12.addVertexWithUV(var23, var27, var31, var17, var19);
                var12.addVertexWithUV(var23, var25, var29, var15, var21);
                var12.addVertexWithUV(var23, var25, var29, var15, var21);
                var12.addVertexWithUV(var23, var25, var31, var17, var21);
            }
            else if (var9 == 7) {
                var12.addVertexWithUV(var23, var25, var31, var17, var21);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var23, var25, var29, var15, var21);
                var12.addVertexWithUV(var23, var25, var31, var17, var21);
            }
            else if (var9 == 8) {
                var12.addVertexWithUV(var23, var27, var31, var17, var19);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var33, var25, var29, var15, var21);
                var12.addVertexWithUV(var33, var25, var31, var17, var21);
            }
            else if (var9 == 10) {
                var12.addVertexWithUV(var23, var27, var31, var17, var19);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var23, var25, var31, var17, var21);
            }
            else if (var9 == 11) {
                var12.addVertexWithUV(var23, var27, var31, var17, var19);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var23, var25, var29, var15, var21);
                var12.addVertexWithUV(var23, var27, var31, var17, var19);
            }
            else if (var9 == 15) {
                var12.addVertexWithUV(var33, var27, var31, var17, var19);
                var12.addVertexWithUV(var23, var27, var29, var15, var19);
                var12.addVertexWithUV(var23, var25, var29, var15, var21);
                var12.addVertexWithUV(var33, var25, var31, var17, var21);
            }
        }
        else {
            var12.addVertexWithUV(var23, var27, var31, var17, var19);
            var12.addVertexWithUV(var23, var27, var29, var15, var19);
            var12.addVertexWithUV(var23, var25, var29, var15, var21);
            var12.addVertexWithUV(var23, var25, var31, var17, var21);
        }
    }

    public void renderSlopesSouthFace(Block var1, double var2, double var4, double var6, int var8, int var9, RenderBlocks var10, int var11) {
        Tessellator var12 = Tessellator.instance;
        var12.setBrightness(var11);

        if (var10.overrideBlockTexture >= 0) {
            var8 = var10.overrideBlockTexture;
        }

        int var13 = (var8 & 15) << 4;
        int var14 = var8 & 240;
        double var15 = ((double)var13 + var1.getBlockBoundsMinZ() * 16.0D) / 256.0D;
        double var17 = ((double)var13 + var1.getBlockBoundsMaxZ() * 16.0D - 0.01D) / 256.0D;
        double var19 = ((double)var14 + var1.getBlockBoundsMinY() * 16.0D) / 256.0D;
        double var21 = ((double)var14 + var1.getBlockBoundsMaxY() * 16.0D - 0.01D) / 256.0D;
        double var23;

        if (var10.flipTexture) {
            var23 = var15;
            var15 = var17;
            var17 = var23;
        }

        if (var1.getBlockBoundsMinZ() < 0.0D || var1.getBlockBoundsMaxZ() > 1.0D) {
            var15 = (double)(((float)var13 + 0.0F) / 256.0F);
            var17 = (double)(((float)var13 + 15.99F) / 256.0F);
        }

        if (var1.getBlockBoundsMinY() < 0.0D || var1.getBlockBoundsMaxY() > 1.0D) {
            var19 = (double)(((float)var14 + 0.0F) / 256.0F);
            var21 = (double)(((float)var14 + 15.99F) / 256.0F);
        }

        var23 = var2 + var1.getBlockBoundsMaxX();
        double var25 = var4 + var1.getBlockBoundsMinY();
        double var27 = var4 + var1.getBlockBoundsMaxY();
        double var29 = var6 + var1.getBlockBoundsMinZ();
        double var31 = var6 + var1.getBlockBoundsMaxZ();
        double var33 = var2 + var1.getBlockBoundsMinX();

        if (this.enableAO) {
            if (var9 != 4 && var9 != 8 && var9 != 12 && var9 != 15) {
                if (var9 == 5) {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorTop + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var23, var25, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var23, var25, var29, var17, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZNeg) * (this.factorTop + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var33, var27, var29, var17, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYPos + this.aoLightValueYPosZPos) * (this.factorTop + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var33, var27, var31, var15, var19);
                }
                else if (var9 == 6) {
                    var12.setColorOpaque_F(this.colorRedTopLeft_SouthFace, this.colorGreenTopLeft_SouthFace, this.colorBlueTopLeft_SouthFace);
                    var12.addVertexWithUV(var23, var25, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedBottomLeft_SouthFace, this.colorGreenBottomLeft_SouthFace, this.colorBlueBottomLeft_SouthFace);
                    var12.addVertexWithUV(var23, var25, var29, var17, var21);
                    var12.setColorOpaque_F(this.colorRedBottomLeft_SouthFace, this.colorGreenBottomLeft_SouthFace, this.colorBlueBottomLeft_SouthFace);
                    var12.addVertexWithUV(var23, var25, var29, var17, var21);
                    var12.setColorOpaque_F(this.colorRedTopRight_SouthFace, this.colorGreenTopRight_SouthFace, this.colorBlueTopRight_SouthFace);
                    var12.addVertexWithUV(var23, var27, var31, var15, var19);
                }
                else if (var9 == 7) {
                    var12.setColorOpaque_F(this.colorRedTopLeft_SouthFace, this.colorGreenTopLeft_SouthFace, this.colorBlueTopLeft_SouthFace);
                    var12.addVertexWithUV(var23, var25, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedBottomLeft_SouthFace, this.colorGreenBottomLeft_SouthFace, this.colorBlueBottomLeft_SouthFace);
                    var12.addVertexWithUV(var23, var25, var29, var17, var21);
                    var12.setColorOpaque_F(this.colorRedBottomRight_SouthFace, this.colorGreenBottomRight_SouthFace, this.colorBlueBottomRight_SouthFace);
                    var12.addVertexWithUV(var23, var27, var29, var17, var19);
                    var12.setColorOpaque_F(this.colorRedTopLeft_SouthFace, this.colorGreenTopLeft_SouthFace, this.colorBlueTopLeft_SouthFace);
                    var12.addVertexWithUV(var23, var25, var31, var15, var21);
                }
                else if (var9 == 9) {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZPos) * (this.factorBottom + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var33, var25, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueYNeg + this.aoLightValueYNegZNeg) * (this.factorBottom + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var33, var25, var29, var17, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZNeg) * (this.factorBottom + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var23, var27, var29, var17, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXPos + this.aoLightValueXPosZPos) * (this.factorBottom + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var23, var27, var31, var15, var19);
                }
                else if (var9 == 10) {
                    var12.setColorOpaque_F(this.colorRedTopLeft_SouthFace, this.colorGreenTopLeft_SouthFace, this.colorBlueTopLeft_SouthFace);
                    var12.addVertexWithUV(var23, var25, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedBottomRight_SouthFace, this.colorGreenBottomRight_SouthFace, this.colorBlueBottomRight_SouthFace);
                    var12.addVertexWithUV(var23, var27, var29, var17, var19);
                    var12.setColorOpaque_F(this.colorRedBottomRight_SouthFace, this.colorGreenBottomRight_SouthFace, this.colorBlueBottomRight_SouthFace);
                    var12.addVertexWithUV(var23, var27, var29, var17, var19);
                    var12.setColorOpaque_F(this.colorRedTopRight_SouthFace, this.colorGreenTopRight_SouthFace, this.colorBlueTopRight_SouthFace);
                    var12.addVertexWithUV(var23, var27, var31, var15, var19);
                }
                else if (var9 == 11) {
                    var12.setColorOpaque_F(this.colorRedTopRight_SouthFace, this.colorGreenTopRight_SouthFace, this.colorBlueTopRight_SouthFace);
                    var12.addVertexWithUV(var23, var27, var31, var15, var19);
                    var12.setColorOpaque_F(this.colorRedBottomLeft_SouthFace, this.colorGreenBottomLeft_SouthFace, this.colorBlueBottomLeft_SouthFace);
                    var12.addVertexWithUV(var23, var25, var29, var17, var21);
                    var12.setColorOpaque_F(this.colorRedBottomRight_SouthFace, this.colorGreenBottomRight_SouthFace, this.colorBlueBottomRight_SouthFace);
                    var12.addVertexWithUV(var23, var27, var29, var17, var19);
                    var12.setColorOpaque_F(this.colorRedTopRight_SouthFace, this.colorGreenTopRight_SouthFace, this.colorBlueTopRight_SouthFace);
                    var12.addVertexWithUV(var23, var27, var31, var15, var19);
                }
                else if (var9 == 14) {
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXPos + this.aoLightValueXPosYNeg) * (this.factorEast + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXPos + this.aoLightValueXPosYNeg) * (this.factorEast + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXPos + this.aoLightValueXPosYNeg) * (this.factorEast + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var23, var25, var31, var15, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZNeg + this.aoLightValueYNegZNeg) * (this.factorEast + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZNeg + this.aoLightValueYNegZNeg) * (this.factorEast + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZNeg + this.aoLightValueYNegZNeg) * (this.factorEast + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var33, var25, var29, var17, var21);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueZNeg + this.aoLightValueYPosZNeg) * (this.factorEast + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueZNeg + this.aoLightValueYPosZNeg) * (this.factorEast + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueZNeg + this.aoLightValueYPosZNeg) * (this.factorEast + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var33, var27, var29, var17, var19);
                    var12.setColorOpaque_F(this.colorRedSlopes * (this.aoLightValueXPos + this.aoLightValueXPosYPos) * (this.factorEast + this.factorSouth) / 4.0F, this.colorGreenSlopes * (this.aoLightValueXPos + this.aoLightValueXPosYPos) * (this.factorEast + this.factorSouth) / 4.0F, this.colorBlueSlopes * (this.aoLightValueXPos + this.aoLightValueXPosYPos) * (this.factorEast + this.factorSouth) / 4.0F);
                    var12.addVertexWithUV(var23, var27, var31, var15, var19);
                }
            }
            else {
                var12.setColorOpaque_F(this.colorRedTopLeft_SouthFace, this.colorGreenTopLeft_SouthFace, this.colorBlueTopLeft_SouthFace);
                var12.addVertexWithUV(var23, var25, var31, var15, var21);
                var12.setColorOpaque_F(this.colorRedBottomLeft_SouthFace, this.colorGreenBottomLeft_SouthFace, this.colorBlueBottomLeft_SouthFace);
                var12.addVertexWithUV(var23, var25, var29, var17, var21);
                var12.setColorOpaque_F(this.colorRedBottomRight_SouthFace, this.colorGreenBottomRight_SouthFace, this.colorBlueBottomRight_SouthFace);
                var12.addVertexWithUV(var23, var27, var29, var17, var19);
                var12.setColorOpaque_F(this.colorRedTopRight_SouthFace, this.colorGreenTopRight_SouthFace, this.colorBlueTopRight_SouthFace);
                var12.addVertexWithUV(var23, var27, var31, var15, var19);
            }
        }
        else if (var9 != 4 && var9 != 8 && var9 != 12 && var9 != 15) {
            if (var9 == 5) {
                var12.addVertexWithUV(var23, var25, var31, var15, var21);
                var12.addVertexWithUV(var23, var25, var29, var17, var21);
                var12.addVertexWithUV(var33, var27, var29, var17, var19);
                var12.addVertexWithUV(var33, var27, var31, var15, var19);
            }
            else if (var9 == 6) {
                var12.addVertexWithUV(var23, var25, var31, var15, var21);
                var12.addVertexWithUV(var23, var25, var29, var17, var21);
                var12.addVertexWithUV(var23, var25, var29, var17, var21);
                var12.addVertexWithUV(var23, var27, var31, var15, var19);
            }
            else if (var9 == 7) {
                var12.addVertexWithUV(var23, var25, var31, var15, var21);
                var12.addVertexWithUV(var23, var25, var29, var17, var21);
                var12.addVertexWithUV(var23, var27, var29, var17, var19);
                var12.addVertexWithUV(var23, var25, var31, var15, var21);
            }
            else if (var9 == 9) {
                var12.addVertexWithUV(var33, var25, var31, var15, var21);
                var12.addVertexWithUV(var33, var25, var29, var17, var21);
                var12.addVertexWithUV(var23, var27, var29, var17, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var19);
            }
            else if (var9 == 10) {
                var12.addVertexWithUV(var23, var25, var31, var15, var21);
                var12.addVertexWithUV(var23, var27, var29, var17, var19);
                var12.addVertexWithUV(var23, var27, var29, var17, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var19);
            }
            else if (var9 == 11) {
                var12.addVertexWithUV(var23, var27, var31, var15, var19);
                var12.addVertexWithUV(var23, var25, var29, var17, var21);
                var12.addVertexWithUV(var23, var27, var29, var17, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var19);
            }
            else if (var9 == 14) {
                var12.addVertexWithUV(var23, var25, var31, var15, var21);
                var12.addVertexWithUV(var33, var25, var29, var17, var21);
                var12.addVertexWithUV(var33, var27, var29, var17, var19);
                var12.addVertexWithUV(var23, var27, var31, var15, var19);
            }
        }
        else {
            var12.addVertexWithUV(var23, var25, var31, var15, var21);
            var12.addVertexWithUV(var23, var25, var29, var17, var21);
            var12.addVertexWithUV(var23, var27, var29, var17, var19);
            var12.addVertexWithUV(var23, var27, var31, var15, var19);
        }
    }
}
