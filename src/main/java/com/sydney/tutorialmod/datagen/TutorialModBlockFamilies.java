package com.sydney.tutorialmod.datagen;

import com.google.common.collect.Maps;
import com.sydney.tutorialmod.block.TutorialModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.data.family.BlockFamily;

import java.util.Map;

import static com.sydney.tutorialmod.data.TutorialModBlockFamilies.register;

public class TutorialModBlockFamilies extends FabricModelProvider {
    private static final Map<Block, BlockFamily> BASE_BLOCKS_TO_FAMILIES = Maps.newHashMap();


    private static final String WOODEN_GROUP = "wooden";
    /**
     * The name of the criterion used for the recipe unlock advancements of wooden block families.
     */
    private static final String WOODEN_UNLOCK_CRITERION_NAME = "has_planks";


    public static final BlockFamily SAKURA = register(TutorialModBlocks.SAKURA_PLANKS)
            .slab(TutorialModBlocks.SAKURA_SLAB)

            .group(WOODEN_GROUP)
            .unlockCriterionName(WOODEN_UNLOCK_CRITERION_NAME)
            .build();














    public TutorialModBlockFamilies(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
