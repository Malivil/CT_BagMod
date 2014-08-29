package mal.teleportrelay.client;

import mal.teleportrelay.common.CommonProxy;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenderInformation(final String path) {
		MinecraftForgeClient.preloadTexture(path);
	}

	@Override
	public void registerTickHandler() {
		TickRegistry.registerTickHandler(new ClientTickHandler(), Side.CLIENT);
	}
}
