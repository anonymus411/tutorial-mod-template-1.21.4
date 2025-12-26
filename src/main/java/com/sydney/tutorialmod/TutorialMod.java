package com.sydney.tutorialmod;

import com.sydney.tutorialmod.block.*;
import com.sydney.tutorialmod.block.custom.Pink_Garnet_Ore;
import com.sydney.tutorialmod.block.custom.Silt;


import com.sydney.tutorialmod.item.*;

import com.sydney.tutorialmod.screen.ModScreenHandlers;
import com.sydney.tutorialmod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Identifier MOD_ID(String id) {
        return null;
    }

	@Override
	public void onInitialize() {
		
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		Cookies.registerModItems();
		Donuts.registerModItems();

KnifeItem.registerModItems();
		ModScreenHandlers.registerScreenHandlers();
		SawBlock.registerModBlocks();
		Pink_Garnet_Ore.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();

		Silt.registerModBlocks();
		Cookies.registerModItems();
		Donuts.registerModItems();
		CookieCutter.registerModItems();
		Popsicle.registerModItems();
		Flowers.registerModBlocks();
		PottedFlowers.registerModBlocks();

		Frosting.registerModItems();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
	}




