package com.sydney.tutorialmod.item;

import com.sydney.tutorialmod.TutorialMod;
import com.sydney.tutorialmod.block.Flowers;
import com.sydney.tutorialmod.block.ModBlocks;
import com.sydney.tutorialmod.block.TutorialModBlocks;
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
                        entries.add(ModItems.CAULIFLOWER_SEEDS);
                        entries.add(ModItems.CAKE_DOUGH);
                        entries.add(ModItems.SWEETBERRY_JAM);
                        entries.add(ModItems.JAR);
                        entries.add(ModItems.RAW_PINK_GARNET);
                        entries.add(ModItems.STRAW);
                        entries.add(ModItems.ROPE);
                        entries.add(ModItems.STRAWBERRY);
                        entries.add(ModItems.STRAWBERRY_SEEDS);
                        entries.add(ModItems.CIRCLE_COOKIE_CUTTER);
                        entries.add(ModItems.BLUE_ROYAL_FROSTING);
                        entries.add(ModItems.SUGAR_COOKIE);
                        entries.add(ModItems.BLUE_SUGAR_COOKIE);
                        entries.add(CookieCutter.STAR_COOKIE_CUTTER);

                        entries.add(Popsicle.MELON_POPSICLE);

//silt
entries.add(ModItems.SILT_BALL);
entries.add(ModItems.SILT_BRICK);
                        entries.add(Cookies.LIGHT_BLUE_SUGAR_COOKIE);
                        entries.add(Cookies.LIME_SUGAR_COOKIE);
                        entries.add(Frosting.LIGHT_BLUE_ROYAL_FROSTING);
                        entries.add(Frosting.LIME_ROYAL_FROSTING);

                    }).build());






















    public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "pink_garnet_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.OAK_GlASS_TRAPDOOR))
                                        .displayName(Text.translatable("itemgroup.tutorialmod.pink_garnet_blocks"))
                                        .entries((displayContext, entries) -> {
                                            entries.add(ModBlocks.OAK_GlASS_TRAPDOOR);
                                            entries.add(ModBlocks.CHERRY_GlASS_TRAPDOOR);
entries.add(ModBlocks.SPRUCE_CHAIR);
entries.add(TutorialModBlocks.SAKURA_PLANKS);
entries.add(TutorialModBlocks.SAKURA_SLAB);

                                            //GARNET
                                            entries.add(Pink_Garnet_Ore.PINK_GARNET_DEEPSLATE_ORE);
                                            entries.add(Pink_Garnet_Ore.PINK_GARNET_ORE);
                                            entries.add(Pink_Garnet_Ore.RAW_PINK_GARNET_BLOCK);
                                            entries.add(Pink_Garnet_Ore.PINK_GARNET_BLOCK);
                                            entries.add(ModBlocks.STACKED_RAW_GOLD_BLOCKS);
                                            entries.add(ModBlocks.DAHLIA);
                                            entries.add(Flowers.FORGET_ME_NOT);
                                            entries.add(ModItems.FLOUR);
                                            entries.add(ModItems.PIE_CRUST);
                                            entries.add(ModItems.CRANBERRY);
entries.add(ModBlocks.CHERRY_BARREL);
entries.add(ModBlocks.MANGROVE_BARREL);
entries.add(ModBlocks.SAKURA_WALL_SIGN);
entries.add(ModBlocks.SAKURA_PLANKS);
entries.add(ModBlocks.SAKURA_HANGING_SIGN);
//silt
entries.add(Silt.SILT);
entries.add(Silt.SILT_BRICKS);








                    }).build());
    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}



