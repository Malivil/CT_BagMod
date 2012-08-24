package mal.teleportrelay.common;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import net.minecraft.src.EntityPlayerMP;
import net.minecraft.src.ItemStack;
import net.minecraft.src.NetworkManager;
import net.minecraft.src.Packet250CustomPayload;
import net.minecraft.src.TileEntity;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class ServerPacketHandler implements IPacketHandler {

	@Override
	public void onPacketData(NetworkManager manager, Packet250CustomPayload packet, Player player) {
		DataInputStream data = new DataInputStream(new ByteArrayInputStream(packet.data));
		EntityPlayerMP entityPlayer = (EntityPlayerMP)player;

		try {
			int type = data.readInt();
			// 0 = Item Use - Position change and item damage
			if (type == 0) {
				double x = data.readDouble();
				double y = data.readDouble();
				double z = data.readDouble();
				float yaw = data.readFloat();
				float pitch = data.readFloat();
				entityPlayer.setVelocity(0.0, 0.0, 0.0);
				entityPlayer.fallDistance = 0.0f;
				entityPlayer.serverForThisPlayer.setPlayerLocation(x, y, z, yaw, pitch);

				ItemStack remote = entityPlayer.getCurrentEquippedItem();
				if (remote != null)
					remote.damageItem(1, entityPlayer);
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
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
