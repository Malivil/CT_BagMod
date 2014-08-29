package metadark.mods.SuperSlopes.IntCorners;

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
        modid = "SuperSlopes_IntCorners",
        name = "SuperSlopes - IntCorners",
        version = "4.2b"
)
@NetworkMod(
        clientSideRequired = true,
        serverSideRequired = false
)
public class IntCorners
{
    @Instance("SuperSlopes|IntCorners")
    public static IntCorners instance;
    public static PropertyManager props;
    @SidedProxy(
            clientSide = "metadark.mods.SuperSlopes.IntCorners.ClientInit",
            serverSide = "metadark.mods.SuperSlopes.IntCorners.CommonInit"
    )
    public static CommonInit init;
    public static int IntCornersRenderID;
    public static int LightOpacity;
    public static Block BlockKaevWoodIntCorners;
    public static Block BlockKaevCobblestoneIntCorners;
    public static Block BlockKaevGlassIntCorners;
    public static Block BlockKaevSandstoneIntCorners;
    public static Block BlockKaevDirtIntCorners;
    public static Block BlockKaevStoneIntCorners;
    public static Block BlockKaevSandIntCorners;
    public static Block BlockKaevSnowIntCorners;
    public static Block BlockKaevGrassIntCorners;
    public static Block BlockKaevBricksIntCorners;
    public static Block BlockKaevGravelIntCorners;
    public static Block BlockKaevGoldIntCorners;
    public static Block BlockKaevSteelIntCorners;
    public static Block BlockKaevObsidianIntCorners;
    public static Block BlockKaevDiamondIntCorners;
    public static Block BlockKaevWhiteWoolIntCorners;
    public static Block BlockKaevBlackWoolIntCorners;
    public static Block BlockKaevRedWoolIntCorners;
    public static Block BlockKaevGreenWoolIntCorners;
    public static Block BlockKaevBrownWoolIntCorners;
    public static Block BlockKaevBlueWoolIntCorners;
    public static Block BlockKaevPurpleWoolIntCorners;
    public static Block BlockKaevCyanWoolIntCorners;
    public static Block BlockKaevSilverWoolIntCorners;
    public static Block BlockKaevGrayWoolIntCorners;
    public static Block BlockKaevPinkWoolIntCorners;
    public static Block BlockKaevLimeWoolIntCorners;
    public static Block BlockKaevYellowWoolIntCorners;
    public static Block BlockKaevLightBlueWoolIntCorners;
    public static Block BlockKaevMagentaWoolIntCorners;
    public static Block BlockKaevOrangeWoolIntCorners;
    public static Item ItemKaevWoodIntCorners;
    public static Item ItemKaevCobblestoneIntCorners;
    public static Item ItemKaevGlassIntCorners;
    public static Item ItemKaevSandstoneIntCorners;
    public static Item ItemKaevDirtIntCorners;
    public static Item ItemKaevStoneIntCorners;
    public static Item ItemKaevSandIntCorners;
    public static Item ItemKaevSnowIntCorners;
    public static Item ItemKaevGrassIntCorners;
    public static Item ItemKaevBricksIntCorners;
    public static Item ItemKaevGravelIntCorners;
    public static Item ItemKaevGoldIntCorners;
    public static Item ItemKaevSteelIntCorners;
    public static Item ItemKaevObsidianIntCorners;
    public static Item ItemKaevDiamondIntCorners;
    public static Item ItemKaevWhiteWoolIntCorners;
    public static Item ItemKaevBlackWoolIntCorners;
    public static Item ItemKaevRedWoolIntCorners;
    public static Item ItemKaevGreenWoolIntCorners;
    public static Item ItemKaevBrownWoolIntCorners;
    public static Item ItemKaevBlueWoolIntCorners;
    public static Item ItemKaevPurpleWoolIntCorners;
    public static Item ItemKaevCyanWoolIntCorners;
    public static Item ItemKaevSilverWoolIntCorners;
    public static Item ItemKaevGrayWoolIntCorners;
    public static Item ItemKaevPinkWoolIntCorners;
    public static Item ItemKaevLimeWoolIntCorners;
    public static Item ItemKaevYellowWoolIntCorners;
    public static Item ItemKaevLightBlueWoolIntCorners;
    public static Item ItemKaevMagentaWoolIntCorners;
    public static Item ItemKaevOrangeWoolIntCorners;

    public static void prepareProps()
    {
        props.getInt("LightOpacity", 0);
        props.getBoolean("BlockInversion", true);
        props.getInt("WoodIntCorners", 197);
        props.getInt("CobblestoneIntCorners", 198);
        props.getInt("GlassIntCorners", 199);
        props.getInt("SandstoneIntCorners", 200);
        props.getInt("DirtIntCorners", 201);
        props.getInt("StoneIntCorners", 202);
        props.getInt("SandIntCorners", 203);
        props.getInt("SnowIntCorners", 204);
        props.getInt("GrassIntCorners", 205);
        props.getInt("BricksIntCorners", 206);
        props.getInt("GravelIntCorners", 207);
        props.getInt("GoldIntCorners", 208);
        props.getInt("IronIntCorners", 209);
        props.getInt("ObsidianIntCorners", 210);
        props.getInt("DiamondIntCorners", 211);
        props.getInt("WhiteWoolIntCorners", 0);
        props.getInt("BlackWoolIntCorners", 0);
        props.getInt("RedWoolIntCorners", 0);
        props.getInt("GreenWoolIntCorners", 0);
        props.getInt("BrownWoolIntCorners", 0);
        props.getInt("BlueWoolIntCorners", 0);
        props.getInt("PurpleWoolIntCorners", 0);
        props.getInt("CyanWoolIntCorners", 0);
        props.getInt("LightGrayWoolIntCorners", 0);
        props.getInt("GrayWoolIntCorners", 0);
        props.getInt("PinkWoolIntCorners", 0);
        props.getInt("LimeWoolIntCorners", 0);
        props.getInt("YellowWoolIntCorners", 0);
        props.getInt("LightBlueWoolIntCorners", 0);
        props.getInt("MagentaWoolIntCorners", 0);
        props.getInt("OrangeWoolIntCorners", 0);
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
