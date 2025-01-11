package com.sydney.tutorialmod.item;

import com.sydney.tutorialmod.TutorialMod;
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
                        entries.add(ModItems.CAULIFLOWER_SEEDS);
                        entries.add(ModItems.CAKE_DOUGH);
                        entries.add(ModItems.SWEETBERRY_JAM);
                        entries.add(ModItems.JAR);
                        entries.add(ModItems.RAW_PINK_GARNET);



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

entries.add(Silt.SILT);
entries.add(ModItems.SILT_BALL);
entries.add(ModItems.SILT_BRICK);





                    }).build());
    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}



