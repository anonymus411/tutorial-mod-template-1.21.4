package com.sydney.tutorialmod.datagen;

import com.sydney.tutorialmod.block.ModBlocks;
import com.sydney.tutorialmod.util.BlockTags;
import com.sydney.tutorialmod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.GLASS_TRAPDOORS)
                .add(ModBlocks.CHERRY_GlASS_TRAPDOOR)
                .add(ModBlocks.OAK_GlASS_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.BARN_TRAPDOORS)
                .add(ModBlocks.CHERRY_BARN_TRAPDOOR);


        }
    }

