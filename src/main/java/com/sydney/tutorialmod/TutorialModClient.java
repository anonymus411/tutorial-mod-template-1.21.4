package com.sydney.tutorialmod;

import com.sydney.tutorialmod.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;

import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.render.BlockRenderLayer;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class TutorialModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.putBlock(ModBlocks.TOMATO, (BlockRenderLayer.CUTOUT));
        BlockRenderLayerMap.putBlock(ModBlocks.CAULIFLOWER, (BlockRenderLayer.CUTOUT));
        BlockRenderLayerMap.putBlock(ModBlocks.OAK_GlASS_TRAPDOOR, (BlockRenderLayer.CUTOUT));
        BlockRenderLayerMap.putBlock(ModBlocks.CHERRY_GlASS_TRAPDOOR, (BlockRenderLayer.CUTOUT));



        }
    }


