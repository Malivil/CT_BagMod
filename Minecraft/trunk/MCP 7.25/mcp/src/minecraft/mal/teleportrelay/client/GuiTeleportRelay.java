package mal.teleportrelay.client;

import mal.teleportrelay.common.TileEntityTeleportRelay;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.packet.Packet;
import cpw.mods.fml.common.network.PacketDispatcher;

public class GuiTeleportRelay extends GuiScreen {
	TileEntityTeleportRelay relay = null;

	public GuiTeleportRelay(final TileEntityTeleportRelay relay) {
		this.relay = relay;
	}

	@Override
	public void initGui() {
		if (this.relay == null) {
			mc.displayGuiScreen(null);
			return;
		}

		final EntityPlayer player = mc.thePlayer;
		if (!relay.ownerName.equals(player.username)) {
			player.sendChatToPlayer("You aren't the owner of this Relay. You cannot access its settings.");
			mc.displayGuiScreen(null);
			return;
		}

		this.relay.enabled = !this.relay.enabled;
		player.sendChatToPlayer(String.format("Relay at (%d, %d, %d) is now %s!", this.relay.xCoord, this.relay.yCoord, this.relay.zCoord, (this.relay.enabled ? "Enabled" : "Disabled")));
		sendUpdatesToServer();
		mc.displayGuiScreen(null);
	}

	@Override
	protected void actionPerformed(final GuiButton guibutton) {
		final EntityPlayer player = mc.thePlayer;
		mc.displayGuiScreen(null);
	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}

	private void sendUpdatesToServer() {
		if (this.relay == null)
			return;

		final Packet infoPacket = relay.getDescriptionPacket();
		PacketDispatcher.sendPacketToServer(infoPacket);
		PacketDispatcher.sendPacketToAllAround(relay.xCoord, relay.yCoord, relay.zCoord, relay.getRenderDistance(), 0, infoPacket);
	}
}
