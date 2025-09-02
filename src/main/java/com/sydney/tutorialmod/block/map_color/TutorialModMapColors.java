package com.sydney.tutorialmod.block.map_color;

import com.sydney.tutorialmod.TutorialMod;
import com.sydney.tutorialmod.block.helper.BlockBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class TutorialModMapColors {

    public static final MapColor SAKURA_BARK = MapColor.TERRACOTTA_BROWN;
    public static final MapColor SAKURA_WOOD = MapColor.TERRACOTTA_BROWN;

    private static RegistryKey<Block> keyOf(String id) {
        return RegistryKey.of(RegistryKeys.BLOCK, TutorialMod.MOD_ID(id));
    }

    private static Block register(RegistryKey<Block> key, BlockBuilder builder) {
        return builder.register(key);
    }

    private static Block register(String id, BlockBuilder builder) {
        return register(keyOf(id), builder);
    }
}
