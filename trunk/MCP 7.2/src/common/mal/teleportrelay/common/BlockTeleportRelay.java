package mal.teleportrelay.common;

import java.util.Random;

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
	protected BlockTeleportRelay(int blockID) {
		super(blockID, 0, Material.wood);
		this.setCreativeTab(CreativeTabs.tabRedstone);
	}

	@Override
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int blockID) {
		super.onBlockDestroyedByPlayer(world, x, y, z, blockID);
		TeleportRelay.removeRelayLocation(x, y, z);
	}

	@Override
	public void onBlockDestroyedByExplosion(World world, int x, int y, int z) {
		super.onBlockDestroyedByExplosion(world, x, y, z);
		TeleportRelay.removeRelayLocation(x, y, z);
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityplayer, int par6, float par7, float par8, float par9) {
		TileEntity entity = world.getBlockTileEntity(x, y, z);
		// If we can get the TileEntity, open the GUI for this TileEntity
		if ((entity != null) && (entity instanceof TileEntityTeleportRelay)) {
			FMLClientHandler.instance().displayGuiScreen(entityplayer, new GuiTeleportRelay((TileEntityTeleportRelay)entity));
			return true;
		}
		return false;
	}

	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLiving entityLiving) {
		// If this was placed by a player
		if ((entityLiving != null) && (entityLiving instanceof EntityPlayer)) {
			TileEntity entity = world.getBlockTileEntity(x, y, z);
			// And we can get the TileEntity, save this user's name as the owner of the TileEntity
			if ((entity != null) && (entity instanceof TileEntityTeleportRelay))
				((TileEntityTeleportRelay)entity).ownerName = ((EntityPlayer)entityLiving).username;

			TeleportRelay.addRelayLocation(x, y, z);
		}
	}

	@Override
	public int idDropped(int i, Random random, int j) {
		return this.blockID;
	}

	@Override
	public int quantityDropped(Random random) {
		return 1;
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
	public TileEntity createNewTileEntity(World world) {
		try {
			return (TileEntity)TileEntityTeleportRelay.class.newInstance();
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public boolean isBlockSolidOnSide(World world, int x, int y, int z, ForgeDirection side) {
		return true;
	}
}
