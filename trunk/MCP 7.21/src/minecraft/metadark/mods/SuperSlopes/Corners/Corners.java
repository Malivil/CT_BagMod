package metadark.mods.SuperSlopes.Corners;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import metadark.mods.SuperSlopes.PropertyManager;
import net.minecraft.src.Block;
import net.minecraft.src.Item;

@Mod(
        modid = "SuperSlopesCorners",
        name = "SuperSlopes - Corners",
        version = "4.6"
)
@NetworkMod(
        clientSideRequired = true,
        serverSideRequired = false
)
public class Corners
{
    @Instance("SuperSlopes|Corners")
    public static Corners instance;
    public static PropertyManager props;
    @SidedProxy(
            clientSide = "metadark.mods.SuperSlopes.Corners.ClientInit",
            serverSide = "metadark.mods.SuperSlopes.Corners.CommonInit"
    )
    public static CommonInit init;
    public static int CornersRenderID;
    public static int LightOpacity;
    public static Block BlockKaevWoodCorners;
    public static Block BlockKaevCobblestoneCorners;
    public static Block BlockKaevGlassCorners;
    public static Block BlockKaevSandstoneCorners;
    public static Block BlockKaevSmoothSandstoneCorners;
    public static Block BlockKaevChiseledSandstoneCorners;
    public static Block BlockKaevDirtCorners;
    public static Block BlockKaevStoneCorners;
    public static Block BlockKaevStoneBrickCorners;
    public static Block BlockKaevSandCorners;
    public static Block BlockKaevSnowCorners;
    public static Block BlockKaevGrassCorners;
    public static Block BlockKaevBricksCorners;
    public static Block BlockKaevGravelCorners;
    public static Block BlockKaevGoldCorners;
    public static Block BlockKaevSteelCorners;
    public static Block BlockKaevObsidianCorners;
    public static Block BlockKaevNetherBrickCorners;
    public static Block BlockKaevDiamondCorners;
    public static Block BlockKaevWhiteWoolCorners;
    public static Block BlockKaevBlackWoolCorners;
    public static Block BlockKaevRedWoolCorners;
    public static Block BlockKaevGreenWoolCorners;
    public static Block BlockKaevBrownWoolCorners;
    public static Block BlockKaevBlueWoolCorners;
    public static Block BlockKaevPurpleWoolCorners;
    public static Block BlockKaevCyanWoolCorners;
    public static Block BlockKaevSilverWoolCorners;
    public static Block BlockKaevGrayWoolCorners;
    public static Block BlockKaevPinkWoolCorners;
    public static Block BlockKaevLimeWoolCorners;
    public static Block BlockKaevYellowWoolCorners;
    public static Block BlockKaevLightBlueWoolCorners;
    public static Block BlockKaevMagentaWoolCorners;
    public static Block BlockKaevOrangeWoolCorners;
    public static Item ItemKaevWoodCorners;
    public static Item ItemKaevCobblestoneCorners;
    public static Item ItemKaevGlassCorners;
    public static Item ItemKaevSandstoneCorners;
    public static Item ItemKaevSmoothSandstoneCorners;
    public static Item ItemKaevChiseledSandstoneCorners;
    public static Item ItemKaevDirtCorners;
    public static Item ItemKaevStoneCorners;
    public static Item ItemKaevStoneBrickCorners;
    public static Item ItemKaevSandCorners;
    public static Item ItemKaevSnowCorners;
    public static Item ItemKaevGrassCorners;
    public static Item ItemKaevBricksCorners;
    public static Item ItemKaevGravelCorners;
    public static Item ItemKaevGoldCorners;
    public static Item ItemKaevSteelCorners;
    public static Item ItemKaevObsidianCorners;
    public static Item ItemKaevNetherBrickCorners;
    public static Item ItemKaevDiamondCorners;
    public static Item ItemKaevWhiteWoolCorners;
    public static Item ItemKaevBlackWoolCorners;
    public static Item ItemKaevRedWoolCorners;
    public static Item ItemKaevGreenWoolCorners;
    public static Item ItemKaevBrownWoolCorners;
    public static Item ItemKaevBlueWoolCorners;
    public static Item ItemKaevPurpleWoolCorners;
    public static Item ItemKaevCyanWoolCorners;
    public static Item ItemKaevSilverWoolCorners;
    public static Item ItemKaevGrayWoolCorners;
    public static Item ItemKaevPinkWoolCorners;
    public static Item ItemKaevLimeWoolCorners;
    public static Item ItemKaevYellowWoolCorners;
    public static Item ItemKaevLightBlueWoolCorners;
    public static Item ItemKaevMagentaWoolCorners;
    public static Item ItemKaevOrangeWoolCorners;

    public static void prepareProps()
    {
        props.getInt("LightOpacity", 0);
        props.getBoolean("BlockInversion", true);
        props.getInt("WoodCorners", 182);
        props.getInt("CobblestoneCorners", 183);
        props.getInt("GlassCorners", 184);
        props.getInt("SandstoneCorners", 185);
        props.getInt("SmoothSandstoneCorners", 0);
        props.getInt("ChiseledSandstoneCorners", 0);
        props.getInt("DirtCorners", 186);
        props.getInt("StoneCorners", 187);
        props.getInt("StoneBrickCorners", 0);
        props.getInt("SandCorners", 188);
        props.getInt("SnowCorners", 189);
        props.getInt("GrassCorners", 190);
        props.getInt("BricksCorners", 191);
        props.getInt("GravelCorners", 192);
        props.getInt("GoldCorners", 193);
        props.getInt("IronCorners", 194);
        props.getInt("ObsidianCorners", 195);
        props.getInt("NetherBrickCorners", 0);
        props.getInt("DiamondCorners", 196);
        props.getInt("WhiteWoolCorners", 0);
        props.getInt("BlackWoolCorners", 0);
        props.getInt("RedWoolCorners", 0);
        props.getInt("GreenWoolCorners", 0);
        props.getInt("BrownWoolCorners", 0);
        props.getInt("BlueWoolCorners", 0);
        props.getInt("PurpleWoolCorners", 0);
        props.getInt("CyanWoolCorners", 0);
        props.getInt("LightGrayWoolCorners", 0);
        props.getInt("GrayWoolCorners", 0);
        props.getInt("PinkWoolCorners", 0);
        props.getInt("LimeWoolCorners", 0);
        props.getInt("YellowWoolCorners", 0);
        props.getInt("LightBlueWoolCorners", 0);
        props.getInt("MagentaWoolCorners", 0);
        props.getInt("OrangeWoolCorners", 0);
    }

    @PreInit
    public void preload(FMLPreInitializationEvent var1)
    {
        props = new PropertyManager(var1.getSuggestedConfigurationFile().getPath());
        prepareProps();
        init.loadConfig();
        props.save();
    }

    @Init
    public void load(FMLInitializationEvent var1)
    {
        init.registerBlockModel();
        init.addLocalizations();
        init.addRecipes();
    }
}
