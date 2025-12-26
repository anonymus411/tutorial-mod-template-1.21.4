package com.sydney.tutorialmod.item;

import com.sydney.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class Cookies {
    public static final Item LIGHT_BLUE_SUGAR_COOKIE = registerItem("light_blue_sugar_cookie", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "light_blue_sugar_cookie")))
            .food(ModFoodComponents.SUGAR_COOKIE)));

    public static final Item LIME_SUGAR_COOKIE = registerItem("lime_sugar_cookie", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "lime_sugar_cookie")))
            .food(ModFoodComponents.SUGAR_COOKIE)));

    public static final Item BLUE_SUGAR_COOKIE = registerItem("blue_sugar_cookie", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "blue_sugar_cookie")))
            .food(ModFoodComponents.SUGAR_COOKIE)));




    public static final Item ORANGE_SUGAR_COOKIE = registerItem("orange_sugar_cookie", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "orange_sugar_cookie")))
            .food(ModFoodComponents.SUGAR_COOKIE)));



    public static final Item YELLOW_SUGAR_COOKIE = registerItem("yellow_sugar_cookie", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "yellow_sugar_cookie")))
            .food(ModFoodComponents.SUGAR_COOKIE)));









    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Cookies for " + TutorialMod.MOD_ID);
    }
}
