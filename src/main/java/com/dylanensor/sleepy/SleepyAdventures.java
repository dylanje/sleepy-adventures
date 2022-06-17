package com.dylanensor.sleepy;

import com.dylanensor.sleepy.block.SquishyBlock;
import com.dylanensor.sleepy.entity.SquishyEntity;
import com.dylanensor.sleepy.init.EntityInit;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SleepyAdventures implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final String MOD_ID = "sleepy";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public static final ItemGroup SLEEPY_GROUP = FabricItemGroupBuilder.build(
        new Identifier(MOD_ID, "general"),
        () -> new ItemStack(Blocks.COBBLED_DEEPSLATE));

    public static MutableText i18n(String key, Object... args) {
        return Text.translatable(MOD_ID + "." + key, args);
    }

    public static final Item SQUISHY_BALL = new Item(new FabricItemSettings().group(SleepyAdventures.SLEEPY_GROUP));
    public static final SquishyBlock SQUISHY_BLOCK = new SquishyBlock(FabricBlockSettings.copyOf(Blocks.SLIME_BLOCK));

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info("sleepy time");
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "squishy_ball"), SQUISHY_BALL);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "squishy_block"), SQUISHY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"squishy_block"), new BlockItem(SQUISHY_BLOCK, new FabricItemSettings().group(SLEEPY_GROUP)));

        EntityInit.init();
        LOGGER.info("slept through entity init");
    }
}
