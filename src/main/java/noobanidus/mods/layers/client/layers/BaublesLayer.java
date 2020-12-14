package noobanidus.mods.layers.client.layers;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.AbstractEyesLayer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import noobanidus.mods.layers.client.render.LayersRenderType;

public class BaublesLayer<T extends Entity, M extends EntityModel<T>> extends AbstractEyesLayer<T, M> {
  public final RenderType BAUBLES_RENDERER;

  public BaublesLayer(IEntityRenderer<T, M> p_i226039_1_, ResourceLocation texture) {
    super(p_i226039_1_);
    BAUBLES_RENDERER = LayersRenderType.get(texture);
  }

  @Override
  public void render(MatrixStack p_225628_1_, IRenderTypeBuffer p_225628_2_, int p_225628_3_, T p_225628_4_, float p_225628_5_, float p_225628_6_, float p_225628_7_, float p_225628_8_, float p_225628_9_, float p_225628_10_) {
    if (!p_225628_4_.isInvisible()) {
      super.render(p_225628_1_, p_225628_2_, p_225628_3_, p_225628_4_, p_225628_5_, p_225628_6_, p_225628_7_, p_225628_8_, p_225628_9_, p_225628_10_);
    }
  }

  @Override
  public RenderType getRenderType() {
    return BAUBLES_RENDERER;
  }
}
