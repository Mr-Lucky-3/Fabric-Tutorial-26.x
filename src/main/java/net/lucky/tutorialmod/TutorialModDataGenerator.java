package net.lucky.tutorialmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.lucky.tutorialmod.datagen.*;
import net.lucky.tutorialmod.worldgen.ModConfiguredFeatures;
import net.lucky.tutorialmod.worldgen.ModPlacedFeatures;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class TutorialModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		//Must run provider lines here
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModItemTagsProvider::new);
		pack.addProvider(ModWorldGenProvider::new);
		pack.addProvider(ModEquipmentAssetProvider::new);
	}
	@Override
	public void buildRegistry(RegistrySetBuilder registryBuilder) {
		// vvv Used for world gen (such as custom ores) vvv
		registryBuilder.add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
		// ^^^ Used for world gen (such as custom ores) ^^^
	}
}