package net.lucky.tutorialmod.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.lucky.tutorialmod.block.ModBlocks;
import net.lucky.tutorialmod.item.ModArmorMaterials;
import net.lucky.tutorialmod.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        //Used to generate block models, necessary for all blocks
        blockModelGenerators.createTrivialCube(ModBlocks.FLUORITE_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.RAW_FLUORITE_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.FLUORITE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.FLUORITE_DEEPSLATE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.AZURITE_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.RAW_AZURITE_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.AZURITE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.AZURITE_DEEPSLATE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.ALEXANDRITE_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.RAW_ALEXANDRITE_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.ALEXANDRITE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.ALEXANDRITE_DEEPSLATE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.BISMUTH_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.RAW_BISMUTH_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.BISMUTH_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.BISMUTH_DEEPSLATE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.PINK_GARNET_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.RAW_PINK_GARNET_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.PINK_GARNET_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.ZIRCON_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.RAW_ZIRCON_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.ZIRCON_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.ZIRCON_DEEPSLATE_ORE);

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        //Used to generate item models, necessary for all items
        itemModelGenerators.generateFlatItem(ModItems.FLUORITE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_FLUORITE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.AZURITE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_AZURITE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ALEXANDRITE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_ALEXANDRITE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BISMUTH, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_BISMUTH, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.PINK_GARNET, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_PINK_GARNET, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ZIRCON, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_ZIRCON, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(ModItems.FLUORITE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FLUORITE_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FLUORITE_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FLUORITE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FLUORITE_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateSpear(ModItems.FLUORITE_SPEAR);
        itemModelGenerators.generateFlatItem(ModItems.AZURITE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.AZURITE_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.AZURITE_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.AZURITE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.AZURITE_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateSpear(ModItems.AZURITE_SPEAR);
        itemModelGenerators.generateFlatItem(ModItems.ALEXANDRITE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ALEXANDRITE_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ALEXANDRITE_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ALEXANDRITE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ALEXANDRITE_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateSpear(ModItems.ALEXANDRITE_SPEAR);

        itemModelGenerators.generateFlatItem(ModItems.BISMUTH_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BISMUTH_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BISMUTH_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BISMUTH_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BISMUTH_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateSpear(ModItems.BISMUTH_SPEAR);

        itemModelGenerators.generateFlatItem(ModItems.PINK_GARNET_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.PINK_GARNET_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.PINK_GARNET_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.PINK_GARNET_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.PINK_GARNET_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateSpear(ModItems.PINK_GARNET_SPEAR);

        itemModelGenerators.generateFlatItem(ModItems.ZIRCON_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ZIRCON_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ZIRCON_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ZIRCON_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ZIRCON_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateSpear(ModItems.ZIRCON_SPEAR);

        //Slightly different method specific to armor
        itemModelGenerators.generateTrimmableItem(ModItems.FLUORITE_HELMET, ModArmorMaterials.FLUORITE_KEY,
                ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.FLUORITE_CHESTPLATE, ModArmorMaterials.FLUORITE_KEY,
                ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.FLUORITE_LEGGINGS, ModArmorMaterials.FLUORITE_KEY,
                ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.FLUORITE_BOOTS, ModArmorMaterials.FLUORITE_KEY,
                ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.AZURITE_HELMET, ModArmorMaterials.AZURITE_KEY,
                ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.AZURITE_CHESTPLATE, ModArmorMaterials.AZURITE_KEY,
                ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.AZURITE_LEGGINGS, ModArmorMaterials.AZURITE_KEY,
                ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.AZURITE_BOOTS, ModArmorMaterials.AZURITE_KEY,
                ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.ALEXANDRITE_HELMET, ModArmorMaterials.ALEXANDRITE_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.ALEXANDRITE_CHESTPLATE, ModArmorMaterials.ALEXANDRITE_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.ALEXANDRITE_LEGGINGS, ModArmorMaterials.ALEXANDRITE_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.ALEXANDRITE_BOOTS, ModArmorMaterials.ALEXANDRITE_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerators.generateTrimmableItem(ModItems.BISMUTH_HELMET, ModArmorMaterials.BISMUTH_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.BISMUTH_CHESTPLATE, ModArmorMaterials.BISMUTH_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.BISMUTH_LEGGINGS, ModArmorMaterials.BISMUTH_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.BISMUTH_BOOTS, ModArmorMaterials.BISMUTH_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerators.generateTrimmableItem(ModItems.PINK_GARNET_HELMET, ModArmorMaterials.PINK_GARNET_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.PINK_GARNET_CHESTPLATE, ModArmorMaterials.PINK_GARNET_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.PINK_GARNET_LEGGINGS, ModArmorMaterials.PINK_GARNET_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.PINK_GARNET_BOOTS, ModArmorMaterials.PINK_GARNET_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerators.generateTrimmableItem(ModItems.ZIRCON_HELMET, ModArmorMaterials.ZIRCON_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.ZIRCON_CHESTPLATE, ModArmorMaterials.ZIRCON_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.ZIRCON_LEGGINGS, ModArmorMaterials.ZIRCON_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.ZIRCON_BOOTS, ModArmorMaterials.ZIRCON_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
    }
}