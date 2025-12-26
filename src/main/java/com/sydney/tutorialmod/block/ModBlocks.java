package com.sydney.tutorialmod.block;

import com.sydney.tutorialmod.TutorialMod;
import com.sydney.tutorialmod.block.custom.*;


import com.sydney.tutorialmod.block.custom.FlowerBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;

import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.*;


public class ModBlocks  {




















    public static final Block BELL_PEPPERS= registerBlockWithoutBlockItem("bell_peppers",
            new BellpepperCropBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "bell_peppers"))).noCollision()
                    .ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY).mapColor(MapColor.DARK_GREEN)));

    public static final Block TOMATO = registerBlockWithoutBlockItem("tomato",
            new Tomato(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "tomato")))));



    public static final Block STRAWBERRY = registerBlockWithoutBlockItem("strawberry",
            new Strawberry(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "strawberry")))));


    public static final Block CRANBERRY_BUSH = registerBlockWithoutBlockItem("cranberry_bush",
            new CranberryPlant(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "cranberry_bush")))));


    public static final Block DAHLIA = registerBlock("dahlia", new FlowerBlock(StatusEffects.SATURATION, 0.35F,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "dahlia")))));


    public static final Block POTTED_DAHLIA = registerBlock("potted_dahlia", new FlowerPotBlock(ModBlocks.DAHLIA, createFlowerPotSettings()
    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "potted_dahlia")))));



    public static final Block BLUEBELL = registerBlock("bluebell", new FlowerBlock(StatusEffects.SATURATION, 0.35F,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "bluebell")))));



    public static final Block POTTED_BLUEBELL = registerBlock("potted_bluebell", new FlowerPotBlock(ModBlocks.BLUEBELL, createFlowerPotSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "potted_bluebell")))));






    public static final Block OAK_GlASS_TRAPDOOR = registerBlock("oak_glass_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "oak_glass_trapdoor")))
                    .strength(2f).requiresTool().nonOpaque()));
    public static final Block CHERRY_GlASS_TRAPDOOR = registerBlock("cherry_glass_trapdoor",
            new TrapdoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "cherry_glass_trapdoor")))
                    .strength(2f).requiresTool().nonOpaque()));





  public   static final Block CHERRY_BARN_TRAPDOOR = registerBlock("cherry_barn_trapdoor",
            new TrapdoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "cherry_glass_trapdoor")))
                    .strength(2f).requiresTool().nonOpaque()));



    public static final Block SAWMILL  = registerBlock("sawmill", SawmillBlock::new);










    private static Block registerBlockWithoutBlockItem(String name, Block block)






    {


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



