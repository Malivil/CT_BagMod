package metadark.mods.SuperSlopes.Slopes;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.src.ModLoader;

public class ClientInit extends CommonInit
{
    public void registerBlockModel()
    {
        Slopes.SlopesRenderID = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(new RenderSlopes());
    }

    public void addLocalizations()
    {
        ModLoader.addLocalization("KaevWoodSlopesStairsUp.name", "Wood Stairs Inv");
        ModLoader.addLocalization("KaevWoodSlopesSlopeDown.name", "Wood Slope");
        ModLoader.addLocalization("KaevWoodSlopesSlopeUp.name", "Wood Slope Inv");
        ModLoader.addLocalization("KaevWoodSlopesSlopeSide.name", "Wood Corner");
        ModLoader.addLocalization("KaevCobblestoneSlopesStairsUp.name", "Cobblestone Stairs Inv");
        ModLoader.addLocalization("KaevCobblestoneSlopesSlopeDown.name", "Cobblestone Slope");
        ModLoader.addLocalization("KaevCobblestoneSlopesSlopeUp.name", "Cobblestone Slope Inv");
        ModLoader.addLocalization("KaevCobblestoneSlopesSlopeSide.name", "Cobblestone Corner");
        ModLoader.addLocalization("KaevGlassSlopesStairsUp.name", "Glass Stairs Inv");
        ModLoader.addLocalization("KaevGlassSlopesSlopeDown.name", "Glass Slope");
        ModLoader.addLocalization("KaevGlassSlopesSlopeUp.name", "Glass Slope Inv");
        ModLoader.addLocalization("KaevGlassSlopesSlopeSide.name", "Glass Corner");
        ModLoader.addLocalization("KaevSandstoneSlopesStairsUp.name", "Sandstone Stairs Inv");
        ModLoader.addLocalization("KaevSandstoneSlopesSlopeDown.name", "Sandstone Slope");
        ModLoader.addLocalization("KaevSandstoneSlopesSlopeUp.name", "Sandstone Slope Inv");
        ModLoader.addLocalization("KaevSandstoneSlopesSlopeSide.name", "Sandstone Corner");
        ModLoader.addLocalization("KaevDirtSlopesStairsUp.name", "Dirt Stairs Inv");
        ModLoader.addLocalization("KaevDirtSlopesSlopeDown.name", "Dirt Slope");
        ModLoader.addLocalization("KaevDirtSlopesSlopeUp.name", "Dirt Slope Inv");
        ModLoader.addLocalization("KaevDirtSlopesSlopeSide.name", "Dirt Corner");
        ModLoader.addLocalization("KaevStoneSlopesStairsUp.name", "Stone Stairs Inv");
        ModLoader.addLocalization("KaevStoneSlopesSlopeDown.name", "Stone Slope");
        ModLoader.addLocalization("KaevStoneSlopesSlopeUp.name", "Stone Slope Inv");
        ModLoader.addLocalization("KaevStoneSlopesSlopeSide.name", "Stone Corner");
        ModLoader.addLocalization("KaevSandSlopesStairsUp.name", "Sand Stairs Inv");
        ModLoader.addLocalization("KaevSandSlopesSlopeDown.name", "Sand Slope");
        ModLoader.addLocalization("KaevSandSlopesSlopeUp.name", "Sand Slope Inv");
        ModLoader.addLocalization("KaevSandSlopesSlopeSide.name", "Sand Corner");
        ModLoader.addLocalization("KaevSnowSlopesStairsUp.name", "Snow Stairs Inv");
        ModLoader.addLocalization("KaevSnowSlopesSlopeDown.name", "Snow Slope");
        ModLoader.addLocalization("KaevSnowSlopesSlopeUp.name", "Snow Slope Inv");
        ModLoader.addLocalization("KaevSnowSlopesSlopeSide.name", "Snow Corner");
        ModLoader.addLocalization("KaevGrassSlopesStairsUp.name", "Grass Stairs Inv");
        ModLoader.addLocalization("KaevGrassSlopesSlopeDown.name", "Grass Slope");
        ModLoader.addLocalization("KaevGrassSlopesSlopeUp.name", "Grass Slope Inv");
        ModLoader.addLocalization("KaevGrassSlopesSlopeSide.name", "Grass Corner");
        ModLoader.addLocalization("KaevBricksSlopesStairsUp.name", "Brick Stairs Inv");
        ModLoader.addLocalization("KaevBricksSlopesSlopeDown.name", "Brick Slope");
        ModLoader.addLocalization("KaevBricksSlopesSlopeUp.name", "Brick Slope Inv");
        ModLoader.addLocalization("KaevBricksSlopesSlopeSide.name", "Brick Corner");
        ModLoader.addLocalization("KaevGravelSlopesStairsUp.name", "Gravel Stairs Inv");
        ModLoader.addLocalization("KaevGravelSlopesSlopeDown.name", "Gravel Slope");
        ModLoader.addLocalization("KaevGravelSlopesSlopeUp.name", "Gravel Slope Inv");
        ModLoader.addLocalization("KaevGravelSlopesSlopeSide.name", "Gravel Corner");
        ModLoader.addLocalization("KaevGoldSlopesStairsUp.name", "Gold Stairs Inv");
        ModLoader.addLocalization("KaevGoldSlopesSlopeDown.name", "Gold Slope");
        ModLoader.addLocalization("KaevGoldSlopesSlopeUp.name", "Gold Slope Inv");
        ModLoader.addLocalization("KaevGoldSlopesSlopeSide.name", "Gold Corner");
        ModLoader.addLocalization("KaevSteelSlopesStairsUp.name", "Iron Stairs Inv");
        ModLoader.addLocalization("KaevSteelSlopesSlopeDown.name", "Iron Slope");
        ModLoader.addLocalization("KaevSteelSlopesSlopeUp.name", "Iron Slope Inv");
        ModLoader.addLocalization("KaevSteelSlopesSlopeSide.name", "Iron Corner");
        ModLoader.addLocalization("KaevObsidianSlopesStairsUp.name", "Obsidian Stairs Inv");
        ModLoader.addLocalization("KaevObsidianSlopesSlopeDown.name", "Obsidian Slope");
        ModLoader.addLocalization("KaevObsidianSlopesSlopeUp.name", "Obsidian Slope Inv");
        ModLoader.addLocalization("KaevObsidianSlopesSlopeSide.name", "Obsidian Corner");
        ModLoader.addLocalization("KaevDiamondSlopesStairsUp.name", "Diamond Stairs Inv");
        ModLoader.addLocalization("KaevDiamondSlopesSlopeDown.name", "Diamond Slope");
        ModLoader.addLocalization("KaevDiamondSlopesSlopeUp.name", "Diamond Slope Inv");
        ModLoader.addLocalization("KaevDiamondSlopesSlopeSide.name", "Diamond Corner");
        ModLoader.addLocalization("KaevWhiteWoolSlopesStairsUp.name", "Wool Stairs Inv");
        ModLoader.addLocalization("KaevWhiteWoolSlopesSlopeDown.name", "Wool Slope");
        ModLoader.addLocalization("KaevWhiteWoolSlopesSlopeUp.name", "Wool Slope Inv");
        ModLoader.addLocalization("KaevWhiteWoolSlopesSlopeSide.name", "Wool Corner");
        ModLoader.addLocalization("KaevBlackWoolSlopesStairsUp.name", "Black Stairs Inv");
        ModLoader.addLocalization("KaevBlackWoolSlopesSlopeDown.name", "Black Slope");
        ModLoader.addLocalization("KaevBlackWoolSlopesSlopeUp.name", "Black Slope Inv");
        ModLoader.addLocalization("KaevBlackWoolSlopesSlopeSide.name", "Black Corner");
        ModLoader.addLocalization("KaevRedWoolSlopesStairsUp.name", "Red Stairs Inv");
        ModLoader.addLocalization("KaevRedWoolSlopesSlopeDown.name", "Red Slope");
        ModLoader.addLocalization("KaevRedWoolSlopesSlopeUp.name", "Red Slope Inv");
        ModLoader.addLocalization("KaevRedWoolSlopesSlopeSide.name", "Red Corner");
        ModLoader.addLocalization("KaevGreenWoolSlopesStairsUp.name", "Green Stairs Inv");
        ModLoader.addLocalization("KaevGreenWoolSlopesSlopeDown.name", "Green Slope");
        ModLoader.addLocalization("KaevGreenWoolSlopesSlopeUp.name", "Green Slope Inv");
        ModLoader.addLocalization("KaevGreenWoolSlopesSlopeSide.name", "Green Corner");
        ModLoader.addLocalization("KaevBrownWoolSlopesStairsUp.name", "Brown Stairs Inv");
        ModLoader.addLocalization("KaevBrownWoolSlopesSlopeDown.name", "Brown Slope");
        ModLoader.addLocalization("KaevBrownWoolSlopesSlopeUp.name", "Brown Slope Inv");
        ModLoader.addLocalization("KaevBrownWoolSlopesSlopeSide.name", "Brown Corner");
        ModLoader.addLocalization("KaevBlueWoolSlopesStairsUp.name", "Blue Stairs Inv");
        ModLoader.addLocalization("KaevBlueWoolSlopesSlopeDown.name", "Blue Slope");
        ModLoader.addLocalization("KaevBlueWoolSlopesSlopeUp.name", "Blue Slope Inv");
        ModLoader.addLocalization("KaevBlueWoolSlopesSlopeSide.name", "Blue Corner");
        ModLoader.addLocalization("KaevPurpleWoolSlopesStairsUp.name", "Purple Stairs Inv");
        ModLoader.addLocalization("KaevPurpleWoolSlopesSlopeDown.name", "Purple Slope");
        ModLoader.addLocalization("KaevPurpleWoolSlopesSlopeUp.name", "Purple Slope Inv");
        ModLoader.addLocalization("KaevPurpleWoolSlopesSlopeSide.name", "Purple Corner");
        ModLoader.addLocalization("KaevCyanWoolSlopesStairsUp.name", "Cyan Stairs Inv");
        ModLoader.addLocalization("KaevCyanWoolSlopesSlopeDown.name", "Cyan Slope");
        ModLoader.addLocalization("KaevCyanWoolSlopesSlopeUp.name", "Cyan Slope Inv");
        ModLoader.addLocalization("KaevCyanWoolSlopesSlopeSide.name", "Cyan Corner");
        ModLoader.addLocalization("KaevSilverWoolSlopesStairsUp.name", "Light Gray Stairs Inv");
        ModLoader.addLocalization("KaevSilverWoolSlopesSlopeDown.name", "Light Gray Slope");
        ModLoader.addLocalization("KaevSilverWoolSlopesSlopeUp.name", "Light Gray Slope Inv");
        ModLoader.addLocalization("KaevSilverWoolSlopesSlopeSide.name", "Light Gray Corner");
        ModLoader.addLocalization("KaevGrayWoolSlopesStairsUp.name", "Gray Stairs Inv");
        ModLoader.addLocalization("KaevGrayWoolSlopesSlopeDown.name", "Gray Slope");
        ModLoader.addLocalization("KaevGrayWoolSlopesSlopeUp.name", "Gray Slope Inv");
        ModLoader.addLocalization("KaevGrayWoolSlopesSlopeSide.name", "Gray Corner");
        ModLoader.addLocalization("KaevPinkWoolSlopesStairsUp.name", "Pink Stairs Inv");
        ModLoader.addLocalization("KaevPinkWoolSlopesSlopeDown.name", "Pink Slope");
        ModLoader.addLocalization("KaevPinkWoolSlopesSlopeUp.name", "Pink Slope Inv");
        ModLoader.addLocalization("KaevPinkWoolSlopesSlopeSide.name", "Pink Corner");
        ModLoader.addLocalization("KaevLimeWoolSlopesStairsUp.name", "Lime Stairs Inv");
        ModLoader.addLocalization("KaevLimeWoolSlopesSlopeDown.name", "Lime Slope");
        ModLoader.addLocalization("KaevLimeWoolSlopesSlopeUp.name", "Lime Slope Inv");
        ModLoader.addLocalization("KaevLimeWoolSlopesSlopeSide.name", "Lime Corner");
        ModLoader.addLocalization("KaevYellowWoolSlopesStairsUp.name", "Yellow Stairs Inv");
        ModLoader.addLocalization("KaevYellowWoolSlopesSlopeDown.name", "Yellow Slope");
        ModLoader.addLocalization("KaevYellowWoolSlopesSlopeUp.name", "Yellow Slope Inv");
        ModLoader.addLocalization("KaevYellowWoolSlopesSlopeSide.name", "Yellow Corner");
        ModLoader.addLocalization("KaevLightBlueWoolSlopesStairsUp.name", "Light Blue Stairs Inv");
        ModLoader.addLocalization("KaevLightBlueWoolSlopesSlopeDown.name", "Light Blue Slope");
        ModLoader.addLocalization("KaevLightBlueWoolSlopesSlopeUp.name", "Light Blue Slope Inv");
        ModLoader.addLocalization("KaevLightBlueWoolSlopesSlopeSide.name", "Light Blue Corner");
        ModLoader.addLocalization("KaevMagentaWoolSlopesStairsUp.name", "Magenta Stairs Inv");
        ModLoader.addLocalization("KaevMagentaWoolSlopesSlopeDown.name", "Magenta Slope");
        ModLoader.addLocalization("KaevMagentaWoolSlopesSlopeUp.name", "Magenta Slope Inv");
        ModLoader.addLocalization("KaevMagentaWoolSlopesSlopeSide.name", "Magenta Corner");
        ModLoader.addLocalization("KaevOrangeWoolSlopesStairsUp.name", "Orange Stairs Inv");
        ModLoader.addLocalization("KaevOrangeWoolSlopesSlopeDown.name", "Orange Slope");
        ModLoader.addLocalization("KaevOrangeWoolSlopesSlopeUp.name", "Orange Slope Inv");
        ModLoader.addLocalization("KaevOrangeWoolSlopesSlopeSide.name", "Orange Corner");
    }
}
