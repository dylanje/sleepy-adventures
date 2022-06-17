package com.dylanensor.sleepy.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.world.World;

public class SquishyEntity extends SquidEntity {
    public SquishyEntity(EntityType<? extends SquidEntity> entityType, World world) {
        super(entityType, world);
    }
}
