package com.sydney.tutorialmod.item;

import com.sydney.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class KnifeItem {

    public static final Item IRON_KNIFE = registerItem("iron_knife", new TubeItem(new Item.Settings() .registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TutorialMod.MOD_ID,"iron_knife")))
            .maxDamage(8).maxCount(1)));







    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Frosting for " + TutorialMod.MOD_ID);
    }
}


