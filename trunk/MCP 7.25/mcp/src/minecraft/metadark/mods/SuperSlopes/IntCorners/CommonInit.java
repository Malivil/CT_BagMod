package metadark.mods.SuperSlopes.IntCorners;

import metadark.mods.SuperSlopes.Corners.Corners;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonInit {
    public void registerBlockModel() {}

    public void addLocalizations() {}

    public void addRecipes() {
        if (IntCorners.props.getInt("WoodIntCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevWoodIntCorners, 3, 0), new Object[] {"  #", "###", '#', Block.planks});
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevWoodIntCorners, 3, 8), new Object[] {"## ", "# #", '#', Block.planks});

            if (IntCorners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevWoodIntCorners, 3, 4), new Object[] {"###", "  #", '#', Block.planks});
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevWoodIntCorners, 3, 12), new Object[] {"# #", "## ", '#', Block.planks});
            }
        }

        if (IntCorners.props.getInt("CobblestoneIntCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevCobblestoneIntCorners, 3, 0), new Object[] {"  #", "###", '#', Block.cobblestone});
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevCobblestoneIntCorners, 3, 8), new Object[] {"## ", "# #", '#', Block.cobblestone});

            if (IntCorners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevCobblestoneIntCorners, 3, 4), new Object[] {"###", "  #", '#', Block.cobblestone});
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevCobblestoneIntCorners, 3, 12), new Object[] {"# #", "## ", '#', Block.cobblestone});
            }
        }

        if (IntCorners.props.getInt("GlassIntCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevGlassIntCorners, 3, 0), new Object[] {"  #", "###", '#', Block.glass});
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevGlassIntCorners, 3, 8), new Object[] {"## ", "# #", '#', Block.glass});

            if (IntCorners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevGlassIntCorners, 3, 4), new Object[] {"###", "  #", '#', Block.glass});
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevGlassIntCorners, 3, 12), new Object[] {"# #", "## ", '#', Block.glass});
            }
        }

        if (IntCorners.props.getInt("SandstoneIntCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevSandstoneIntCorners, 3, 0), new Object[] {"  #", "###", '#', new ItemStack(Block.sandStone, 1, 0)});
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevSandstoneIntCorners, 3, 8), new Object[] {"## ", "# #", '#', new ItemStack(Block.sandStone, 1, 0)});

            if (IntCorners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevSandstoneIntCorners, 3, 4), new Object[] {"###", "  #", '#', new ItemStack(Block.sandStone, 1, 0)});
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevSandstoneIntCorners, 3, 12), new Object[] {"# #", "## ", '#', new ItemStack(Block.sandStone, 1, 0)});
            }
        }

        if (IntCorners.props.getInt("SmoothSandstoneIntCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevSmoothSandstoneIntCorners, 3, 0), new Object[] {"  #", "###", '#', new ItemStack(Block.sandStone, 1, 2)});
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevSmoothSandstoneIntCorners, 3, 8), new Object[] {"## ", "# #", '#', new ItemStack(Block.sandStone, 1, 2)});

            if (IntCorners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevSmoothSandstoneIntCorners, 3, 4), new Object[] {"###", "  #", '#', new ItemStack(Block.sandStone, 1, 2)});
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevSmoothSandstoneIntCorners, 3, 12), new Object[] {"# #", "## ", '#', new ItemStack(Block.sandStone, 1, 2)});
            }
        }

        if (IntCorners.props.getInt("ChiseledSandstoneIntCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevChiseledSandstoneIntCorners, 3, 0), new Object[] {"  #", "###", '#', new ItemStack(Block.sandStone, 1, 1)});
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevChiseledSandstoneIntCorners, 3, 8), new Object[] {"## ", "# #", '#', new ItemStack(Block.sandStone, 1, 1)});

            if (IntCorners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevChiseledSandstoneIntCorners, 3, 4), new Object[] {"###", "  #", '#', new ItemStack(Block.sandStone, 1, 1)});
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevChiseledSandstoneIntCorners, 3, 12), new Object[] {"# #", "## ", '#', new ItemStack(Block.sandStone, 1, 1)});
            }
        }

        if (IntCorners.props.getInt("DirtIntCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevDirtIntCorners, 3, 0), new Object[] {"  #", "###", '#', Block.dirt});
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevDirtIntCorners, 3, 8), new Object[] {"## ", "# #", '#', Block.dirt});

            if (IntCorners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevDirtIntCorners, 3, 4), new Object[] {"###", "  #", '#', Block.dirt});
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevDirtIntCorners, 3, 12), new Object[] {"# #", "## ", '#', Block.dirt});
            }
        }

        if (IntCorners.props.getInt("StoneIntCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevStoneIntCorners, 3, 0), new Object[] {"  #", "###", '#', Block.stone});
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevStoneIntCorners, 3, 8), new Object[] {"## ", "# #", '#', Block.stone});

            if (IntCorners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevStoneIntCorners, 3, 4), new Object[] {"###", "  #", '#', Block.stone});
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevStoneIntCorners, 3, 12), new Object[] {"# #", "## ", '#', Block.stone});
            }
        }

        if (IntCorners.props.getInt("StoneBrickIntCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevStoneBrickIntCorners, 3, 0), new Object[] {"  #", "###", '#', Block.stoneBrick});
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevStoneBrickIntCorners, 3, 8), new Object[] {"## ", "# #", '#', Block.stoneBrick});

            if (IntCorners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevStoneBrickIntCorners, 3, 4), new Object[] {"###", "  #", '#', Block.stoneBrick});
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevStoneBrickIntCorners, 3, 12), new Object[] {"# #", "## ", '#', Block.stoneBrick});
            }
        }

        if (IntCorners.props.getInt("SandIntCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevSandIntCorners, 3, 0), new Object[] {"  #", "###", '#', Block.sand});
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevSandIntCorners, 3, 8), new Object[] {"## ", "# #", '#', Block.sand});

            if (IntCorners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevSandIntCorners, 3, 4), new Object[] {"###", "  #", '#', Block.sand});
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevSandIntCorners, 3, 12), new Object[] {"# #", "## ", '#', Block.sand});
            }
        }

        if (IntCorners.props.getInt("SnowIntCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevSnowIntCorners, 3, 0), new Object[] {"  #", "###", '#', Block.snow});
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevSnowIntCorners, 3, 8), new Object[] {"## ", "# #", '#', Block.snow});

            if (IntCorners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevSnowIntCorners, 3, 4), new Object[] {"###", "  #", '#', Block.snow});
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevSnowIntCorners, 3, 12), new Object[] {"# #", "## ", '#', Block.snow});
            }
        }

        if (IntCorners.props.getInt("GrassIntCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevGrassIntCorners, 3, 0), new Object[] {"  #", "###", '#', Block.grass});
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevGrassIntCorners, 3, 8), new Object[] {"## ", "# #", '#', Block.grass});

            if (IntCorners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevGrassIntCorners, 3, 4), new Object[] {"###", "  #", '#', Block.grass});
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevGrassIntCorners, 3, 12), new Object[] {"# #", "## ", '#', Block.grass});
            }
        }

        if (IntCorners.props.getInt("BricksIntCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevBricksIntCorners, 3, 0), new Object[] {"  #", "###", '#', Block.brick});
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevBricksIntCorners, 3, 8), new Object[] {"## ", "# #", '#', Block.brick});

            if (IntCorners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevBricksIntCorners, 3, 4), new Object[] {"###", "  #", '#', Block.brick});
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevBricksIntCorners, 3, 12), new Object[] {"# #", "## ", '#', Block.brick});
            }
        }

        if (IntCorners.props.getInt("GravelIntCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevGravelIntCorners, 3, 0), new Object[] {"  #", "###", '#', Block.gravel});
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevGravelIntCorners, 3, 8), new Object[] {"## ", "# #", '#', Block.gravel});

            if (IntCorners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevGravelIntCorners, 3, 4), new Object[] {"###", "  #", '#', Block.gravel});
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevGravelIntCorners, 3, 12), new Object[] {"# #", "## ", '#', Block.gravel});
            }
        }

        if (IntCorners.props.getInt("GoldIntCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevGoldIntCorners, 3, 0), new Object[] {"  #", "###", '#', Block.blockGold});
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevGoldIntCorners, 3, 8), new Object[] {"## ", "# #", '#', Block.blockGold});

            if (IntCorners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevGoldIntCorners, 3, 4), new Object[] {"###", "  #", '#', Block.blockGold});
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevGoldIntCorners, 3, 12), new Object[] {"# #", "## ", '#', Block.blockGold});
            }
        }

        if (IntCorners.props.getInt("IronIntCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevSteelIntCorners, 3, 0), new Object[] {"  #", "###", '#', Block.blockSteel});
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevSteelIntCorners, 3, 8), new Object[] {"## ", "# #", '#', Block.blockSteel});

            if (IntCorners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevSteelIntCorners, 3, 4), new Object[] {"###", "  #", '#', Block.blockSteel});
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevSteelIntCorners, 3, 12), new Object[] {"# #", "## ", '#', Block.blockSteel});
            }
        }

        if (IntCorners.props.getInt("ObsidianIntCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevObsidianIntCorners, 3, 0), new Object[] {"  #", "###", '#', Block.obsidian});
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevObsidianIntCorners, 3, 8), new Object[] {"## ", "# #", '#', Block.obsidian});

            if (IntCorners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevObsidianIntCorners, 3, 4), new Object[] {"###", "  #", '#', Block.obsidian});
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevObsidianIntCorners, 3, 12), new Object[] {"# #", "## ", '#', Block.obsidian});
            }
        }

        if (IntCorners.props.getInt("NetherBrickIntCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevNetherBrickIntCorners, 3, 0), new Object[] {"  #", "###", '#', Block.netherBrick});
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevNetherBrickIntCorners, 3, 8), new Object[] {"## ", "# #", '#', Block.netherBrick});

            if (IntCorners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevNetherBrickIntCorners, 3, 4), new Object[] {"###", "  #", '#', Block.netherBrick});
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevNetherBrickIntCorners, 3, 12), new Object[] {"# #", "## ", '#', Block.netherBrick});
            }
        }

        if (IntCorners.props.getInt("DiamondIntCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevDiamondIntCorners, 3, 0), new Object[] {"  #", "###", '#', Block.blockDiamond});
            GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevDiamondIntCorners, 3, 8), new Object[] {"## ", "# #", '#', Block.blockDiamond});

            if (IntCorners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevDiamondIntCorners, 3, 4), new Object[] {"###", "  #", '#', Block.blockDiamond});
                GameRegistry.addRecipe(new ItemStack(IntCorners.BlockKaevDiamondIntCorners, 3, 12), new Object[] {"# #", "## ", '#', Block.blockDiamond});
            }
        }

        final String[] colors = {"White", "Orange", "Magenta", "LightBlue", "Yellow", "Lime", "Pink", "Gray", "LightGray", "Cyan", "Purple", "Blue", "Brown", "Green", "Red", "Black"};
        final Block[] blocks = {IntCorners.BlockKaevWhiteWoolIntCorners, IntCorners.BlockKaevOrangeWoolIntCorners, IntCorners.BlockKaevMagentaWoolIntCorners, IntCorners.BlockKaevLightBlueWoolIntCorners,
        						IntCorners.BlockKaevYellowWoolIntCorners, IntCorners.BlockKaevLimeWoolIntCorners, IntCorners.BlockKaevPinkWoolIntCorners, IntCorners.BlockKaevGrayWoolIntCorners,
        						IntCorners.BlockKaevLightGrayWoolIntCorners, IntCorners.BlockKaevCyanWoolIntCorners, IntCorners.BlockKaevPurpleWoolIntCorners, IntCorners.BlockKaevBlueWoolIntCorners,
        						IntCorners.BlockKaevBrownWoolIntCorners, IntCorners.BlockKaevGreenWoolIntCorners, IntCorners.BlockKaevRedWoolIntCorners, IntCorners.BlockKaevBlackWoolIntCorners};

        for (int i = 0; i < colors.length; i++) {
        	if (Corners.props.getInt(colors[i] + "WoolIntCorners") != 0) {
                GameRegistry.addRecipe(new ItemStack(blocks[i], 3, 0), new Object[] {"  #", "###", '#', new ItemStack(Block.cloth, 1, i)});
                GameRegistry.addRecipe(new ItemStack(blocks[i], 3, 8), new Object[] {"## ", "# #", '#', new ItemStack(Block.cloth, 1, i)});

                if (Corners.props.getBoolean("BlockInversion")) {
                    GameRegistry.addRecipe(new ItemStack(blocks[i], 3, 4), new Object[] {"###", "  #", '#', new ItemStack(Block.cloth, 1, i)});
                    GameRegistry.addRecipe(new ItemStack(blocks[i], 3, 12), new Object[] {"# #", "## ", '#', new ItemStack(Block.cloth, 1, i)});
                }
            }
        }
    }

    public void loadConfig() {
        IntCorners.LightOpacity = IntCorners.props.getInt("LightOpacity");

        if (IntCorners.props.getInt("WoodIntCorners") != 0) {
            IntCorners.BlockKaevWoodIntCorners = (new BlockIntCorners(IntCorners.props.getInt("WoodIntCorners"), 4, Material.wood)).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setResistance(5.0F).setBlockName("WoodIntCorners");
            IntCorners.ItemKaevWoodIntCorners = (new ItemIntCorners(IntCorners.BlockKaevWoodIntCorners.blockID - 256, "Wood")).setItemName("WoodIntCorners");
        }
        else
            IntCorners.BlockKaevWoodIntCorners = Block.stone;

        if (IntCorners.props.getInt("CobblestoneIntCorners") != 0) {
            IntCorners.BlockKaevCobblestoneIntCorners = (new BlockIntCorners(IntCorners.props.getInt("CobblestoneIntCorners"), Block.cobblestone.blockIndexInTexture, Material.rock)).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setBlockName("CobblestoneIntCorners");
            IntCorners.ItemKaevCobblestoneIntCorners = (new ItemIntCorners(IntCorners.BlockKaevCobblestoneIntCorners.blockID - 256, "Cobblestone")).setItemName("CobblestoneIntCorners");
        }
        else
            IntCorners.BlockKaevCobblestoneIntCorners = Block.stone;

        if (IntCorners.props.getInt("GlassIntCorners") != 0) {
            IntCorners.BlockKaevGlassIntCorners = (new BlockIntCorners(IntCorners.props.getInt("GlassIntCorners"), Block.glass.blockIndexInTexture, Material.glass)).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setBlockName("GlassIntCorners");
            IntCorners.ItemKaevGlassIntCorners = (new ItemIntCorners(IntCorners.BlockKaevGlassIntCorners.blockID - 256, "Glass")).setItemName("GlassIntCorners");
        }
        else
            IntCorners.BlockKaevGlassIntCorners = Block.stone;

        if (IntCorners.props.getInt("SandstoneIntCorners") != 0) {
            IntCorners.BlockKaevSandstoneIntCorners = (new BlockIntCorners(IntCorners.props.getInt("SandstoneIntCorners"), 192, Material.rock)).setHardness(0.8F).setStepSound(Block.soundStoneFootstep).setBlockName("SandstoneIntCorners");
            IntCorners.ItemKaevSandstoneIntCorners = (new ItemIntCorners(IntCorners.BlockKaevSandstoneIntCorners.blockID - 256, "Sandstone")).setItemName("SandstoneIntCorners");
        }
        else
            IntCorners.BlockKaevSandstoneIntCorners = Block.stone;

        if (IntCorners.props.getInt("SmoothSandstoneIntCorners") != 0) {
            IntCorners.BlockKaevSmoothSandstoneIntCorners = (new BlockIntCorners(IntCorners.props.getInt("SmoothSandstoneIntCorners"), 230, Material.rock)).setHardness(0.8F).setStepSound(Block.soundStoneFootstep).setBlockName("SmoothSandstoneIntCorners");
            IntCorners.ItemKaevSmoothSandstoneIntCorners = (new ItemIntCorners(IntCorners.BlockKaevSmoothSandstoneIntCorners.blockID - 256, "SmoothSandstone")).setItemName("SmoothSandstoneIntCorners");
        }
        else
            IntCorners.BlockKaevSmoothSandstoneIntCorners = Block.stone;

        if (IntCorners.props.getInt("ChiseledSandstoneIntCorners") != 0) {
            IntCorners.BlockKaevChiseledSandstoneIntCorners = (new BlockIntCorners(IntCorners.props.getInt("ChiseledSandstoneIntCorners"), 229, Material.rock)).setHardness(0.8F).setStepSound(Block.soundStoneFootstep).setBlockName("ChiseledSandstoneIntCorners");
            IntCorners.ItemKaevChiseledSandstoneIntCorners = (new ItemIntCorners(IntCorners.BlockKaevChiseledSandstoneIntCorners.blockID - 256, "ChiseledSandstone")).setItemName("ChiseledSandstoneIntCorners");
        }
        else
            IntCorners.BlockKaevChiseledSandstoneIntCorners = Block.stone;

        if (IntCorners.props.getInt("DirtIntCorners") != 0) {
            IntCorners.BlockKaevDirtIntCorners = (new BlockIntCorners(IntCorners.props.getInt("DirtIntCorners"), Block.dirt.blockIndexInTexture, Material.ground)).setHardness(0.5F).setStepSound(Block.soundGravelFootstep).setBlockName("DirtIntCorners");
            IntCorners.ItemKaevDirtIntCorners = (new ItemIntCorners(IntCorners.BlockKaevDirtIntCorners.blockID - 256, "Dirt")).setItemName("DirtIntCorners");
        }
        else
            IntCorners.BlockKaevDirtIntCorners = Block.stone;

        if (IntCorners.props.getInt("StoneIntCorners") != 0) {
            IntCorners.BlockKaevStoneIntCorners = (new BlockIntCorners(IntCorners.props.getInt("StoneIntCorners"), Block.stone.blockIndexInTexture, Material.rock)).setHardness(1.5F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setBlockName("StoneIntCorners");
            IntCorners.ItemKaevStoneIntCorners = (new ItemIntCorners(IntCorners.BlockKaevStoneIntCorners.blockID - 256, "Stone")).setItemName("StoneIntCorners");
        }
        else
            IntCorners.BlockKaevStoneIntCorners = Block.stone;

        if (IntCorners.props.getInt("StoneBrickIntCorners") != 0) {
            IntCorners.BlockKaevStoneBrickIntCorners = (new BlockIntCorners(IntCorners.props.getInt("StoneBrickIntCorners"), Block.stoneBrick.blockIndexInTexture, Material.rock)).setHardness(1.5F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setBlockName("StoneBrickIntCorners");
            IntCorners.ItemKaevStoneBrickIntCorners = (new ItemIntCorners(IntCorners.BlockKaevStoneBrickIntCorners.blockID - 256, "StoneBrick")).setItemName("StoneBrickIntCorners");
        }
        else
            IntCorners.BlockKaevStoneBrickIntCorners = Block.stone;

        if (IntCorners.props.getInt("SandIntCorners") != 0) {
            IntCorners.BlockKaevSandIntCorners = (new BlockIntCorners(IntCorners.props.getInt("SandIntCorners"), Block.sand.blockIndexInTexture, Material.sand)).setHardness(0.5F).setStepSound(Block.soundSandFootstep).setBlockName("SandIntCorners");
            IntCorners.ItemKaevSandIntCorners = (new ItemIntCorners(IntCorners.BlockKaevSandIntCorners.blockID - 256, "Sand")).setItemName("SandIntCorners");
        }
        else
            IntCorners.BlockKaevSandIntCorners = Block.stone;

        if (IntCorners.props.getInt("SnowIntCorners") != 0) {
            IntCorners.BlockKaevSnowIntCorners = (new BlockIntCorners(IntCorners.props.getInt("SnowIntCorners"), Block.snow.blockIndexInTexture, Material.snow)).setHardness(0.1F).setStepSound(Block.soundClothFootstep).setBlockName("SnowIntCorners");
            IntCorners.ItemKaevSnowIntCorners = (new ItemIntCorners(IntCorners.BlockKaevSnowIntCorners.blockID - 256, "Snow")).setItemName("SnowIntCorners");
        }
        else
            IntCorners.BlockKaevSnowIntCorners = Block.stone;

        if (IntCorners.props.getInt("GrassIntCorners") != 0) {
            IntCorners.BlockKaevGrassIntCorners = (new BlockIntCorners(IntCorners.props.getInt("GrassIntCorners"), Block.grass.blockIndexInTexture, Material.ground)).setHardness(0.6F).setStepSound(Block.soundGrassFootstep).setBlockName("GrassIntCorners");
            IntCorners.ItemKaevGrassIntCorners = (new ItemIntCorners(IntCorners.BlockKaevGrassIntCorners.blockID - 256, "Grass")).setItemName("GrassIntCorners");
        }
        else
            IntCorners.BlockKaevGrassIntCorners = Block.stone;

        if (IntCorners.props.getInt("BricksIntCorners") != 0) {
            IntCorners.BlockKaevBricksIntCorners = (new BlockIntCorners(IntCorners.props.getInt("BricksIntCorners"), Block.brick.blockIndexInTexture, Material.rock)).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setBlockName("BricksIntCorners");
            IntCorners.ItemKaevBricksIntCorners = (new ItemIntCorners(IntCorners.BlockKaevBricksIntCorners.blockID - 256, "Bricks")).setItemName("BricksIntCorners");
        }
        else
            IntCorners.BlockKaevBricksIntCorners = Block.stone;

        if (IntCorners.props.getInt("GravelIntCorners") != 0) {
            IntCorners.BlockKaevGravelIntCorners = (new BlockIntCorners(IntCorners.props.getInt("GravelIntCorners"), Block.gravel.blockIndexInTexture, Material.sand)).setHardness(0.6F).setStepSound(Block.soundGravelFootstep).setBlockName("GravelIntCorners");
            IntCorners.ItemKaevGravelIntCorners = (new ItemIntCorners(IntCorners.BlockKaevGravelIntCorners.blockID - 256, "Gravel")).setItemName("GravelIntCorners");
        }
        else
            IntCorners.BlockKaevGravelIntCorners = Block.stone;

        if (IntCorners.props.getInt("GoldIntCorners") != 0) {
            IntCorners.BlockKaevGoldIntCorners = (new BlockIntCorners(IntCorners.props.getInt("GoldIntCorners"), Block.blockGold.blockIndexInTexture, Material.iron)).setHardness(3.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F).setBlockName("GoldIntCorners");
            IntCorners.ItemKaevGoldIntCorners = (new ItemIntCorners(IntCorners.BlockKaevGoldIntCorners.blockID - 256, "Gold")).setItemName("GoldIntCorners");
        }
        else
            IntCorners.BlockKaevGoldIntCorners = Block.stone;

        if (IntCorners.props.getInt("IronIntCorners") != 0) {
            IntCorners.BlockKaevSteelIntCorners = (new BlockIntCorners(IntCorners.props.getInt("IronIntCorners"), Block.blockSteel.blockIndexInTexture, Material.iron)).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F).setBlockName("SteelIntCorners");
            IntCorners.ItemKaevSteelIntCorners = (new ItemIntCorners(IntCorners.BlockKaevSteelIntCorners.blockID - 256, "Steel")).setItemName("SteelIntCorners");
        }
        else
            IntCorners.BlockKaevSteelIntCorners = Block.stone;

        if (IntCorners.props.getInt("ObsidianIntCorners") != 0) {
            IntCorners.BlockKaevObsidianIntCorners = (new BlockIntCorners(IntCorners.props.getInt("ObsidianIntCorners"), Block.obsidian.blockIndexInTexture, Material.rock)).setHardness(10.0F).setStepSound(Block.soundStoneFootstep).setResistance(2000.0F).setBlockName("ObsidianIntCorners");
            IntCorners.ItemKaevObsidianIntCorners = (new ItemIntCorners(IntCorners.BlockKaevObsidianIntCorners.blockID - 256, "Obsidian")).setItemName("ObsidianIntCorners");
        }
        else
            IntCorners.BlockKaevObsidianIntCorners = Block.stone;

        if (IntCorners.props.getInt("NetherBrickIntCorners") != 0) {
            IntCorners.BlockKaevNetherBrickIntCorners = (new BlockIntCorners(IntCorners.props.getInt("NetherBrickIntCorners"), Block.netherBrick.blockIndexInTexture, Material.rock)).setHardness(1.5F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setBlockName("NetherBrickIntCorners");
            IntCorners.ItemKaevNetherBrickIntCorners = (new ItemIntCorners(IntCorners.BlockKaevNetherBrickIntCorners.blockID - 256, "NetherBrick")).setItemName("NetherBrickIntCorners");
        }
        else
            IntCorners.BlockKaevNetherBrickIntCorners = Block.stone;

        if (IntCorners.props.getInt("DiamondIntCorners") != 0) {
            IntCorners.BlockKaevDiamondIntCorners = (new BlockIntCorners(IntCorners.props.getInt("DiamondIntCorners"), Block.blockDiamond.blockIndexInTexture, Material.iron)).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F).setBlockName("DiamondIntCorners");
            IntCorners.ItemKaevDiamondIntCorners = (new ItemIntCorners(IntCorners.BlockKaevDiamondIntCorners.blockID - 256, "Diamond")).setItemName("DiamondIntCorners");
        }
        else
            IntCorners.BlockKaevDiamondIntCorners = Block.stone;

        if (IntCorners.props.getInt("WhiteWoolIntCorners") != 0) {
            IntCorners.BlockKaevWhiteWoolIntCorners = (new BlockIntCorners(IntCorners.props.getInt("WhiteWoolIntCorners", 212), 64, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("WhiteWoolIntCorners");
            IntCorners.ItemKaevWhiteWoolIntCorners = (new ItemIntCorners(IntCorners.BlockKaevWhiteWoolIntCorners.blockID - 256, "WhiteWool")).setItemName("WhiteWoolIntCorners");
        }
        else
            IntCorners.BlockKaevWhiteWoolIntCorners = Block.stone;

        if (IntCorners.props.getInt("BlackWoolIntCorners") != 0) {
            IntCorners.BlockKaevBlackWoolIntCorners = (new BlockIntCorners(IntCorners.props.getInt("BlackWoolIntCorners", 213), 113, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlackWoolIntCorners");
            IntCorners.ItemKaevBlackWoolIntCorners = (new ItemIntCorners(IntCorners.BlockKaevBlackWoolIntCorners.blockID - 256, "BlackWool")).setItemName("BlackWoolIntCorners");
        }
        else
            IntCorners.BlockKaevBlackWoolIntCorners = Block.stone;

        if (IntCorners.props.getInt("RedWoolIntCorners") != 0) {
            IntCorners.BlockKaevRedWoolIntCorners = (new BlockIntCorners(IntCorners.props.getInt("RedWoolIntCorners", 214), 129, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("RedWoolIntCorners");
            IntCorners.ItemKaevRedWoolIntCorners = (new ItemIntCorners(IntCorners.BlockKaevRedWoolIntCorners.blockID - 256, "RedWool")).setItemName("RedWoolIntCorners");
        }
        else
            IntCorners.BlockKaevRedWoolIntCorners = Block.stone;

        if (IntCorners.props.getInt("GreenWoolIntCorners") != 0) {
            IntCorners.BlockKaevGreenWoolIntCorners = (new BlockIntCorners(IntCorners.props.getInt("GreenWoolIntCorners", 215), 145, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("GreenWoolIntCorners");
            IntCorners.ItemKaevGreenWoolIntCorners = (new ItemIntCorners(IntCorners.BlockKaevGreenWoolIntCorners.blockID - 256, "GreenWool")).setItemName("GreenWoolIntCorners");
        }
        else
            IntCorners.BlockKaevGreenWoolIntCorners = Block.stone;

        if (IntCorners.props.getInt("BrownWoolIntCorners") != 0) {
            IntCorners.BlockKaevBrownWoolIntCorners = (new BlockIntCorners(IntCorners.props.getInt("BrownWoolIntCorners", 216), 161, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BrownWoolIntCorners");
            IntCorners.ItemKaevBrownWoolIntCorners = (new ItemIntCorners(IntCorners.BlockKaevBrownWoolIntCorners.blockID - 256, "BrownWool")).setItemName("BrownWoolIntCorners");
        }
        else
            IntCorners.BlockKaevBrownWoolIntCorners = Block.stone;

        if (IntCorners.props.getInt("BlueWoolIntCorners") != 0) {
            IntCorners.BlockKaevBlueWoolIntCorners = (new BlockIntCorners(IntCorners.props.getInt("BlueWoolIntCorners", 217), 177, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlueWoolIntCorners");
            IntCorners.ItemKaevBlueWoolIntCorners = (new ItemIntCorners(IntCorners.BlockKaevBlueWoolIntCorners.blockID - 256, "BlueWool")).setItemName("BlueWoolIntCorners");
        }
        else
            IntCorners.BlockKaevBlueWoolIntCorners = Block.stone;

        if (IntCorners.props.getInt("PurpleWoolIntCorners") != 0) {
            IntCorners.BlockKaevPurpleWoolIntCorners = (new BlockIntCorners(IntCorners.props.getInt("PurpleWoolIntCorners", 218), 193, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("PurpleWoolIntCorners");
            IntCorners.ItemKaevPurpleWoolIntCorners = (new ItemIntCorners(IntCorners.BlockKaevPurpleWoolIntCorners.blockID - 256, "PurpleWool")).setItemName("PurpleWoolIntCorners");
        }
        else
            IntCorners.BlockKaevPurpleWoolIntCorners = Block.stone;

        if (IntCorners.props.getInt("CyanWoolIntCorners") != 0) {
            IntCorners.BlockKaevCyanWoolIntCorners = (new BlockIntCorners(IntCorners.props.getInt("CyanWoolIntCorners", 219), 209, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("CyanWoolIntCorners");
            IntCorners.ItemKaevCyanWoolIntCorners = (new ItemIntCorners(IntCorners.BlockKaevCyanWoolIntCorners.blockID - 256, "CyanWool")).setItemName("CyanWoolIntCorners");
        }
        else
            IntCorners.BlockKaevCyanWoolIntCorners = Block.stone;

        if (IntCorners.props.getInt("LightGrayWoolIntCorners") != 0) {
            IntCorners.BlockKaevLightGrayWoolIntCorners = (new BlockIntCorners(IntCorners.props.getInt("LightGrayWoolIntCorners", 220), 225, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("SilverWoolIntCorners");
            IntCorners.ItemKaevSilverWoolIntCorners = (new ItemIntCorners(IntCorners.BlockKaevLightGrayWoolIntCorners.blockID - 256, "SilverWool")).setItemName("SilverWoolIntCorners");
        }
        else
            IntCorners.BlockKaevLightGrayWoolIntCorners = Block.stone;

        if (IntCorners.props.getInt("GrayWoolIntCorners") != 0) {
            IntCorners.BlockKaevGrayWoolIntCorners = (new BlockIntCorners(IntCorners.props.getInt("GrayWoolIntCorners", 221), 114, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("GrayWoolIntCorners");
            IntCorners.ItemKaevGrayWoolIntCorners = (new ItemIntCorners(IntCorners.BlockKaevGrayWoolIntCorners.blockID - 256, "GrayWool")).setItemName("GrayWoolIntCorners");
        }
        else
            IntCorners.BlockKaevGrayWoolIntCorners = Block.stone;

        if (IntCorners.props.getInt("PinkWoolIntCorners") != 0) {
            IntCorners.BlockKaevPinkWoolIntCorners = (new BlockIntCorners(IntCorners.props.getInt("PinkWoolIntCorners", 222), 130, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("PinkWoolIntCorners");
            IntCorners.ItemKaevPinkWoolIntCorners = (new ItemIntCorners(IntCorners.BlockKaevPinkWoolIntCorners.blockID - 256, "PinkWool")).setItemName("PinkWoolIntCorners");
        }
        else
            IntCorners.BlockKaevPinkWoolIntCorners = Block.stone;

        if (IntCorners.props.getInt("LimeWoolIntCorners") != 0) {
            IntCorners.BlockKaevLimeWoolIntCorners = (new BlockIntCorners(IntCorners.props.getInt("LimeWoolIntCorners", 223), 146, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("LimeWoolIntCorners");
            IntCorners.ItemKaevLimeWoolIntCorners = (new ItemIntCorners(IntCorners.BlockKaevLimeWoolIntCorners.blockID - 256, "LimeWool")).setItemName("LimeWoolIntCorners");
        }
        else
            IntCorners.BlockKaevLimeWoolIntCorners = Block.stone;

        if (IntCorners.props.getInt("YellowWoolIntCorners") != 0) {
            IntCorners.BlockKaevYellowWoolIntCorners = (new BlockIntCorners(IntCorners.props.getInt("YellowWoolIntCorners", 224), 162, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("YellowWoolIntCorners");
            IntCorners.ItemKaevYellowWoolIntCorners = (new ItemIntCorners(IntCorners.BlockKaevYellowWoolIntCorners.blockID - 256, "YellowWool")).setItemName("YellowWoolIntCorners");
        }
        else
            IntCorners.BlockKaevYellowWoolIntCorners = Block.stone;

        if (IntCorners.props.getInt("LightBlueWoolIntCorners") != 0) {
            IntCorners.BlockKaevLightBlueWoolIntCorners = (new BlockIntCorners(IntCorners.props.getInt("LightBlueWoolIntCorners", 225), 178, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("LightBlueWoolIntCorners");
            IntCorners.ItemKaevLightBlueWoolIntCorners = (new ItemIntCorners(IntCorners.BlockKaevLightBlueWoolIntCorners.blockID - 256, "LightBlueWool")).setItemName("LightBlueWoolIntCorners");
        }
        else
            IntCorners.BlockKaevLightBlueWoolIntCorners = Block.stone;

        if (IntCorners.props.getInt("MagentaWoolIntCorners") != 0) {
            IntCorners.BlockKaevMagentaWoolIntCorners = (new BlockIntCorners(IntCorners.props.getInt("MagentaWoolIntCorners", 226), 194, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("MagentaWoolIntCorners");
            IntCorners.ItemKaevMagentaWoolIntCorners = (new ItemIntCorners(IntCorners.BlockKaevMagentaWoolIntCorners.blockID - 256, "MagentaWool")).setItemName("MagentaWoolIntCorners");
        }
        else
            IntCorners.BlockKaevMagentaWoolIntCorners = Block.stone;

        if (IntCorners.props.getInt("OrangeWoolIntCorners") != 0) {
            IntCorners.BlockKaevOrangeWoolIntCorners = (new BlockIntCorners(IntCorners.props.getInt("OrangeWoolIntCorners", 227), 210, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("OrangeWoolIntCorners");
            IntCorners.ItemKaevOrangeWoolIntCorners = (new ItemIntCorners(IntCorners.BlockKaevOrangeWoolIntCorners.blockID - 256, "OrangeWool")).setItemName("OrangeWoolIntCorners");
        }
        else
            IntCorners.BlockKaevOrangeWoolIntCorners = Block.stone;
    }
}
