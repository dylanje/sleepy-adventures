package com.dylanensor.sleepy.init;

import com.dylanensor.sleepy.entity.SquishyEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.dylanensor.sleepy.SleepyAdventures.MOD_ID;

public class EntityInit {
    public static final EntityType<SquishyEntity> SQUISHY_ENTITY = FabricEntityTypeBuilder.create(SpawnGroup.WATER_AMBIENT, SquishyEntity::new).dimensions(EntityDimensions.fixed(0.22F,0.81F)).build();

    public static void init() {
        Registry.register(Registry.ENTITY_TYPE, new Identifier(MOD_ID, "squishy"), SQUISHY_ENTITY);

        FabricDefaultAttributeRegistry.register(SQUISHY_ENTITY,SquishyEntity.createSquidAttributes());
    }
}