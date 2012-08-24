package mal.teleportrelay.client;

import cpw.mods.fml.common.network.PacketDispatcher;
import mal.teleportrelay.common.TileEntityTeleportRelay;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.GuiButton;
import net.minecraft.src.GuiScreen;
import net.minecraft.src.Packet;

public class GuiTeleportRelay extends GuiScreen {
	TileEntityTeleportRelay relay = null;

	public GuiTeleportRelay(TileEntityTeleportRelay relay) {
		this.relay = relay;
	}

	@Override
	public void initGui() {
		if (this.relay == null) {
			mc.displayGuiScreen(null);
			return;
		}

		EntityPlayer player = mc.thePlayer;
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
	protected void actionPerformed(GuiButton guibutton) {
		EntityPlayer player = mc.thePlayer;
		mc.displayGuiScreen(null);
	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}

	private void sendUpdatesToServer() {
		if (this.relay == null)
			return;

		Packet infoPacket = relay.getAuxillaryInfoPacket();
		PacketDispatcher.sendPacketToServer(infoPacket);
		PacketDispatcher.sendPacketToAllAround(relay.xCoord, relay.yCoord, relay.zCoord, relay.getRenderDistance(), 0, infoPacket);
	}
}
