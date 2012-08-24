package mal.teleportrelay.client;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.registry.TickRegistry;
import mal.teleportrelay.common.CommonProxy;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenderInformation(String path) {
		MinecraftForgeClient.preloadTexture(path);
	}

	@Override
	public void registerTickHandler() {
		TickRegistry.registerTickHandler(new ClientTickHandler(), Side.CLIENT);
	}
}
