package com.sydney.tutorialmod.item;

import com.sydney.tutorialmod.TutorialMod;
import com.sydney.tutorialmod.block.Flowers;
import com.sydney.tutorialmod.block.ModBlocks;
import com.sydney.tutorialmod.block.custom.Pink_Garnet_Ore;
import com.sydney.tutorialmod.block.custom.Silt;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.tutorialmod.pink_garnet_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.LILYFISH);
                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.TOMATO_SEEDS);
                        entries.add(ModItems.CAULIFLOWER);

                        entries.add(ModItems.CAKE_DOUGH);
                        entries.add(ModItems.SWEETBERRY_JAM);
                        entries.add(ModItems.JAR);
                        entries.add(ModItems.RAW_PINK_GARNET);
                        entries.add(ModItems.STRAW);
                        entries.add(ModItems.ROPE);
                        entries.add(ModItems.STRAWBERRY);
                        entries.add(ModItems.STRAWBERRY_SEEDS);

entries.add(KnifeItem.IRON_KNIFE);
                        entries.add(Popsicle.MELON_POPSICLE);
entries.add(ModItems.ROSE_FLOWER_CROWN);
entries.add(ModItems.ROSE);
//silt
entries.add(ModItems.SILT_BALL);
entries.add(ModItems.SILT_BRICK);

                    }).build());






















    public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "pink_garnet_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.OAK_GlASS_TRAPDOOR))
                                        .displayName(Text.translatable("itemgroup.tutorialmod.pink_garnet_blocks"))
                                        .entries((displayContext, entries) -> {
                                            entries.add(ModBlocks.OAK_GlASS_TRAPDOOR);
                                            entries.add(ModBlocks.CHERRY_GlASS_TRAPDOOR);


                                            //GARNET
                                            entries.add(Pink_Garnet_Ore.PINK_GARNET_DEEPSLATE_ORE);
                                            entries.add(Pink_Garnet_Ore.PINK_GARNET_ORE);
                                            entries.add(Pink_Garnet_Ore.RAW_PINK_GARNET_BLOCK);
                                            entries.add(Pink_Garnet_Ore.PINK_GARNET_BLOCK);

entries.add(ModBlocks.SAWMILL);







//silt
entries.add(Silt.SILT);
entries.add(Silt.SILT_BRICKS);








                    }).build());



    public static final ItemGroup FOOD_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "food_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.GLOWBERRY_CUBECAKE))
                    .displayName(Text.translatable("itemgroup.tutorialmod.food_items"))
                    .entries((displayContext, entries) -> {

                        entries.add(Cookies.LIGHT_BLUE_SUGAR_COOKIE);
                        entries.add(Cookies.LIME_SUGAR_COOKIE);

                        entries.add(ModItems.CRANBERRY);
                        entries.add(ModItems.GLOWBERRY_CUBECAKE);
                        entries.add(ModItems.WAFER_CONE);
                        entries.add(ModItems.WAFER);
                        entries.add(ModItems.GLOWBERRY_ICE_CREAM);
                        entries.add(ModItems.GLOWBERRY_ICE_CREAM_CONE);
                        entries.add(ModItems.ICE_CUBES);
                        entries.add(ModItems.CHOCOLATE_BAR);
                        entries.add(ModItems.MINT_CHOCOLATE);
                        entries.add(ModItems.MINT_LEAVES);
                        entries.add(Frosting.BLUE_ROYAL_FROSTING);
                        entries.add(ModItems.SUGAR_COOKIE);
                        entries.add(Cookies.BLUE_SUGAR_COOKIE);
entries.add(ModItems.BELL_PEPPER_SEEDS);
entries.add(ModItems.BELL_PEPPER_GREEN);
entries.add(ModItems.BELL_PEPPER_YELLOW);
entries.add(ModItems.BELL_PEPPER_RED);
entries.add(ModItems.GREEN_APPLE);
entries.add(ModItems.GREEN_APPLE_PIE);

entries.add(ModItems.KIWI);
entries.add(Cookies.ORANGE_SUGAR_COOKIE);
entries.add(Cookies.YELLOW_SUGAR_COOKIE);











                    }).build());

    public static final ItemGroup MISC = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "misc_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Frosting.LIGHT_BLUE_ROYAL_FROSTING))
                    .displayName(Text.translatable("itemgroup.tutorialmod.misc_items"))
                    .entries((displayContext, entries) -> {

                        entries.add(Frosting.LIGHT_BLUE_ROYAL_FROSTING);
                        entries.add(Frosting.LIME_ROYAL_FROSTING);
                        entries.add(Frosting.ORANGE_ROYAL_FROSTING);
                        entries.add(Frosting.YELLOW_ROYAL_FROSTING);
                        entries.add(ModItems.FLOUR);
                        entries.add(ModItems.PIE_CRUST);
                        entries.add(ModItems.CIRCLE_COOKIE_CUTTER);

                        entries.add(CookieCutter.STAR_COOKIE_CUTTER);

                    }).build());
                        public static final ItemGroup NATURE = Registry.register(Registries.ITEM_GROUP,
                                Identifier.of(TutorialMod.MOD_ID, "nature_items"),
                                FabricItemGroup.builder().icon(() -> new ItemStack(Flowers.FORGET_ME_NOT))
                                        .displayName(Text.translatable("itemgroup.tutorialmod.nature_items"))
                                        .entries((displayContext, entries) -> {

                        entries.add(ModBlocks.DAHLIA);
                        entries.add(Flowers.FORGET_ME_NOT);
entries.add(ModBlocks.BLUEBELL);























                    }).build());
    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}



