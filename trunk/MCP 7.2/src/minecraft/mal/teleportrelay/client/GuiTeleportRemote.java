package mal.teleportrelay.client;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import mal.teleportrelay.common.TeleportRelay;
import mal.teleportrelay.common.TileEntityTeleportRelay;
import net.minecraft.src.Chunk;
import net.minecraft.src.ChunkCoordinates;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.GuiButton;
import net.minecraft.src.GuiScreen;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Packet250CustomPayload;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.network.PacketDispatcher;

public class GuiTeleportRemote extends GuiScreen {
	ItemStack remote = null;

	public GuiTeleportRemote(ItemStack remote) {
		this.remote = remote;
	}

	@Override
	public void initGui() {
		final EntityPlayer player = mc.thePlayer;
		final World world = mc.theWorld;
		ChunkCoordinates loc = null;
		TileEntityTeleportRelay relay = null;
		TileEntity entity = null;
		boolean enabled = true, publicAccess = true, powered = true;
		String ownerName = "";
		GuiButton button = null;

		// Print all the relay locations on GUI creation if debug is enabled
		if (TeleportRelay.debug)
			TeleportRelay.printRelayLocations();

		controlList.add(new GuiButton(0, width / 2 - 100, height / 4 + 24, "Spawn"));

		for (int i = 0; i < TeleportRelay.getRelayCount(); i++) {
			loc = TeleportRelay.getTeleportLocation(i);
			enabled = true;
			powered = true;
			publicAccess = true;
			ownerName = "";

			if (world != null) {
				entity = world.getBlockTileEntity(loc.posX, loc.posY, loc.posZ);
				if (entity != null) {
					if (entity instanceof TileEntityTeleportRelay) {
						relay = ((TileEntityTeleportRelay)entity);
						enabled = relay.enabled;
						powered = !TeleportRelay.requirePower || (world.isBlockIndirectlyGettingPowered(loc.posX, loc.posY, loc.posZ) || world.isBlockGettingPowered(loc.posX, loc.posY, loc.posZ));
						publicAccess = relay.publicAccess;
						ownerName = relay.ownerName;

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
	}

	@Override
	protected void actionPerformed(GuiButton guibutton) {
		if (!guibutton.enabled)
			return;

		EntityPlayer player = mc.thePlayer;
		ChunkCoordinates destinationChunk = null;

		Packet250CustomPayload positionPacket = new Packet250CustomPayload();
		ByteArrayOutputStream positionBytes = new ByteArrayOutputStream();
		DataOutputStream positionData = new DataOutputStream(positionBytes);

		try {
			switch(guibutton.id) {
				// World / Bed
				case 0:
					positionData.writeInt(TeleportRelay.PACKET_TYPES.TELEPORT_PLAYER_TO_SPAWN.getType());
					break;
				// Relay
				default:
					destinationChunk = TeleportRelay.getTeleportLocation(guibutton.id - 1);

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
		catch (IOException e) {
			e.printStackTrace();
		}

		mc.displayGuiScreen(null);
	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}
}
