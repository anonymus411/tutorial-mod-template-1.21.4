package com.sydney.tutorialmod.world.tree;

import com.sydney.tutorialmod.TutorialMod;
import com.sydney.tutorialmod.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator KIWI = new SaplingGenerator(TutorialMod.MOD_ID + ":kiwi",
            Optional.empty(), Optional.of(ModConfiguredFeatures.KIWI_KEY), Optional.empty());;

}

