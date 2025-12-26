package com.sydney.tutorialmod.datagen;

import com.sydney.tutorialmod.block.ModBlocks;
import com.sydney.tutorialmod.block.custom.Pink_Garnet_Ore;
import com.sydney.tutorialmod.block.custom.Silt;
import com.sydney.tutorialmod.util.BlockTags;
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

       valueLookupBuilder(net.minecraft.registry.tag.BlockTags.PICKAXE_MINEABLE)
        .add(Pink_Garnet_Ore.PINK_GARNET_ORE)
        .add(Pink_Garnet_Ore.PINK_GARNET_DEEPSLATE_ORE)

        .add(Silt.SILT_BRICKS);
        valueLookupBuilder(BlockTags.GLASS_TRAPDOORS)
                .add(ModBlocks.CHERRY_GlASS_TRAPDOOR)
                .add(ModBlocks.OAK_GlASS_TRAPDOOR);
        valueLookupBuilder(BlockTags.BARN_TRAPDOORS)
                .add(ModBlocks.CHERRY_BARN_TRAPDOOR);

        valueLookupBuilder(net.minecraft.registry.tag.BlockTags.LOGS_THAT_BURN);




    }
}


