package io.github.fallout015.two.client.renderer.entity;

import com.mojang.blaze3d.matrix.MatrixStack;

import io.github.fallout015.two.entity.monster.IceSlimeEntity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.SlimeGelLayer;
import net.minecraft.client.renderer.entity.model.SlimeModel;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class IceSlimeRenderer extends MobRenderer<IceSlimeEntity, SlimeModel<IceSlimeEntity>> {
	private static final ResourceLocation TEXTURE = new ResourceLocation("two", "textures/entity/slime/ice_slime.png");

	public IceSlimeRenderer(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new SlimeModel<>(16), 0.25f);
		this.addLayer(new SlimeGelLayer<>(this));
	}

	public void render(IceSlimeEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
		this.shadowSize = 0.25F * (float)entityIn.getSlimeSize();
		super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
	}
	@Override
	public ResourceLocation getEntityTexture(IceSlimeEntity entity) {
		return TEXTURE;
	}
	protected void preRenderCallback(IceSlimeEntity entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
		matrixStackIn.scale(0.999F, 0.999F, 0.999F);
		matrixStackIn.translate(0.0D, (double)0.001F, 0.0D);
		float f1 = (float)entitylivingbaseIn.getSlimeSize();
		float f2 = MathHelper.lerp(partialTickTime, entitylivingbaseIn.prevSquishFactor, entitylivingbaseIn.squishFactor) / (f1 * 0.5F + 1.0F);
		float f3 = 1.0F / (f2 + 1.0F);
		matrixStackIn.scale(f3 * f1, 1.0F / f3 * f1, f3 * f1);
	}
}