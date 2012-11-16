package metadark.mods.SuperSlopes.Slopes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

public class CommonInit
{
    public void registerBlockModel() {}

    public void addLocalizations() {}

    public void addRecipes()
    {
        if (Slopes.props.getInt("WoodSlopes") != 0)
        {
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevWoodSlopes, 3, 4), new Object[] {"#  ", " # ", "###", '#', Block.planks});
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevWoodSlopes, 3, 12), new Object[] {" # ", " ##", " # ", '#', Block.planks});

            if (Slopes.props.getBoolean("BlockInversion"))
            {
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevWoodSlopes, 3, 8), new Object[] {"###", " # ", "#  ", '#', Block.planks});
            }
        }

        if (Slopes.props.getInt("CobblestoneSlopes") != 0)
        {
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevCobblestoneSlopes, 3, 4), new Object[] {"#  ", " # ", "###", '#', Block.cobblestone});
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevCobblestoneSlopes, 3, 12), new Object[] {" # ", " ##", " # ", '#', Block.cobblestone});

            if (Slopes.props.getBoolean("BlockInversion"))
            {
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevCobblestoneSlopes, 3, 8), new Object[] {"###", " # ", "#  ", '#', Block.cobblestone});
            }
        }

        if (Slopes.props.getInt("GlassSlopes") != 0)
        {
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevGlassSlopes, 3, 4), new Object[] {"#  ", " # ", "###", '#', Block.glass});
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevGlassSlopes, 3, 12), new Object[] {" # ", " ##", " # ", '#', Block.glass});

            if (Slopes.props.getBoolean("BlockInversion"))
            {
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevGlassSlopes, 4, 0), new Object[] {"###", " ##", "  #", '#', Block.glass});
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevGlassSlopes, 3, 8), new Object[] {"###", " # ", "#  ", '#', Block.glass});
            }
        }

        if (Slopes.props.getInt("SandstoneSlopes") != 0)
        {
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevSandstoneSlopes, 3, 4), new Object[] {"#  ", " # ", "###", '#', new ItemStack(Block.sandStone, 1, 0)});
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevSandstoneSlopes, 3, 12), new Object[] {" # ", " ##", " # ", '#', new ItemStack(Block.sandStone, 1, 0)});

            if (Slopes.props.getBoolean("BlockInversion"))
            {
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevSandstoneSlopes, 3, 8), new Object[] {"###", " # ", "#  ", '#', new ItemStack(Block.sandStone, 1, 0)});
            }
        }

        if (Slopes.props.getInt("SmoothSandstoneSlopes") != 0)
        {
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevSmoothSandstoneSlopes, 3, 4), new Object[] {"#  ", " # ", "###", '#', new ItemStack(Block.sandStone, 1, 2)});
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevSmoothSandstoneSlopes, 3, 12), new Object[] {" # ", " ##", " # ", '#', new ItemStack(Block.sandStone, 1, 2)});

            if (Slopes.props.getBoolean("BlockInversion"))
            {
            	GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevSmoothSandstoneSlopes, 4, 0), new Object[] {"###", " ##", "  #", '#', new ItemStack(Block.sandStone, 1, 2)});
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevSmoothSandstoneSlopes, 3, 8), new Object[] {"###", " # ", "#  ", '#', new ItemStack(Block.sandStone, 1, 2)});
            }
        }

        if (Slopes.props.getInt("ChiseledSandstoneSlopes") != 0)
        {
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevChiseledSandstoneSlopes, 3, 4), new Object[] {"#  ", " # ", "###", '#', new ItemStack(Block.sandStone, 1, 1)});
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevChiseledSandstoneSlopes, 3, 12), new Object[] {" # ", " ##", " # ", '#', new ItemStack(Block.sandStone, 1, 1)});

            if (Slopes.props.getBoolean("BlockInversion"))
            {
            	GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevChiseledSandstoneSlopes, 4, 0), new Object[] {"###", " ##", "  #", '#', new ItemStack(Block.sandStone, 1, 1)});
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevChiseledSandstoneSlopes, 3, 8), new Object[] {"###", " # ", "#  ", '#', new ItemStack(Block.sandStone, 1, 1)});
            }
        }

        if (Slopes.props.getInt("DirtSlopes") != 0)
        {
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevDirtSlopes, 3, 4), new Object[] {"#  ", " # ", "###", '#', Block.dirt});
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevDirtSlopes, 3, 12), new Object[] {" # ", " ##", " # ", '#', Block.dirt});

            if (Slopes.props.getBoolean("BlockInversion"))
            {
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevDirtSlopes, 4, 0), new Object[] {"###", " ##", "  #", '#', Block.dirt});
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevDirtSlopes, 3, 8), new Object[] {"###", " # ", "#  ", '#', Block.dirt});
            }
        }

        if (Slopes.props.getInt("StoneSlopes") != 0)
        {
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevStoneSlopes, 3, 4), new Object[] {"#  ", " # ", "###", '#', Block.stone});
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevStoneSlopes, 3, 12), new Object[] {" # ", " ##", " # ", '#', Block.stone});

            if (Slopes.props.getBoolean("BlockInversion"))
            {
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevStoneSlopes, 4, 0), new Object[] {"###", " ##", "  #", '#', Block.stone});
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevStoneSlopes, 3, 8), new Object[] {"###", " # ", "#  ", '#', Block.stone});
            }
        }

        if (Slopes.props.getInt("StoneBrickSlopes") != 0)
        {
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevStoneBrickSlopes, 3, 4), new Object[] {"#  ", " # ", "###", '#', Block.stoneBrick});
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevStoneBrickSlopes, 3, 12), new Object[] {" # ", " ##", " # ", '#', Block.stoneBrick});

            if (Slopes.props.getBoolean("BlockInversion"))
            {
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevStoneBrickSlopes, 3, 8), new Object[] {"###", " # ", "#  ", '#', Block.stoneBrick});
            }
        }

        if (Slopes.props.getInt("SandSlopes") != 0)
        {
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevSandSlopes, 3, 4), new Object[] {"#  ", " # ", "###", '#', Block.sand});
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevSandSlopes, 3, 12), new Object[] {" # ", " ##", " # ", '#', Block.sand});

            if (Slopes.props.getBoolean("BlockInversion"))
            {
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevSandSlopes, 4, 0), new Object[] {"###", " ##", "  #", '#', Block.sand});
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevSandSlopes, 3, 8), new Object[] {"###", " # ", "#  ", '#', Block.sand});
            }
        }

        if (Slopes.props.getInt("SnowSlopes") != 0)
        {
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevSnowSlopes, 3, 4), new Object[] {"#  ", " # ", "###", '#', Block.snow});
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevSnowSlopes, 3, 12), new Object[] {" # ", " ##", " # ", '#', Block.snow});

            if (Slopes.props.getBoolean("BlockInversion"))
            {
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevSnowSlopes, 4, 0), new Object[] {"###", " ##", "  #", '#', Block.snow});
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevSnowSlopes, 3, 8), new Object[] {"###", " # ", "#  ", '#', Block.snow});
            }
        }

        if (Slopes.props.getInt("GrassSlopes") != 0)
        {
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevGrassSlopes, 3, 4), new Object[] {"#  ", " # ", "###", '#', Block.grass});
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevGrassSlopes, 3, 12), new Object[] {" # ", " ##", " # ", '#', Block.grass});

            if (Slopes.props.getBoolean("BlockInversion"))
            {
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevGrassSlopes, 4, 0), new Object[] {"###", " ##", "  #", '#', Block.grass});
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevGrassSlopes, 3, 8), new Object[] {"###", " # ", "#  ", '#', Block.grass});
            }
        }

        if (Slopes.props.getInt("BricksSlopes") != 0)
        {
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevBricksSlopes, 3, 4), new Object[] {"#  ", " # ", "###", '#', Block.brick});
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevBricksSlopes, 3, 12), new Object[] {" # ", " ##", " # ", '#', Block.brick});

            if (Slopes.props.getBoolean("BlockInversion"))
            {
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevBricksSlopes, 3, 8), new Object[] {"###", " # ", "#  ", '#', Block.brick});
            }
        }

        if (Slopes.props.getInt("GravelSlopes") != 0)
        {
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevGravelSlopes, 3, 4), new Object[] {"#  ", " # ", "###", '#', Block.gravel});
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevGravelSlopes, 3, 12), new Object[] {" # ", " ##", " # ", '#', Block.gravel});

            if (Slopes.props.getBoolean("BlockInversion"))
            {
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevGravelSlopes, 4, 0), new Object[] {"###", " ##", "  #", '#', Block.gravel});
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevGravelSlopes, 3, 8), new Object[] {"###", " # ", "#  ", '#', Block.gravel});
            }
        }

        if (Slopes.props.getInt("GoldSlopes") != 0)
        {
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevGoldSlopes, 3, 4), new Object[] {"#  ", " # ", "###", '#', Block.blockGold});
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevGoldSlopes, 3, 12), new Object[] {" # ", " ##", " # ", '#', Block.blockGold});

            if (Slopes.props.getBoolean("BlockInversion"))
            {
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevGoldSlopes, 4, 0), new Object[] {"###", " ##", "  #", '#', Block.blockGold});
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevGoldSlopes, 3, 8), new Object[] {"###", " # ", "#  ", '#', Block.blockGold});
            }
        }

        if (Slopes.props.getInt("IronSlopes") != 0)
        {
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevSteelSlopes, 3, 4), new Object[] {"#  ", " # ", "###", '#', Block.blockSteel});
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevSteelSlopes, 3, 12), new Object[] {" # ", " ##", " # ", '#', Block.blockSteel});

            if (Slopes.props.getBoolean("BlockInversion"))
            {
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevSteelSlopes, 4, 0), new Object[] {"###", " ##", "  #", '#', Block.blockSteel});
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevSteelSlopes, 3, 8), new Object[] {"###", " # ", "#  ", '#', Block.blockSteel});
            }
        }

        if (Slopes.props.getInt("ObsidianSlopes") != 0)
        {
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevObsidianSlopes, 3, 4), new Object[] {"#  ", " # ", "###", '#', Block.obsidian});
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevObsidianSlopes, 3, 12), new Object[] {" # ", " ##", " # ", '#', Block.obsidian});

            if (Slopes.props.getBoolean("BlockInversion"))
            {
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevObsidianSlopes, 4, 0), new Object[] {"###", " ##", "  #", '#', Block.obsidian});
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevObsidianSlopes, 3, 8), new Object[] {"###", " # ", "#  ", '#', Block.obsidian});
            }
        }

        if (Slopes.props.getInt("NetherBrickSlopes") != 0)
        {
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevNetherBrickSlopes, 3, 4), new Object[] {"#  ", " # ", "###", '#', Block.netherBrick});
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevNetherBrickSlopes, 3, 12), new Object[] {" # ", " ##", " # ", '#', Block.netherBrick});

            if (Slopes.props.getBoolean("BlockInversion"))
            {
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevNetherBrickSlopes, 3, 8), new Object[] {"###", " # ", "#  ", '#', Block.netherBrick});
            }
        }

        if (Slopes.props.getInt("DiamondSlopes") != 0)
        {
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevDiamondSlopes, 4, 4), new Object[] {"#  ", " # ", "###", '#', Block.blockDiamond});
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevDiamondSlopes, 4, 12), new Object[] {" # ", " ##", " # ", '#', Block.blockDiamond});

            if (Slopes.props.getBoolean("BlockInversion"))
            {
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevDiamondSlopes, 4, 0), new Object[] {"###", " ##", "  #", '#', Block.blockDiamond});
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevDiamondSlopes, 4, 8), new Object[] {"###", " # ", "#  ", '#', Block.blockDiamond});
            }
        }

        if (Slopes.props.getInt("WhiteWoolSlopes") != 0)
        {
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevWhiteWoolSlopes, 4, 4), new Object[] {"#  ", " # ", "###", '#', Block.cloth});
            GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevWhiteWoolSlopes, 4, 12), new Object[] {" # ", " ##", " # ", '#', Block.cloth});

            if (Slopes.props.getBoolean("BlockInversion"))
            {
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevWhiteWoolSlopes, 4, 0), new Object[] {"###", " ##", "  #", '#', Block.cloth});
                GameRegistry.addRecipe(new ItemStack(Slopes.BlockKaevWhiteWoolSlopes, 4, 8), new Object[] {"###", " # ", "#  ", '#', Block.cloth});
            }
        }
    }

    public void loadConfig()
    {
        Slopes.LightOpacity = Slopes.props.getInt("LightOpacity");

        if (Slopes.props.getInt("WoodSlopes") != 0)
        {
            Slopes.BlockKaevWoodSlopes = (new BlockSlopes(Slopes.props.getInt("WoodSlopes"), 4, Material.wood)).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setResistance(5.0F).setBlockName("WoodSlopes");
            Slopes.ItemKaevWoodSlopes = (new ItemSlopes(Slopes.BlockKaevWoodSlopes.blockID - 256, "Wood")).setItemName("WoodSlopes");
        }
        else
        {
            Slopes.BlockKaevWoodSlopes = Block.stone;
        }

        if (Slopes.props.getInt("CobblestoneSlopes") != 0)
        {
            Slopes.BlockKaevCobblestoneSlopes = (new BlockSlopes(Slopes.props.getInt("CobblestoneSlopes"), 16, Material.rock)).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setBlockName("CobblestoneSlopes");
            Slopes.ItemKaevCobblestoneSlopes = (new ItemSlopes(Slopes.BlockKaevCobblestoneSlopes.blockID - 256, "Cobblestone")).setItemName("CobblestoneSlopes");
        }
        else
        {
            Slopes.BlockKaevCobblestoneSlopes = Block.stone;
        }

        if (Slopes.props.getInt("GlassSlopes") != 0)
        {
            Slopes.BlockKaevGlassSlopes = (new BlockSlopes(Slopes.props.getInt("GlassSlopes"), 49, Material.glass)).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setBlockName("GlassSlopes");
            Slopes.ItemKaevGlassSlopes = (new ItemSlopes(Slopes.BlockKaevGlassSlopes.blockID - 256, "Glass")).setItemName("GlassSlopes");
        }
        else
        {
            Slopes.BlockKaevGlassSlopes = Block.stone;
        }

        if (Slopes.props.getInt("SandstoneSlopes") != 0)
        {
            Slopes.BlockKaevSandstoneSlopes = (new BlockSlopes(Slopes.props.getInt("SandstoneSlopes"), 192, Material.rock)).setHardness(0.8F).setStepSound(Block.soundStoneFootstep).setBlockName("SandstoneSlopes");
            Slopes.ItemKaevSandstoneSlopes = (new ItemSlopes(Slopes.BlockKaevSandstoneSlopes.blockID - 256, "Sandstone")).setItemName("SandstoneSlopes");
        }
        else
        {
            Slopes.BlockKaevSandstoneSlopes = Block.stone;
        }

        if (Slopes.props.getInt("SmoothSandstoneSlopes") != 0)
        {
            Slopes.BlockKaevSmoothSandstoneSlopes = (new BlockSlopes(Slopes.props.getInt("SmoothSandstoneSlopes"), 230, Material.rock)).setHardness(0.8F).setStepSound(Block.soundStoneFootstep).setBlockName("SmoothSandstoneSlopes");
            Slopes.ItemKaevSmoothSandstoneSlopes = (new ItemSlopes(Slopes.BlockKaevSmoothSandstoneSlopes.blockID - 256, "SmoothSandstone")).setItemName("SmoothSandstoneSlopes");
        }
        else
        {
            Slopes.BlockKaevSmoothSandstoneSlopes = Block.stone;
        }

        if (Slopes.props.getInt("ChiseledSandstoneSlopes") != 0)
        {
            Slopes.BlockKaevChiseledSandstoneSlopes = (new BlockSlopes(Slopes.props.getInt("ChiseledSandstoneSlopes"), 229, Material.rock)).setHardness(0.8F).setStepSound(Block.soundStoneFootstep).setBlockName("ChiseledSandstoneSlopes");
            Slopes.ItemKaevChiseledSandstoneSlopes = (new ItemSlopes(Slopes.BlockKaevChiseledSandstoneSlopes.blockID - 256, "ChiseledSandstone")).setItemName("ChiseledSandstoneSlopes");
        }
        else
        {
            Slopes.BlockKaevChiseledSandstoneSlopes = Block.stone;
        }

        if (Slopes.props.getInt("DirtSlopes") != 0)
        {
            Slopes.BlockKaevDirtSlopes = (new BlockSlopes(Slopes.props.getInt("DirtSlopes"), 2, Material.ground)).setHardness(0.5F).setStepSound(Block.soundGravelFootstep).setBlockName("DirtSlopes");
            Slopes.ItemKaevDirtSlopes = (new ItemSlopes(Slopes.BlockKaevDirtSlopes.blockID - 256, "Dirt")).setItemName("DirtSlopes");
        }
        else
        {
            Slopes.BlockKaevDirtSlopes = Block.stone;
        }

        if (Slopes.props.getInt("StoneSlopes") != 0)
        {
            Slopes.BlockKaevStoneSlopes = (new BlockSlopes(Slopes.props.getInt("StoneSlopes"), 1, Material.rock)).setHardness(1.5F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setBlockName("StoneSlopes");
            Slopes.ItemKaevStoneSlopes = (new ItemSlopes(Slopes.BlockKaevStoneSlopes.blockID - 256, "Stone")).setItemName("StoneSlopes");
        }
        else
        {
            Slopes.BlockKaevStoneSlopes = Block.stone;
        }

        if (Slopes.props.getInt("StoneBrickSlopes") != 0)
        {
            Slopes.BlockKaevStoneBrickSlopes = (new BlockSlopes(Slopes.props.getInt("StoneBrickSlopes"), Block.stoneBrick.blockIndexInTexture, Material.rock)).setHardness(1.5F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setBlockName("StoneBrickSlopes");
            Slopes.ItemKaevStoneBrickSlopes = (new ItemSlopes(Slopes.BlockKaevStoneBrickSlopes.blockID - 256, "StoneBrick")).setItemName("StoneBrickSlopes");
        }
        else
        {
            Slopes.BlockKaevStoneBrickSlopes = Block.stone;
        }

        if (Slopes.props.getInt("SandSlopes") != 0)
        {
            Slopes.BlockKaevSandSlopes = (new BlockSlopes(Slopes.props.getInt("SandSlopes"), 18, Material.sand)).setHardness(0.5F).setStepSound(Block.soundSandFootstep).setBlockName("SandSlopes");
            Slopes.ItemKaevSandSlopes = (new ItemSlopes(Slopes.BlockKaevSandSlopes.blockID - 256, "Sand")).setItemName("SandSlopes");
        }
        else
        {
            Slopes.BlockKaevSandSlopes = Block.stone;
        }

        if (Slopes.props.getInt("SnowSlopes") != 0)
        {
            Slopes.BlockKaevSnowSlopes = (new BlockSlopes(Slopes.props.getInt("SnowSlopes"), 66, Material.snow)).setHardness(0.1F).setStepSound(Block.soundClothFootstep).setBlockName("SnowSlopes");
            Slopes.ItemKaevSnowSlopes = (new ItemSlopes(Slopes.BlockKaevSnowSlopes.blockID - 256, "Snow")).setItemName("SnowSlopes");
        }
        else
        {
            Slopes.BlockKaevSnowSlopes = Block.stone;
        }

        if (Slopes.props.getInt("GrassSlopes") != 0)
        {
            Slopes.BlockKaevGrassSlopes = (new BlockSlopes(Slopes.props.getInt("GrassSlopes"), 3, Material.ground)).setHardness(0.6F).setStepSound(Block.soundGrassFootstep).setBlockName("GrassSlopes");
            Slopes.ItemKaevGrassSlopes = (new ItemSlopes(Slopes.BlockKaevGrassSlopes.blockID - 256, "Grass")).setItemName("GrassSlopes");
        }
        else
        {
            Slopes.BlockKaevGrassSlopes = Block.stone;
        }

        if (Slopes.props.getInt("BricksSlopes") != 0)
        {
            Slopes.BlockKaevBricksSlopes = (new BlockSlopes(Slopes.props.getInt("BricksSlopes"), 7, Material.rock)).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setBlockName("BricksSlopes");
            Slopes.ItemKaevBricksSlopes = (new ItemSlopes(Slopes.BlockKaevBricksSlopes.blockID - 256, "Bricks")).setItemName("BricksSlopes");
        }
        else
        {
            Slopes.BlockKaevBricksSlopes = Block.stone;
        }

        if (Slopes.props.getInt("GravelSlopes") != 0)
        {
            Slopes.BlockKaevGravelSlopes = (new BlockSlopes(Slopes.props.getInt("GravelSlopes"), 19, Material.sand)).setHardness(0.6F).setStepSound(Block.soundGravelFootstep).setBlockName("GravelSlopes");
            Slopes.ItemKaevGravelSlopes = (new ItemSlopes(Slopes.BlockKaevGravelSlopes.blockID - 256, "Gravel")).setItemName("GravelSlopes");
        }
        else
        {
            Slopes.BlockKaevGravelSlopes = Block.stone;
        }

        if (Slopes.props.getInt("GoldSlopes") != 0)
        {
            Slopes.BlockKaevGoldSlopes = (new BlockSlopes(Slopes.props.getInt("GoldSlopes"), 23, Material.iron)).setHardness(3.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F).setBlockName("GoldSlopes");
            Slopes.ItemKaevGoldSlopes = (new ItemSlopes(Slopes.BlockKaevGoldSlopes.blockID - 256, "Gold")).setItemName("GoldSlopes");
        }
        else
        {
            Slopes.BlockKaevGoldSlopes = Block.stone;
        }

        if (Slopes.props.getInt("IronSlopes") != 0)
        {
            Slopes.BlockKaevSteelSlopes = (new BlockSlopes(Slopes.props.getInt("IronSlopes"), 22, Material.iron)).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F).setBlockName("SteelSlopes");
            Slopes.ItemKaevSteelSlopes = (new ItemSlopes(Slopes.BlockKaevSteelSlopes.blockID - 256, "Steel")).setItemName("SteelSlopes");
        }
        else
        {
            Slopes.BlockKaevSteelSlopes = Block.stone;
        }

        if (Slopes.props.getInt("ObsidianSlopes") != 0)
        {
            Slopes.BlockKaevObsidianSlopes = (new BlockSlopes(Slopes.props.getInt("ObsidianSlopes"), 37, Material.rock)).setHardness(10.0F).setStepSound(Block.soundStoneFootstep).setResistance(2000.0F).setBlockName("ObsidianSlopes");
            Slopes.ItemKaevObsidianSlopes = (new ItemSlopes(Slopes.BlockKaevObsidianSlopes.blockID - 256, "Obsidian")).setItemName("ObsidianSlopes");
        }
        else
        {
            Slopes.BlockKaevObsidianSlopes = Block.stone;
        }

        if (Slopes.props.getInt("NetherBrickSlopes") != 0)
        {
            Slopes.BlockKaevNetherBrickSlopes = (new BlockSlopes(Slopes.props.getInt("NetherBrickSlopes"), Block.netherBrick.blockIndexInTexture, Material.rock)).setHardness(1.5F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setBlockName("NetherBrickSlopes");
            Slopes.ItemKaevNetherBrickSlopes = (new ItemSlopes(Slopes.BlockKaevNetherBrickSlopes.blockID - 256, "NetherBrick")).setItemName("NetherBrickSlopes");
        }
        else
        {
            Slopes.BlockKaevNetherBrickSlopes = Block.stone;
        }

        if (Slopes.props.getInt("DiamondSlopes") != 0)
        {
            Slopes.BlockKaevDiamondSlopes = (new BlockSlopes(Slopes.props.getInt("DiamondSlopes"), 24, Material.iron)).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F).setBlockName("DiamondSlopes");
            Slopes.ItemKaevDiamondSlopes = (new ItemSlopes(Slopes.BlockKaevDiamondSlopes.blockID - 256, "Diamond")).setItemName("DiamondSlopes");
        }
        else
        {
            Slopes.BlockKaevDiamondSlopes = Block.stone;
        }

        if (Slopes.props.getInt("WhiteWoolSlopes") != 0)
        {
            Slopes.BlockKaevWhiteWoolSlopes = (new BlockSlopes(Slopes.props.getInt("WhiteWoolSlopes"), 64, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("WhiteWoolSlopes");
            Slopes.ItemKaevWhiteWoolSlopes = (new ItemSlopes(Slopes.BlockKaevWhiteWoolSlopes.blockID - 256, "WhiteWool")).setItemName("WhiteWoolSlopes");
        }
        else
        {
            Slopes.BlockKaevWhiteWoolSlopes = Block.stone;
        }

        if (Slopes.props.getInt("BlackWoolSlopes") != 0)
        {
            Slopes.BlockKaevBlackWoolSlopes = (new BlockSlopes(Slopes.props.getInt("BlackWoolSlopes"), 113, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlackWoolSlopes");
            Slopes.ItemKaevBlackWoolSlopes = (new ItemSlopes(Slopes.BlockKaevBlackWoolSlopes.blockID - 256, "BlackWool")).setItemName("BlackWoolSlopes");
        }
        else
        {
            Slopes.BlockKaevBlackWoolSlopes = Block.stone;
        }

        if (Slopes.props.getInt("RedWoolSlopes") != 0)
        {
            Slopes.BlockKaevRedWoolSlopes = (new BlockSlopes(Slopes.props.getInt("RedWoolSlopes"), 129, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("RedWoolSlopes");
            Slopes.ItemKaevRedWoolSlopes = (new ItemSlopes(Slopes.BlockKaevRedWoolSlopes.blockID - 256, "RedWool")).setItemName("RedWoolSlopes");
        }
        else
        {
            Slopes.BlockKaevRedWoolSlopes = Block.stone;
        }

        if (Slopes.props.getInt("GreenWoolSlopes") != 0)
        {
            Slopes.BlockKaevGreenWoolSlopes = (new BlockSlopes(Slopes.props.getInt("GreenWoolSlopes"), 145, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("GreenWoolSlopes");
            Slopes.ItemKaevGreenWoolSlopes = (new ItemSlopes(Slopes.BlockKaevGreenWoolSlopes.blockID - 256, "GreenWool")).setItemName("GreenWoolSlopes");
        }
        else
        {
            Slopes.BlockKaevGreenWoolSlopes = Block.stone;
        }

        if (Slopes.props.getInt("BrownWoolSlopes") != 0)
        {
            Slopes.BlockKaevBrownWoolSlopes = (new BlockSlopes(Slopes.props.getInt("BrownWoolSlopes"), 161, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BrownWoolSlopes");
            Slopes.ItemKaevBrownWoolSlopes = (new ItemSlopes(Slopes.BlockKaevBrownWoolSlopes.blockID - 256, "BrownWool")).setItemName("BrownWoolSlopes");
        }
        else
        {
            Slopes.BlockKaevBrownWoolSlopes = Block.stone;
        }

        if (Slopes.props.getInt("BlueWoolSlopes") != 0)
        {
            Slopes.BlockKaevBlueWoolSlopes = (new BlockSlopes(Slopes.props.getInt("BlueWoolSlopes"), 177, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlueWoolSlopes");
            Slopes.ItemKaevBlueWoolSlopes = (new ItemSlopes(Slopes.BlockKaevBlueWoolSlopes.blockID - 256, "BlueWool")).setItemName("BlueWoolSlopes");
        }
        else
        {
            Slopes.BlockKaevBlueWoolSlopes = Block.stone;
        }

        if (Slopes.props.getInt("PurpleWoolSlopes") != 0)
        {
            Slopes.BlockKaevPurpleWoolSlopes = (new BlockSlopes(Slopes.props.getInt("PurpleWoolSlopes"), 193, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("PurpleWoolSlopes");
            Slopes.ItemKaevPurpleWoolSlopes = (new ItemSlopes(Slopes.BlockKaevPurpleWoolSlopes.blockID - 256, "PurpleWool")).setItemName("PurpleWoolSlopes");
        }
        else
        {
            Slopes.BlockKaevPurpleWoolSlopes = Block.stone;
        }

        if (Slopes.props.getInt("CyanWoolSlopes") != 0)
        {
            Slopes.BlockKaevCyanWoolSlopes = (new BlockSlopes(Slopes.props.getInt("CyanWoolSlopes"), 209, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("CyanWoolSlopes");
            Slopes.ItemKaevCyanWoolSlopes = (new ItemSlopes(Slopes.BlockKaevCyanWoolSlopes.blockID - 256, "CyanWool")).setItemName("CyanWoolSlopes");
        }
        else
        {
            Slopes.BlockKaevCyanWoolSlopes = Block.stone;
        }

        if (Slopes.props.getInt("LightGrayWoolSlopes") != 0)
        {
            Slopes.BlockKaevSilverWoolSlopes = (new BlockSlopes(Slopes.props.getInt("LightGrayWoolSlopes"), 225, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("SilverWoolSlopes");
            Slopes.ItemKaevSilverWoolSlopes = (new ItemSlopes(Slopes.BlockKaevSilverWoolSlopes.blockID - 256, "SilverWool")).setItemName("SilverWoolSlopes");
        }
        else
        {
            Slopes.BlockKaevSilverWoolSlopes = Block.stone;
        }

        if (Slopes.props.getInt("GrayWoolSlopes") != 0)
        {
            Slopes.BlockKaevGrayWoolSlopes = (new BlockSlopes(Slopes.props.getInt("GrayWoolSlopes"), 114, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("GrayWoolSlopes");
            Slopes.ItemKaevGrayWoolSlopes = (new ItemSlopes(Slopes.BlockKaevGrayWoolSlopes.blockID - 256, "GrayWool")).setItemName("GrayWoolSlopes");
        }
        else
        {
            Slopes.BlockKaevGrayWoolSlopes = Block.stone;
        }

        if (Slopes.props.getInt("PinkWoolSlopes") != 0)
        {
            Slopes.BlockKaevPinkWoolSlopes = (new BlockSlopes(Slopes.props.getInt("PinkWoolSlopes"), 130, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("PinkWoolSlopes");
            Slopes.ItemKaevPinkWoolSlopes = (new ItemSlopes(Slopes.BlockKaevPinkWoolSlopes.blockID - 256, "PinkWool")).setItemName("PinkWoolSlopes");
        }
        else
        {
            Slopes.BlockKaevPinkWoolSlopes = Block.stone;
        }

        if (Slopes.props.getInt("LimeWoolSlopes") != 0)
        {
            Slopes.BlockKaevLimeWoolSlopes = (new BlockSlopes(Slopes.props.getInt("LimeWoolSlopes"), 146, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("LimeWoolSlopes");
            Slopes.ItemKaevLimeWoolSlopes = (new ItemSlopes(Slopes.BlockKaevLimeWoolSlopes.blockID - 256, "LimeWool")).setItemName("LimeWoolSlopes");
        }
        else
        {
            Slopes.BlockKaevLimeWoolSlopes = Block.stone;
        }

        if (Slopes.props.getInt("YellowWoolSlopes") != 0)
        {
            Slopes.BlockKaevYellowWoolSlopes = (new BlockSlopes(Slopes.props.getInt("YellowWoolSlopes"), 162, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("YellowWoolSlopes");
            Slopes.ItemKaevYellowWoolSlopes = (new ItemSlopes(Slopes.BlockKaevYellowWoolSlopes.blockID - 256, "YellowWool")).setItemName("YellowWoolSlopes");
        }
        else
        {
            Slopes.BlockKaevYellowWoolSlopes = Block.stone;
        }

        if (Slopes.props.getInt("LightBlueWoolSlopes") != 0)
        {
            Slopes.BlockKaevLightBlueWoolSlopes = (new BlockSlopes(Slopes.props.getInt("LightBlueWoolSlopes"), 178, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("LightBlueWoolSlopes");
            Slopes.ItemKaevLightBlueWoolSlopes = (new ItemSlopes(Slopes.BlockKaevLightBlueWoolSlopes.blockID - 256, "LightBlueWool")).setItemName("LightBlueWoolSlopes");
        }
        else
        {
            Slopes.BlockKaevLightBlueWoolSlopes = Block.stone;
        }

        if (Slopes.props.getInt("MagentaWoolSlopes") != 0)
        {
            Slopes.BlockKaevMagentaWoolSlopes = (new BlockSlopes(Slopes.props.getInt("MagentaWoolSlopes"), 194, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("MagentaWoolSlopes");
            Slopes.ItemKaevMagentaWoolSlopes = (new ItemSlopes(Slopes.BlockKaevMagentaWoolSlopes.blockID - 256, "MagentaWool")).setItemName("MagentaWoolSlopes");
        }
        else
        {
            Slopes.BlockKaevMagentaWoolSlopes = Block.stone;
        }

        if (Slopes.props.getInt("OrangeWoolSlopes") != 0)
        {
            Slopes.BlockKaevOrangeWoolSlopes = (new BlockSlopes(Slopes.props.getInt("OrangeWoolSlopes"), 210, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("OrangeWoolSlopes");
            Slopes.ItemKaevOrangeWoolSlopes = (new ItemSlopes(Slopes.BlockKaevOrangeWoolSlopes.blockID - 256, "OrangeWool")).setItemName("OrangeWoolSlopes");
        }
        else
        {
            Slopes.BlockKaevOrangeWoolSlopes = Block.stone;
        }
    }
}
