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

        valueLookupBuilder(ModTags.Items.FLUORITE_REPAIR).add(ModItems.FLUORITE); //Tells what item(s) to use for tools tagged fluorite repair
        valueLookupBuilder(ModTags.Items.AZURITE_REPAIR).add(ModItems.AZURITE);
        valueLookupBuilder(ModTags.Items.ALEXANDRITE_REPAIR).add(ModItems.ALEXANDRITE);
        valueLookupBuilder(ModTags.Items.BISMUTH_REPAIR).add(ModItems.BISMUTH);
        valueLookupBuilder(ModTags.Items.PINK_GARNET_REPAIR).add(ModItems.PINK_GARNET);
        valueLookupBuilder(ModTags.Items.ZIRCON_REPAIR).add(ModItems.ZIRCON);

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
        valueLookupBuilder(ItemTags.SWORDS).add(ModItems.ALEXANDRITE_SWORD);
        valueLookupBuilder(ItemTags.SWORDS).add(ModItems.BISMUTH_SWORD);
        valueLookupBuilder(ItemTags.SWORDS).add(ModItems.PINK_GARNET_SWORD);
        valueLookupBuilder(ItemTags.SWORDS).add(ModItems.ZIRCON_SWORD);

        valueLookupBuilder(ItemTags.PICKAXES).add(ModItems.ALEXANDRITE_PICKAXE);
        valueLookupBuilder(ItemTags.PICKAXES).add(ModItems.BISMUTH_PICKAXE);
        valueLookupBuilder(ItemTags.PICKAXES).add(ModItems.PINK_GARNET_PICKAXE);
        valueLookupBuilder(ItemTags.PICKAXES).add(ModItems.ZIRCON_PICKAXE);

        valueLookupBuilder(ItemTags.SHOVELS).add(ModItems.ALEXANDRITE_SHOVEL);
        valueLookupBuilder(ItemTags.SHOVELS).add(ModItems.BISMUTH_SHOVEL);
        valueLookupBuilder(ItemTags.SHOVELS).add(ModItems.PINK_GARNET_SHOVEL);
        valueLookupBuilder(ItemTags.SHOVELS).add(ModItems.ZIRCON_SHOVEL);

        valueLookupBuilder(ItemTags.AXES).add(ModItems.ALEXANDRITE_AXE);
        valueLookupBuilder(ItemTags.AXES).add(ModItems.BISMUTH_AXE);
        valueLookupBuilder(ItemTags.AXES).add(ModItems.PINK_GARNET_AXE);
        valueLookupBuilder(ItemTags.AXES).add(ModItems.ZIRCON_AXE);

        valueLookupBuilder(ItemTags.HOES).add(ModItems.ALEXANDRITE_HOE);
        valueLookupBuilder(ItemTags.HOES).add(ModItems.BISMUTH_HOE);
        valueLookupBuilder(ItemTags.HOES).add(ModItems.PINK_GARNET_HOE);
        valueLookupBuilder(ItemTags.HOES).add(ModItems.ZIRCON_HOE);

        valueLookupBuilder(ItemTags.SPEARS).add(ModItems.ALEXANDRITE_SPEAR);
        valueLookupBuilder(ItemTags.SPEARS).add(ModItems.BISMUTH_SPEAR);
        valueLookupBuilder(ItemTags.SPEARS).add(ModItems.PINK_GARNET_SPEAR);
        valueLookupBuilder(ItemTags.SPEARS).add(ModItems.ZIRCON_SPEAR);

        valueLookupBuilder(ItemTags.HEAD_ARMOR).add(ModItems.FLUORITE_HELMET);
        valueLookupBuilder(ItemTags.CHEST_ARMOR).add(ModItems.FLUORITE_CHESTPLATE);
        valueLookupBuilder(ItemTags.LEG_ARMOR).add(ModItems.FLUORITE_LEGGINGS);
        valueLookupBuilder(ItemTags.FOOT_ARMOR).add(ModItems.FLUORITE_BOOTS);
        valueLookupBuilder(ItemTags.HEAD_ARMOR).add(ModItems.AZURITE_HELMET);
        valueLookupBuilder(ItemTags.CHEST_ARMOR).add(ModItems.AZURITE_CHESTPLATE);
        valueLookupBuilder(ItemTags.LEG_ARMOR).add(ModItems.AZURITE_LEGGINGS);
        valueLookupBuilder(ItemTags.FOOT_ARMOR).add(ModItems.AZURITE_BOOTS);
        valueLookupBuilder(ItemTags.HEAD_ARMOR).add(ModItems.ALEXANDRITE_HELMET);
        valueLookupBuilder(ItemTags.HEAD_ARMOR).add(ModItems.BISMUTH_HELMET);
        valueLookupBuilder(ItemTags.HEAD_ARMOR).add(ModItems.PINK_GARNET_HELMET);
        valueLookupBuilder(ItemTags.HEAD_ARMOR).add(ModItems.ZIRCON_HELMET);

        valueLookupBuilder(ItemTags.CHEST_ARMOR).add(ModItems.ALEXANDRITE_CHESTPLATE);
        valueLookupBuilder(ItemTags.CHEST_ARMOR).add(ModItems.BISMUTH_CHESTPLATE);
        valueLookupBuilder(ItemTags.CHEST_ARMOR).add(ModItems.PINK_GARNET_CHESTPLATE);
        valueLookupBuilder(ItemTags.CHEST_ARMOR).add(ModItems.ZIRCON_CHESTPLATE);

        valueLookupBuilder(ItemTags.LEG_ARMOR).add(ModItems.ALEXANDRITE_LEGGINGS);
        valueLookupBuilder(ItemTags.LEG_ARMOR).add(ModItems.BISMUTH_LEGGINGS);
        valueLookupBuilder(ItemTags.LEG_ARMOR).add(ModItems.PINK_GARNET_LEGGINGS);
        valueLookupBuilder(ItemTags.LEG_ARMOR).add(ModItems.ZIRCON_LEGGINGS);

        valueLookupBuilder(ItemTags.FOOT_ARMOR).add(ModItems.ALEXANDRITE_BOOTS);
        valueLookupBuilder(ItemTags.FOOT_ARMOR).add(ModItems.BISMUTH_BOOTS);
        valueLookupBuilder(ItemTags.FOOT_ARMOR).add(ModItems.PINK_GARNET_BOOTS);
        valueLookupBuilder(ItemTags.FOOT_ARMOR).add(ModItems.ZIRCON_BOOTS);
    }
}