package morePistons;

import java.util.logging.Level;

import net.minecraft.src.GuiScreen;
import net.minecraft.src.TileEntity;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@NetworkMod(
        clientSideRequired = true,
        serverSideRequired = true
)
@Mod(
        modid = "MorePistons",
        name = "More Pistons",
        version = "1.1.1 for [1.4.5]"
)
public class mod_MorePistons
{
    private static GuiScreen lastGuiOpen;
    public boolean blocksAdded = false;
    public static int idBlockDoublePistonBase;
    public static int idBlockDoubleStickyPistonBase;
    public static int idBlockTriplePistonBase;
    public static int idBlockTripleStickyPistonBase;
    public static int idBlockQuadPistonBase;
    public static int idBlockQuadStickyPistonBase;
    public static int idBlockGravitationalPistonBase;
    public static int idBlockPistonExtension;
    public static int idBlockPistonRod;
    //public static int idBlockStrongPistonBase;
    //public static int idBlockStrongStickyPistonBase;
    @SidedProxy(
            clientSide = "morePistons.ClientProxyMorePistons",
            serverSide = "morePistons.CommonProxyMorePistons"
    )
    public static CommonProxyMorePistons proxy;

    @PreInit
	public void onPreInit(final FMLPreInitializationEvent event) {
		event.getModMetadata().version = "1.1.1";
		final Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
		try {
			cfg.load();
			idBlockDoublePistonBase = Integer.parseInt(cfg.getBlock("DoublePistonID", 210).value);
	        idBlockDoubleStickyPistonBase = Integer.parseInt(cfg.getBlock("DoubleStickyPistonID", 211).value);
	        idBlockTriplePistonBase = Integer.parseInt(cfg.getBlock("TriplePistonID", 212).value);
	        idBlockTripleStickyPistonBase = Integer.parseInt(cfg.getBlock("TripleStickyPistonID", 213).value);
	        idBlockQuadPistonBase = Integer.parseInt(cfg.getBlock("QuadruplePistonID", 214).value);
	        idBlockQuadStickyPistonBase = Integer.parseInt(cfg.getBlock("QuadrupleStickyPistonID", 215).value);
	        idBlockGravitationalPistonBase = Integer.parseInt(cfg.getBlock("GravitationalPistonBaseID", 216).value);
	        idBlockPistonExtension = Integer.parseInt(cfg.getBlock("PistonExtensionID", 217).value);
	        idBlockPistonRod = Integer.parseInt(cfg.getBlock("PistonRodID", 218).value);
	        //idBlockStrongPistonBase = Integer.parseInt(cfg.getBlock("SuperPistonID", 219).value);
	        //idBlockStrongStickyPistonBase = Integer.parseInt(cfg.getBlock("SuperStickyPistonID", 220).value);
		}
		catch (Exception e) {
			FMLLog.log(Level.SEVERE, e, "MorePistons failed to load config settings.");
		}
		finally {
			cfg.save();
		}
    }

    @Init
    public void morePistons(FMLInitializationEvent var1)
    {
        proxy.registerRenderThings();
        new MorePistonsBlocks();
        new MorePistons();
        new MorePistonsRecipes();
    }

    public static TileEntity getTileEntity(int var0, int var1, int var2, boolean var3, boolean var4)
    {
        return new TileEntityMorePistons(var0, var1, var2, var3, var4);
    }
}
