package metadark.mods.SuperSlopes.IntCorners;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ClientInit extends CommonInit
{
    public void registerBlockModel()
    {
        IntCorners.IntCornersRenderID = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(new RenderIntCorners());
    }

    public void addLocalizations()
    {
        LanguageRegistry.instance().addStringLocalization("KaevWoodSlopesTruncCornerDown.name", "Wood Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevWoodSlopesTruncCornerUp.name", "Wood Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevWoodSlopesInvCornerDown.name", "Wood Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevWoodSlopesInvCornerUp.name", "Wood Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevCobblestoneSlopesTruncCornerDown.name", "Cobblestone Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevCobblestoneSlopesTruncCornerUp.name", "Cobblestone Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevCobblestoneSlopesInvCornerDown.name", "Cobblestone Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevCobblestoneSlopesInvCornerUp.name", "Cobblestone Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevGlassSlopesTruncCornerDown.name", "Glass Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevGlassSlopesTruncCornerUp.name", "Glass Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevGlassSlopesInvCornerDown.name", "Glass Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevGlassSlopesInvCornerUp.name", "Glass Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevSandstoneSlopesTruncCornerDown.name", "Sandstone Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevSandstoneSlopesTruncCornerUp.name", "Sandstone Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevSandstoneSlopesInvCornerDown.name", "Sandstone Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevSandstoneSlopesInvCornerUp.name", "Sandstone Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevSmoothSandstoneSlopesTruncCornerDown.name", "Smooth Sandstone Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevSmoothSandstoneSlopesTruncCornerUp.name", "Smooth Sandstone Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevSmoothSandstoneSlopesInvCornerDown.name", "Smooth Sandstone Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevSmoothSandstoneSlopesInvCornerUp.name", "Smooth Sandstone Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevChiseledSandstoneSlopesTruncCornerDown.name", "Chiseled Sandstone Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevChiseledSandstoneSlopesTruncCornerUp.name", "Chiseled Sandstone Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevChiseledSandstoneSlopesInvCornerDown.name", "Chiseled Sandstone Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevChiseledSandstoneSlopesInvCornerUp.name", "Chiseled Sandstone Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevDirtSlopesTruncCornerDown.name", "Dirt Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevDirtSlopesTruncCornerUp.name", "Dirt Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevDirtSlopesInvCornerDown.name", "Dirt Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevDirtSlopesInvCornerUp.name", "Dirt Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevStoneSlopesTruncCornerDown.name", "Stone Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevStoneSlopesTruncCornerUp.name", "Stone Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevStoneSlopesInvCornerDown.name", "Stone Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevStoneSlopesInvCornerUp.name", "Stone Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevStoneBrickSlopesTruncCornerDown.name", "Stone Brick Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevStoneBrickSlopesTruncCornerUp.name", "Stone Brick Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevStoneBrickSlopesInvCornerDown.name", "Stone Brick Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevStoneBrickSlopesInvCornerUp.name", "Stone Brick Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevSandSlopesTruncCornerDown.name", "Sand Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevSandSlopesTruncCornerUp.name", "Sand Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevSandSlopesInvCornerDown.name", "Sand Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevSandSlopesInvCornerUp.name", "Sand Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevSnowSlopesTruncCornerDown.name", "Snow Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevSnowSlopesTruncCornerUp.name", "Snow Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevSnowSlopesInvCornerDown.name", "Snow Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevSnowSlopesInvCornerUp.name", "Snow Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevGrassSlopesTruncCornerDown.name", "Grass Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevGrassSlopesTruncCornerUp.name", "Grass Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevGrassSlopesInvCornerDown.name", "Grass Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevGrassSlopesInvCornerUp.name", "Grass Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevBricksSlopesTruncCornerDown.name", "Brick Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevBricksSlopesTruncCornerUp.name", "Brick Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevBricksSlopesInvCornerDown.name", "Brick Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevBricksSlopesInvCornerUp.name", "Brick Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevGravelSlopesTruncCornerDown.name", "Gravel Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevGravelSlopesTruncCornerUp.name", "Gravel Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevGravelSlopesInvCornerDown.name", "Gravel Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevGravelSlopesInvCornerUp.name", "Gravel Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevGoldSlopesTruncCornerDown.name", "Gold Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevGoldSlopesTruncCornerUp.name", "Gold Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevGoldSlopesInvCornerDown.name", "Gold Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevGoldSlopesInvCornerUp.name", "Gold Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevSteelSlopesTruncCornerDown.name", "Iron Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevSteelSlopesTruncCornerUp.name", "Iron Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevSteelSlopesInvCornerDown.name", "Iron Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevSteelSlopesInvCornerUp.name", "Iron Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevObsidianSlopesTruncCornerDown.name", "Obsidian Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevObsidianSlopesTruncCornerUp.name", "Obsidian Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevObsidianSlopesInvCornerDown.name", "Obsidian Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevObsidianSlopesInvCornerUp.name", "Obsidian Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevNetherBrickSlopesTruncCornerDown.name", "Nether Brick Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevNetherBrickSlopesTruncCornerUp.name", "Nether Brick Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevNetherBrickSlopesInvCornerDown.name", "Nether Brick Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevNetherBrickSlopesInvCornerUp.name", "Nether Brick Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevDiamondSlopesTruncCornerDown.name", "Diamond Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevDiamondSlopesTruncCornerUp.name", "Diamond Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevDiamondSlopesInvCornerDown.name", "Diamond Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevDiamondSlopesInvCornerUp.name", "Diamond Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevWhiteWoolSlopesTruncCornerDown.name", "Wool Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevWhiteWoolSlopesTruncCornerUp.name", "Wool Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevWhiteWoolSlopesInvCornerDown.name", "Wool Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevWhiteWoolSlopesInvCornerUp.name", "Wool Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevBlackWoolSlopesTruncCornerDown.name", "Black Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevBlackWoolSlopesTruncCornerUp.name", "Black Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevBlackWoolSlopesInvCornerDown.name", "Black Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevBlackWoolSlopesInvCornerUp.name", "Black Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevRedWoolSlopesTruncCornerDown.name", "Red Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevRedWoolSlopesTruncCornerUp.name", "Red Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevRedWoolSlopesInvCornerDown.name", "Red Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevRedWoolSlopesInvCornerUp.name", "Red Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevGreenWoolSlopesTruncCornerDown.name", "Green Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevGreenWoolSlopesTruncCornerUp.name", "Green Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevGreenWoolSlopesInvCornerDown.name", "Green Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevGreenWoolSlopesInvCornerUp.name", "Green Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevBrownWoolSlopesTruncCornerDown.name", "Brown Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevBrownWoolSlopesTruncCornerUp.name", "Brown Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevBrownWoolSlopesInvCornerDown.name", "Brown Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevBrownWoolSlopesInvCornerUp.name", "Brown Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevBlueWoolSlopesTruncCornerDown.name", "Blue Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevBlueWoolSlopesTruncCornerUp.name", "Blue Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevBlueWoolSlopesInvCornerDown.name", "Blue Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevBlueWoolSlopesInvCornerUp.name", "Blue Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevPurpleWoolSlopesTruncCornerDown.name", "Purple Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevPurpleWoolSlopesTruncCornerUp.name", "Purple Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevPurpleWoolSlopesInvCornerDown.name", "Purple Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevPurpleWoolSlopesInvCornerUp.name", "Purple Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevCyanWoolSlopesTruncCornerDown.name", "Cyan Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevCyanWoolSlopesTruncCornerUp.name", "Cyan Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevCyanWoolSlopesInvCornerDown.name", "Cyan Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevCyanWoolSlopesInvCornerUp.name", "Cyan Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevSilverWoolSlopesTruncCornerDown.name", "Light Gray Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevSilverWoolSlopesTruncCornerUp.name", "Light Gray Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevSilverWoolSlopesInvCornerDown.name", "Light Gray Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevSilverWoolSlopesInvCornerUp.name", "Light Gray Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevGrayWoolSlopesTruncCornerDown.name", "Gray Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevGrayWoolSlopesTruncCornerUp.name", "Gray Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevGrayWoolSlopesInvCornerDown.name", "Gray Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevGrayWoolSlopesInvCornerUp.name", "Gray Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevPinkWoolSlopesTruncCornerDown.name", "Pink Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevPinkWoolSlopesTruncCornerUp.name", "Pink Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevPinkWoolSlopesInvCornerDown.name", "Pink Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevPinkWoolSlopesInvCornerUp.name", "Pink Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevLimeWoolSlopesTruncCornerDown.name", "Lime Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevLimeWoolSlopesTruncCornerUp.name", "Lime Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevLimeWoolSlopesInvCornerDown.name", "Lime Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevLimeWoolSlopesInvCornerUp.name", "Lime Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevYellowWoolSlopesTruncCornerDown.name", "Yellow Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevYellowWoolSlopesTruncCornerUp.name", "Yellow Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevYellowWoolSlopesInvCornerDown.name", "Yellow Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevYellowWoolSlopesInvCornerUp.name", "Yellow Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevLightBlueWoolSlopesTruncCornerDown.name", "Light Blue Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevLightBlueWoolSlopesTruncCornerUp.name", "Light Blue Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevLightBlueWoolSlopesInvCornerDown.name", "Light Blue Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevLightBlueWoolSlopesInvCornerUp.name", "Light Blue Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevMagentaWoolSlopesTruncCornerDown.name", "Magenta Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevMagentaWoolSlopesTruncCornerUp.name", "Magenta Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevMagentaWoolSlopesInvCornerDown.name", "Magenta Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevMagentaWoolSlopesInvCornerUp.name", "Magenta Interior Corner Inv");
        LanguageRegistry.instance().addStringLocalization("KaevOrangeWoolSlopesTruncCornerDown.name", "Orange Oblique Slope");
        LanguageRegistry.instance().addStringLocalization("KaevOrangeWoolSlopesTruncCornerUp.name", "Orange Oblique Slope Inv");
        LanguageRegistry.instance().addStringLocalization("KaevOrangeWoolSlopesInvCornerDown.name", "Orange Interior Corner");
        LanguageRegistry.instance().addStringLocalization("KaevOrangeWoolSlopesInvCornerUp.name", "Orange Interior Corner Inv");
    }
}