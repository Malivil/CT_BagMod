package net.minecraft.world.gen.layer;

import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;

public class GenLayerBiome extends GenLayer
{
    /** this sets all the biomes that are allowed to appear in the overworld */
    private BiomeGenBase[] allowedBiomes;

    public GenLayerBiome(long par1, GenLayer par3GenLayer, WorldType par4WorldType)
    {
        super(par1);
        this.allowedBiomes = par4WorldType.getBiomesForWorldType();
        this.parent = par3GenLayer;
    }

    /**
     * Returns a list of integer values generated by this layer. These may be interpreted as temperatures, rainfall
     * amounts, or biomeList[] indices based on the particular GenLayer subclass.
     */
    public int[] getInts(int par1, int par2, int par3, int par4)
    {
        int[] var5 = this.parent.getInts(par1, par2, par3, par4);
        int[] var6 = IntCache.getIntCache(par3 * par4);

        for (int var7 = 0; var7 < par4; ++var7)
        {
            for (int var8 = 0; var8 < par3; ++var8)
            {
                this.initChunkSeed((long)(var8 + par1), (long)(var7 + par2));
                int var9 = var5[var8 + var7 * par3];

                if (var9 == 0)
                {
                    var6[var8 + var7 * par3] = 0;
                }
                else if (var9 == BiomeGenBase.mushroomIsland.biomeID)
                {
                    var6[var8 + var7 * par3] = var9;
                }
                else if (var9 == 1)
                {
                    var6[var8 + var7 * par3] = this.allowedBiomes[this.nextInt(this.allowedBiomes.length)].biomeID;
                }
                else
                {
                    int var10 = this.allowedBiomes[this.nextInt(this.allowedBiomes.length)].biomeID;

                    if (var10 == BiomeGenBase.taiga.biomeID)
                    {
                        var6[var8 + var7 * par3] = var10;
                    }
                    else
                    {
                        var6[var8 + var7 * par3] = BiomeGenBase.icePlains.biomeID;
                    }
                }
            }
        }

        return var6;
    }
}
