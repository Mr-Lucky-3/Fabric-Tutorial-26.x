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
                .add(ModBlocks.FLUORITE_DEEPSLATE_ORE);

        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL) //Tells the game the lowest tier to mine a certain block, as do the ones below
                .add(ModBlocks.FLUORITE_DEEPSLATE_ORE);

        getOrCreateRawBuilder(BlockTags.NEEDS_DIAMOND_TOOL);

        valueLookupBuilder(ModTags.Blocks.NEEDS_FLUORITE_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        valueLookupBuilder(ModTags.Blocks.INCORRECT_FOR_FLUORITE_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);


    }
}