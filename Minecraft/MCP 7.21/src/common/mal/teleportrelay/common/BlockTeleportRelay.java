package mal.teleportrelay.common;

import mal.teleportrelay.client.GuiTeleportRelay;
import net.minecraft.src.BlockContainer;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Material;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;
import net.minecraftforge.common.ForgeDirection;
import cpw.mods.fml.client.FMLClientHandler;

public class BlockTeleportRelay extends BlockContainer {
	protected BlockTeleportRelay(final int blockID) {
		super(blockID, 0, Material.wood);
		this.setCreativeTab(CreativeTabs.tabRedstone);
	}

	@Override
	public void onBlockDestroyedByPlayer(final World world, final int x, final int y, final int z, final int blockID) {
		super.onBlockDestroyedByPlayer(world, x, y, z, blockID);
		TeleportRelay.removeRelayLocation(x, y, z);
	}

	@Override
	public void onBlockDestroyedByExplosion(final World world, final int x, final int y, final int z) {
		super.onBlockDestroyedByExplosion(world, x, y, z);
		TeleportRelay.removeRelayLocation(x, y, z);
	}

	@Override
	public boolean onBlockActivated(final World world, final int x, final int y, final int z, final EntityPlayer entityplayer, final int par6, final float par7, final float par8, final float par9) {
		TileEntity entity = world.getBlockTileEntity(x, y, z);
		// If we can get the TileEntity, open the GUI for this TileEntity
		if ((entity != null) && (entity instanceof TileEntityTeleportRelay)) {
			FMLClientHandler.instance().displayGuiScreen(entityplayer, new GuiTeleportRelay((TileEntityTeleportRelay)entity));
			return true;
		}
		return false;
	}

	@Override
	public void onBlockPlacedBy(final World world, final int x, final int y, final int z, final EntityLiving entityLiving) {
		// If this was placed by a player
		if ((entityLiving != null) && (entityLiving instanceof EntityPlayer)) {
			final TileEntity entity = world.getBlockTileEntity(x, y, z);
			// And we can get the TileEntity, save this user's name as the owner of the TileEntity
			if ((entity != null) && (entity instanceof TileEntityTeleportRelay))
				((TileEntityTeleportRelay)entity).ownerName = ((EntityPlayer)entityLiving).username;

			TeleportRelay.addRelayLocation(x, y, z);
		}
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public int getRenderType() {
		return -1;
	}

	@Override
	public String getTextureFile() {
		return "/mal/teleportrelay/sprites/relayItem.png";
	}

	@Override
	public TileEntity createNewTileEntity(final World world) {
		try {
			return (TileEntity)TileEntityTeleportRelay.class.newInstance();
		}
		catch (final Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public boolean isBlockSolidOnSide(final World world, final int x, final int y, final int z, final ForgeDirection side) {
		return true;
	}
}
