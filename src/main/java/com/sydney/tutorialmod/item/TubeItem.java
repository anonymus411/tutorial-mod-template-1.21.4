package com.sydney.tutorialmod.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import static net.minecraft.block.Blocks.register;

public class TubeItem extends Item {
        public TubeItem(Settings settings) {
            super(settings);
        }

        public boolean hasRecipeRemainder() {
            return true;
        }

        @Override
        public ItemStack getRecipeRemainder(ItemStack stack) {
            if (stack.getDamage() < stack.getMaxDamage() - 1) {
                ItemStack moreDamaged = stack.copy();
                moreDamaged.setDamage(stack.getDamage() + 1);
                return moreDamaged;
            }

            return ItemStack.EMPTY;
        }
    }


