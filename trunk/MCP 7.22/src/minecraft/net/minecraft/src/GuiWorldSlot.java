package net.minecraft.src;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import java.util.Date;

@SideOnly(Side.CLIENT)
class GuiWorldSlot extends GuiSlot
{
    final GuiSelectWorld parentWorldGui;

    public GuiWorldSlot(GuiSelectWorld par1GuiSelectWorld)
    {
        super(par1GuiSelectWorld.mc, par1GuiSelectWorld.width, par1GuiSelectWorld.height, 32, par1GuiSelectWorld.height - 64, 36);
        this.parentWorldGui = par1GuiSelectWorld;
    }

    /**
     * Gets the size of the current slot list.
     */
    protected int getSize()
    {
        return GuiSelectWorld.getSize(this.parentWorldGui).size();
    }

    /**
     * the element in the slot that was clicked, boolean for wether it was double clicked or not
     */
    protected void elementClicked(int par1, boolean par2)
    {
        GuiSelectWorld.onElementSelected(this.parentWorldGui, par1);
        boolean var3 = GuiSelectWorld.getSelectedWorld(this.parentWorldGui) >= 0 && GuiSelectWorld.getSelectedWorld(this.parentWorldGui) < this.getSize();
        GuiSelectWorld.getSelectButton(this.parentWorldGui).enabled = var3;
        GuiSelectWorld.getRenameButton(this.parentWorldGui).enabled = var3;
        GuiSelectWorld.getDeleteButton(this.parentWorldGui).enabled = var3;
        GuiSelectWorld.func_82312_f(this.parentWorldGui).enabled = var3;

        if (par2 && var3)
        {
            this.parentWorldGui.selectWorld(par1);
        }
    }

    /**
     * returns true if the element passed in is currently selected
     */
    protected boolean isSelected(int par1)
    {
        return par1 == GuiSelectWorld.getSelectedWorld(this.parentWorldGui);
    }

    /**
     * return the height of the content being scrolled
     */
    protected int getContentHeight()
    {
        return GuiSelectWorld.getSize(this.parentWorldGui).size() * 36;
    }

    protected void drawBackground()
    {
        this.parentWorldGui.drawDefaultBackground();
    }

    protected void drawSlot(int par1, int par2, int par3, int par4, Tessellator par5Tessellator)
    {
        SaveFormatComparator var6 = (SaveFormatComparator)GuiSelectWorld.getSize(this.parentWorldGui).get(par1);
        String var7 = var6.getDisplayName();

        if (var7 == null || MathHelper.stringNullOrLengthZero(var7))
        {
            var7 = GuiSelectWorld.func_82313_g(this.parentWorldGui) + " " + (par1 + 1);
        }

        String var8 = var6.getFileName();
        var8 = var8 + " (" + GuiSelectWorld.func_82315_h(this.parentWorldGui).format(new Date(var6.getLastTimePlayed()));
        var8 = var8 + ")";
        String var9 = "";

        if (var6.requiresConversion())
        {
            var9 = GuiSelectWorld.func_82311_i(this.parentWorldGui) + " " + var9;
        }
        else
        {
            var9 = GuiSelectWorld.func_82314_j(this.parentWorldGui)[var6.getEnumGameType().getID()];

            if (var6.isHardcoreModeEnabled())
            {
                var9 = "\u00a74" + StatCollector.translateToLocal("gameMode.hardcore") + "\u00a7r";
            }

            if (var6.getCheatsEnabled())
            {
                var9 = var9 + ", " + StatCollector.translateToLocal("selectWorld.cheats");
            }
        }

        this.parentWorldGui.drawString(this.parentWorldGui.fontRenderer, var7, par2 + 2, par3 + 1, 16777215);
        this.parentWorldGui.drawString(this.parentWorldGui.fontRenderer, var8, par2 + 2, par3 + 12, 8421504);
        this.parentWorldGui.drawString(this.parentWorldGui.fontRenderer, var9, par2 + 2, par3 + 12 + 10, 8421504);
    }
}
