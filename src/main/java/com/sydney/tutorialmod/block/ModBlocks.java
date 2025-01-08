package com.sydney.tutorialmod.block;

import com.sydney.tutorialmod.TutorialMod;
import com.sydney.tutorialmod.block.custom.Cauliflower;
import com.sydney.tutorialmod.block.custom.Tomato;
import com.sydney.tutorialmod.sound.ModSounds;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.client.sound.Sound;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {


    public static final Block TOMATO = registerBlockWithoutBlockItem("tomato",
            new Tomato(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "tomato")))));

    public static final Block CAULIFLOWER= registerBlockWithoutBlockItem("cauliflower",
            new Cauliflower(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "cauliflower"))).noCollision()
                    .ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY).mapColor(MapColor.DARK_GREEN)));






    public static final Block OAK_GlASS_TRAPDOOR = registerBlock("oak_glass_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "oak_glass_trapdoor")))
                    .strength(2f).requiresTool().nonOpaque()));
    public static final Block CHERRY_GlASS_TRAPDOOR = registerBlock("cherry_glass_trapdoor",
            new TrapdoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "cherry_glass_trapdoor")))
                    .strength(2f).requiresTool().nonOpaque()));



    public static final Block CHERRY_BARN_TRAPDOOR = registerBlock("cherry_barn_trapdoor",
            new TrapdoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "cherry_glass_trapdoor")))
                    .strength(2f).requiresTool().nonOpaque()));


    private static Block registerBlockWithoutBlockItem(String name, Block block) {


        return Registry.register(Registries.BLOCK, Identifier.of(TutorialMod.MOD_ID, name), block);

    }


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TutorialMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, name))).useBlockPrefixedTranslationKey()));
    }

    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering Mod Blocks for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {

        });
    }
}



