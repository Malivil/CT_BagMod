//Date: 12/3/2011 9:26:04 PM
//Template version 1.1
//Java generated by Techne
//Keep in mind that you still need to fill in some blanks
//- ZeuX

package mal.teleportrelay.common;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTeleportRelay extends ModelBase {
	private final ModelRenderer dishModel;
	private final ModelRenderer baseModel;

	public ModelTeleportRelay() {
		textureWidth = 32;
		textureHeight = 32;

		setTextureOffset("Dish.Dish_Frame_Bottom", 0, 0);
		setTextureOffset("Dish.Dish_Back", 0, 0);
		setTextureOffset("Dish.Dish_Frame_Right", 0, 0);
		setTextureOffset("Dish.Dish_Frame_Left", 0, 0);
		setTextureOffset("Dish.Dish_Frame_Top", 0, 0);
		setTextureOffset("Base.Bipod_Stalk", 3, 3);
		setTextureOffset("Base.Bipod_Base", 5, 5);

		dishModel = new ModelRenderer(this, "Dish");
		dishModel.setRotationPoint(-4F, 15F, 1F);
		setRotation(dishModel, 0F, 0F, 0F);
		dishModel.mirror = false;
		dishModel.addBox("Dish_Frame_Bottom", 1F, 6F, 1F, 5, 1, 1);
		dishModel.addBox("Dish_Back", 0F, 0F, 0F, 7, 7, 1);
		dishModel.addBox("Dish_Frame_Right", 0F, 0F, 1F, 1, 7, 1);
		dishModel.addBox("Dish_Frame_Left", 6F, 0F, 1F, 1, 7, 1);
		dishModel.addBox("Dish_Frame_Top", 1F, 0F, 1F, 5, 1, 1);

		baseModel = new ModelRenderer(this, "Base");
		baseModel.setRotationPoint(-1F, 12F, 0F);
		setRotation(baseModel, 0F, 0F, (float)Math.PI);
		baseModel.mirror = false;
		baseModel.addBox("Bipod_Stalk", -1F, -6F, 0F, 1, 9, 1);
		baseModel.addBox("Bipod_Base", -4F, 3F, -3F, 7, 1, 7);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		renderModel(f5);
	}

	public void renderModel(final float f) {
		dishModel.render(f);
		baseModel.render(f);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
