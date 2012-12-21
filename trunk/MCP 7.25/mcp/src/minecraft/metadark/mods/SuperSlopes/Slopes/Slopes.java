package metadark.mods.SuperSlopes.Slopes;

import metadark.mods.SuperSlopes.PropertyManager;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(
        modid = "SuperSlopesSlopes",
        name = "SuperSlopes - Slopes",
        version = "4.7"
)
@NetworkMod(
        clientSideRequired = true,
        serverSideRequired = false
)
public class Slopes {
    @Instance("SuperSlopes|Slopes")
    public static Slopes instance;
    public static PropertyManager props;
    @SidedProxy(
            clientSide = "metadark.mods.SuperSlopes.Slopes.ClientInit",
            serverSide = "metadark.mods.SuperSlopes.Slopes.CommonInit"
    )
    public static CommonInit init;
    public static int SlopesRenderID;
    public static int LightOpacity;
    public static Block BlockKaevWoodSlopes;
    public static Block BlockKaevCobblestoneSlopes;
    public static Block BlockKaevGlassSlopes;
    public static Block BlockKaevSandstoneSlopes;
    public static Block BlockKaevSmoothSandstoneSlopes;
    public static Block BlockKaevChiseledSandstoneSlopes;
    public static Block BlockKaevDirtSlopes;
    public static Block BlockKaevStoneSlopes;
    public static Block BlockKaevStoneBrickSlopes;
    public static Block BlockKaevSandSlopes;
    public static Block BlockKaevSnowSlopes;
    public static Block BlockKaevGrassSlopes;
    public static Block BlockKaevBricksSlopes;
    public static Block BlockKaevGravelSlopes;
    public static Block BlockKaevGoldSlopes;
    public static Block BlockKaevSteelSlopes;
    public static Block BlockKaevObsidianSlopes;
    public static Block BlockKaevNetherBrickSlopes;
    public static Block BlockKaevDiamondSlopes;
    public static Block BlockKaevWhiteWoolSlopes;
    public static Block BlockKaevBlackWoolSlopes;
    public static Block BlockKaevRedWoolSlopes;
    public static Block BlockKaevGreenWoolSlopes;
    public static Block BlockKaevBrownWoolSlopes;
    public static Block BlockKaevBlueWoolSlopes;
    public static Block BlockKaevPurpleWoolSlopes;
    public static Block BlockKaevCyanWoolSlopes;
    public static Block BlockKaevLightGrayWoolSlopes;
    public static Block BlockKaevGrayWoolSlopes;
    public static Block BlockKaevPinkWoolSlopes;
    public static Block BlockKaevLimeWoolSlopes;
    public static Block BlockKaevYellowWoolSlopes;
    public static Block BlockKaevLightBlueWoolSlopes;
    public static Block BlockKaevMagentaWoolSlopes;
    public static Block BlockKaevOrangeWoolSlopes;
    public static Item ItemKaevWoodSlopes;
    public static Item ItemKaevCobblestoneSlopes;
    public static Item ItemKaevGlassSlopes;
    public static Item ItemKaevSandstoneSlopes;
    public static Item ItemKaevSmoothSandstoneSlopes;
    public static Item ItemKaevChiseledSandstoneSlopes;
    public static Item ItemKaevDirtSlopes;
    public static Item ItemKaevStoneSlopes;
    public static Item ItemKaevStoneBrickSlopes;
    public static Item ItemKaevSandSlopes;
    public static Item ItemKaevSnowSlopes;
    public static Item ItemKaevGrassSlopes;
    public static Item ItemKaevBricksSlopes;
    public static Item ItemKaevGravelSlopes;
    public static Item ItemKaevGoldSlopes;
    public static Item ItemKaevSteelSlopes;
    public static Item ItemKaevObsidianSlopes;
    public static Item ItemKaevNetherBrickSlopes;
    public static Item ItemKaevDiamondSlopes;
    public static Item ItemKaevWhiteWoolSlopes;
    public static Item ItemKaevBlackWoolSlopes;
    public static Item ItemKaevRedWoolSlopes;
    public static Item ItemKaevGreenWoolSlopes;
    public static Item ItemKaevBrownWoolSlopes;
    public static Item ItemKaevBlueWoolSlopes;
    public static Item ItemKaevPurpleWoolSlopes;
    public static Item ItemKaevCyanWoolSlopes;
    public static Item ItemKaevSilverWoolSlopes;
    public static Item ItemKaevGrayWoolSlopes;
    public static Item ItemKaevPinkWoolSlopes;
    public static Item ItemKaevLimeWoolSlopes;
    public static Item ItemKaevYellowWoolSlopes;
    public static Item ItemKaevLightBlueWoolSlopes;
    public static Item ItemKaevMagentaWoolSlopes;
    public static Item ItemKaevOrangeWoolSlopes;

    public static void prepareProps() {
        props.getInt("LightOpacity", 0);
        props.getBoolean("BlockInversion", true);
        props.getInt("WoodSlopes", 167);
        props.getInt("CobblestoneSlopes", 168);
        props.getInt("GlassSlopes", 169);
        props.getInt("SandstoneSlopes", 170);
        props.getInt("SmoothSandstoneSlopes", 0);
        props.getInt("ChiseledSandstoneSlopes", 0);
        props.getInt("DirtSlopes", 171);
        props.getInt("StoneSlopes", 172);
        props.getInt("StoneBrickSlopes", 0);
        props.getInt("SandSlopes", 173);
        props.getInt("SnowSlopes", 174);
        props.getInt("GrassSlopes", 175);
        props.getInt("BricksSlopes", 176);
        props.getInt("GravelSlopes", 177);
        props.getInt("GoldSlopes", 178);
        props.getInt("IronSlopes", 179);
        props.getInt("ObsidianSlopes", 180);
        props.getInt("NetherBrickSlopes", 0);
        props.getInt("DiamondSlopes", 181);
        props.getInt("WhiteWoolSlopes", 215);
        props.getInt("BlackWoolSlopes", 0);
        props.getInt("RedWoolSlopes", 0);
        props.getInt("GreenWoolSlopes", 0);
        props.getInt("BrownWoolSlopes", 0);
        props.getInt("BlueWoolSlopes", 0);
        props.getInt("PurpleWoolSlopes", 0);
        props.getInt("CyanWoolSlopes", 0);
        props.getInt("LightGrayWoolSlopes", 0);
        props.getInt("GrayWoolSlopes", 0);
        props.getInt("PinkWoolSlopes", 0);
        props.getInt("LimeWoolSlopes", 0);
        props.getInt("YellowWoolSlopes", 0);
        props.getInt("LightBlueWoolSlopes", 0);
        props.getInt("MagentaWoolSlopes", 0);
        props.getInt("OrangeWoolSlopes", 0);
    }

    @PreInit
    public void preload(final FMLPreInitializationEvent event) {
        props = new PropertyManager(event.getSuggestedConfigurationFile().getPath());
        prepareProps();
        init.loadConfig();
        props.save();
    }

    @Init
    public void load(FMLInitializationEvent event) {
        init.registerBlockModel();
        init.addLocalizations();
        init.addRecipes();
    }
}
