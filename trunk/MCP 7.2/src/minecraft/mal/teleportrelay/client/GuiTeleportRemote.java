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
		final ChunkCoordinates bed = player.getSpawnChunk();
		final ChunkCoordinates spawn = world.getSpawnPoint();
		ChunkCoordinates loc = null;
		TileEntityTeleportRelay relay = null;
		TileEntity entity = null;
		boolean enabled = true, publicAccess = true, powered = true;
		String ownerName = "";
		GuiButton button = null;

		// Print all the relay locations on GUI creation if debug is enabled
		if (TeleportRelay.debug)
			TeleportRelay.printRelayLocations();

		// HACK: Until player.getSpawnChunk is fixed so it returns the actual
		// bed location, add a check to make sure the bed and the world aren't equal.
		// If they ARE, display "World" rather than "Bed" so it isn't confusing.
		if ((bed != null) && !bed.equals(spawn))
			controlList.add(new GuiButton(0, width / 2 - 100, height / 4 + 24, "Bed Spawn at: (" + bed.posX + ", " + bed.posY + ", " + bed.posZ + ")"));
		else
			controlList.add(new GuiButton(0, width / 2 - 100, height / 4 + 24, "World Spawn at: (" + spawn.posX + ", " + spawn.posY + ", " + spawn.posZ + ")"));

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

		switch(guibutton.id) {
			// World / Bed
			case 0:
				destinationChunk = player.getSpawnChunk();

				if (destinationChunk == null)
					destinationChunk = mc.theWorld.getSpawnPoint();
				break;
			// Relay
			default:
				destinationChunk = TeleportRelay.getTeleportLocation(guibutton.id - 1);
				break;
		}

		Packet250CustomPayload positionPacket = new Packet250CustomPayload();
		ByteArrayOutputStream positionBytes = new ByteArrayOutputStream();
		DataOutputStream positionData = new DataOutputStream(positionBytes);

		// Add small amounts to each position to center the player
		double xPos = ((double)destinationChunk.posX) + 0.5;
		double zPos = ((double)destinationChunk.posZ) + 0.5;
		double yPos = (double)destinationChunk.posY;
		double yPosAdjusted = yPos;

		if (mc.theWorld != null) {
			// Try to get the nearest free space
			yPosAdjusted = mc.theWorld.getTopSolidOrLiquidBlock((int)xPos, (int)zPos);
			if (yPosAdjusted == -1) {
				Chunk chunk = mc.theWorld.getChunkFromBlockCoords(destinationChunk.posX, destinationChunk.posZ);
				if (chunk != null) {
					if (!chunk.isChunkLoaded) {
						FMLLog.info("[TeleportRelay] Chunk is not loaded in actionPerformed, trying to load it!");
						// TODO: Doesn't work
						//mc.theWorld.getChunkProvider().loadChunk(destinationChunk.posX >> 4, destinationChunk.posZ >> 4);
					}

					// Try to get the nearest free space again
					yPosAdjusted = mc.theWorld.getTopSolidOrLiquidBlock((int)xPos, (int)zPos);
				}
			}
		}

		// If we got a valid adjusted yPos, use it
		// Otherwise just use the stored value
		if (yPosAdjusted != -1)
			yPos = yPosAdjusted;

		player.setVelocity(0.0, 0.0, 0.0);
		player.fallDistance = 0.0f;
		player.setPositionAndUpdate(xPos, yPos, zPos);

		try {
			// Type
			positionData.writeInt(0);
			positionData.writeDouble(xPos);
			positionData.writeDouble(yPos);
			positionData.writeDouble(zPos);
			positionData.writeFloat(player.rotationYaw);
			positionData.writeFloat(player.rotationPitch);

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
		FMLLog.info("[TeleportRelay] Teleporting player to (%f, %f, %f)!", xPos, yPos, zPos);
		remote.damageItem(1, player);
		mc.displayGuiScreen(null);
	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}
}
