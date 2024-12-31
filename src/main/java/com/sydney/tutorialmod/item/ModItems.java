package com.sydney.tutorialmod.item;

import com.sydney.tutorialmod.TutorialMod;
import com.sydney.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item CAULIFLOWER = registerItem("cauliflower", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "cauliflower")))
            .food(ModFoodComponents.CAULIFLOWER)));



    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "pink_garnet")))));

    public static final Item LILYFISH = registerItem("lilyfish", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "lilyfish")))));


    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new BlockItem(ModBlocks.TOMATO, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "tomato_seeds")))));

    public static final Item TOMATO = registerItem("tomato",
            new  BlockItem(ModBlocks.TOMATO, new Item.Settings().food(ModFoodComponents.TOMATO)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "tomato")))));

    public static final Item CAULIFLOWER_SEEDS = registerItem("cauliflower_seeds",
            new BlockItem(ModBlocks.CAULIFLOWER_CROP, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "cauliflower_seeds")))));





    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
            entries.add(LILYFISH);
            entries.add(TOMATO_SEEDS);
            entries.add(TOMATO);

        });

    }

    public static void init() {
    }
}