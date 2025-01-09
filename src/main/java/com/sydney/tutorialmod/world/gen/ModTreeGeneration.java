package com.sydney.tutorialmod.world.gen;

import com.sydney.tutorialmod.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGeneration {

    public static void generateTrees() {
    BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA, BiomeKeys.MEADOW),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.IRONWOOD_PLACED_KEY);
}
}


