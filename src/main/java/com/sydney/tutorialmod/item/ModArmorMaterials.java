package com.sydney.tutorialmod.item;

import com.sydney.tutorialmod.TutorialMod;
import com.sydney.tutorialmod.util.ModTags;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;

public class ModArmorMaterials {
    static RegistryKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY = RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset"));
        public static final RegistryKey<EquipmentAsset> PINK_GARNET_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(TutorialMod.MOD_ID, "pink_garnet"));

        public static final ArmorMaterial CITRINE_CROWN = new ArmorMaterial(500, Util.make(new EnumMap<>(EquipmentType.class), map -> {
            map.put(EquipmentType.HELMET, 2);

        }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,0,0, ModTags.Items.PINK_GARNET_REPAIR, PINK_GARNET_KEY);

    public static final ArmorMaterial ROSE_FLOWER_CROWN = new ArmorMaterial(200, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.HELMET, 2);

    }), 20, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,0,0, ModTags.Items.PINK_GARNET_REPAIR, PINK_GARNET_KEY);


}