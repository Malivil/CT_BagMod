package mal.teleportrelay.common;

import mal.teleportrelay.client.GuiTeleportRemote;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import cpw.mods.fml.client.FMLClientHandler;

public class ItemRelayRemote extends Item {

	protected ItemRelayRemote(int blockID, int maxUses) {
		super(blockID);
		maxStackSize = 1;
		setMaxDamage(maxUses);
		this.setTabToDisplayOn(CreativeTabs.tabRedstone);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		if(itemstack.getItemDamage() < itemstack.getMaxDamage())
			FMLClientHandler.instance().displayGuiScreen(entityplayer, new GuiTeleportRemote(itemstack));
		else if (world.isRemote) {
			entityplayer.addChatMessage("Your teleport remote is out of power.");
			entityplayer.addChatMessage("Please recharge it and try again.");
		}

		return itemstack;
	}

	@Override
	public String getTextureFile() {
		return "/mal/teleportrelay/sprites/remoteItem.png";
	}
}
