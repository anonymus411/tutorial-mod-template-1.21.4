package com.sydney.tutorialmod.data.provider;

import com.sydney.tutorialmod.block.TutorialModBlocks;
import com.sydney.tutorialmod.data.TutorialModBlockFamilies;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.recipe.Recipe;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.resource.featuretoggle.FeatureSet;

import java.util.concurrent.CompletableFuture;

public class TutorialModRecipeGenerator extends RecipeGenerator {
    protected TutorialModRecipeGenerator(RegistryWrapper.WrapperLookup registries, RecipeExporter exporter) {
        super(registries, exporter);
    }

    @Override
    public void generate() {
        TutorialModBlockFamilies.getFamilies().filter(BlockFamily::shouldGenerateRecipes).forEach(family -> this.generateFamily(family, FeatureSet.of(FeatureFlags.VANILLA)));

    }
        public static FabricRecipeProvider create(FabricDataOutput fabricDataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
            return new FabricRecipeProvider(fabricDataOutput, completableFuture) {
                @Override
                protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
                    return new TutorialModRecipeGenerator(wrapperLookup, recipeExporter);
                }

                @Override
                public String getName() {
                    return "Recipes";
                }
            };
        }
    }

