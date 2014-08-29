package mal.teleportrelay.client;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import mal.teleportrelay.common.TeleportRelay;
import mal.teleportrelay.common.TileEntityTeleportRelay;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.network.PacketDispatcher;

public class GuiTeleportRemote extends GuiScreen {
	final ItemStack remote;

	public GuiTeleportRemote(final ItemStack remote) {
		this.remote = remote;
	}

	@Override
	public void initGui() {
		final EntityPlayer player = mc.thePlayer;
		final World world = mc.theWorld;

		// Print all the relay locations on GUI creation if debug is enabled
		if (TeleportRelay.debug)
			TeleportRelay.printRelayLocations();

		controlList.add(new GuiButton(0, width / 2 - 100, height / 4 + 24, "Spawn"));
		if (world == null)
			return;

		for (int i = 0; i < TeleportRelay.getRelayCount(); i++) {
			final ChunkCoordinates loc = TeleportRelay.getTeleportLocation(i);
			final TileEntity entity = world.getBlockTileEntity(loc.posX, loc.posY, loc.posZ);
			final GuiButton button;

			if (entity != null) {
				if (entity instanceof TileEntityTeleportRelay) {
					final TileEntityTeleportRelay relay = ((TileEntityTeleportRelay)entity);
					final boolean enabled = relay.enabled;
					final boolean powered = !TeleportRelay.requirePower ||
											(world.isBlockIndirectlyGettingPowered(loc.posX, loc.posY, loc.posZ) ||
											 world.isBlockGettingPowered(loc.posX, loc.posY, loc.posZ));
					final boolean publicAccess = relay.publicAccess;
					final String ownerName = relay.ownerName;

					if (TeleportRelay.debug) {
						FMLLog.info("Location: (%d, %d, %d)\n" +
									"Powered: '%s'\n" +
									"Enabled: '%s'\n" +
									"Owner Name: '%s'\n" +
									"Player Name: '%s'\n" +
									"Public: '%s'",
									loc.posX, loc.posY, loc.posZ,
									(powered ? "True" : "False"),
									(enabled ? "True" : "False"),
									ownerName,
									(player != null ? player.username : "Player is NULL"),
									(publicAccess ? "True" : "False"));
					}

					button = new GuiButton(i + 1, width / 2 - 100, height / 4 + (24 * (i + 2)), "Relay " + (i + 1) + " at: (" + loc.posX + ", " + loc.posY + ", " + loc.posZ + ")");
					// This relay must be
					// A. Enabled
					// B. Powered (Unless requirePower is set to false in the config)
					// C. Public Access
					//    OR
					//    Owned by this player
					button.enabled = (enabled && powered && (publicAccess || ((player != null) && (ownerName.equals(player.username)))));
				}
				else {
					button = new GuiButton(i + 1, width / 2 - 100, height / 4 + (24 * (i + 2)), "Invalid Relay at: (" + loc.posX + ", " + loc.posY + ", " + loc.posZ + ")");
					button.enabled = false;
				}
			}
			else {
				button = new GuiButton(i + 1, width / 2 - 100, height / 4 + (24 * (i + 2)), "Null Relay at: (" + loc.posX + ", " + loc.posY + ", " + loc.posZ + ")");
				button.enabled = false;
			}

			controlList.add(button);
		}
	}

	@Override
	protected void actionPerformed(final GuiButton guibutton) {
		if (!guibutton.enabled)
			return;

		final EntityPlayer player = mc.thePlayer;
		final Packet250CustomPayload positionPacket = new Packet250CustomPayload();
		final ByteArrayOutputStream positionBytes = new ByteArrayOutputStream();
		final DataOutputStream positionData = new DataOutputStream(positionBytes);

		try {
			switch(guibutton.id) {
				// World / Bed
				case 0:
					positionData.writeInt(TeleportRelay.PACKET_TYPES.TELEPORT_PLAYER_TO_SPAWN.getType());
					break;
				// Relay
				default:
					final ChunkCoordinates destinationChunk = TeleportRelay.getTeleportLocation(guibutton.id - 1);

					positionData.writeInt(TeleportRelay.PACKET_TYPES.TELEPORT_PLAYER_TO_POS.getType());
					positionData.writeDouble((double)destinationChunk.posX);
					positionData.writeDouble((double)destinationChunk.posY);
					positionData.writeDouble((double)destinationChunk.posZ);
					break;
			}

			// Set up the packet
			positionPacket.channel = "TR_Channel";
			positionPacket.data = positionBytes.toByteArray();
			positionPacket.length = positionBytes.size();
			// Send the packet to the server
			PacketDispatcher.sendPacketToServer(positionPacket);
		}
		catch (final IOException e) {
			e.printStackTrace();
		}

		mc.displayGuiScreen(null);
	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}
}
