package com.dylanensor.sleepy.client.renderer;

import com.dylanensor.sleepy.client.model.SquishyEntityModel;
import com.dylanensor.sleepy.entity.SquishyEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

import static com.dylanensor.sleepy.SleepyAdventures.MOD_ID;

public class SquishyEntityRenderer extends MobEntityRenderer<SquishyEntity, SquishyEntityModel> {
    public SquishyEntityRenderer(EntityRenderDispatcher entityRenderDispatcher){
        super(entityRenderDispatcher, new SquishyEntityModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(SquishyEntity entity) {
        return new Identifier(MOD_ID,"textures/entity/squishy/squishy.png");
    }
}
