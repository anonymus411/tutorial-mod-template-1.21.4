package com.sydney.tutorialmod.block;

import com.sydney.tutorialmod.TutorialMod;
import com.sydney.tutorialmod.block.helper.BlockBuilder;
import com.sydney.tutorialmod.block.helper.BlockFactory;
import com.sydney.tutorialmod.block.map_color.TutorialModMapColors;
import com.sydney.tutorialmod.sound.ModSounds;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class TutorialModBlocks {
    public static final Block SAKURA_PLANKS = register("sakura_planks", BlockFactory.of(BlockSettings.planks(TutorialModMapColors.SAKURA_WOOD, ModSounds.SAKURA_WOOD, true)));
    public static final Block SAKURA_STAIRS = register("sakura_stairs", BlockFactory.stairs(SAKURA_PLANKS));
    public static final Block SAKURA_SLAB = register("sakura_slab", BlockFactory.slab(SAKURA_PLANKS));
    public static final Block SAKURA_FENCE = register("sakura_fence", BlockFactory.fence(SAKURA_PLANKS));



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


