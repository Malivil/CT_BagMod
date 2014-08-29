package mal.teleportrelay.client;

import java.util.EnumSet;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class ClientTickHandler implements ITickHandler {

	@Override
	public void tickStart(final EnumSet<TickType> type, final Object... tickData) {
	}

	@Override
	public void tickEnd(final EnumSet<TickType> type, final Object... tickData) {
		if (type.equals(EnumSet.of(TickType.CLIENT))) {
			final GuiScreen guiscreen = Minecraft.getMinecraft().currentScreen;
			if (guiscreen != null)
				onTickInGUI(guiscreen);
			else
				onTickInGame();
		}
	}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.CLIENT);
	}

	@Override
	public String getLabel() {
		return null;
	}

	public void onTickInGUI(final GuiScreen guiscreen) {
    }

    public void onTickInGame() {
    }
}
