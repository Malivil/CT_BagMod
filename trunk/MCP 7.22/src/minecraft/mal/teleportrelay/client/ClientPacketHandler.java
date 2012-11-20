package mal.teleportrelay.client;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import mal.teleportrelay.common.TeleportRelay;
import mal.teleportrelay.common.TileEntityTeleportRelay;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.INetworkManager;
import net.minecraft.src.Packet250CustomPayload;
import net.minecraft.src.TileEntity;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class ClientPacketHandler implements IPacketHandler {

	@Override
	public void onPacketData(final INetworkManager manager, final Packet250CustomPayload packet, final Player player) {
		final DataInputStream data = new DataInputStream(new ByteArrayInputStream(packet.data));
		final EntityPlayer entityPlayer = (EntityPlayer)player;

		try {
			final int type = data.readInt();
			// Position change and item damage
			if (type == TeleportRelay.PACKET_TYPES.TELEPORT_PLAYER_TO_SPAWN.getType() ||
				type == TeleportRelay.PACKET_TYPES.TELEPORT_PLAYER_TO_POS.getType()) {
				// Server-only
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

				// Add this relay to the list, if it's not there already
				if (!TeleportRelay.hasRelayAtLocation(x, y, z))
					TeleportRelay.addRelayLocation(x, y, z);
			}
		}
		catch (final IOException e) {
			e.printStackTrace();
		}
	}
}
