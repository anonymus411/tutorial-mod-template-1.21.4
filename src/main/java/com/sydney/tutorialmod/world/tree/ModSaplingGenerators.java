package com.sydney.tutorialmod.world.tree;

import com.sydney.tutorialmod.TutorialMod;
import com.sydney.tutorialmod.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator DRIFTWOOD = new SaplingGenerator(TutorialMod.MOD_ID + ":driftwood",
            Optional.empty(), Optional.of(ModConfiguredFeatures.SAKURA_KEY), Optional.empty());
}

