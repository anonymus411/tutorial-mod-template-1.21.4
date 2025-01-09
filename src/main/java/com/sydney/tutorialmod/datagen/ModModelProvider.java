package com.sydney.tutorialmod.datagen;

import com.sydney.tutorialmod.block.ModBlocks;
import com.sydney.tutorialmod.block.Wood;
import com.sydney.tutorialmod.block.custom.Cauliflower;
import com.sydney.tutorialmod.block.custom.Tomato;
import com.sydney.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.BambooShootBlock;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.minecraft.client.data.TexturedModel;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {


        blockStateModelGenerator.registerCrop(ModBlocks.CAULIFLOWER, Cauliflower.AGE, 0, 1, 2, 3, 4, 5, 6);

        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.TOMATO, BlockStateModelGenerator.CrossType.NOT_TINTED,
                Tomato.AGE, 0, 1, 2, 3);


blockStateModelGenerator.registerTrapdoor(ModBlocks.OAK_GlASS_TRAPDOOR);
blockStateModelGenerator.registerTrapdoor(ModBlocks.CHERRY_GlASS_TRAPDOOR);
blockStateModelGenerator.registerTrapdoor(ModBlocks.CHERRY_BARN_TRAPDOOR);


        blockStateModelGenerator.registerLog(Wood.IRONWOOD_LOG).log(Wood.IRONWOOD_WOOD);
        blockStateModelGenerator.registerLog(Wood.STRIPPED_IRONWOOD_LOG).log(Wood.IRONWOOD_LOG);

        blockStateModelGenerator.registerSimpleCubeAll(Wood.IRONWOOD_PLANKS);
        blockStateModelGenerator.registerSingleton(Wood.IRONWOOD_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(Wood.IRONWOOD_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);








    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PINK_GARNET, Models.GENERATED);
        itemModelGenerator.register(ModItems.LILYFISH,Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO_SEEDS,Models.GENERATED);
    itemModelGenerator.register(ModItems.CAULIFLOWER,Models.GENERATED);
    itemModelGenerator.register(ModItems.CAKE_DOUGH,Models.GENERATED);
    itemModelGenerator.register(ModItems.SWEETBERRY_JAM,Models.GENERATED);
    itemModelGenerator.register(ModItems.JAR,Models.GENERATED);
        itemModelGenerator.register(Wood.IRONWOOD_SAPLING.asItem(), Models.GENERATED);
    }
}
