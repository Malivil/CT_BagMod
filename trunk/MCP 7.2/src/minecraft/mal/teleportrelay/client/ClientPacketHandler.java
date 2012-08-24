package mal.teleportrelay.client;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import mal.teleportrelay.common.TeleportRelay;
import mal.teleportrelay.common.TileEntityTeleportRelay;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.NetworkManager;
import net.minecraft.src.Packet250CustomPayload;
import net.minecraft.src.TileEntity;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class ClientPacketHandler implements IPacketHandler {

	@Override
	public void onPacketData(NetworkManager manager, Packet250CustomPayload packet, Player player) {
		DataInputStream data = new DataInputStream(new ByteArrayInputStream(packet.data));
		EntityPlayer entityPlayer = (EntityPlayer)player;

		try {
			int type = data.readInt();
			// 0 = Item Use - Position change and item damage
			if (type == 0) {
				// Server-only
			}
			// 1 = TileEntityTeleportRelay Update - Updates the variables associated with the relay at the given location
			else if (type == 1) {
				int x = data.readInt();
				int y = data.readInt();
				int z = data.readInt();
				String ownerName = data.readUTF();
				String name = data.readUTF();
				boolean enabled = data.readBoolean();
				boolean publicAccess = data.readBoolean();

				if (entityPlayer.worldObj != null) {
					TileEntity entity = entityPlayer.worldObj.getBlockTileEntity(x, y, z);
					if ((entity != null) && (entity instanceof TileEntityTeleportRelay)) {
						TileEntityTeleportRelay relay = ((TileEntityTeleportRelay)entity);
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
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
