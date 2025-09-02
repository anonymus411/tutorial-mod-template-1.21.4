package com.sydney.tutorialmod.block;

import com.sydney.tutorialmod.TutorialMod;
import com.sydney.tutorialmod.block.custom.*;


import com.sydney.tutorialmod.world.tree.ModSaplingGenerators;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
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









    public static final Block TOMATO = registerBlockWithoutBlockItem("tomato",
            new Tomato(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "tomato")))));

    public static final Block CAULIFLOWER= registerBlockWithoutBlockItem("cauliflower",
            new Cauliflower(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "cauliflower"))).noCollision()
                    .ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY).mapColor(MapColor.DARK_GREEN)));

    public static final Block STRAWBERRY = registerBlockWithoutBlockItem("strawberry",
            new Strawberry(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "strawberry")))));


    public static final Block SPRUCE_CHAIR = registerBlock("spruce_chair",
            new ChairBlock(AbstractBlock.Settings.create().nonOpaque()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "spruce_chair")))));


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


    ;public static final Block CHERRY_BARREL = registerBlock("cherry_barrel",
            new BarrelBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "cherry_barrel"))).mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.5F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block SPRUCE_BARREL = registerBlock("spruce_barrel",
            new BarrelBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "spruce_barrel"))).mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.5F).sounds(BlockSoundGroup.WOOD).burnable()));


    public static final Block MANGROVE_BARREL = registerBlock("mangrove_barrel",
            new BarrelBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "mangrove_barrel"))).mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.5F).sounds(BlockSoundGroup.WOOD).burnable()));


    public static final Block BIRCH_BARREL = registerBlock("birch_barrel",
            new BarrelBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "birch_barrel"))).mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.5F).sounds(BlockSoundGroup.WOOD).burnable()));



    public static final Block STACKED_RAW_GOLD_BLOCKS = registerBlock("stacked_raw_gold_blocks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "raw_pink_garnet_block")))
                    .strength(3f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));



       public static final Block OAK_GlASS_TRAPDOOR = registerBlock("oak_glass_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "oak_glass_trapdoor")))
                    .strength(2f).requiresTool().nonOpaque()));
    public static final Block CHERRY_GlASS_TRAPDOOR = registerBlock("cherry_glass_trapdoor",
            new TrapdoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "cherry_glass_trapdoor")))
                    .strength(2f).requiresTool().nonOpaque()));

public static final Block SAKURA_PLANKS = registerBlock("sakura_planks",
    new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK,Identifier.of(TutorialMod.MOD_ID,"sakura_planks")))));



    public static final WallSignBlock SAKURA_WALL_SIGN = (WallSignBlock) registerBlock("sakura_wall_sign",
            new WallSignBlock(WoodType.CHERRY,AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK,Identifier.of(TutorialMod.MOD_ID,"sakura_wall_sign")))));





  public   static final Block CHERRY_BARN_TRAPDOOR = registerBlock("cherry_barn_trapdoor",
            new TrapdoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, "cherry_glass_trapdoor")))
                    .strength(2f).requiresTool().nonOpaque()));

public static final HangingSignBlock SAKURA_HANGING_SIGN = (HangingSignBlock) registerBlock("sakura_hanging_sign",
        new HangingSignBlock(WoodType.CHERRY,AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK,Identifier.of(TutorialMod.MOD_ID,"sakura_hanging_sign")))));
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



