// Date: 10/11/2014 10:40:57
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package tardis.client.renderer.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class TardisOctagonModel extends ModelBase
{
	//fields
	ModelRenderer Base1;
	ModelRenderer Base2;
	ModelRenderer Arm1;
	ModelRenderer Arm2;
	ModelRenderer Arm3;
	ModelRenderer Arm4;
	ModelRenderer Arm5;
	ModelRenderer Arm6;
	ModelRenderer Arm7;
	ModelRenderer Arm8;
	ModelRenderer Stick1;
	ModelRenderer Stick2;
	ModelRenderer Stick3;
	ModelRenderer Stick4;
	
	public TardisOctagonModel()
	{
		textureWidth = 128;
		textureHeight = 128;
	
		Base1 = new ModelRenderer(this, 0, -32);
		Base1.addBox(-16F, 0F, -16F, 32, 4, 32);
		Base1.setRotationPoint(0F, 0F, 0F);
		Base1.setTextureSize(128, 128);
		Base1.mirror = true;
		setRotation(Base1, 0F, 0F, 0F);
		Base2 = new ModelRenderer(this, 0, 4);
		Base2.addBox(-16F, 0F, -16F, 32, 4, 32);
		Base2.setRotationPoint(0F, 0F, 0F);
		Base2.setTextureSize(128, 128);
		Base2.mirror = true;
		setRotation(Base2, 0F, 0.7853982F, 0F);
		Arm1 = new ModelRenderer(this, 0, 4);
		Arm1.addBox(-0.5F, -0.8F, -0.5F, 1, 5, 1);
		Arm1.setRotationPoint(16F, 0F, 6.6F);
		Arm1.setTextureSize(128, 128);
		Arm1.mirror = true;
		setRotation(Arm1, 0F, -0.3926991F, 0F);
		Arm2 = new ModelRenderer(this, 4, 4);
		Arm2.addBox(-0.5F, -0.8F, -0.5F, 1, 5, 1);
		Arm2.setRotationPoint(-16F, 0F, -6.6F);
		Arm2.setTextureSize(128, 128);
		Arm2.mirror = true;
		setRotation(Arm2, 0F, -0.3926991F, 0F);
		Arm3 = new ModelRenderer(this, 8, 4);
		Arm3.addBox(-0.5F, -0.8F, -0.5F, 1, 5, 1);
		Arm3.setRotationPoint(16F, 0F, -6.6F);
		Arm3.setTextureSize(128, 128);
		Arm3.mirror = true;
		setRotation(Arm3, 0F, 0.3926991F, 0F);
		Arm4 = new ModelRenderer(this, 12, 4);
		Arm4.addBox(-0.5F, -0.8F, -0.5F, 1, 5, 1);
		Arm4.setRotationPoint(-16F, 0F, 6.6F);
		Arm4.setTextureSize(128, 128);
		Arm4.mirror = true;
		setRotation(Arm4, 0F, 0.3926991F, 0F);
		Arm5 = new ModelRenderer(this, 12, 10);
		Arm5.addBox(-0.5F, -0.8F, -0.5F, 1, 5, 1);
		Arm5.setRotationPoint(6.6F, 0F, 16F);
		Arm5.setTextureSize(128, 128);
		Arm5.mirror = true;
		setRotation(Arm5, 0F, 0.3926991F, 0F);
		Arm6 = new ModelRenderer(this, 8, 10);
		Arm6.addBox(-0.5F, -0.8F, -0.5F, 1, 5, 1);
		Arm6.setRotationPoint(-6.6F, 0F, 16F);
		Arm6.setTextureSize(128, 128);
		Arm6.mirror = true;
		setRotation(Arm6, 0F, -0.3926991F, 0F);
		Arm7 = new ModelRenderer(this, 4, 10);
		Arm7.addBox(-0.5F, -0.8F, -0.5F, 1, 5, 1);
		Arm7.setRotationPoint(6.6F, 0F, -16F);
		Arm7.setTextureSize(128, 128);
		Arm7.mirror = true;
		setRotation(Arm7, 0F, -0.3926991F, 0F);
		Arm8 = new ModelRenderer(this, 0, 10);
		Arm8.addBox(-0.5F, -0.8F, -0.5F, 1, 5, 1);
		Arm8.setRotationPoint(-6.6F, 0F, -16F);
		Arm8.setTextureSize(128, 128);
		Arm8.mirror = true;
		setRotation(Arm8, 0F, 0.3926991F, 0F);
		Stick1 = new ModelRenderer(this, 0, 16);
		Stick1.addBox(0.4666667F, -0.8333333F, -0.5333334F, 13, 1, 1);
		Stick1.setRotationPoint(-7F, 4F, -16F);
		Stick1.setTextureSize(128, 128);
		Stick1.mirror = true;
		setRotation(Stick1, 0F, 0F, 0F);
		Stick2 = new ModelRenderer(this, 0, 18);
		Stick2.addBox(0.4666667F, -0.8333333F, -0.5333334F, 13, 1, 1);
		Stick2.setRotationPoint(-7F, 4F, 16F);
		Stick2.setTextureSize(128, 128);
		Stick2.mirror = true;
		setRotation(Stick2, 0F, 0F, 0F);
		Stick3 = new ModelRenderer(this, 0, 20);
		Stick3.addBox(0.4666667F, -0.8333333F, -0.5333334F, 13, 1, 1);
		Stick3.setRotationPoint(16F, 4F, 7F);
		Stick3.setTextureSize(128, 128);
		Stick3.mirror = true;
		setRotation(Stick3, 0F, 1.570796F, 0F);
		Stick4 = new ModelRenderer(this, 0, 22);
		Stick4.addBox(0.4666667F, -0.8333333F, -0.5333334F, 13, 1, 1);
		Stick4.setRotationPoint(-16F, 4F, 7F);
		Stick4.setTextureSize(128, 128);
		Stick4.mirror = true;
		setRotation(Stick4, 0F, 1.570796F, 0F);

	}
	
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		Base1.render(f5);
		Base2.render(f5);
		Arm1.render(f5);
		Arm2.render(f5);
		Arm3.render(f5);
		Arm4.render(f5);
		Arm5.render(f5);
		Arm6.render(f5);
		Arm7.render(f5);
		Arm8.render(f5);
		Stick1.render(f5);
		Stick2.render(f5);
		Stick3.render(f5);
		Stick4.render(f5);
	}
	
	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
	}

}
