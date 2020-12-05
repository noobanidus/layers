package noobanidus.mods.layers.setup;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.passive.SnowGolemEntity;
import net.minecraft.entity.passive.horse.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import noobanidus.mods.layers.Layers;
import noobanidus.mods.layers.client.layers.BaublesLayer;

@OnlyIn(Dist.CLIENT)
public class ClientSetup {
  @SuppressWarnings("unchecked")
  public static void setup(FMLClientSetupEvent event) {
    event.enqueueWork(() -> {
      Minecraft mc = event.getMinecraftSupplier().get();
      EntityRendererManager manager = mc.getRenderManager();
      ResourceLocation skeleton = new ResourceLocation(Layers.MODID, "textures/skeleton_baubles.png");
      ResourceLocation llama = new ResourceLocation(Layers.MODID, "textures/llama_nose.png");
      ResourceLocation creeper = new ResourceLocation(Layers.MODID, "textures/creeper_sweater.png");
      ResourceLocation ghast = new ResourceLocation(Layers.MODID, "textures/ghast_baubles.png");
      ResourceLocation phantom = new ResourceLocation(Layers.MODID, "textures/phantom_baubles.png");
      ResourceLocation snow = new ResourceLocation(Layers.MODID, "textures/snow_buttons.png");
      ResourceLocation witch = new ResourceLocation(Layers.MODID, "textures/witch_green_hat.png");
      ResourceLocation chicken = new ResourceLocation(Layers.MODID, "textures/chicken_throat.png");
      ResourceLocation horse = new ResourceLocation(Layers.MODID, "textures/horse_nose.png");
      ResourceLocation enderman = new ResourceLocation(Layers.MODID, "textures/enderman_baubles.png");
      LivingRenderer<SkeletonEntity, EntityModel<SkeletonEntity>> renderer = (LivingRenderer<SkeletonEntity, EntityModel<SkeletonEntity>>) manager.renderers.get(EntityType.SKELETON);
      renderer.addLayer(new BaublesLayer<>(renderer, skeleton));
      LivingRenderer<WitherSkeletonEntity, EntityModel<WitherSkeletonEntity>> renderer2 = (LivingRenderer<WitherSkeletonEntity, EntityModel<WitherSkeletonEntity>>) manager.renderers.get(EntityType.WITHER_SKELETON);
      renderer2.addLayer(new BaublesLayer<>(renderer2, skeleton));
      LivingRenderer<LlamaEntity, EntityModel<LlamaEntity>> renderer3 = (LivingRenderer<LlamaEntity, EntityModel<LlamaEntity>>) manager.renderers.get(EntityType.LLAMA);
      renderer3.addLayer(new BaublesLayer<>(renderer3, llama));
      LivingRenderer<TraderLlamaEntity, EntityModel<TraderLlamaEntity>> renderer4 = (LivingRenderer<TraderLlamaEntity, EntityModel<TraderLlamaEntity>>) manager.renderers.get(EntityType.TRADER_LLAMA);
      renderer4.addLayer(new BaublesLayer<>(renderer4, llama));
      LivingRenderer<CreeperEntity, EntityModel<CreeperEntity>> renderer5 = (LivingRenderer<CreeperEntity, EntityModel<CreeperEntity>>) manager.renderers.get(EntityType.CREEPER);
      renderer5.addLayer(new BaublesLayer<>(renderer5, creeper));
      LivingRenderer<GhastEntity, EntityModel<GhastEntity>> renderer6 = (LivingRenderer<GhastEntity, EntityModel<GhastEntity>>) manager.renderers.get(EntityType.GHAST);
      renderer6.addLayer(new BaublesLayer<>(renderer6, ghast));
      LivingRenderer<PhantomEntity, EntityModel<PhantomEntity>> renderer7 = (LivingRenderer<PhantomEntity, EntityModel<PhantomEntity>>) manager.renderers.get(EntityType.PHANTOM);
      renderer7.addLayer(new BaublesLayer<>(renderer7, phantom));
      LivingRenderer<SnowGolemEntity, EntityModel<SnowGolemEntity>> renderer8 = (LivingRenderer<SnowGolemEntity, EntityModel<SnowGolemEntity>>) manager.renderers.get(EntityType.SNOW_GOLEM);
      renderer8.addLayer(new BaublesLayer<>(renderer8, snow));
      LivingRenderer<ChickenEntity, EntityModel<ChickenEntity>> renderer10 = (LivingRenderer<ChickenEntity, EntityModel<ChickenEntity>>) manager.renderers.get(EntityType.CHICKEN);
      renderer10.addLayer(new BaublesLayer<>(renderer10, chicken));
      LivingRenderer<HorseEntity, EntityModel<HorseEntity>> renderer11 = (LivingRenderer<HorseEntity, EntityModel<HorseEntity>>) manager.renderers.get(EntityType.HORSE);
      renderer11.addLayer(new BaublesLayer<>(renderer11, horse));
      LivingRenderer<DonkeyEntity, EntityModel<DonkeyEntity>> renderer12 = (LivingRenderer<DonkeyEntity, EntityModel<DonkeyEntity>>) manager.renderers.get(EntityType.DONKEY);
      LivingRenderer<MuleEntity, EntityModel<MuleEntity>> renderer13 = (LivingRenderer<MuleEntity, EntityModel<MuleEntity>>) manager.renderers.get(EntityType.MULE);
      LivingRenderer<ZombieHorseEntity, EntityModel<ZombieHorseEntity>> renderer14 = (LivingRenderer<ZombieHorseEntity, EntityModel<ZombieHorseEntity>>) manager.renderers.get(EntityType.ZOMBIE_HORSE);
      renderer12.addLayer(new BaublesLayer<>(renderer12, horse));
      renderer13.addLayer(new BaublesLayer<>(renderer13, horse));
      renderer14.addLayer(new BaublesLayer<>(renderer14, horse));
      LivingRenderer<EndermanEntity, EntityModel<EndermanEntity>> renderer15 = (LivingRenderer<EndermanEntity, EntityModel<EndermanEntity>>) manager.renderers.get(EntityType.ENDERMAN);
      renderer15.addLayer(new BaublesLayer<>(renderer15, enderman));
    });
  }

}
