package mal.teleportrelay.common;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import net.minecraft.src.ChunkCoordinates;
import net.minecraft.src.EntityPlayerMP;
import net.minecraft.src.INetworkManager;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Packet250CustomPayload;
import net.minecraft.src.TileEntity;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class ServerPacketHandler implements IPacketHandler {

	@Override
	public void onPacketData(final INetworkManager manager, final Packet250CustomPayload packet, final Player player) {
		final DataInputStream data = new DataInputStream(new ByteArrayInputStream(packet.data));
		final EntityPlayerMP entityPlayer = (EntityPlayerMP)player;

		try {
			final int type = data.readInt();
			// Position change and item damage
			if (type == TeleportRelay.PACKET_TYPES.TELEPORT_PLAYER_TO_SPAWN.getType() ||
				type == TeleportRelay.PACKET_TYPES.TELEPORT_PLAYER_TO_POS.getType()) {
				final double xPos, zPos;
				double yPos;

				// Get the positions right from the packet
				if (type == TeleportRelay.PACKET_TYPES.TELEPORT_PLAYER_TO_POS.getType()) {
					xPos = data.readDouble();
					yPos = data.readDouble();
					zPos = data.readDouble();

					// Get the adjusted yPos to fit the player
					final int yPosAdjusted = getFreeYPosition(entityPlayer, xPos, yPos, zPos);
					// If we got a valid adjusted yPos, use it
					// Otherwise just use the stored value
					if (yPosAdjusted != -1)
						yPos = yPosAdjusted;
				}
				// Get the spawn positions
				else {
					ChunkCoordinates spawnChunk = entityPlayer.getSpawnChunk();

					// If the player spawn is null and there is a world spawn, get that
					if (spawnChunk == null) {
						if (entityPlayer.worldObj != null) {
							spawnChunk = entityPlayer.worldObj.getSpawnPoint();
	
							// Get the adjusted yPos to fit the player
							final int yPosAdjusted = getFreeYPosition(entityPlayer, spawnChunk.posX, spawnChunk.posY, spawnChunk.posZ);
							// If we got a valid adjusted yPos, use it
							// Otherwise just use the stored value
							if (yPosAdjusted != -1)
								spawnChunk.posY = yPosAdjusted;
						}
					}
					// Add 1 to the spawn chunk "height" so that we don't
					// teleport INTO the bed, we teleport on top of it
					else
						spawnChunk.posY++;

					// If both the player spawn and the world spawn are null, somehow, error
					if (spawnChunk == null) {
						FMLLog.warning("[TeleportRelay] ERROR: Unable to get spawn location.");
						return;
					}

					xPos = (double)spawnChunk.posX;
					yPos = (double)spawnChunk.posY;
					zPos = (double)spawnChunk.posZ;
				}

				// Stop the player before teleporting them
				entityPlayer.setVelocity(0.0, 0.0, 0.0);
				entityPlayer.fallDistance = 0.0f;
				// Add small amounts to the x and z position to center the player
				entityPlayer.setPositionAndUpdate(xPos + 0.5, yPos, zPos + 0.5);

				// Use up 1 charge of the remote
				final ItemStack remote = entityPlayer.getCurrentEquippedItem();
				if (remote != null)
					remote.damageItem(1, entityPlayer);
			}
			// Updates the variables associated with the relay at the given location
			else if (type == TeleportRelay.PACKET_TYPES.UPDATE_TELEPORT_RELAY.getType()) {
				final int x = data.readInt();
				final int y = data.readInt();
				final int z = data.readInt();
				final String ownerName = data.readUTF();
				final String name = data.readUTF();
				final boolean enabled = data.readBoolean();
				final boolean publicAccess = data.readBoolean();

				if (entityPlayer.worldObj != null) {
					final TileEntity entity = entityPlayer.worldObj.getBlockTileEntity(x, y, z);
					if ((entity != null) && (entity instanceof TileEntityTeleportRelay)) {
						final TileEntityTeleportRelay relay = ((TileEntityTeleportRelay)entity);
						relay.ownerName = ownerName;
						relay.name = name;
						relay.enabled = enabled;
						relay.publicAccess = publicAccess;
					}
				}
			}
		}
		catch (final IOException e) {
			e.printStackTrace();
		}
	}

	private static int getFreeYPosition(EntityPlayerMP entityPlayer, double xPos, double yPos, double zPos) {
		// Start with -1 as an invalid position
		int yPosAdjusted = -1;

		// If the world isn't null, find the nearest open position, going straight up
		if (entityPlayer.worldObj != null) {
			// Stop after 10 blocks because we don't want to drop ourselves in the world
			for (int i = (int)yPos; i < ((int)yPos + 10) ; i++) {
				if (entityPlayer.worldObj.doesBlockHaveSolidTopSurface((int)xPos, i - 1, (int)zPos) &&
					entityPlayer.worldObj.isAirBlock((int)xPos, i, (int)zPos) &&
					entityPlayer.worldObj.isAirBlock((int)xPos, i + 1, (int)zPos)) {
					yPosAdjusted = i;
					break;
				}
			}
		}

		return yPosAdjusted;
	}
}