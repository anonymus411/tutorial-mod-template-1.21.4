package com.sydney.tutorialmod.data;

import com.google.common.collect.Maps;
import com.sydney.tutorialmod.block.ModBlocks;
import com.sydney.tutorialmod.block.TutorialModBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.registry.Registries;

import java.util.Map;
import java.util.stream.Stream;

import static net.minecraft.data.family.BlockFamilies.register;

public class TutorialModBlockFamilies {
    private static final Map<Block, BlockFamily> BASE_BLOCKS_TO_FAMILIES = Maps.newHashMap();

    /**
     * The group used for the recipes of wooden block families.
     */
    private static final String WOODEN_GROUP = "wooden";
    /**
     * The name of the criterion used for the recipe unlock advancements of wooden block families.
     */
    private static final String WOODEN_UNLOCK_CRITERION_NAME = "has_planks";

    public static final BlockFamily SAKURA = register(ModBlocks.SAKURA_PLANKS)

            .group(WOODEN_GROUP)
            .unlockCriterionName(WOODEN_UNLOCK_CRITERION_NAME)
            .build();

    public static BlockFamily.Builder register(Block baseBlock) {
        BlockFamily.Builder builder = new BlockFamily.Builder(baseBlock);
        BlockFamily blockFamily = BASE_BLOCKS_TO_FAMILIES.put(baseBlock, builder.build());
        if (blockFamily != null) {
            throw new IllegalStateException("Duplicate family definition for " + Registries.BLOCK.getId(baseBlock));
        } else {
            return builder;
        }
    }

    public static Stream<BlockFamily> getFamilies() {
        return BASE_BLOCKS_TO_FAMILIES.values().stream();
    }
}
