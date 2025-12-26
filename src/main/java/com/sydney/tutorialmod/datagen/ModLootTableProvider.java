package com.sydney.tutorialmod.datagen;

import com.sun.source.tree.Tree;
import com.sydney.tutorialmod.block.BellpepperCropBlock;
import com.sydney.tutorialmod.block.ModBlocks;
import com.sydney.tutorialmod.block.custom.*;
import com.sydney.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.FishingRodItem;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);


        addDrop(Pink_Garnet_Ore.PINK_GARNET_BLOCK);
        addDrop(Pink_Garnet_Ore.RAW_PINK_GARNET_BLOCK);


        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.BELL_PEPPERS)
                .properties(StatePredicate.Builder.create().exactMatch(BellpepperCropBlock.AGE, BellpepperCropBlock.MAX_AGE));
    this.addDrop(ModBlocks.BELL_PEPPERS, this.cropDrops(ModBlocks.BELL_PEPPERS, ModItems.BELL_PEPPER_GREEN, ModItems.BELL_PEPPER_SEEDS, builder2));





        this.addDrop(ModBlocks.STRAWBERRY,
                block -> this.applyExplosionDecay(
                        block, LootTable.builder().pool(LootPool.builder().conditionally(
                                                BlockStatePropertyLootCondition.builder(ModBlocks.STRAWBERRY).properties(StatePredicate.Builder.create().exactMatch(Tomato.AGE, 3))
                                        )
                                        .with(ItemEntry.builder(ModItems.STRAWBERRY_SEEDS))
                                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 3.0F)))
                                        .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE)))
                        ).pool(LootPool.builder().conditionally(
                                        BlockStatePropertyLootCondition.builder(ModBlocks.STRAWBERRY).properties(StatePredicate.Builder.create().exactMatch(Strawberry.AGE, 2))
                                ).with(ItemEntry.builder(ModItems.STRAWBERRY))
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 2.0F)))
                                .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE))))));






        this.addDrop(ModBlocks.TOMATO,
                block -> this.applyExplosionDecay(
                        block, LootTable.builder().pool(LootPool.builder().conditionally(
                                                BlockStatePropertyLootCondition.builder(ModBlocks.TOMATO).properties(StatePredicate.Builder.create().exactMatch(Tomato.AGE, 3))
                                        )
                                        .with(ItemEntry.builder(ModItems.TOMATO_SEEDS))
                                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 3.0F)))
                                        .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE)))
                        ).pool(LootPool.builder().conditionally(
                                        BlockStatePropertyLootCondition.builder(ModBlocks.TOMATO).properties(StatePredicate.Builder.create().exactMatch(Tomato.AGE, 2))
                                ).with(ItemEntry.builder(ModItems.TOMATO))
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 2.0F)))
                                .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE))))));


        this.addDrop(ModBlocks.CRANBERRY_BUSH,
                block -> this.applyExplosionDecay(
                        block, LootTable.builder().pool(LootPool.builder().conditionally(
                                                BlockStatePropertyLootCondition.builder(ModBlocks.CRANBERRY_BUSH).properties(StatePredicate.Builder.create().exactMatch(CranberryPlant.AGE, 3))
                                        )
                                        .with(ItemEntry.builder(ModItems.CRANBERRY))
                                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 3.0F)))
                                        .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE)))
                        ).pool(LootPool.builder().conditionally(
                                        BlockStatePropertyLootCondition.builder(ModBlocks.CRANBERRY_BUSH).properties(StatePredicate.Builder.create().exactMatch(CranberryPlant.AGE, 2))
                                ).with(ItemEntry.builder(ModItems.CRANBERRY))
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 2.0F)))
                                .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE))))));






        addDrop(Pink_Garnet_Ore.PINK_GARNET_ORE, oreDrops(Pink_Garnet_Ore.PINK_GARNET_ORE, ModItems.RAW_PINK_GARNET));
        addDrop(Pink_Garnet_Ore.PINK_GARNET_DEEPSLATE_ORE, multipleOreDrops(Pink_Garnet_Ore.PINK_GARNET_DEEPSLATE_ORE, ModItems.RAW_PINK_GARNET, 3, 7));
//silt
        addDrop(Silt.SILT, oreDrops(Silt.SILT, ModItems.SILT_BALL));
        addDrop(Silt.SILT_BRICKS);



    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}


