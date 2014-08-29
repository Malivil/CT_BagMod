package mal.teleportrelay.common;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;


public class TileEntityTeleportRelayRenderer extends TileEntitySpecialRenderer {
	final private ModelTeleportRelay aModel;

	public TileEntityTeleportRelayRenderer() {
		aModel = new ModelTeleportRelay();
	}

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double d, double d1, double d2, float f) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float)d + 0.5F, (float)d1 - 0.5F, (float)d2 + 0.5F); 
		bindTextureByName("/mal/teleportrelay/sprites/relayBlock.png");
		GL11.glPushMatrix();
		aModel.renderModel(0.0625F);
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}
}
