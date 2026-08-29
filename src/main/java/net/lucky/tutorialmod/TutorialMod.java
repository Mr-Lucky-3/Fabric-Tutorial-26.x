package net.lucky.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.lucky.tutorialmod.block.ModBlocks;
import net.lucky.tutorialmod.creativemodetab.ModCreativeModeTabs;
import net.lucky.tutorialmod.item.ModItems;
import net.lucky.tutorialmod.worldgen.gen.ModWorldGeneration;
import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Important Comment
public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Mod Initialized");
		//Must run general register lines like the following
		ModCreativeModeTabs.registerModCreativeModeTabs();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
