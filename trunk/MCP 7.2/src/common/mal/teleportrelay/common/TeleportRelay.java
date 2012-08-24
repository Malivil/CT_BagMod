package mal.teleportrelay.common;

import java.util.ArrayList;
import java.util.logging.Level;

import mal.teleportrelay.client.ClientPacketHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.src.Block;
import net.minecraft.src.ChunkCoordinates;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod( modid = "TeleportRelay", name = "Teleport Relay", version = "0.4" )
@NetworkMod(
		clientSideRequired = true, serverSideRequired = false,
		clientPacketHandlerSpec = @SidedPacketHandler(channels = {"TR_Channel"}, packetHandler = ClientPacketHandler.class),
		serverPacketHandlerSpec = @SidedPacketHandler(channels = {"TR_Channel"}, packetHandler = ServerPacketHandler.class)
)
public class TeleportRelay {
	public static final String version = "0.4";
	public static Block teleportRelayBlock;
	public static Item relayRemoteItem;
	private static final ArrayList<ChunkCoordinates> placedRelayBlocks = new ArrayList<ChunkCoordinates>();

	@SidedProxy( clientSide = "mal.teleportrelay.client.ClientProxy", serverSide = "mal.teleportrelay.common.CommonProxy" )
	public static CommonProxy proxy;
	
	/* Configurable Variables */
	public static int teleportRelayID = 150;
	public static int relayRemoteID = 4500;
	public static int relayRemoteUses = 10;
	public static boolean allowRepair = false;
	public static boolean requirePower = true;
	public static boolean debug = false;

	@PreInit
	public void oPreInit(FMLPreInitializationEvent event) {
		event.getModMetadata().version = TeleportRelay.version;
		Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
		try {
			cfg.load();
			teleportRelayID = cfg.getOrCreateBlockIdProperty("teleportRelayID", 150).getInt(150);
			relayRemoteID = cfg.getOrCreateIntProperty("relayRemoteID", Configuration.CATEGORY_ITEM, 4500).getInt(4500);
			relayRemoteUses = cfg.getOrCreateIntProperty("relayRemoteUses", Configuration.CATEGORY_ITEM, 10).getInt(10);
			allowRepair = cfg.getOrCreateBooleanProperty("allowRepair", Configuration.CATEGORY_GENERAL, false).getBoolean(false);
			requirePower = cfg.getOrCreateBooleanProperty("requirePower", Configuration.CATEGORY_GENERAL, false).getBoolean(false);
			debug = cfg.getOrCreateBooleanProperty("debug", Configuration.CATEGORY_GENERAL, false).getBoolean(false);
		}
		catch (Exception e) {
			FMLLog.log(Level.SEVERE, e, "TeleportRelay failed to load config settings.");
		}
		finally {
			cfg.save();
		}

		if (debug) {
			FMLLog.info("[TeleportRelay] Loaded with the following options:\n\t" +
							"teleportRelayID: %d\n\t" +
							"relayRemoteID: %d\n\t" +
							"relayRemoteUses: %d\n\t" +
							"allowRepair: %b\n\t",
							teleportRelayID, relayRemoteID, relayRemoteUses, allowRepair);
		}
	}

	@Init
	public void onInit(FMLInitializationEvent event) {
		teleportRelayBlock = new BlockTeleportRelay(teleportRelayID).setBlockName("teleportRelayBlock").setHardness(2.0f).setResistance(2.0f);
		relayRemoteItem = new ItemRelayRemote(relayRemoteID, relayRemoteUses).setItemName("relayRemoteItem");

		TileEntityTeleportRelayRenderer teleportRelayRenderer = new TileEntityTeleportRelayRenderer();
		ClientRegistry.registerTileEntity(TileEntityTeleportRelay.class, "teleportRelayBlock", teleportRelayRenderer);

		GameRegistry.registerBlock(teleportRelayBlock);
		GameRegistry.addRecipe(new ItemStack(teleportRelayBlock, 1), new Object[] { "igi", "grg", "iri", Character.valueOf('i'), Item.ingotIron, Character.valueOf('g'), Item.ingotGold, Character.valueOf('r'), Item.redstone });
		GameRegistry.addRecipe(new ItemStack(relayRemoteItem, 1), new Object[] { "b", "i", "r", Character.valueOf('b'), Block.button, Character.valueOf('i'), Item.ingotIron, Character.valueOf('r'), Item.redstone });

		if (allowRepair)
			GameRegistry.addShapelessRecipe(new ItemStack(relayRemoteItem, 1), new Object[] { new ItemStack(relayRemoteItem, 1, -1), Item.redstone });

		LanguageRegistry.instance().addName(teleportRelayBlock, "Teleport Relay");
		LanguageRegistry.instance().addName(relayRemoteItem, "Teleport Relay Remote");

		proxy.registerRenderInformation(((BlockTeleportRelay)teleportRelayBlock).getTextureFile());
		proxy.registerRenderInformation(((ItemRelayRemote)relayRemoteItem).getTextureFile());
		proxy.registerTickHandler();
	}

	public static void addRelayLocation(int x, int y, int z) {
		ChunkCoordinates loc = new ChunkCoordinates(x, y, z);

		if (!placedRelayBlocks.contains(loc))
			placedRelayBlocks.add(loc);
	}

	public static void removeRelayLocation(int x, int y, int z) {
		ChunkCoordinates loc = new ChunkCoordinates(x, y, z);

		if (placedRelayBlocks.contains(loc))
			placedRelayBlocks.remove(loc);
	}

	public static boolean hasRelayAtLocation(int x, int y, int z) {
		ChunkCoordinates loc = new ChunkCoordinates(x, y, z);

		return placedRelayBlocks.contains(loc);
	}

	public static ChunkCoordinates getTeleportLocation(int i) {
		return placedRelayBlocks.get(i);
	}

	public static int getRelayCount() {
		return placedRelayBlocks.size();
	}

	public static void printRelayLocations() {
		ChunkCoordinates loc = null;
		Minecraft minecraft = FMLClientHandler.instance().getClient();
		ChunkCoordinates spawn = minecraft.theWorld.getSpawnPoint();
		ChunkCoordinates bed = minecraft.thePlayer.getSpawnChunk();

		minecraft.thePlayer.addChatMessage("[TeleportRelay] World Spawn at: (" + spawn.posX + ", " + spawn.posY + ", " + spawn.posZ + ")");
		if (bed != null)
			minecraft.thePlayer.addChatMessage("[TeleportRelay] Bed Spawn at: (" + bed.posX + ", " + bed.posY + ", " + bed.posZ + ")");

		for (int i = 0; i < placedRelayBlocks.size(); i++) {
			loc = placedRelayBlocks.get(i);
			minecraft.thePlayer.addChatMessage("[TeleportRelay] Relay " + (i + 1) + " at: (" + loc.posX + ", " + loc.posY + ", " + loc.posZ + ")");
		}
	}
}