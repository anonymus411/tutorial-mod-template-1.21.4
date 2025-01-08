package com.sydney.tutorialmod.util;

import com.sydney.tutorialmod.TutorialMod;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class BlockTags {
    public static final TagKey<Block> CHERRY_BARN_TRAPDOOR = createTag("cherry_barn_trapdoor");
    public static final TagKey<Block> CHERRY_GLASS_TRAPDOOR = createTag("cherry_glass_trapdoor");














    public static final TagKey<Block> GLASS_TRAPDOORS = createTag("glass_trapdoors");
    public static final TagKey<Block> BARN_TRAPDOORS = createTag("barn_trapdoors");


    private static TagKey<net.minecraft.block.Block> createTag(String name) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, name));
    }
}

