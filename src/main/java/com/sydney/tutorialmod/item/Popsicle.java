package com.sydney.tutorialmod.item;

import com.sydney.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class Popsicle {

    public static final Item MELON_POPSICLE = registerItem("melon_popsicle", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "melon_popsicle")))
            .food(ModFoodComponents.MELON_POPSICLE)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Popsicle for " + TutorialMod.MOD_ID);
    }
}
