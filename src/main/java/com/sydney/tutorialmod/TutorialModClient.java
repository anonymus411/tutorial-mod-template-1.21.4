package com.sydney.tutorialmod;

import com.sydney.tutorialmod.block.Flowers;
import com.sydney.tutorialmod.block.ModBlocks;
import com.sydney.tutorialmod.block.PottedFlowers;
import net.fabricmc.api.ClientModInitializer;

import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.render.BlockRenderLayer;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class                                                                                                                                                                           TutorialModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.putBlock(ModBlocks.TOMATO, (BlockRenderLayer.CUTOUT));
        BlockRenderLayerMap.putBlock(ModBlocks.CAULIFLOWER, (BlockRenderLayer.CUTOUT));
        BlockRenderLayerMap.putBlock(ModBlocks.OAK_GlASS_TRAPDOOR, (BlockRenderLayer.CUTOUT));BlockRenderLayerMap.putBlock(ModBlocks.CHERRY_GlASS_TRAPDOOR, (BlockRenderLayer.CUTOUT));
        BlockRenderLayerMap.putBlock(ModBlocks.DAHLIA,(BlockRenderLayer.CUTOUT));
        BlockRenderLayerMap.putBlock(ModBlocks.POTTED_DAHLIA,(BlockRenderLayer.CUTOUT));
        BlockRenderLayerMap.putBlock(ModBlocks.STRAWBERRY,BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.STRAWBERRY,BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(Flowers.FORGET_ME_NOT,BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(PottedFlowers.POTTED_FORGET_ME_NOT,BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(ModBlocks.CRANBERRY_BUSH, (BlockRenderLayer.CUTOUT));


        }
    }


