package net.minecraft.src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FurnaceRecipes
{
    private static final FurnaceRecipes smeltingBase = new FurnaceRecipes();

    /** The list of smelting results. */
    private Map smeltingList = new HashMap();
    private Map experienceList = new HashMap();
    private HashMap<List<Integer>, ItemStack> metaSmeltingList = new HashMap<List<Integer>, ItemStack>();
    private HashMap<List<Integer>, Float> metaExperience = new HashMap<List<Integer>, Float>();

    /**
     * Used to call methods addSmelting and getSmeltingResult.
     */
    public static final FurnaceRecipes smelting()
    {
        return smeltingBase;
    }

    private FurnaceRecipes()
    {
        this.addSmelting(Block.oreIron.blockID, new ItemStack(Item.ingotIron), 0.7F);
        this.addSmelting(Block.oreGold.blockID, new ItemStack(Item.ingotGold), 1.0F);
        this.addSmelting(Block.oreDiamond.blockID, new ItemStack(Item.diamond), 1.0F);
        this.addSmelting(Block.sand.blockID, new ItemStack(Block.glass), 0.1F);
        this.addSmelting(Item.porkRaw.shiftedIndex, new ItemStack(Item.porkCooked), 0.35F);
        this.addSmelting(Item.beefRaw.shiftedIndex, new ItemStack(Item.beefCooked), 0.35F);
        this.addSmelting(Item.chickenRaw.shiftedIndex, new ItemStack(Item.chickenCooked), 0.35F);
        this.addSmelting(Item.fishRaw.shiftedIndex, new ItemStack(Item.fishCooked), 0.35F);
        this.addSmelting(Block.cobblestone.blockID, new ItemStack(Block.stone), 0.1F);
        this.addSmelting(Item.clay.shiftedIndex, new ItemStack(Item.brick), 0.3F);
        this.addSmelting(Block.cactus.blockID, new ItemStack(Item.dyePowder, 1, 2), 0.2F);
        this.addSmelting(Block.wood.blockID, new ItemStack(Item.coal, 1, 1), 0.15F);
        this.addSmelting(Block.oreEmerald.blockID, new ItemStack(Item.emerald), 1.0F);
        this.addSmelting(Item.field_82794_bL.shiftedIndex, new ItemStack(Item.field_82795_bM), 0.35F);
        this.addSmelting(Block.oreCoal.blockID, new ItemStack(Item.coal), 0.1F);
        this.addSmelting(Block.oreRedstone.blockID, new ItemStack(Item.redstone), 0.7F);
        this.addSmelting(Block.oreLapis.blockID, new ItemStack(Item.dyePowder, 1, 4), 0.2F);
    }

    /**
     * Adds a smelting recipe.
     */
    public void addSmelting(int par1, ItemStack par2ItemStack, float par3)
    {
        this.smeltingList.put(Integer.valueOf(par1), par2ItemStack);
        this.experienceList.put(Integer.valueOf(par2ItemStack.itemID), Float.valueOf(par3));
    }

    /**
     * Returns the smelting result of an item.
     * Deprecated in favor of a metadata sensitive version
     */
    @Deprecated
    public ItemStack getSmeltingResult(int par1)
    {
        return (ItemStack)this.smeltingList.get(Integer.valueOf(par1));
    }

    public Map getSmeltingList()
    {
        return this.smeltingList;
    }

    @Deprecated //In favor of ItemStack sensitive version
    public float getExperience(int par1)
    {
        return this.experienceList.containsKey(Integer.valueOf(par1)) ? ((Float)this.experienceList.get(Integer.valueOf(par1))).floatValue() : 0.0F;
    }

    /**
     * Add a metadata-sensitive furnace recipe
     * @param itemID The Item ID
     * @param metadata The Item Metadata
     * @param itemstack The ItemStack for the result
     */
    @Deprecated //In favor of the exp version, will remove next major MC version.
    public void addSmelting(int itemID, int metadata, ItemStack itemstack)
    {
        addSmelting(itemID, metadata, itemstack, 0.0f);
    }

    /**
     * A metadata sensitive version of adding a furnace recipe.
     */
    public void addSmelting(int itemID, int metadata, ItemStack itemstack, float experience)
    {
        metaSmeltingList.put(Arrays.asList(itemID, metadata), itemstack);
        metaExperience.put(Arrays.asList(itemID, metadata), experience);
    }

    /**
     * Used to get the resulting ItemStack form a source ItemStack
     * @param item The Source ItemStack
     * @return The result ItemStack
     */
    public ItemStack getSmeltingResult(ItemStack item) 
    {
        if (item == null)
        {
            return null;
        }
        ItemStack ret = (ItemStack)metaSmeltingList.get(Arrays.asList(item.itemID, item.getItemDamage()));
        if (ret != null) 
        {
            return ret;
        }
        return (ItemStack)smeltingList.get(Integer.valueOf(item.itemID));
    }

    /**
     * Grabs the amount of base experience for this item to give when pulled from the furnace slot.
     */
    public float getExperience(ItemStack item)
    {
        if (item == null || item.getItem() == null)
        {
            return 0;
        }
        float ret = item.getItem().getSmeltingExperience(item);
        if (ret < 0 && metaExperience.containsKey(Arrays.asList(item.itemID, item.getItemDamage())))
        {
            ret = metaExperience.get(Arrays.asList(item.itemID, item.getItemDamage()));
        }
        if (ret < 0 && experienceList.containsKey(item.itemID))
        {
            ret = ((Float)experienceList.get(item.itemID)).floatValue();
        }
        return (ret < 0 ? 0 : ret);
    }
}
