package com.sydney.tutorialmod;

import com.sydney.tutorialmod.block.ModBlocks;
import com.sydney.tutorialmod.block.custom.Pink_Garnet_Ore;
import com.sydney.tutorialmod.block.custom.Silt;
import com.sydney.tutorialmod.item.ModItemGroups;
import com.sydney.tutorialmod.item.ModItems;
import com.sydney.tutorialmod.sound.ModSounds;
import com.sydney.tutorialmod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();

		Pink_Garnet_Ore.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
		ModSounds.registerSounds();
		Silt.registerModBlocks();








		}
	public static void init() {

	}}