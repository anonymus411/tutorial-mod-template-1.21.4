package com.sydney.tutorialmod.util;

import com.sydney.tutorialmod.TutorialMod;
import com.sydney.tutorialmod.block.ModBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ItemTags {


    private static TagKey<Item> createTag(String name) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, name));
    }
}


