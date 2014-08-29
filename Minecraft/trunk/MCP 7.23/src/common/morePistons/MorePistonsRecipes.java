package morePistons;

import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class MorePistonsRecipes
{
    public MorePistonsRecipes()
    {
    	GameRegistry.addRecipe(new ItemStack(MorePistons.doublePistonBase, 1), new Object[] {"XXX", " Y ", " Z ", 'X', Block.planks, 'Y', Item.ingotIron, 'Z', Block.pistonBase});
    	GameRegistry.addRecipe(new ItemStack(MorePistons.doubleStickyPistonBase, 1), new Object[] {"Y", "X", 'X', MorePistons.doublePistonBase, 'Y', Item.slimeBall});
    	GameRegistry.addRecipe(new ItemStack(MorePistons.doubleStickyPistonBase, 1), new Object[] {"XXX", " Y ", " Z ", 'X', Block.planks, 'Y', Item.ingotIron, 'Z', Block.pistonStickyBase});
    	GameRegistry.addRecipe(new ItemStack(MorePistons.triplePistonBase, 1), new Object[] {"XXX", " Y ", " Z ", 'X', Block.planks, 'Y', Item.ingotIron, 'Z', MorePistons.doublePistonBase});
    	GameRegistry.addRecipe(new ItemStack(MorePistons.tripleStickyPistonBase, 1), new Object[] {"Y", "X", 'X', MorePistons.triplePistonBase, 'Y', Item.slimeBall});
    	GameRegistry.addRecipe(new ItemStack(MorePistons.tripleStickyPistonBase, 1), new Object[] {"XXX", " Y ", " Z ", 'X', Block.planks, 'Y', Item.ingotIron, 'Z', MorePistons.doubleStickyPistonBase});
    	GameRegistry.addRecipe(new ItemStack(MorePistons.quadruplePistonBase, 1), new Object[] {"XXX", " Y ", " Z ", 'X', Block.planks, 'Y', Item.ingotIron, 'Z', MorePistons.triplePistonBase});
    	GameRegistry.addRecipe(new ItemStack(MorePistons.quadrupleStickyPistonBase, 1), new Object[] {"Y", "X", 'X', MorePistons.quadruplePistonBase, 'Y', Item.slimeBall});
    	GameRegistry.addRecipe(new ItemStack(MorePistons.quadrupleStickyPistonBase, 1), new Object[] {"XXX", " Y ", " Z ", 'X', Block.planks, 'Y', Item.ingotIron, 'Z', MorePistons.tripleStickyPistonBase});
    	GameRegistry.addRecipe(new ItemStack(MorePistons.gravitationalPistonBase, 1), new Object[] {"Y", "X", 'X', Block.pistonBase, 'Y', Block.tnt});
    }
}
