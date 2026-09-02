package net.lucky.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.lucky.tutorialmod.block.ModBlocks;
import net.lucky.tutorialmod.tags.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE) //Tells the game these blocks need a pickaxe
                .add(ModBlocks.FLUORITE_BLOCK)
                .add(ModBlocks.RAW_FLUORITE_BLOCK)
                .add(ModBlocks.FLUORITE_ORE)
                .add(ModBlocks.FLUORITE_DEEPSLATE_ORE)
                .add(ModBlocks.AZURITE_BLOCK)
                .add(ModBlocks.RAW_AZURITE_BLOCK)
                .add(ModBlocks.AZURITE_ORE)
                .add(ModBlocks.AZURITE_DEEPSLATE_ORE)
                .add(ModBlocks.ALEXANDRITE_BLOCK)
                .add(ModBlocks.RAW_ALEXANDRITE_BLOCK)
                .add(ModBlocks.ALEXANDRITE_ORE)
                .add(ModBlocks.BISMUTH_BLOCK)
                .add(ModBlocks.RAW_BISMUTH_BLOCK)
                .add(ModBlocks.BISMUTH_ORE)
                .add(ModBlocks.PINK_GARNET_BLOCK)
                .add(ModBlocks.RAW_PINK_GARNET_BLOCK)
                .add(ModBlocks.PINK_GARNET_ORE)
                .add(ModBlocks.ZIRCON_BLOCK)
                .add(ModBlocks.RAW_ZIRCON_BLOCK)
                .add(ModBlocks.ZIRCON_ORE);

        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL) //Tells the game the lowest tier to mine a certain block, as do the ones below
                .add(ModBlocks.FLUORITE_DEEPSLATE_ORE)
                .add(ModBlocks.AZURITE_DEEPSLATE_ORE)
                .add(ModBlocks.ALEXANDRITE_DEEPSLATE_ORE)
                .add(ModBlocks.BISMUTH_DEEPSLATE_ORE)
                .add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE)
                .add(ModBlocks.ZIRCON_DEEPSLATE_ORE);

        getOrCreateRawBuilder(BlockTags.NEEDS_DIAMOND_TOOL);

        valueLookupBuilder(ModTags.Blocks.NEEDS_FLUORITE_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
        valueLookupBuilder(ModTags.Blocks.NEEDS_AZURITE_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
        valueLookupBuilder(ModTags.Blocks.NEEDS_ALEXANDRITE_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
        valueLookupBuilder(ModTags.Blocks.NEEDS_BISMUTH_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
        valueLookupBuilder(ModTags.Blocks.NEEDS_PINK_GARNET_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
        valueLookupBuilder(ModTags.Blocks.NEEDS_ZIRCON_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
        valueLookupBuilder(ModTags.Blocks.INCORRECT_FOR_FLUORITE_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
        valueLookupBuilder(ModTags.Blocks.INCORRECT_FOR_AZURITE_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
        valueLookupBuilder(ModTags.Blocks.INCORRECT_FOR_ALEXANDRITE_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
        valueLookupBuilder(ModTags.Blocks.INCORRECT_FOR_BISMUTH_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
        valueLookupBuilder(ModTags.Blocks.INCORRECT_FOR_PINK_GARNET_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
        valueLookupBuilder(ModTags.Blocks.INCORRECT_FOR_ZIRCON_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

    }
}