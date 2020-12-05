package noobanidus.mods.layers.client.layers;

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
  public RenderType getRenderType() {
    return BAUBLES_RENDERER;
  }
}
