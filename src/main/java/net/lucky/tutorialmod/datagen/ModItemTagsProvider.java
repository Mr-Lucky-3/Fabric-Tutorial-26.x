package net.lucky.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.lucky.tutorialmod.item.ModItems;
import net.lucky.tutorialmod.tags.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(ModTags.Items.TRANSFORMABLE_ITEMS) //Tells the game what items are changing
                .add(ModItems.FLUORITE)
                .add(ModItems.AZURITE)
                .add(Items.IRON_INGOT)
                .add(Items.COAL)
                .add(Items.BRICK);

        valueLookupBuilder(ModTags.Items.FLUORITE_REPAIR) //Tells what item(s) to use for tools tagged fluorite repair
                .add(ModItems.FLUORITE);
        valueLookupBuilder(ModTags.Items.AZURITE_REPAIR)
                .add(ModItems.AZURITE);

        valueLookupBuilder(ItemTags.SWORDS).add(ModItems.FLUORITE_SWORD); //Tells the game this is a sword by giving it a sword tag, the ones below follow this
        valueLookupBuilder(ItemTags.PICKAXES).add(ModItems.FLUORITE_PICKAXE);
        valueLookupBuilder(ItemTags.SHOVELS).add(ModItems.FLUORITE_SHOVEL);
        valueLookupBuilder(ItemTags.AXES).add(ModItems.FLUORITE_AXE);
        valueLookupBuilder(ItemTags.HOES).add(ModItems.FLUORITE_HOE);
        valueLookupBuilder(ItemTags.SPEARS).add(ModItems.FLUORITE_SPEAR);
        valueLookupBuilder(ItemTags.SWORDS).add(ModItems.AZURITE_SWORD);
        valueLookupBuilder(ItemTags.PICKAXES).add(ModItems.AZURITE_PICKAXE);
        valueLookupBuilder(ItemTags.SHOVELS).add(ModItems.AZURITE_SHOVEL);
        valueLookupBuilder(ItemTags.AXES).add(ModItems.AZURITE_AXE);
        valueLookupBuilder(ItemTags.HOES).add(ModItems.AZURITE_HOE);
        valueLookupBuilder(ItemTags.SPEARS).add(ModItems.AZURITE_SPEAR);

        valueLookupBuilder(ItemTags.HEAD_ARMOR).add(ModItems.FLUORITE_HELMET);
        valueLookupBuilder(ItemTags.CHEST_ARMOR).add(ModItems.FLUORITE_CHESTPLATE);
        valueLookupBuilder(ItemTags.LEG_ARMOR).add(ModItems.FLUORITE_LEGGINGS);
        valueLookupBuilder(ItemTags.FOOT_ARMOR).add(ModItems.FLUORITE_BOOTS);
        valueLookupBuilder(ItemTags.HEAD_ARMOR).add(ModItems.AZURITE_HELMET);
        valueLookupBuilder(ItemTags.CHEST_ARMOR).add(ModItems.AZURITE_CHESTPLATE);
        valueLookupBuilder(ItemTags.LEG_ARMOR).add(ModItems.AZURITE_LEGGINGS);
        valueLookupBuilder(ItemTags.FOOT_ARMOR).add(ModItems.AZURITE_BOOTS);
    }
}