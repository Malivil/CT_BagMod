package morePistons;

import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxyMorePistons extends CommonProxyMorePistons
{
    public void registerRenderThings()
    {
        MinecraftForgeClient.preloadTexture("/morePistons/blocks/block_textures");
    }
}
