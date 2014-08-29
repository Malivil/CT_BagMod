package metadark.mods.SuperSlopes.IntCorners;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.src.ModLoader;

public class ClientInit extends CommonInit
{
    public void registerBlockModel()
    {
        IntCorners.IntCornersRenderID = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(new RenderIntCorners());
    }

    public void addLocalizations()
    {
        ModLoader.addLocalization("KaevWoodSlopesTruncCornerDown.name", "Wood Oblique Slope");
        ModLoader.addLocalization("KaevWoodSlopesTruncCornerUp.name", "Wood Oblique Slope Inv");
        ModLoader.addLocalization("KaevWoodSlopesInvCornerDown.name", "Wood Interior Corner");
        ModLoader.addLocalization("KaevWoodSlopesInvCornerUp.name", "Wood Interior Corner Inv");
        ModLoader.addLocalization("KaevCobblestoneSlopesTruncCornerDown.name", "Cobblestone Oblique Slope");
        ModLoader.addLocalization("KaevCobblestoneSlopesTruncCornerUp.name", "Cobblestone Oblique Slope Inv");
        ModLoader.addLocalization("KaevCobblestoneSlopesInvCornerDown.name", "Cobblestone Interior Corner");
        ModLoader.addLocalization("KaevCobblestoneSlopesInvCornerUp.name", "Cobblestone Interior Corner Inv");
        ModLoader.addLocalization("KaevGlassSlopesTruncCornerDown.name", "Glass Oblique Slope");
        ModLoader.addLocalization("KaevGlassSlopesTruncCornerUp.name", "Glass Oblique Slope Inv");
        ModLoader.addLocalization("KaevGlassSlopesInvCornerDown.name", "Glass Interior Corner");
        ModLoader.addLocalization("KaevGlassSlopesInvCornerUp.name", "Glass Interior Corner Inv");
        ModLoader.addLocalization("KaevSandstoneSlopesTruncCornerDown.name", "Sandstone Oblique Slope");
        ModLoader.addLocalization("KaevSandstoneSlopesTruncCornerUp.name", "Sandstone Oblique Slope Inv");
        ModLoader.addLocalization("KaevSandstoneSlopesInvCornerDown.name", "Sandstone Interior Corner");
        ModLoader.addLocalization("KaevSandstoneSlopesInvCornerUp.name", "Sandstone Interior Corner Inv");
        ModLoader.addLocalization("KaevDirtSlopesTruncCornerDown.name", "Dirt Oblique Slope");
        ModLoader.addLocalization("KaevDirtSlopesTruncCornerUp.name", "Dirt Oblique Slope Inv");
        ModLoader.addLocalization("KaevDirtSlopesInvCornerDown.name", "Dirt Interior Corner");
        ModLoader.addLocalization("KaevDirtSlopesInvCornerUp.name", "Dirt Interior Corner Inv");
        ModLoader.addLocalization("KaevStoneSlopesTruncCornerDown.name", "Stone Oblique Slope");
        ModLoader.addLocalization("KaevStoneSlopesTruncCornerUp.name", "Stone Oblique Slope Inv");
        ModLoader.addLocalization("KaevStoneSlopesInvCornerDown.name", "Stone Interior Corner");
        ModLoader.addLocalization("KaevStoneSlopesInvCornerUp.name", "Stone Interior Corner Inv");
        ModLoader.addLocalization("KaevSandSlopesTruncCornerDown.name", "Sand Oblique Slope");
        ModLoader.addLocalization("KaevSandSlopesTruncCornerUp.name", "Sand Oblique Slope Inv");
        ModLoader.addLocalization("KaevSandSlopesInvCornerDown.name", "Sand Interior Corner");
        ModLoader.addLocalization("KaevSandSlopesInvCornerUp.name", "Sand Interior Corner Inv");
        ModLoader.addLocalization("KaevSnowSlopesTruncCornerDown.name", "Snow Oblique Slope");
        ModLoader.addLocalization("KaevSnowSlopesTruncCornerUp.name", "Snow Oblique Slope Inv");
        ModLoader.addLocalization("KaevSnowSlopesInvCornerDown.name", "Snow Interior Corner");
        ModLoader.addLocalization("KaevSnowSlopesInvCornerUp.name", "Snow Interior Corner Inv");
        ModLoader.addLocalization("KaevGrassSlopesTruncCornerDown.name", "Grass Oblique Slope");
        ModLoader.addLocalization("KaevGrassSlopesTruncCornerUp.name", "Grass Oblique Slope Inv");
        ModLoader.addLocalization("KaevGrassSlopesInvCornerDown.name", "Grass Interior Corner");
        ModLoader.addLocalization("KaevGrassSlopesInvCornerUp.name", "Grass Interior Corner Inv");
        ModLoader.addLocalization("KaevBricksSlopesTruncCornerDown.name", "Brick Oblique Slope");
        ModLoader.addLocalization("KaevBricksSlopesTruncCornerUp.name", "Brick Oblique Slope Inv");
        ModLoader.addLocalization("KaevBricksSlopesInvCornerDown.name", "Brick Interior Corner");
        ModLoader.addLocalization("KaevBricksSlopesInvCornerUp.name", "Brick Interior Corner Inv");
        ModLoader.addLocalization("KaevGravelSlopesTruncCornerDown.name", "Gravel Oblique Slope");
        ModLoader.addLocalization("KaevGravelSlopesTruncCornerUp.name", "Gravel Oblique Slope Inv");
        ModLoader.addLocalization("KaevGravelSlopesInvCornerDown.name", "Gravel Interior Corner");
        ModLoader.addLocalization("KaevGravelSlopesInvCornerUp.name", "Gravel Interior Corner Inv");
        ModLoader.addLocalization("KaevGoldSlopesTruncCornerDown.name", "Gold Oblique Slope");
        ModLoader.addLocalization("KaevGoldSlopesTruncCornerUp.name", "Gold Oblique Slope Inv");
        ModLoader.addLocalization("KaevGoldSlopesInvCornerDown.name", "Gold Interior Corner");
        ModLoader.addLocalization("KaevGoldSlopesInvCornerUp.name", "Gold Interior Corner Inv");
        ModLoader.addLocalization("KaevSteelSlopesTruncCornerDown.name", "Iron Oblique Slope");
        ModLoader.addLocalization("KaevSteelSlopesTruncCornerUp.name", "Iron Oblique Slope Inv");
        ModLoader.addLocalization("KaevSteelSlopesInvCornerDown.name", "Iron Interior Corner");
        ModLoader.addLocalization("KaevSteelSlopesInvCornerUp.name", "Iron Interior Corner Inv");
        ModLoader.addLocalization("KaevObsidianSlopesTruncCornerDown.name", "Obsidian Oblique Slope");
        ModLoader.addLocalization("KaevObsidianSlopesTruncCornerUp.name", "Obsidian Oblique Slope Inv");
        ModLoader.addLocalization("KaevObsidianSlopesInvCornerDown.name", "Obsidian Interior Corner");
        ModLoader.addLocalization("KaevObsidianSlopesInvCornerUp.name", "Obsidian Interior Corner Inv");
        ModLoader.addLocalization("KaevDiamondSlopesTruncCornerDown.name", "Diamond Oblique Slope");
        ModLoader.addLocalization("KaevDiamondSlopesTruncCornerUp.name", "Diamond Oblique Slope Inv");
        ModLoader.addLocalization("KaevDiamondSlopesInvCornerDown.name", "Diamond Interior Corner");
        ModLoader.addLocalization("KaevDiamondSlopesInvCornerUp.name", "Diamond Interior Corner Inv");
        ModLoader.addLocalization("KaevWhiteWoolSlopesTruncCornerDown.name", "Wool Oblique Slope");
        ModLoader.addLocalization("KaevWhiteWoolSlopesTruncCornerUp.name", "Wool Oblique Slope Inv");
        ModLoader.addLocalization("KaevWhiteWoolSlopesInvCornerDown.name", "Wool Interior Corner");
        ModLoader.addLocalization("KaevWhiteWoolSlopesInvCornerUp.name", "Wool Interior Corner Inv");
        ModLoader.addLocalization("KaevBlackWoolSlopesTruncCornerDown.name", "Black Oblique Slope");
        ModLoader.addLocalization("KaevBlackWoolSlopesTruncCornerUp.name", "Black Oblique Slope Inv");
        ModLoader.addLocalization("KaevBlackWoolSlopesInvCornerDown.name", "Black Interior Corner");
        ModLoader.addLocalization("KaevBlackWoolSlopesInvCornerUp.name", "Black Interior Corner Inv");
        ModLoader.addLocalization("KaevRedWoolSlopesTruncCornerDown.name", "Red Oblique Slope");
        ModLoader.addLocalization("KaevRedWoolSlopesTruncCornerUp.name", "Red Oblique Slope Inv");
        ModLoader.addLocalization("KaevRedWoolSlopesInvCornerDown.name", "Red Interior Corner");
        ModLoader.addLocalization("KaevRedWoolSlopesInvCornerUp.name", "Red Interior Corner Inv");
        ModLoader.addLocalization("KaevGreenWoolSlopesTruncCornerDown.name", "Green Oblique Slope");
        ModLoader.addLocalization("KaevGreenWoolSlopesTruncCornerUp.name", "Green Oblique Slope Inv");
        ModLoader.addLocalization("KaevGreenWoolSlopesInvCornerDown.name", "Green Interior Corner");
        ModLoader.addLocalization("KaevGreenWoolSlopesInvCornerUp.name", "Green Interior Corner Inv");
        ModLoader.addLocalization("KaevBrownWoolSlopesTruncCornerDown.name", "Brown Oblique Slope");
        ModLoader.addLocalization("KaevBrownWoolSlopesTruncCornerUp.name", "Brown Oblique Slope Inv");
        ModLoader.addLocalization("KaevBrownWoolSlopesInvCornerDown.name", "Brown Interior Corner");
        ModLoader.addLocalization("KaevBrownWoolSlopesInvCornerUp.name", "Brown Interior Corner Inv");
        ModLoader.addLocalization("KaevBlueWoolSlopesTruncCornerDown.name", "Blue Oblique Slope");
        ModLoader.addLocalization("KaevBlueWoolSlopesTruncCornerUp.name", "Blue Oblique Slope Inv");
        ModLoader.addLocalization("KaevBlueWoolSlopesInvCornerDown.name", "Blue Interior Corner");
        ModLoader.addLocalization("KaevBlueWoolSlopesInvCornerUp.name", "Blue Interior Corner Inv");
        ModLoader.addLocalization("KaevPurpleWoolSlopesTruncCornerDown.name", "Purple Oblique Slope");
        ModLoader.addLocalization("KaevPurpleWoolSlopesTruncCornerUp.name", "Purple Oblique Slope Inv");
        ModLoader.addLocalization("KaevPurpleWoolSlopesInvCornerDown.name", "Purple Interior Corner");
        ModLoader.addLocalization("KaevPurpleWoolSlopesInvCornerUp.name", "Purple Interior Corner Inv");
        ModLoader.addLocalization("KaevCyanWoolSlopesTruncCornerDown.name", "Cyan Oblique Slope");
        ModLoader.addLocalization("KaevCyanWoolSlopesTruncCornerUp.name", "Cyan Oblique Slope Inv");
        ModLoader.addLocalization("KaevCyanWoolSlopesInvCornerDown.name", "Cyan Interior Corner");
        ModLoader.addLocalization("KaevCyanWoolSlopesInvCornerUp.name", "Cyan Interior Corner Inv");
        ModLoader.addLocalization("KaevSilverWoolSlopesTruncCornerDown.name", "Light Gray Oblique Slope");
        ModLoader.addLocalization("KaevSilverWoolSlopesTruncCornerUp.name", "Light Gray Oblique Slope Inv");
        ModLoader.addLocalization("KaevSilverWoolSlopesInvCornerDown.name", "Light Gray Interior Corner");
        ModLoader.addLocalization("KaevSilverWoolSlopesInvCornerUp.name", "Light Gray Interior Corner Inv");
        ModLoader.addLocalization("KaevGrayWoolSlopesTruncCornerDown.name", "Gray Oblique Slope");
        ModLoader.addLocalization("KaevGrayWoolSlopesTruncCornerUp.name", "Gray Oblique Slope Inv");
        ModLoader.addLocalization("KaevGrayWoolSlopesInvCornerDown.name", "Gray Interior Corner");
        ModLoader.addLocalization("KaevGrayWoolSlopesInvCornerUp.name", "Gray Interior Corner Inv");
        ModLoader.addLocalization("KaevPinkWoolSlopesTruncCornerDown.name", "Pink Oblique Slope");
        ModLoader.addLocalization("KaevPinkWoolSlopesTruncCornerUp.name", "Pink Oblique Slope Inv");
        ModLoader.addLocalization("KaevPinkWoolSlopesInvCornerDown.name", "Pink Interior Corner");
        ModLoader.addLocalization("KaevPinkWoolSlopesInvCornerUp.name", "Pink Interior Corner Inv");
        ModLoader.addLocalization("KaevLimeWoolSlopesTruncCornerDown.name", "Lime Oblique Slope");
        ModLoader.addLocalization("KaevLimeWoolSlopesTruncCornerUp.name", "Lime Oblique Slope Inv");
        ModLoader.addLocalization("KaevLimeWoolSlopesInvCornerDown.name", "Lime Interior Corner");
        ModLoader.addLocalization("KaevLimeWoolSlopesInvCornerUp.name", "Lime Interior Corner Inv");
        ModLoader.addLocalization("KaevYellowWoolSlopesTruncCornerDown.name", "Yellow Oblique Slope");
        ModLoader.addLocalization("KaevYellowWoolSlopesTruncCornerUp.name", "Yellow Oblique Slope Inv");
        ModLoader.addLocalization("KaevYellowWoolSlopesInvCornerDown.name", "Yellow Interior Corner");
        ModLoader.addLocalization("KaevYellowWoolSlopesInvCornerUp.name", "Yellow Interior Corner Inv");
        ModLoader.addLocalization("KaevLightBlueWoolSlopesTruncCornerDown.name", "Light Blue Oblique Slope");
        ModLoader.addLocalization("KaevLightBlueWoolSlopesTruncCornerUp.name", "Light Blue Oblique Slope Inv");
        ModLoader.addLocalization("KaevLightBlueWoolSlopesInvCornerDown.name", "Light Blue Interior Corner");
        ModLoader.addLocalization("KaevLightBlueWoolSlopesInvCornerUp.name", "Light Blue Interior Corner Inv");
        ModLoader.addLocalization("KaevMagentaWoolSlopesTruncCornerDown.name", "Magenta Oblique Slope");
        ModLoader.addLocalization("KaevMagentaWoolSlopesTruncCornerUp.name", "Magenta Oblique Slope Inv");
        ModLoader.addLocalization("KaevMagentaWoolSlopesInvCornerDown.name", "Magenta Interior Corner");
        ModLoader.addLocalization("KaevMagentaWoolSlopesInvCornerUp.name", "Magenta Interior Corner Inv");
        ModLoader.addLocalization("KaevOrangeWoolSlopesTruncCornerDown.name", "Orange Oblique Slope");
        ModLoader.addLocalization("KaevOrangeWoolSlopesTruncCornerUp.name", "Orange Oblique Slope Inv");
        ModLoader.addLocalization("KaevOrangeWoolSlopesInvCornerDown.name", "Orange Interior Corner");
        ModLoader.addLocalization("KaevOrangeWoolSlopesInvCornerUp.name", "Orange Interior Corner Inv");
    }
}