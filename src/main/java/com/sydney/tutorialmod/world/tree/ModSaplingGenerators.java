package com.sydney.tutorialmod.world.tree;

import com.sydney.tutorialmod.TutorialMod;
import com.sydney.tutorialmod.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.world.gen.feature.TreeConfiguredFeatures;

import java.util.Optional;

public class ModSaplingGenerators {

    public static final SaplingGenerator IRONWOOD = new SaplingGenerator(TutorialMod.MOD_ID + ":ironwood",
            Optional.empty(), Optional.of(ModConfiguredFeatures.IRONWOOD_KEY), Optional.empty());
}

