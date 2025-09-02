package com.sydney.tutorialmod.datagen;

import com.sydney.tutorialmod.block.Flowers;
import com.sydney.tutorialmod.block.ModBlocks;
import com.sydney.tutorialmod.block.PottedFlowers;
import com.sydney.tutorialmod.block.TutorialModBlocks;
import com.sydney.tutorialmod.block.custom.*;
import com.sydney.tutorialmod.item.*;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.BarrelBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.*;
import net.minecraft.client.render.model.json.ModelVariantOperator;
import net.minecraft.client.render.model.json.WeightedVariant;
import net.minecraft.item.Items;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

import static net.minecraft.client.data.BlockStateModelGenerator.createButtonBlockState;
import static net.minecraft.client.data.BlockStateModelGenerator.createWeightedVariant;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    private static void registerBarrel(BlockStateModelGenerator blockStateModelGenerator, Block customBarrel) {
        Identifier identifier = TextureMap.getSubId(ModBlocks.CHERRY_BARREL, "_top_open");
        WeightedVariant weightedVariant = BlockStateModelGenerator.createWeightedVariant(TexturedModel.CUBE_BOTTOM_TOP.upload(customBarrel, blockStateModelGenerator.modelCollector));
        WeightedVariant weightedVariant2 = BlockStateModelGenerator.createWeightedVariant(
                TexturedModel.CUBE_BOTTOM_TOP
                        .get(customBarrel)
                        .textures(textureMap -> textureMap.put(TextureKey.TOP, identifier))
                        .upload(customBarrel, "_open", blockStateModelGenerator.modelCollector)
        );
        BlockStateVariantMap<ModelVariantOperator> upDefaultRotationOperations = BlockStateVariantMap.operations(Properties.FACING)
                .register(Direction.DOWN, BlockStateModelGenerator.ROTATE_X_180)
                .register(Direction.UP, BlockStateModelGenerator.NO_OP)
                .register(Direction.NORTH, BlockStateModelGenerator.ROTATE_X_90)
                .register(Direction.SOUTH, BlockStateModelGenerator.ROTATE_X_90.then(BlockStateModelGenerator.ROTATE_Y_180))
                .register(Direction.WEST, BlockStateModelGenerator.ROTATE_X_90.then(BlockStateModelGenerator.ROTATE_Y_270))
                .register(Direction.EAST, BlockStateModelGenerator.ROTATE_X_90.then(BlockStateModelGenerator.ROTATE_Y_90));
        blockStateModelGenerator.blockStateCollector
                .accept(
                        VariantsBlockModelDefinitionCreator.of(customBarrel)
                                .with(BlockStateVariantMap.models(Properties.OPEN).register(false, weightedVariant).register(true, weightedVariant2))
                                .coordinate(upDefaultRotationOperations)
                );
    }
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        registerBarrel(blockStateModelGenerator, ModBlocks.CHERRY_BARREL);


        blockStateModelGenerator.registerHangingSign(ModBlocks.SAKURA_HANGING_SIGN, ModBlocks.SAKURA_PLANKS, ModBlocks.SAKURA_WALL_SIGN);

        blockStateModelGenerator.registerCrop(ModBlocks.CAULIFLOWER, Cauliflower.AGE, 0, 1, 2, 3, 4, 5, 6);

        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.TOMATO, BlockStateModelGenerator.CrossType.NOT_TINTED,
                Tomato.AGE, 0, 1, 2, 3);

        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.STRAWBERRY, BlockStateModelGenerator.CrossType.NOT_TINTED,
                Strawberry.AGE, 0, 1, 2, 3);

        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.CRANBERRY_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED,
                CranberryPlant.AGE, 0, 1, 2, 3);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SPRUCE_CHAIR);

        blockStateModelGenerator.registerFlowerPotPlantAndItem(ModBlocks.DAHLIA, ModBlocks.POTTED_DAHLIA, BlockStateModelGenerator.CrossType.TINTED);

        blockStateModelGenerator.registerFlowerPotPlantAndItem(Flowers.FORGET_ME_NOT, PottedFlowers.POTTED_FORGET_ME_NOT, BlockStateModelGenerator.CrossType.TINTED);

        blockStateModelGenerator.registerSimpleCubeAll(TutorialModBlocks.SAKURA_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TutorialModBlocks.SAKURA_SLAB);


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
        itemModelGenerator.register(ModItems.SUGAR_COOKIE,Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_ROYAL_FROSTING,Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_SUGAR_COOKIE,Models.GENERATED);
        itemModelGenerator.register(ModItems.CIRCLE_COOKIE_CUTTER,Models.GENERATED);
itemModelGenerator.register(ModItems.STRAWBERRY,Models.GENERATED);
       itemModelGenerator.register(CookieCutter.STAR_COOKIE_CUTTER,Models.GENERATED);
   itemModelGenerator.register(Popsicle.MELON_POPSICLE,Models.GENERATED);
   itemModelGenerator.register(ModItems.FLOUR,Models.GENERATED);
   itemModelGenerator.register(ModItems.PIE_CRUST,Models.GENERATED);

itemModelGenerator.register(Cookies.LIGHT_BLUE_SUGAR_COOKIE,Models.GENERATED);
        itemModelGenerator.register(Cookies.LIME_SUGAR_COOKIE,Models.GENERATED);
itemModelGenerator.register(Frosting.LIGHT_BLUE_ROYAL_FROSTING,Models.GENERATED);
itemModelGenerator.register(Frosting.LIME_ROYAL_FROSTING,Models.GENERATED);

    }
}
