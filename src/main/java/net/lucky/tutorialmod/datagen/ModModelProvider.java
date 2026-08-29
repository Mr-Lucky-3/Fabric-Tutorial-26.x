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

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        //Used to generate item models, necessary for all items
        itemModelGenerators.generateFlatItem(ModItems.FLUORITE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_FLUORITE, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(ModItems.FLUORITE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FLUORITE_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FLUORITE_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FLUORITE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FLUORITE_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateSpear(ModItems.FLUORITE_SPEAR);

        //Slightly different method specific to armor
        itemModelGenerators.generateTrimmableItem(ModItems.FLUORITE_HELMET, ModArmorMaterials.FLUORITE_KEY,
                ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.FLUORITE_CHESTPLATE, ModArmorMaterials.FLUORITE_KEY,
                ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.FLUORITE_LEGGINGS, ModArmorMaterials.FLUORITE_KEY,
                ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.FLUORITE_BOOTS, ModArmorMaterials.FLUORITE_KEY,
                ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
    }
}