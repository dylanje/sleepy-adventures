package com.dylanensor.sleepy.init;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

import static com.dylanensor.sleepy.SleepyAdventures.MOD_ID;

@Environment(EnvType.CLIENT)
public class RenderInit {

    public static void init() {
        public static final EntityModelLayer SQUISHY_LAYER = new EntityModeLlayer(new Identifier(MOD_ID:squishy_render_layer), "squishy_render_layer");
        EntityRendererRegistry.register(EntityInit.SQUISHY_ENTITY, SquishyEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(SQUISHY_LAYER, SquishyEntityModel::getTexuredModelData);
        // public static final EntityModelLayer STONE_GOLEM_LAYER = new EntityModelLayer(new Identifier("adventurez:stone_golem_render_layer"), "stone_golem_render_layer");
        // EntityRendererRegistry.register(EntityInit.STONEGOLEM_ENTITY, StoneGolemRenderer::new);
        // EntityModelLayerRegistry.registerModelLayer(STONE_GOLEM_LAYER, StoneGolemModel::getTexturedModelData);

        // Network
        // ClientPlayNetworking.registerGlobalReceiver(EntitySpawnPacket.ID, EntitySpawnPacket::onPacket);
    }
}
