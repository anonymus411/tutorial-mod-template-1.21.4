package com.sydney.tutorialmod.item;

import com.sydney.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class Frosting {
    public static final Item LIGHT_BLUE_ROYAL_FROSTING = registerItem("light_blue_royal_frosting", new TubeItem(new Item.Settings() .registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TutorialMod.MOD_ID,"light_blue_royal_frosting")))
            .maxDamage(8).maxCount(1)));


    public static final Item LIME_ROYAL_FROSTING = registerItem("lime_royal_frosting", new TubeItem(new Item.Settings() .registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TutorialMod.MOD_ID,"lime_royal_frosting")))
            .maxDamage(8).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Frosting for " + TutorialMod.MOD_ID);
    }
}
