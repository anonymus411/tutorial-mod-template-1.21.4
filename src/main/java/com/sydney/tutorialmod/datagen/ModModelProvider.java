package com.sydney.tutorialmod.datagen;

import com.sydney.tutorialmod.block.ModBlocks;
import com.sydney.tutorialmod.block.custom.*;
import com.sydney.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.*;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {


        blockStateModelGenerator.registerCrop(ModBlocks.CAULIFLOWER, Cauliflower.AGE, 0, 1, 2, 3, 4, 5, 6);

        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.TOMATO, BlockStateModelGenerator.CrossType.NOT_TINTED,
                Tomato.AGE, 0, 1, 2, 3);

        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.STRAWBERRY, BlockStateModelGenerator.CrossType.NOT_TINTED,
                Strawberry.AGE, 0, 1, 2, 3);

blockStateModelGenerator.registerTintableCross(ModBlocks.DALIAH,BlockStateModelGenerator.CrossType.NOT_TINTED);


blockStateModelGenerator.registerTrapdoor(ModBlocks.OAK_GlASS_TRAPDOOR);
blockStateModelGenerator.registerTrapdoor(ModBlocks.CHERRY_GlASS_TRAPDOOR);
blockStateModelGenerator.registerTrapdoor(ModBlocks.CHERRY_BARN_TRAPDOOR);
blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STACKED_RAW_GOLD_BLOCKS);

//GARNET

blockStateModelGenerator.registerSimpleCubeAll(Pink_Garnet_Ore.PINK_GARNET_DEEPSLATE_ORE);
blockStateModelGenerator.registerSimpleCubeAll(Pink_Garnet_Ore.PINK_GARNET_ORE);

blockStateModelGenerator.registerSimpleCubeAll(Pink_Garnet_Ore.PINK_GARNET_BLOCK);
blockStateModelGenerator.registerSimpleCubeAll(Pink_Garnet_Ore.RAW_PINK_GARNET_BLOCK);

//IRONWOOD

        blockStateModelGenerator.registerSimpleCubeAll(Silt.SILT);
blockStateModelGenerator.registerSimpleCubeAll(Silt.SILT_BRICKS);



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
    itemModelGenerator.register(ModItems.RAW_PINK_GARNET,Models.GENERATED);
itemModelGenerator.register(ModItems.SILT_BALL,Models.GENERATED);
itemModelGenerator.register(ModItems.SILT_BRICK, Models.GENERATED);
itemModelGenerator.register(ModItems.STRAW,Models.GENERATED);
        itemModelGenerator.register(ModItems.ROPE,Models.GENERATED);
    }
}
