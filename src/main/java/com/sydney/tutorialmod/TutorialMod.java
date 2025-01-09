package com.sydney.tutorialmod;

import com.sydney.tutorialmod.block.ModBlocks;
import com.sydney.tutorialmod.block.Wood;
import com.sydney.tutorialmod.item.ModItemGroups;
import com.sydney.tutorialmod.item.ModItems;
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
		Wood.registerModBlocks();



		StrippableBlockRegistry.register(Wood.IRONWOOD_LOG, Wood.STRIPPED_IRONWOOD_LOG);





		}
	public static void init() {

	}}