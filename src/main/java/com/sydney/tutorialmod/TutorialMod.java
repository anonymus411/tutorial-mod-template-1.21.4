package com.sydney.tutorialmod;

import com.google.common.reflect.Reflection;
import com.sydney.tutorialmod.block.*;
import com.sydney.tutorialmod.block.custom.ChairBlock;
import com.sydney.tutorialmod.block.custom.Pink_Garnet_Ore;
import com.sydney.tutorialmod.block.custom.Silt;

import com.sydney.tutorialmod.block.helper.BlockFactory;
import com.sydney.tutorialmod.block.map_color.TutorialModMapColors;
import com.sydney.tutorialmod.data.provider.TutorialModRecipeGenerator;
import com.sydney.tutorialmod.item.*;
import com.sydney.tutorialmod.sound.ModSounds;
import com.sydney.tutorialmod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.minecraft.data.family.BlockFamilies;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Ref;

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
		ModSounds.registerSounds();


		Pink_Garnet_Ore.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
		ModSounds.registerSounds();
		Silt.registerModBlocks();
		Cookies.registerModItems();
		Donuts.registerModItems();
		CookieCutter.registerModItems();
		Popsicle.registerModItems();
		Flowers.registerModBlocks();
		PottedFlowers.registerModBlocks();
		ChairBlock.registerModBlocks();
		Frosting.registerModItems();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}


