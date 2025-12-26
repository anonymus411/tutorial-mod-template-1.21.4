package com.sydney.tutorialmod.util;

import com.sydney.tutorialmod.TutorialMod;
import net.minecraft.block.BarrelBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.block.MapColor;
import net.minecraft.client.sound.Sound;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class BlockTags {

    public static final TagKey<Block> BARRELS = createTag("barrels");

    public static final TagKey<Block> NEEDS_PINK_GARNET_TOOL = createTag("needs_pink_garnet_tool");
    public static final TagKey<Block> INCORRECT_FOR_PINK_GARNET_TOOL = createTag("incorrect_for_pink_garnet_tool");

    public static final TagKey<Block> CHERRY_BARN_TRAPDOOR = createTag("cherry_barn_trapdoor");
    public static final TagKey<Block> CHERRY_GLASS_TRAPDOOR = createTag("cherry_glass_trapdoor");
public static final TagKey<Block> DAHLIA = createTag("potted_dahlia")

    ;














    public static final TagKey<Block> GLASS_TRAPDOORS = createTag("glass_trapdoors");
    public static final TagKey<Block> BARN_TRAPDOORS = createTag("barn_trapdoors");


    private static TagKey<net.minecraft.block.Block> createTag(String name) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, name));

            }
}



