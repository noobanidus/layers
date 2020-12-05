package noobanidus.mods.layers.client.render;

import net.minecraft.client.renderer.RenderState;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.util.ResourceLocation;

public class LayersRenderType extends RenderType {
  public LayersRenderType(String p_i225992_1_, VertexFormat p_i225992_2_, int p_i225992_3_, int p_i225992_4_, boolean p_i225992_5_, boolean p_i225992_6_, Runnable p_i225992_7_, Runnable p_i225992_8_) {
    super(p_i225992_1_, p_i225992_2_, p_i225992_3_, p_i225992_4_, p_i225992_5_, p_i225992_6_, p_i225992_7_, p_i225992_8_);
  }

  public static RenderType get(ResourceLocation p_228652_0_) {
    TextureState lvt_1_1_ = new TextureState(p_228652_0_, false, false);
    return makeType("layers_layer", DefaultVertexFormats.ENTITY, 7, 256, false, true, RenderType.State.getBuilder().texture(lvt_1_1_).transparency(RenderState.NO_TRANSPARENCY).writeMask(COLOR_WRITE).fog(RenderState.NO_FOG).cull(RenderState.CULL_DISABLED).lightmap(RenderState.LIGHTMAP_DISABLED).alpha(RenderState.DEFAULT_ALPHA).overlay(RenderState.OVERLAY_ENABLED).build(false));
  }
}
