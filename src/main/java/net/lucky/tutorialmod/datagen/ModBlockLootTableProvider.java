package net.lucky.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.lucky.tutorialmod.block.ModBlocks;
import net.lucky.tutorialmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        dropSelf(ModBlocks.FLUORITE_BLOCK);
        dropSelf(ModBlocks.RAW_FLUORITE_BLOCK);
        dropSelf(ModBlocks.AZURITE_BLOCK);
        dropSelf(ModBlocks.RAW_AZURITE_BLOCK);
        dropSelf(ModBlocks.ALEXANDRITE_BLOCK);
        dropSelf(ModBlocks.RAW_ALEXANDRITE_BLOCK);
        dropSelf(ModBlocks.BISMUTH_BLOCK);
        dropSelf(ModBlocks.RAW_BISMUTH_BLOCK);
        dropSelf(ModBlocks.PINK_GARNET_BLOCK);
        dropSelf(ModBlocks.RAW_PINK_GARNET_BLOCK);
        dropSelf(ModBlocks.ZIRCON_BLOCK);
        dropSelf(ModBlocks.RAW_ZIRCON_BLOCK);

        add(ModBlocks.FLUORITE_ORE, createOreDrop(ModBlocks.FLUORITE_ORE, ModItems.RAW_FLUORITE));
        add(ModBlocks.FLUORITE_DEEPSLATE_ORE, createOreDrop(ModBlocks.FLUORITE_DEEPSLATE_ORE, ModItems.RAW_FLUORITE));
        add(ModBlocks.AZURITE_ORE, createOreDrop(ModBlocks.AZURITE_ORE, ModItems.RAW_AZURITE));
        add(ModBlocks.AZURITE_DEEPSLATE_ORE, createOreDrop(ModBlocks.AZURITE_DEEPSLATE_ORE, ModItems.RAW_AZURITE));
        add(ModBlocks.ALEXANDRITE_ORE, createOreDrop(ModBlocks.ALEXANDRITE_ORE, ModItems.RAW_ALEXANDRITE));
        add(ModBlocks.ALEXANDRITE_DEEPSLATE_ORE, createOreDrop(ModBlocks.ALEXANDRITE_DEEPSLATE_ORE, ModItems.RAW_ALEXANDRITE));
        add(ModBlocks.BISMUTH_ORE, createOreDrop(ModBlocks.BISMUTH_ORE, ModItems.RAW_BISMUTH));
        add(ModBlocks.BISMUTH_DEEPSLATE_ORE, createOreDrop(ModBlocks.BISMUTH_DEEPSLATE_ORE, ModItems.RAW_BISMUTH));
        add(ModBlocks.PINK_GARNET_ORE, createOreDrop(ModBlocks.PINK_GARNET_ORE, ModItems.RAW_PINK_GARNET));
        add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE, createOreDrop(ModBlocks.PINK_GARNET_DEEPSLATE_ORE, ModItems.RAW_PINK_GARNET));
        add(ModBlocks.ZIRCON_ORE, createOreDrop(ModBlocks.ZIRCON_ORE, ModItems.RAW_ZIRCON));
        add(ModBlocks.ZIRCON_DEEPSLATE_ORE, createOreDrop(ModBlocks.ZIRCON_DEEPSLATE_ORE, ModItems.RAW_ZIRCON));

    }

    public LootTable.Builder createMultipleOreDrops(final Block block, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);

        return this.createSilkTouchDispatchTable(block, this.applyExplosionDecay(
                block, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))));
    }
}