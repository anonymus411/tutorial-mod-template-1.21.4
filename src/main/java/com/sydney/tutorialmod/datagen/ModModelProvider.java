package com.sydney.tutorialmod.datagen;

import com.sydney.tutorialmod.block.ModBlocks;
import com.sydney.tutorialmod.block.custom.CauliflowerCropBlock;
import com.sydney.tutorialmod.block.custom.Tomato;
import com.sydney.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {


        blockStateModelGenerator.registerCrop(ModBlocks.CAULIFLOWER_CROP, CauliflowerCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);

        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.TOMATO, BlockStateModelGenerator.CrossType.NOT_TINTED,
                Tomato.AGE, 0, 1, 2, 3);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PINK_GARNET, Models.GENERATED);
        itemModelGenerator.register(ModItems.LILYFISH,Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO_SEEDS,Models.GENERATED);
    itemModelGenerator.register(ModItems.CAULIFLOWER,Models.GENERATED);

    }
}
