package metadark.mods.SuperSlopes.Corners;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonInit {
    public void registerBlockModel() {}

    public void addLocalizations() {}

    public void addRecipes() {
        if (Corners.props.getInt("WoodCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevWoodCorners, 3, 0), new Object[] {" # ", "###", '#', Block.planks});
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevWoodCorners, 3, 8), new Object[] {" # ", " # ", "###", '#', Block.planks});

            if (Corners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevWoodCorners, 3, 4), new Object[] {"###", " # ", '#', Block.planks});
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevWoodCorners, 3, 12), new Object[] {"###", " # ", " # ", '#', Block.planks});
            }
        }

        if (Corners.props.getInt("CobblestoneCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevCobblestoneCorners, 3, 0), new Object[] {" # ", "###", '#', Block.cobblestone});
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevCobblestoneCorners, 3, 8), new Object[] {" # ", " # ", "###", '#', Block.cobblestone});

            if (Corners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevCobblestoneCorners, 3, 4), new Object[] {"###", " # ", '#', Block.cobblestone});
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevCobblestoneCorners, 3, 12), new Object[] {"###", " # ", " # ", '#', Block.cobblestone});
            }
        }

        if (Corners.props.getInt("GlassCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevGlassCorners, 3, 0), new Object[] {" # ", "###", '#', Block.glass});
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevGlassCorners, 3, 8), new Object[] {" # ", " # ", "###", '#', Block.glass});

            if (Corners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevGlassCorners, 3, 4), new Object[] {"###", " # ", '#', Block.glass});
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevGlassCorners, 3, 12), new Object[] {"###", " # ", " # ", '#', Block.glass});
            }
        }

        if (Corners.props.getInt("SandstoneCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevSandstoneCorners, 3, 0), new Object[] {" # ", "###", '#', new ItemStack(Block.sandStone, 1, 0)});
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevSandstoneCorners, 3, 8), new Object[] {" # ", " # ", "###", '#', new ItemStack(Block.sandStone, 1, 0)});

            if (Corners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevSandstoneCorners, 3, 4), new Object[] {"###", " # ", '#', new ItemStack(Block.sandStone, 1, 0)});
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevSandstoneCorners, 3, 12), new Object[] {"###", " # ", " # ", '#', new ItemStack(Block.sandStone, 1, 0)});
            }
        }

        if (Corners.props.getInt("SmoothSandstoneCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevSmoothSandstoneCorners, 3, 0), new Object[] {" # ", "###", '#', new ItemStack(Block.sandStone, 1, 2)});
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevSmoothSandstoneCorners, 3, 8), new Object[] {" # ", " # ", "###", '#', new ItemStack(Block.sandStone, 1, 2)});

            if (Corners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevSmoothSandstoneCorners, 3, 4), new Object[] {"###", " # ", '#', new ItemStack(Block.sandStone, 1, 2)});
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevSmoothSandstoneCorners, 3, 12), new Object[] {"###", " # ", " # ", '#', new ItemStack(Block.sandStone, 1, 2)});
            }
        }

        if (Corners.props.getInt("ChiseledSandstoneCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevChiseledSandstoneCorners, 3, 0), new Object[] {" # ", "###", '#', new ItemStack(Block.sandStone, 1, 1)});
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevChiseledSandstoneCorners, 3, 8), new Object[] {" # ", " # ", "###", '#', new ItemStack(Block.sandStone, 1, 1)});

            if (Corners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevChiseledSandstoneCorners, 3, 4), new Object[] {"###", " # ", '#', new ItemStack(Block.sandStone, 1, 1)});
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevChiseledSandstoneCorners, 3, 12), new Object[] {"###", " # ", " # ", '#', new ItemStack(Block.sandStone, 1, 1)});
            }
        }

        if (Corners.props.getInt("DirtCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevDirtCorners, 3, 0), new Object[] {" # ", "###", '#', Block.dirt});
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevDirtCorners, 3, 8), new Object[] {" # ", " # ", "###", '#', Block.dirt});

            if (Corners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevDirtCorners, 3, 4), new Object[] {"###", " # ", '#', Block.dirt});
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevDirtCorners, 3, 12), new Object[] {"###", " # ", " # ", '#', Block.dirt});
            }
        }

        if (Corners.props.getInt("StoneCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevStoneCorners, 3, 0), new Object[] {" # ", "###", '#', Block.stone});
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevStoneCorners, 3, 8), new Object[] {" # ", " # ", "###", '#', Block.stone});

            if (Corners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevStoneCorners, 3, 4), new Object[] {"###", " # ", '#', Block.stone});
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevStoneCorners, 3, 12), new Object[] {"###", " # ", " # ", '#', Block.stone});
            }
        }

        if (Corners.props.getInt("StoneBrickCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevStoneBrickCorners, 3, 0), new Object[] {" # ", "###", '#', Block.stoneBrick});
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevStoneBrickCorners, 3, 8), new Object[] {" # ", " # ", "###", '#', Block.stoneBrick});

            if (Corners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevStoneBrickCorners, 3, 4), new Object[] {"###", " # ", '#', Block.stoneBrick});
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevStoneBrickCorners, 3, 12), new Object[] {"###", " # ", " # ", '#', Block.stoneBrick});
            }
        }

        if (Corners.props.getInt("SandCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevSandCorners, 3, 0), new Object[] {" # ", "###", '#', Block.sand});
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevSandCorners, 3, 8), new Object[] {" # ", " # ", "###", '#', Block.sand});

            if (Corners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevSandCorners, 3, 4), new Object[] {"###", " # ", '#', Block.sand});
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevSandCorners, 3, 12), new Object[] {"###", " # ", " # ", '#', Block.sand});
            }
        }

        if (Corners.props.getInt("SnowCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevSnowCorners, 3, 0), new Object[] {" # ", "###", '#', Block.snow});
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevSnowCorners, 3, 8), new Object[] {" # ", " # ", "###", '#', Block.snow});

            if (Corners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevSnowCorners, 3, 4), new Object[] {"###", " # ", '#', Block.snow});
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevSnowCorners, 3, 12), new Object[] {"###", " # ", " # ", '#', Block.snow});
            }
        }

        if (Corners.props.getInt("GrassCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevGrassCorners, 3, 0), new Object[] {" # ", "###", '#', Block.grass});
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevGrassCorners, 3, 8), new Object[] {" # ", " # ", "###", '#', Block.grass});

            if (Corners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevGrassCorners, 3, 4), new Object[] {"###", " # ", '#', Block.grass});
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevGrassCorners, 3, 12), new Object[] {"###", " # ", " # ", '#', Block.grass});
            }
        }

        if (Corners.props.getInt("BricksCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevBricksCorners, 3, 0), new Object[] {" # ", "###", '#', Block.brick});
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevBricksCorners, 3, 8), new Object[] {" # ", " # ", "###", '#', Block.brick});

            if (Corners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevBricksCorners, 3, 4), new Object[] {"###", " # ", '#', Block.brick});
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevBricksCorners, 3, 12), new Object[] {"###", " # ", " # ", '#', Block.brick});
            }
        }

        if (Corners.props.getInt("GravelCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevGravelCorners, 3, 0), new Object[] {" # ", "###", '#', Block.gravel});
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevGravelCorners, 3, 8), new Object[] {" # ", " # ", "###", '#', Block.gravel});

            if (Corners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevGravelCorners, 3, 4), new Object[] {"###", " # ", '#', Block.gravel});
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevGravelCorners, 3, 12), new Object[] {"###", " # ", " # ", '#', Block.gravel});
            }
        }

        if (Corners.props.getInt("GoldCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevGoldCorners, 3, 0), new Object[] {" # ", "###", '#', Block.blockGold});
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevGoldCorners, 3, 8), new Object[] {" # ", " # ", "###", '#', Block.blockGold});

            if (Corners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevGoldCorners, 3, 4), new Object[] {"###", " # ", '#', Block.blockGold});
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevGoldCorners, 3, 12), new Object[] {"###", " # ", " # ", '#', Block.blockGold});
            }
        }

        if (Corners.props.getInt("IronCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevSteelCorners, 3, 0), new Object[] {" # ", "###", '#', Block.blockSteel});
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevSteelCorners, 3, 8), new Object[] {" # ", " # ", "###", '#', Block.blockSteel});

            if (Corners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevSteelCorners, 3, 4), new Object[] {"###", " # ", '#', Block.blockSteel});
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevSteelCorners, 3, 12), new Object[] {"###", " # ", " # ", '#', Block.blockSteel});
            }
        }

        if (Corners.props.getInt("ObsidianCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevObsidianCorners, 3, 0), new Object[] {" # ", "###", '#', Block.obsidian});
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevObsidianCorners, 3, 8), new Object[] {" # ", " # ", "###", '#', Block.obsidian});

            if (Corners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevObsidianCorners, 3, 4), new Object[] {"###", " # ", '#', Block.obsidian});
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevObsidianCorners, 3, 12), new Object[] {"###", " # ", " # ", '#', Block.obsidian});
            }
        }

        if (Corners.props.getInt("NetherBrickCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevNetherBrickCorners, 3, 0), new Object[] {" # ", "###", '#', Block.netherBrick});
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevNetherBrickCorners, 3, 8), new Object[] {" # ", " # ", "###", '#', Block.netherBrick});

            if (Corners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevNetherBrickCorners, 3, 4), new Object[] {"###", " # ", '#', Block.netherBrick});
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevNetherBrickCorners, 3, 12), new Object[] {"###", " # ", " # ", '#', Block.netherBrick});
            }
        }

        if (Corners.props.getInt("DiamondCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevDiamondCorners, 3, 0), new Object[] {" # ", "###", '#', Block.blockDiamond});
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevDiamondCorners, 3, 8), new Object[] {" # ", " # ", "###", '#', Block.blockDiamond});

            if (Corners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevDiamondCorners, 3, 4), new Object[] {"###", " # ", '#', Block.blockDiamond});
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevDiamondCorners, 3, 12), new Object[] {"###", " # ", " # ", '#', Block.blockDiamond});
            }
        }

        if (Corners.props.getInt("WhiteWoolCorners") != 0) {
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevWhiteWoolCorners, 3, 0), new Object[] {" # ", "###", '#', new ItemStack(Block.cloth, 1, 0)});
            GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevWhiteWoolCorners, 3, 8), new Object[] {" # ", " # ", "###", '#', new ItemStack(Block.cloth, 1, 0)});

            if (Corners.props.getBoolean("BlockInversion")) {
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevWhiteWoolCorners, 3, 4), new Object[] {"###", " # ", '#', new ItemStack(Block.cloth, 1, 0)});
                GameRegistry.addRecipe(new ItemStack(Corners.BlockKaevWhiteWoolCorners, 3, 12), new Object[] {"###", " # ", " # ", '#', new ItemStack(Block.cloth, 1, 0)});
            }
        }

        final String[] colors = {"White", "Orange", "Magenta", "LightBlue", "Yellow", "Lime", "Pink", "Gray", "LightGray", "Cyan", "Purple", "Blue", "Brown", "Green", "Red", "Black"};
        final Block[] blocks = {Corners.BlockKaevWhiteWoolCorners, Corners.BlockKaevOrangeWoolCorners, Corners.BlockKaevMagentaWoolCorners, Corners.BlockKaevLightBlueWoolCorners,
        						Corners.BlockKaevYellowWoolCorners, Corners.BlockKaevLimeWoolCorners, Corners.BlockKaevPinkWoolCorners, Corners.BlockKaevGrayWoolCorners,
        						Corners.BlockKaevLightGrayWoolCorners, Corners.BlockKaevCyanWoolCorners, Corners.BlockKaevPurpleWoolCorners, Corners.BlockKaevBlueWoolCorners,
        						Corners.BlockKaevBrownWoolCorners, Corners.BlockKaevGreenWoolCorners, Corners.BlockKaevRedWoolCorners, Corners.BlockKaevBlackWoolCorners};

        for (int i = 0; i < colors.length; i++) {
        	if (Corners.props.getInt(colors[i] + "WoolCorners") != 0) {
                GameRegistry.addRecipe(new ItemStack(blocks[i], 3, 0), new Object[] {" # ", "###", '#', new ItemStack(Block.cloth, 1, i)});
                GameRegistry.addRecipe(new ItemStack(blocks[i], 3, 8), new Object[] {" # ", " # ", "###", '#', new ItemStack(Block.cloth, 1, i)});

                if (Corners.props.getBoolean("BlockInversion")) {
                    GameRegistry.addRecipe(new ItemStack(blocks[i], 3, 4), new Object[] {"###", " # ", '#', new ItemStack(Block.cloth, 1, i)});
                    GameRegistry.addRecipe(new ItemStack(blocks[i], 3, 12), new Object[] {"###", " # ", " # ", '#', new ItemStack(Block.cloth, 1, i)});
                }
            }
        }
    }

    public void loadConfig() {
        Corners.LightOpacity = Corners.props.getInt("LightOpacity");

        if (Corners.props.getInt("WoodCorners") != 0) {
            Corners.BlockKaevWoodCorners = (new BlockCorners(Corners.props.getInt("WoodCorners"), 4, Material.wood)).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setResistance(5.0F).setBlockName("WoodCorners");
            Corners.ItemKaevWoodCorners = (new ItemCorners(Corners.BlockKaevWoodCorners.blockID - 256, "Wood")).setItemName("WoodCorners");
        }
        else
            Corners.BlockKaevWoodCorners = Block.stone;

        if (Corners.props.getInt("CobblestoneCorners") != 0) {
            Corners.BlockKaevCobblestoneCorners = (new BlockCorners(Corners.props.getInt("CobblestoneCorners"), Block.cobblestone.blockIndexInTexture, Material.rock)).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setBlockName("CobblestoneCorners");
            Corners.ItemKaevCobblestoneCorners = (new ItemCorners(Corners.BlockKaevCobblestoneCorners.blockID - 256, "Cobblestone")).setItemName("CobblestoneCorners");
        }
        else
            Corners.BlockKaevCobblestoneCorners = Block.stone;

        if (Corners.props.getInt("GlassCorners") != 0) {
            Corners.BlockKaevGlassCorners = (new BlockCorners(Corners.props.getInt("GlassCorners"), Block.glass.blockIndexInTexture, Material.glass)).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setBlockName("GlassCorners");
            Corners.ItemKaevGlassCorners = (new ItemCorners(Corners.BlockKaevGlassCorners.blockID - 256, "Glass")).setItemName("GlassCorners");
        }
        else
            Corners.BlockKaevGlassCorners = Block.stone;

        if (Corners.props.getInt("SandstoneCorners") != 0) {
            Corners.BlockKaevSandstoneCorners = (new BlockCorners(Corners.props.getInt("SandstoneCorners"), 192, Material.rock)).setHardness(0.8F).setStepSound(Block.soundStoneFootstep).setBlockName("SandstoneCorners");
            Corners.ItemKaevSandstoneCorners = (new ItemCorners(Corners.BlockKaevSandstoneCorners.blockID - 256, "Sandstone")).setItemName("SandstoneCorners");
        }
        else
            Corners.BlockKaevSandstoneCorners = Block.stone;

        if (Corners.props.getInt("SmoothSandstoneCorners") != 0) {
            Corners.BlockKaevSmoothSandstoneCorners = (new BlockCorners(Corners.props.getInt("SmoothSandstoneCorners"), 230, Material.rock)).setHardness(0.8F).setStepSound(Block.soundStoneFootstep).setBlockName("SmoothSandstoneCorners");
            Corners.ItemKaevSmoothSandstoneCorners = (new ItemCorners(Corners.BlockKaevSmoothSandstoneCorners.blockID - 256, "SmoothSandstone")).setItemName("SmoothSandstoneCorners");
        }
        else
            Corners.BlockKaevSmoothSandstoneCorners = Block.stone;

        if (Corners.props.getInt("ChiseledSandstoneCorners") != 0) {
            Corners.BlockKaevChiseledSandstoneCorners = (new BlockCorners(Corners.props.getInt("ChiseledSandstoneCorners"), 229, Material.rock)).setHardness(0.8F).setStepSound(Block.soundStoneFootstep).setBlockName("ChiseledSandstoneCorners");
            Corners.ItemKaevChiseledSandstoneCorners = (new ItemCorners(Corners.BlockKaevChiseledSandstoneCorners.blockID - 256, "ChiseledSandstone")).setItemName("ChiseledSandstoneCorners");
        }
        else
            Corners.BlockKaevChiseledSandstoneCorners = Block.stone;

        if (Corners.props.getInt("DirtCorners") != 0) {
            Corners.BlockKaevDirtCorners = (new BlockCorners(Corners.props.getInt("DirtCorners"), Block.dirt.blockIndexInTexture, Material.ground)).setHardness(0.5F).setStepSound(Block.soundGravelFootstep).setBlockName("DirtCorners");
            Corners.ItemKaevDirtCorners = (new ItemCorners(Corners.BlockKaevDirtCorners.blockID - 256, "Dirt")).setItemName("DirtCorners");
        }
        else
            Corners.BlockKaevDirtCorners = Block.stone;

        if (Corners.props.getInt("StoneCorners") != 0) {
            Corners.BlockKaevStoneCorners = (new BlockCorners(Corners.props.getInt("StoneCorners"), Block.stone.blockIndexInTexture, Material.rock)).setHardness(1.5F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setBlockName("StoneCorners");
            Corners.ItemKaevStoneCorners = (new ItemCorners(Corners.BlockKaevStoneCorners.blockID - 256, "Stone")).setItemName("StoneCorners");
        }
        else
            Corners.BlockKaevStoneCorners = Block.stone;

        if (Corners.props.getInt("StoneBrickCorners") != 0) {
            Corners.BlockKaevStoneBrickCorners = (new BlockCorners(Corners.props.getInt("StoneBrickCorners"), Block.stoneBrick.blockIndexInTexture, Material.rock)).setHardness(1.5F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setBlockName("StoneBrickCorners");
            Corners.ItemKaevStoneBrickCorners = (new ItemCorners(Corners.BlockKaevStoneBrickCorners.blockID - 256, "StoneBrick")).setItemName("StoneBrickCorners");
        }
        else
            Corners.BlockKaevStoneBrickCorners = Block.stone;

        if (Corners.props.getInt("SandCorners") != 0) {
            Corners.BlockKaevSandCorners = (new BlockCorners(Corners.props.getInt("SandCorners"), Block.sand.blockIndexInTexture, Material.sand)).setHardness(0.5F).setStepSound(Block.soundSandFootstep).setBlockName("SandCorners");
            Corners.ItemKaevSandCorners = (new ItemCorners(Corners.BlockKaevSandCorners.blockID - 256, "Sand")).setItemName("SandCorners");
        }
        else
            Corners.BlockKaevSandCorners = Block.stone;

        if (Corners.props.getInt("SnowCorners") != 0) {
            Corners.BlockKaevSnowCorners = (new BlockCorners(Corners.props.getInt("SnowCorners"), Block.snow.blockIndexInTexture, Material.snow)).setHardness(0.1F).setStepSound(Block.soundClothFootstep).setBlockName("SnowCorners");
            Corners.ItemKaevSnowCorners = (new ItemCorners(Corners.BlockKaevSnowCorners.blockID - 256, "Snow")).setItemName("SnowCorners");
        }
        else
            Corners.BlockKaevSnowCorners = Block.stone;

        if (Corners.props.getInt("GrassCorners") != 0) {
            Corners.BlockKaevGrassCorners = (new BlockCorners(Corners.props.getInt("GrassCorners"), Block.grass.blockIndexInTexture, Material.ground)).setHardness(0.6F).setStepSound(Block.soundGrassFootstep).setBlockName("GrassCorners");
            Corners.ItemKaevGrassCorners = (new ItemCorners(Corners.BlockKaevGrassCorners.blockID - 256, "Grass")).setItemName("GrassCorners");
        }
        else
            Corners.BlockKaevGrassCorners = Block.stone;

        if (Corners.props.getInt("BricksCorners") != 0) {
            Corners.BlockKaevBricksCorners = (new BlockCorners(Corners.props.getInt("BricksCorners"), Block.brick.blockIndexInTexture, Material.rock)).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setBlockName("BricksCorners");
            Corners.ItemKaevBricksCorners = (new ItemCorners(Corners.BlockKaevBricksCorners.blockID - 256, "Bricks")).setItemName("BricksCorners");
        }
        else
            Corners.BlockKaevBricksCorners = Block.stone;

        if (Corners.props.getInt("GravelCorners") != 0) {
            Corners.BlockKaevGravelCorners = (new BlockCorners(Corners.props.getInt("GravelCorners"), Block.gravel.blockIndexInTexture, Material.sand)).setHardness(0.6F).setStepSound(Block.soundGravelFootstep).setBlockName("GravelCorners");
            Corners.ItemKaevGravelCorners = (new ItemCorners(Corners.BlockKaevGravelCorners.blockID - 256, "Gravel")).setItemName("GravelCorners");
        }
        else
            Corners.BlockKaevGravelCorners = Block.stone;

        if (Corners.props.getInt("GoldCorners") != 0) {
            Corners.BlockKaevGoldCorners = (new BlockCorners(Corners.props.getInt("GoldCorners"), Block.blockGold.blockIndexInTexture, Material.iron)).setHardness(3.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F).setBlockName("GoldCorners");
            Corners.ItemKaevGoldCorners = (new ItemCorners(Corners.BlockKaevGoldCorners.blockID - 256, "Gold")).setItemName("GoldCorners");
        }
        else
            Corners.BlockKaevGoldCorners = Block.stone;

        if (Corners.props.getInt("IronCorners") != 0) {
            Corners.BlockKaevSteelCorners = (new BlockCorners(Corners.props.getInt("IronCorners"), Block.blockSteel.blockIndexInTexture, Material.iron)).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F).setBlockName("SteelCorners");
            Corners.ItemKaevSteelCorners = (new ItemCorners(Corners.BlockKaevSteelCorners.blockID - 256, "Steel")).setItemName("SteelCorners");
        }
        else
            Corners.BlockKaevSteelCorners = Block.stone;

        if (Corners.props.getInt("ObsidianCorners") != 0) {
            Corners.BlockKaevObsidianCorners = (new BlockCorners(Corners.props.getInt("ObsidianCorners"), Block.obsidian.blockIndexInTexture, Material.rock)).setHardness(10.0F).setStepSound(Block.soundStoneFootstep).setResistance(2000.0F).setBlockName("ObsidianCorners");
            Corners.ItemKaevObsidianCorners = (new ItemCorners(Corners.BlockKaevObsidianCorners.blockID - 256, "Obsidian")).setItemName("ObsidianCorners");
        }
        else
            Corners.BlockKaevObsidianCorners = Block.stone;

        if (Corners.props.getInt("NetherBrickCorners") != 0) {
            Corners.BlockKaevNetherBrickCorners = (new BlockCorners(Corners.props.getInt("NetherBrickCorners"), Block.netherBrick.blockIndexInTexture, Material.rock)).setHardness(1.5F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setBlockName("NetherBrickCorners");
            Corners.ItemKaevNetherBrickCorners = (new ItemCorners(Corners.BlockKaevNetherBrickCorners.blockID - 256, "NetherBrick")).setItemName("NetherBrickCorners");
        }
        else
            Corners.BlockKaevNetherBrickCorners = Block.stone;

        if (Corners.props.getInt("DiamondCorners") != 0) {
            Corners.BlockKaevDiamondCorners = (new BlockCorners(Corners.props.getInt("DiamondCorners"), Block.blockDiamond.blockIndexInTexture, Material.iron)).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F).setBlockName("DiamondCorners");
            Corners.ItemKaevDiamondCorners = (new ItemCorners(Corners.BlockKaevDiamondCorners.blockID - 256, "Diamond")).setItemName("DiamondCorners");
        }
        else
            Corners.BlockKaevDiamondCorners = Block.stone;

        if (Corners.props.getInt("WhiteWoolCorners") != 0) {
            Corners.BlockKaevWhiteWoolCorners = (new BlockCorners(Corners.props.getInt("WhiteWoolCorners"), 64, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("WhiteWoolCorners");
            Corners.ItemKaevWhiteWoolCorners = (new ItemCorners(Corners.BlockKaevWhiteWoolCorners.blockID - 256, "WhiteWool")).setItemName("WhiteWoolCorners");
        }
        else
            Corners.BlockKaevWhiteWoolCorners = Block.stone;

        if (Corners.props.getInt("BlackWoolCorners") != 0) {
            Corners.BlockKaevBlackWoolCorners = (new BlockCorners(Corners.props.getInt("BlackWoolCorners"), 113, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlackWoolCorners");
            Corners.ItemKaevBlackWoolCorners = (new ItemCorners(Corners.BlockKaevBlackWoolCorners.blockID - 256, "BlackWool")).setItemName("BlackWoolCorners");
        }
        else
            Corners.BlockKaevBlackWoolCorners = Block.stone;

        if (Corners.props.getInt("RedWoolCorners") != 0) {
            Corners.BlockKaevRedWoolCorners = (new BlockCorners(Corners.props.getInt("RedWoolCorners"), 129, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("RedWoolCorners");
            Corners.ItemKaevRedWoolCorners = (new ItemCorners(Corners.BlockKaevRedWoolCorners.blockID - 256, "RedWool")).setItemName("RedWoolCorners");
        }
        else
            Corners.BlockKaevRedWoolCorners = Block.stone;

        if (Corners.props.getInt("GreenWoolCorners") != 0) {
            Corners.BlockKaevGreenWoolCorners = (new BlockCorners(Corners.props.getInt("GreenWoolCorners"), 145, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("GreenWoolCorners");
            Corners.ItemKaevGreenWoolCorners = (new ItemCorners(Corners.BlockKaevGreenWoolCorners.blockID - 256, "GreenWool")).setItemName("GreenWoolCorners");
        }
        else
            Corners.BlockKaevGreenWoolCorners = Block.stone;

        if (Corners.props.getInt("BrownWoolCorners") != 0) {
            Corners.BlockKaevBrownWoolCorners = (new BlockCorners(Corners.props.getInt("BrownWoolCorners"), 161, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BrownWoolCorners");
            Corners.ItemKaevBrownWoolCorners = (new ItemCorners(Corners.BlockKaevBrownWoolCorners.blockID - 256, "BrownWool")).setItemName("BrownWoolCorners");
        }
        else
            Corners.BlockKaevBrownWoolCorners = Block.stone;

        if (Corners.props.getInt("BlueWoolCorners") != 0) {
            Corners.BlockKaevBlueWoolCorners = (new BlockCorners(Corners.props.getInt("BlueWoolCorners"), 177, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlueWoolCorners");
            Corners.ItemKaevBlueWoolCorners = (new ItemCorners(Corners.BlockKaevBlueWoolCorners.blockID - 256, "BlueWool")).setItemName("BlueWoolCorners");
        }
        else
            Corners.BlockKaevBlueWoolCorners = Block.stone;

        if (Corners.props.getInt("PurpleWoolCorners") != 0) {
            Corners.BlockKaevPurpleWoolCorners = (new BlockCorners(Corners.props.getInt("PurpleWoolCorners"), 193, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("PurpleWoolCorners");
            Corners.ItemKaevPurpleWoolCorners = (new ItemCorners(Corners.BlockKaevPurpleWoolCorners.blockID - 256, "PurpleWool")).setItemName("PurpleWoolCorners");
        }
        else
            Corners.BlockKaevPurpleWoolCorners = Block.stone;

        if (Corners.props.getInt("CyanWoolCorners") != 0) {
            Corners.BlockKaevCyanWoolCorners = (new BlockCorners(Corners.props.getInt("CyanWoolCorners"), 209, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("CyanWoolCorners");
            Corners.ItemKaevCyanWoolCorners = (new ItemCorners(Corners.BlockKaevCyanWoolCorners.blockID - 256, "CyanWool")).setItemName("CyanWoolCorners");
        }
        else
            Corners.BlockKaevCyanWoolCorners = Block.stone;

        if (Corners.props.getInt("LightGrayWoolCorners") != 0) {
            Corners.BlockKaevLightGrayWoolCorners = (new BlockCorners(Corners.props.getInt("LightGrayWoolCorners"), 225, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("SilverWoolCorners");
            Corners.ItemKaevSilverWoolCorners = (new ItemCorners(Corners.BlockKaevLightGrayWoolCorners.blockID - 256, "SilverWool")).setItemName("SilverWoolCorners");
        }
        else
            Corners.BlockKaevLightGrayWoolCorners = Block.stone;

        if (Corners.props.getInt("GrayWoolCorners") != 0) {
            Corners.BlockKaevGrayWoolCorners = (new BlockCorners(Corners.props.getInt("GrayWoolCorners"), 114, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("GrayWoolCorners");
            Corners.ItemKaevGrayWoolCorners = (new ItemCorners(Corners.BlockKaevGrayWoolCorners.blockID - 256, "GrayWool")).setItemName("GrayWoolCorners");
        }
        else
            Corners.BlockKaevGrayWoolCorners = Block.stone;
 
        if (Corners.props.getInt("PinkWoolCorners") != 0) {
            Corners.BlockKaevPinkWoolCorners = (new BlockCorners(Corners.props.getInt("PinkWoolCorners"), 130, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("PinkWoolCorners");
            Corners.ItemKaevPinkWoolCorners = (new ItemCorners(Corners.BlockKaevPinkWoolCorners.blockID - 256, "PinkWool")).setItemName("PinkWoolCorners");
        }
        else
            Corners.BlockKaevPinkWoolCorners = Block.stone;

        if (Corners.props.getInt("LimeWoolCorners") != 0) {
            Corners.BlockKaevLimeWoolCorners = (new BlockCorners(Corners.props.getInt("LimeWoolCorners"), 146, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("LimeWoolCorners");
            Corners.ItemKaevLimeWoolCorners = (new ItemCorners(Corners.BlockKaevLimeWoolCorners.blockID - 256, "LimeWool")).setItemName("LimeWoolCorners");
        }
        else
            Corners.BlockKaevLimeWoolCorners = Block.stone;

        if (Corners.props.getInt("YellowWoolCorners") != 0) {
            Corners.BlockKaevYellowWoolCorners = (new BlockCorners(Corners.props.getInt("YellowWoolCorners"), 162, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("YellowWoolCorners");
            Corners.ItemKaevYellowWoolCorners = (new ItemCorners(Corners.BlockKaevYellowWoolCorners.blockID - 256, "YellowWool")).setItemName("YellowWoolCorners");
        }
        else
            Corners.BlockKaevYellowWoolCorners = Block.stone;

        if (Corners.props.getInt("LightBlueWoolCorners") != 0) {
            Corners.BlockKaevLightBlueWoolCorners = (new BlockCorners(Corners.props.getInt("LightBlueWoolCorners"), 178, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("LightBlueWoolCorners");
            Corners.ItemKaevLightBlueWoolCorners = (new ItemCorners(Corners.BlockKaevLightBlueWoolCorners.blockID - 256, "LightBlueWool")).setItemName("LightBlueWoolCorners");
        }
        else
            Corners.BlockKaevLightBlueWoolCorners = Block.stone;

        if (Corners.props.getInt("MagentaWoolCorners") != 0) {
            Corners.BlockKaevMagentaWoolCorners = (new BlockCorners(Corners.props.getInt("MagentaWoolCorners"), 194, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("MagentaWoolCorners");
            Corners.ItemKaevMagentaWoolCorners = (new ItemCorners(Corners.BlockKaevMagentaWoolCorners.blockID - 256, "MagentaWool")).setItemName("MagentaWoolCorners");
        }
        else
            Corners.BlockKaevMagentaWoolCorners = Block.stone;

        if (Corners.props.getInt("OrangeWoolCorners") != 0) {
            Corners.BlockKaevOrangeWoolCorners = (new BlockCorners(Corners.props.getInt("OrangeWoolCorners"), 210, Material.cloth)).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("OrangeWoolCorners");
            Corners.ItemKaevOrangeWoolCorners = (new ItemCorners(Corners.BlockKaevOrangeWoolCorners.blockID - 256, "OrangeWool")).setItemName("OrangeWoolCorners");
        }
        else
            Corners.BlockKaevOrangeWoolCorners = Block.stone;
    }
}
