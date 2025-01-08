package com.sydney.tutorialmod.datagen;

import com.sydney.tutorialmod.block.ModBlocks;
import com.sydney.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

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





                ShapedRecipeJsonBuilder.create(Registries.ITEM,RecipeCategory.MISC,ModItems.JAR,2)
                        .pattern("A")
                        .pattern("B")
                        .pattern("B")
                        .input('A', ItemTags.WOODEN_SLABS)
                        .input('B',Items.GLASS_PANE)
                        .criterion("has_wooden_slab",conditionsFromTag(ItemTags.WOODEN_SLABS))
                        .offerTo(exporter);
            }


        };
    }

    @Override
    public String getName() {
        return "Tutorial Mod Recipes";
    }
}
