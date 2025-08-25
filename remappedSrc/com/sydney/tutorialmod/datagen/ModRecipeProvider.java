package com.sydney.tutorialmod.datagen;

import com.sydney.tutorialmod.block.ModBlocks;
import com.sydney.tutorialmod.block.custom.Pink_Garnet_Ore;
import com.sydney.tutorialmod.block.custom.Silt;
import com.sydney.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {

                List<ItemConvertible> PINK_GARNET_SMELTABLES = List.of(ModItems.RAW_PINK_GARNET, Pink_Garnet_Ore.PINK_GARNET_ORE,
                        Pink_Garnet_Ore.PINK_GARNET_DEEPSLATE_ORE);


                List<ItemConvertible> SILT_BALL_SMELTABLES = List.of(ModItems.SILT_BALL);





                offerSmelting(SILT_BALL_SMELTABLES, RecipeCategory.MISC, ModItems.SILT_BRICK, 0.3f, 200, "silt_brick");

                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.PINK_GARNET, RecipeCategory.DECORATIONS, Pink_Garnet_Ore.PINK_GARNET_BLOCK);

                ShapedRecipeJsonBuilder.create(Registries.ITEM,RecipeCategory.BUILDING_BLOCKS,Pink_Garnet_Ore.RAW_PINK_GARNET_BLOCK,2)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .input('R', ModItems.RAW_PINK_GARNET)
                        .criterion(hasItem(ModItems.RAW_PINK_GARNET), conditionsFromItem(ModItems.RAW_PINK_GARNET))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModItems.RAW_PINK_GARNET, 9)
                        .input(Pink_Garnet_Ore.RAW_PINK_GARNET_BLOCK)
                        .criterion(hasItem(Pink_Garnet_Ore.RAW_PINK_GARNET_BLOCK), conditionsFromItem(Pink_Garnet_Ore.RAW_PINK_GARNET_BLOCK))
                        .offerTo(exporter);








                ShapedRecipeJsonBuilder.create(Registries.ITEM,RecipeCategory.BUILDING_BLOCKS,ModBlocks.OAK_GlASS_TRAPDOOR,2)
                        .pattern("ABA")
                        .pattern("ABA")
                        .pattern("   ")
                          .input('A', Items.OAK_PLANKS)
                          .input('B',Items.GLASS_PANE)
                        .criterion(hasItem(Items.OAK_PLANKS),conditionsFromItem(ModBlocks.OAK_GlASS_TRAPDOOR))
                            .offerTo(exporter);




                ShapedRecipeJsonBuilder.create(Registries.ITEM,RecipeCategory.MISC, ModItems.CAKE_DOUGH,2)
                        .pattern("AB")
                        .pattern("KS")
                        .pattern("  ")
                        .input('A', Items.EGG)
                        .input('B',Items.WHEAT)
                        .input('K',Items.MILK_BUCKET)
                        .input('S',Items.SUGAR)
                        .criterion(hasItem(Items.WHEAT),conditionsFromItem(ModItems.CAKE_DOUGH))
                        .offerTo(exporter);


                ShapedRecipeJsonBuilder.create(Registries.ITEM,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CHERRY_GlASS_TRAPDOOR)
                        .pattern("ABA")
                        .pattern("ABA")
                        .pattern("   ")
                        .input('A', Items.CHERRY_PLANKS)
                        .input('B',Items.GLASS_PANE)
                        .criterion(hasItem(Items.OAK_PLANKS),conditionsFromItem(ModBlocks.CHERRY_GlASS_TRAPDOOR))
                        .offerTo(exporter);


                ShapedRecipeJsonBuilder.create(Registries.ITEM,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CHERRY_BARN_TRAPDOOR,2)
                        .pattern("B")
                        .pattern("A")
                        .pattern(" ")
                        .input('A', Items.CHERRY_PLANKS)
                        .input('B',ModBlocks.CHERRY_GlASS_TRAPDOOR)
                        .criterion(hasItem(Items.OAK_PLANKS),conditionsFromItem(ModBlocks.CHERRY_BARN_TRAPDOOR))
                        .offerTo(exporter);




                ShapedRecipeJsonBuilder.create(Registries.ITEM,RecipeCategory.BUILDING_BLOCKS,ModItems.SWEETBERRY_JAM)
                        .pattern("ABD")
                        .pattern("   ")
                        .pattern("   ")
                        .input('A', Items.SWEET_BERRIES)
                        .input('B',ModItems.JAR)
                        .input('D',Items.SUGAR)
                        .criterion(hasItem(Items.SWEET_BERRIES),conditionsFromItem(ModItems.SWEETBERRY_JAM))
                        .offerTo(exporter);




                ShapedRecipeJsonBuilder.create(Registries.ITEM,RecipeCategory.FOOD,ModItems.SWEETBERRY_CUPCAKE, 2)
                        .pattern("AB")
                        .pattern("AB")
                        .pattern("  ")
                        .input('A',ModItems.CAKE_DOUGH)
                        .input('B',ModItems.SWEETBERRY_JAM)
                        .criterion(hasItem(ModItems.CAKE_DOUGH),conditionsFromItem(ModItems.SWEETBERRY_CUPCAKE))
                        .offerTo(exporter);



            }


        };
    }

    @Override
    public String getName() {
        return "Tutorial Mod Recipes";
    }
}
