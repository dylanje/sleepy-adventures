package com.dylanensor.sleepy;

import com.dylanensor.sleepy.client.renderer.SquishyEntityRenderer;
import com.dylanensor.sleepy.entity.SquishyEntity;
import com.dylanensor.sleepy.init.RenderInit;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class SleepyAdventuresClient implements ClientModInitializer {
    @Override
    public void onInitializeClient(){
        RenderInit.init();
    }
}
