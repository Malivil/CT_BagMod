package net.minecraft.src;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelZombieVillager extends ModelBiped
{
    public ModelZombieVillager()
    {
        this(0.0F, 0.0F, false);
    }

    public ModelZombieVillager(float par1, float par2, boolean par3)
    {
        super(par1, 0.0F, 64, par3 ? 32 : 64);

        if (par3)
        {
            this.bipedHead = new ModelRenderer(this, 0, 0);
            this.bipedHead.addBox(-4.0F, -10.0F, -4.0F, 8, 6, 8, par1);
            this.bipedHead.setRotationPoint(0.0F, 0.0F + par2, 0.0F);
        }
        else
        {
            this.bipedHead = new ModelRenderer(this);
            this.bipedHead.setRotationPoint(0.0F, 0.0F + par2, 0.0F);
            this.bipedHead.setTextureOffset(0, 32).addBox(-4.0F, -10.0F, -4.0F, 8, 10, 8, par1);
            this.bipedHead.setTextureOffset(24, 32).addBox(-1.0F, -3.0F, -6.0F, 2, 4, 2, par1);
        }
    }

    public int func_82897_a()
    {
        return 10;
    }

    /**
     * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
     * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
     * "far" arms and legs can swing at most.
     */
    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
    {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
        float var8 = MathHelper.sin(this.onGround * (float)Math.PI);
        float var9 = MathHelper.sin((1.0F - (1.0F - this.onGround) * (1.0F - this.onGround)) * (float)Math.PI);
        this.bipedRightArm.rotateAngleZ = 0.0F;
        this.bipedLeftArm.rotateAngleZ = 0.0F;
        this.bipedRightArm.rotateAngleY = -(0.1F - var8 * 0.6F);
        this.bipedLeftArm.rotateAngleY = 0.1F - var8 * 0.6F;
        this.bipedRightArm.rotateAngleX = -((float)Math.PI / 2F);
        this.bipedLeftArm.rotateAngleX = -((float)Math.PI / 2F);
        this.bipedRightArm.rotateAngleX -= var8 * 1.2F - var9 * 0.4F;
        this.bipedLeftArm.rotateAngleX -= var8 * 1.2F - var9 * 0.4F;
        this.bipedRightArm.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
        this.bipedLeftArm.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
        this.bipedRightArm.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
        this.bipedLeftArm.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;
    }
}
