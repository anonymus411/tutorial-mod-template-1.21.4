package com.sydney.tutorialmod.datagen;

import com.sun.source.tree.Tree;
import com.sydney.tutorialmod.block.*;
import com.sydney.tutorialmod.block.custom.*;
import com.sydney.tutorialmod.item.*;
import com.sydney.tutorialmod.util.ModTags;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.*;

import static net.minecraft.client.data.BlockStateModelGenerator.createWeightedVariant;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);

    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.BELL_PEPPERS, BlockStateModelGenerator.CrossType.NOT_TINTED,
                BellpepperCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);


        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.TOMATO, BlockStateModelGenerator.CrossType.NOT_TINTED,
                Tomato.AGE, 0, 1, 2, 3);

        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.STRAWBERRY, BlockStateModelGenerator.CrossType.NOT_TINTED,
                Strawberry.AGE, 0, 1, 2, 3);

        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.CRANBERRY_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED,
                CranberryPlant.AGE, 0, 1, 2, 3);


        blockStateModelGenerator.registerFlowerPotPlantAndItem(ModBlocks.DAHLIA, ModBlocks.POTTED_DAHLIA, BlockStateModelGenerator.CrossType.TINTED);

        blockStateModelGenerator.registerFlowerPotPlantAndItem(Flowers.FORGET_ME_NOT, PottedFlowers.POTTED_FORGET_ME_NOT, BlockStateModelGenerator.CrossType.TINTED);


        blockStateModelGenerator.registerTrapdoor(ModBlocks.OAK_GlASS_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.CHERRY_GlASS_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.CHERRY_BARN_TRAPDOOR);


//GARNET

        blockStateModelGenerator.registerSimpleCubeAll(Pink_Garnet_Ore.PINK_GARNET_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(Pink_Garnet_Ore.PINK_GARNET_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(Pink_Garnet_Ore.PINK_GARNET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(Pink_Garnet_Ore.RAW_PINK_GARNET_BLOCK);

//IRONWOOD

        blockStateModelGenerator.registerSimpleCubeAll(Silt.SILT);
        blockStateModelGenerator.registerSimpleCubeAll(Silt.SILT_BRICKS);

        blockStateModelGenerator.registerFlowerPotPlantAndItem(ModBlocks.BLUEBELL, ModBlocks.POTTED_BLUEBELL, BlockStateModelGenerator.CrossType.TINTED);



    }





    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(Frosting.LIGHT_BLUE_ROYAL_FROSTING,Models.GENERATED);
        itemModelGenerator.register(Frosting.LIME_ROYAL_FROSTING,Models.GENERATED);
        itemModelGenerator.register(Frosting.BLUE_ROYAL_FROSTING,Models.GENERATED);

        itemModelGenerator.register(Cookies.LIGHT_BLUE_SUGAR_COOKIE,Models.GENERATED);
        itemModelGenerator.register(Cookies.BLUE_SUGAR_COOKIE,Models.GENERATED);
        itemModelGenerator.register(Cookies.LIME_SUGAR_COOKIE,Models.GENERATED);
        itemModelGenerator.register(ModItems.SUGAR_COOKIE,Models.GENERATED);

        itemModelGenerator.register(CookieCutter.STAR_COOKIE_CUTTER,Models.GENERATED);
        itemModelGenerator.register(ModItems.CIRCLE_COOKIE_CUTTER,Models.GENERATED);

        itemModelGenerator.register(ModItems.SILT_BALL,Models.GENERATED);
        itemModelGenerator.register(ModItems.SILT_BRICK,Models.GENERATED);
itemModelGenerator.register(ModItems.KIWI,Models.GENERATED);

        itemModelGenerator.register(ModItems.STRAWBERRY,Models.GENERATED);
        itemModelGenerator.register(ModItems.LILYFISH,Models.GENERATED);

        itemModelGenerator.register(ModItems.TOMATO_SEEDS,Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEETBERRY_CUPCAKE,Models.GENERATED);

        itemModelGenerator.register(ModItems.FLOUR,Models.GENERATED);
        itemModelGenerator.register(ModItems.PIE_CRUST,Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_GARNET,Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PINK_GARNET,Models.GENERATED);
        itemModelGenerator.register(ModItems.CAKE_DOUGH,Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEETBERRY_JAM,Models.GENERATED);
        itemModelGenerator.register(ModItems.JAR,Models.GENERATED);
        itemModelGenerator.register(ModItems.CAULIFLOWER,Models.GENERATED);
        itemModelGenerator.register(ModItems.ROPE,Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAW,Models.GENERATED);
        itemModelGenerator.register(Popsicle.MELON_POPSICLE,Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOWBERRY_CUBECAKE,Models.GENERATED);

        itemModelGenerator.register(ModItems.WAFER_CONE,Models.GENERATED);
        itemModelGenerator.register(ModItems.WAFER,Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOWBERRY_ICE_CREAM,Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOWBERRY_ICE_CREAM_CONE,Models.GENERATED);
itemModelGenerator.register(ModItems.ICE_CUBES,Models.GENERATED);


        itemModelGenerator.register(ModItems.CHOCOLATE_BAR,Models.GENERATED);
        itemModelGenerator.register(ModItems.MINT_CHOCOLATE,Models.GENERATED);
        itemModelGenerator.register(ModItems.MINT_LEAVES,Models.GENERATED);
itemModelGenerator.register(ModItems.ROSE,Models.GENERATED);

itemModelGenerator.registerArmor(ModItems.ROSE_FLOWER_CROWN,ModArmorMaterials.PINK_GARNET_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);


itemModelGenerator.register(ModItems.BELL_PEPPER_GREEN,Models.GENERATED);
itemModelGenerator.register(ModItems.BELL_PEPPER_YELLOW,Models.GENERATED);
itemModelGenerator.register(ModItems.BELL_PEPPER_RED,Models.GENERATED);

itemModelGenerator.register(KnifeItem.IRON_KNIFE,Models.GENERATED);

itemModelGenerator.register(ModItems.GREEN_APPLE,Models.GENERATED);
itemModelGenerator.register(ModItems.GREEN_APPLE_PIE,Models.GENERATED);

itemModelGenerator.register(Cookies.ORANGE_SUGAR_COOKIE,Models.GENERATED);
itemModelGenerator.register(Cookies.YELLOW_SUGAR_COOKIE,Models.GENERATED);

itemModelGenerator.register(Frosting.ORANGE_ROYAL_FROSTING,Models.GENERATED);
itemModelGenerator.register(Frosting.YELLOW_ROYAL_FROSTING,Models.GENERATED);


    }
}

