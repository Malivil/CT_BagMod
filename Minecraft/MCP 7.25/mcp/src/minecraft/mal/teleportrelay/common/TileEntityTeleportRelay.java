package mal.teleportrelay.common;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.tileentity.TileEntity;

public class TileEntityTeleportRelay extends TileEntity {
	public String ownerName = "";
	public String name = "";
	public boolean enabled = true;
	public boolean publicAccess = true;

	@Override
	public void writeToNBT(final NBTTagCompound nbtTag) {
		super.writeToNBT(nbtTag);

		if (this.ownerName != null)
			nbtTag.setString("ownerName", this.ownerName);
		else
			nbtTag.setString("ownerName", "");
		if (this.name != null)
			nbtTag.setString("name", this.name);
		else
			nbtTag.setString("name", "");
		nbtTag.setBoolean("enabled", this.enabled);
		nbtTag.setBoolean("publicAccess", this.publicAccess);
	}

	@Override
	public void readFromNBT(final NBTTagCompound nbtTag) {
		super.readFromNBT(nbtTag);

		this.ownerName = nbtTag.getString("ownerName");
		this.name = nbtTag.getString("name");
		this.enabled = nbtTag.getBoolean("enabled");
		this.publicAccess = nbtTag.getBoolean("publicAccess");

		// Make sure these are always strings
		if (this.ownerName == null)
			this.ownerName = "";
		// Make sure these are always strings
		if (this.name == null)
			this.name = "";

		TeleportRelay.addRelayLocation(xCoord, yCoord, zCoord);
	}

	@Override
	public Packet getDescriptionPacket() {
		final Packet250CustomPayload infoPacket = new Packet250CustomPayload();
		final ByteArrayOutputStream infoBytes = new ByteArrayOutputStream();
		final DataOutputStream infoData = new DataOutputStream(infoBytes);

		try {
			// Type
			infoData.writeInt(1);
			infoData.writeInt(xCoord);
			infoData.writeInt(yCoord);
			infoData.writeInt(zCoord);
			infoData.writeUTF(this.ownerName);
			infoData.writeUTF(this.name);
			infoData.writeBoolean(this.enabled);
			infoData.writeBoolean(this.publicAccess);

			// Set up the packet
			infoPacket.channel = "TR_Channel";
			infoPacket.data = infoBytes.toByteArray();
			infoPacket.length = infoBytes.size();
		}
		catch (final IOException e) {
			e.printStackTrace();
		}

		return infoPacket;
	}

	public double getRenderDistance() {
		return 64.0;
	}
}
