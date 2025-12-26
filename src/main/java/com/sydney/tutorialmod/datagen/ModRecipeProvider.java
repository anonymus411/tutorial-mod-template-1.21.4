package com.sydney.tutorialmod.datagen;

import com.sydney.tutorialmod.TutorialMod;
import com.sydney.tutorialmod.block.ModBlocks;
import com.sydney.tutorialmod.block.custom.Pink_Garnet_Ore;
import com.sydney.tutorialmod.block.custom.Silt;
import com.sydney.tutorialmod.item.*;
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
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

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


                ShapedRecipeJsonBuilder.create(Registries.ITEM,RecipeCategory.BUILDING_BLOCKS,ModItems.ROSE, 2)
                        .pattern(" ")
                        .pattern("A")
                        .pattern(" ")
                        .input('A', Items.ROSE_BUSH)

                        .criterion(hasItem(Items.ROSE_BUSH),conditionsFromItem(ModItems.ROSE))
                        .offerTo(exporter);




                ShapedRecipeJsonBuilder.create(Registries.ITEM,RecipeCategory.BUILDING_BLOCKS,ModItems.ROSE_FLOWER_CROWN, 1)
                        .pattern("RQR")
                        .pattern("Q Q")
                        .pattern("RQR")
                        .input('R', ModItems.ROSE)
                        .input('Q',Items.STRING)
                        .criterion(hasItem(Items.STRING), conditionsFromItem(ModItems.ROSE_FLOWER_CROWN))
                        .offerTo(exporter);




                ShapedRecipeJsonBuilder.create(Registries.ITEM,RecipeCategory.BUILDING_BLOCKS,Pink_Garnet_Ore.RAW_PINK_GARNET_BLOCK,1)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .input('R', ModItems.RAW_PINK_GARNET)
                        .criterion(hasItem(ModItems.RAW_PINK_GARNET), conditionsFromItem(ModItems.RAW_PINK_GARNET))
                        .offerTo(exporter);

                ShapedRecipeJsonBuilder.create(Registries.ITEM,RecipeCategory.MISC,ModItems.PIE_CRUST,1)
                        .pattern("RAR")
                        .pattern("   ")
                        .pattern("   ")
                        .input('R', ModItems.FLOUR)
                        .input('A',Items.MILK_BUCKET)
                        .criterion(hasItem(ModItems.FLOUR), conditionsFromItem(ModItems.PIE_CRUST))
                        .offerTo(exporter);

                ShapedRecipeJsonBuilder.create(Registries.ITEM,RecipeCategory.BUILDING_BLOCKS,Silt.SILT_BRICKS,1)
                        .pattern("RR")
                        .pattern("RR")
                        .pattern("  ")
                        .input('R', ModItems.SILT_BRICK)
                        .criterion(hasItem(ModItems.SILT_BRICK), conditionsFromItem(ModItems.SILT_BRICK))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModItems.RAW_PINK_GARNET, 9)
                        .input(Pink_Garnet_Ore.RAW_PINK_GARNET_BLOCK)
                        .criterion(hasItem(Pink_Garnet_Ore.RAW_PINK_GARNET_BLOCK), conditionsFromItem(Pink_Garnet_Ore.RAW_PINK_GARNET_BLOCK))
                        .offerTo(exporter);


                createShapeless(RecipeCategory.MISC, ModItems.GREEN_APPLE_PIE, 1)
                        .input(ModItems.GREEN_APPLE)
                        .input(Items.EGG)
                        .input(Items.SUGAR)
                        .criterion(hasItem(Pink_Garnet_Ore.RAW_PINK_GARNET_BLOCK), conditionsFromItem(ModItems.GREEN_APPLE_PIE))
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




                ShapedRecipeJsonBuilder.create(Registries.ITEM,RecipeCategory.MISC,ModItems.STRAW, 4)
                        .pattern("AA ")
                        .pattern("AA ")
                        .pattern("   ")
                        .input('A',ModItems.STRAW)
                        .criterion(hasItem(ModItems.STRAW),conditionsFromItem(ModItems.ROPE))
                        .offerTo(exporter);

                ShapedRecipeJsonBuilder.create(Registries.ITEM,RecipeCategory.MISC,ModItems.CIRCLE_COOKIE_CUTTER, 1)
                        .pattern("AAA")
                        .pattern("A A")
                        .pattern("AAA")
                        .input('A',Items.IRON_NUGGET)
                        .criterion(hasItem(Items.IRON_NUGGET),conditionsFromItem(ModItems.CIRCLE_COOKIE_CUTTER))
                        .offerTo(exporter);



                ShapedRecipeJsonBuilder.create(Registries.ITEM,RecipeCategory.MISC, CookieCutter.STAR_COOKIE_CUTTER, 1)
                        .pattern(  " a ")
                        .pattern(  "a a")
                        .pattern(  " a ")
                        .input('a',Items.IRON_NUGGET)
                        .criterion(hasItem(Items.IRON_NUGGET),conditionsFromItem(CookieCutter.STAR_COOKIE_CUTTER))
                        .offerTo(exporter);


                ShapedRecipeJsonBuilder.create(Registries.ITEM,RecipeCategory.FOOD,ModItems.GLOWBERRY_CUBECAKE, 2)
                        .pattern("DD ")
                        .pattern("AF ")
                        .pattern("   ")
                        .input('A',Items.EGG)
                        .input('D',Items.WHEAT)
                        .input('F',Items.GLOW_BERRIES)
                        .criterion(hasItem(Items.WHEAT),conditionsFromItem(ModItems.GLOWBERRY_CUBECAKE))
                        .offerTo(exporter);


                ShapedRecipeJsonBuilder.create(Registries.ITEM,RecipeCategory.FOOD,ModItems.CHOCOLATE_BAR, 4)
                        .pattern("DE ")
                        .pattern("FE ")
                        .pattern("   ")
                        .input('E',Items.COCOA_BEANS)
                        .input('D',Items.MILK_BUCKET)
                        .input('F',Items.SUGAR)
                        .criterion(hasItem(Items.MILK_BUCKET),conditionsFromItem(ModItems.CHOCOLATE_BAR))
                        .offerTo(exporter);





                ShapedRecipeJsonBuilder.create(Registries.ITEM,RecipeCategory.FOOD,ModItems.MINT_CHOCOLATE, 1)
                        .pattern("DE ")
                        .pattern("   ")
                        .pattern("   ")
                        .input('E',ModItems.MINT_LEAVES)
                        .input('D',ModItems.CHOCOLATE_BAR)

                        .criterion(hasItem(Items.MILK_BUCKET),conditionsFromItem(ModItems.MINT_CHOCOLATE))
                        .offerTo(exporter);






                ShapedRecipeJsonBuilder.create(Registries.ITEM,RecipeCategory.FOOD,ModItems.WAFER_CONE, 3)
                        .pattern(  "D D")
                        .pattern(  " D ")
                        .pattern(  "   ")
                        .input('D',ModItems.WAFER)

                        .criterion(hasItem(ModItems.WAFER),conditionsFromItem(ModItems.WAFER_CONE))
                        .offerTo(exporter);



                ShapedRecipeJsonBuilder.create(Registries.ITEM,RecipeCategory.FOOD,ModItems.GLOWBERRY_ICE_CREAM, 1)
                        .pattern(  "DCE")
                        .pattern(  "FB ")
                        .pattern(  "   ")
                        .input('D',Items.BOWL)
                        .input('C',Items.GLOW_BERRIES)
                        .input('E',Items.MILK_BUCKET)
                        .input('F',ModItems.ICE_CUBES)
                        .input('B',Items.SUGAR)

                        .criterion(hasItem(Items.GLOW_BERRIES),conditionsFromItem(ModItems.GLOWBERRY_ICE_CREAM))
                        .offerTo(exporter);



                ShapedRecipeJsonBuilder.create(Registries.ITEM,RecipeCategory.FOOD,ModItems.GLOWBERRY_ICE_CREAM_CONE, 3)
                        .pattern(  "DE ")
                        .pattern(  "EE ")
                        .pattern(  "   ")
                        .input('D',ModItems.GLOWBERRY_ICE_CREAM)
                        .input('E',ModItems.WAFER_CONE)

                        .criterion(hasItem(ModItems.GLOWBERRY_ICE_CREAM),conditionsFromItem(ModItems.GLOWBERRY_ICE_CREAM_CONE))
                        .offerTo(exporter);






                ShapedRecipeJsonBuilder.create(Registries.ITEM,RecipeCategory.FOOD,ModItems.WAFER, 3)
                        .pattern("DE  ")
                        .pattern("A   ")
                        .pattern("    ")
                        .input('A',Items.EGG)
                        .input('D',Items.WHEAT)
                        .input('E',Items.COCOA_BEANS)
                        .criterion(hasItem(Items.WHEAT),conditionsFromItem(ModItems.WAFER))
                        .offerTo(exporter);


                ShapedRecipeJsonBuilder.create(Registries.ITEM,RecipeCategory.FOOD,ModItems.SUGAR_COOKIE, 8)
                        .pattern("ADD")
                        .pattern("   ")
                        .pattern("   ")
                        .input('A',Items.SUGAR)
                        .input('D',Items.WHEAT)
                        .criterion(hasItem(Items.WHEAT),conditionsFromItem(ModItems.SUGAR_COOKIE))
                        .offerTo(exporter);


                ShapedRecipeJsonBuilder.create(Registries.ITEM,RecipeCategory.FOOD,Frosting.BLUE_ROYAL_FROSTING, 1)
                        .pattern("ADE")
                        .pattern("   ")
                        .pattern("   ")
                        .input('A',Items.SUGAR)
                        .input('D',Items.BLUE_DYE)
                        .input('E',Items.EGG)
                        .criterion(hasItem(Items.EGG),conditionsFromItem(Frosting.BLUE_ROYAL_FROSTING))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.FOOD, Cookies.BLUE_SUGAR_COOKIE, 1)
                        .input(ModItems.SUGAR_COOKIE)
                        .input(Frosting.BLUE_ROYAL_FROSTING)
                        .criterion(hasItem(ModItems.SUGAR_COOKIE), conditionsFromItem(Cookies.BLUE_SUGAR_COOKIE))
                        .offerTo(exporter);





                ShapedRecipeJsonBuilder.create(Registries.ITEM,RecipeCategory.FOOD, Popsicle.MELON_POPSICLE, 1)
                        .pattern(" mm")
                        .pattern("imm")
                        .pattern("-i ")
                        .input('m',Items.MELON_SLICE)
                        .input('i',Items.ICE)
                        .input('-',Items.STICK)
                        .criterion(hasItem(Items.MELON_SLICE),conditionsFromItem(Popsicle.MELON_POPSICLE))
                        .offerTo(exporter);


                ShapedRecipeJsonBuilder.create(Registries.ITEM,RecipeCategory.FOOD,Frosting.ORANGE_ROYAL_FROSTING, 1)
                        .pattern("ADE")
                        .pattern("   ")
                        .pattern("   ")
                        .input('A',Items.SUGAR)
                        .input('D',Items.ORANGE_DYE)
                        .input('E',Items.EGG)
                        .criterion(hasItem(Items.EGG),conditionsFromItem(Frosting.ORANGE_ROYAL_FROSTING))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.FOOD, Cookies.ORANGE_SUGAR_COOKIE, 1)
                        .input(ModItems.SUGAR_COOKIE)
                        .input(Frosting.ORANGE_ROYAL_FROSTING)
                        .criterion(hasItem(ModItems.SUGAR_COOKIE), conditionsFromItem(Cookies.ORANGE_SUGAR_COOKIE))
                        .offerTo(exporter);








                ShapedRecipeJsonBuilder.create(Registries.ITEM,RecipeCategory.FOOD,Frosting.YELLOW_ROYAL_FROSTING, 1)
                        .pattern("ADE")
                        .pattern("   ")
                        .pattern("   ")
                        .input('A',Items.SUGAR)
                        .input('D',Items.YELLOW_DYE)
                        .input('E',Items.EGG)
                        .criterion(hasItem(Items.EGG),conditionsFromItem(Frosting.YELLOW_ROYAL_FROSTING))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.FOOD, Cookies.YELLOW_SUGAR_COOKIE, 1)
                        .input(ModItems.SUGAR_COOKIE)
                        .input(Frosting.YELLOW_ROYAL_FROSTING)
                        .criterion(hasItem(ModItems.SUGAR_COOKIE), conditionsFromItem(Cookies.YELLOW_SUGAR_COOKIE))
                        .offerTo(exporter);



            }


        };
    }

    @Override
    public String getName() {
        return "Tutorial Mod Recipes";
    }
}
