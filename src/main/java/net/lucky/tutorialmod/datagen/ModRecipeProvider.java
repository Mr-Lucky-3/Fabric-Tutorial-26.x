package net.lucky.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.lucky.tutorialmod.block.ModBlocks;
import net.lucky.tutorialmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                List<ItemLike> FLUORITE_SMELTABLES = List.of(ModItems.RAW_FLUORITE, ModBlocks.FLUORITE_ORE, ModBlocks.FLUORITE_DEEPSLATE_ORE);
                List<ItemLike> AZURITE_SMELTABLES = List.of(ModItems.RAW_AZURITE, ModBlocks.AZURITE_ORE, ModBlocks.AZURITE_DEEPSLATE_ORE);
                List<ItemLike> ALEXANDRITE_SMELTABLES = List.of(ModItems.RAW_ALEXANDRITE, ModBlocks.ALEXANDRITE_ORE, ModBlocks.ALEXANDRITE_DEEPSLATE_ORE);
                List<ItemLike> BISMUTH_SMELTABLES = List.of(ModItems.RAW_BISMUTH, ModBlocks.BISMUTH_ORE, ModBlocks.BISMUTH_DEEPSLATE_ORE);
                List<ItemLike> PINK_GARNET_SMELTABLES = List.of(ModItems.RAW_PINK_GARNET, ModBlocks.PINK_GARNET_ORE, ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
                List<ItemLike> ZIRCON_SMELTABLES = List.of(ModItems.RAW_ZIRCON, ModBlocks.ZIRCON_ORE, ModBlocks.ZIRCON_DEEPSLATE_ORE);

                oreSmelting(FLUORITE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.FLUORITE, 0.25f, 200, "fluorite");
                oreBlasting(FLUORITE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.FLUORITE, 0.25f, 100, "fluorite");
                oreSmelting(AZURITE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.AZURITE, 0.25f, 200, "azurite");
                oreBlasting(AZURITE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.AZURITE, 0.25f, 100, "azurite");
                oreSmelting(ALEXANDRITE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.ALEXANDRITE, 0.25f, 200, "alexandrite");
                oreBlasting(ALEXANDRITE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.ALEXANDRITE, 0.25f, 100, "alexandrite");
                oreSmelting(BISMUTH_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.BISMUTH, 0.25f, 200, "bismuth");
                oreBlasting(BISMUTH_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.BISMUTH, 0.25f, 100, "bismuth");
                oreSmelting(PINK_GARNET_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.PINK_GARNET, 0.25f, 200, "pink_garnet");
                oreBlasting(PINK_GARNET_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.PINK_GARNET, 0.25f, 100, "pink_garnet");
                oreSmelting(ZIRCON_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.ZIRCON, 0.25f, 200, "zircon");
                oreBlasting(ZIRCON_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.ZIRCON, 0.25f, 100, "zircon");

                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.FLUORITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLUORITE_BLOCK);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.AZURITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZURITE_BLOCK);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.ALEXANDRITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ALEXANDRITE_BLOCK);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.BISMUTH, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BISMUTH_BLOCK);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.PINK_GARNET, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GARNET_BLOCK);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.ZIRCON, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ZIRCON_BLOCK);

                //Generic recipe creation method
                shaped(RecipeCategory.MISC, ModBlocks.RAW_FLUORITE_BLOCK)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .define('R', ModItems.RAW_FLUORITE)
                        .unlockedBy(getHasName(ModItems.RAW_FLUORITE), has(ModItems.RAW_FLUORITE))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.RAW_FLUORITE, 9)
                        .requires(ModBlocks.RAW_FLUORITE_BLOCK)
                        .unlockedBy(getHasName(ModBlocks.RAW_FLUORITE_BLOCK), has(ModBlocks.RAW_FLUORITE_BLOCK))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.FLUORITE_SWORD)
                        .pattern("F")
                        .pattern("F")
                        .pattern("S")
                        .define('F', ModItems.FLUORITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.FLUORITE), has(ModItems.FLUORITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.FLUORITE_PICKAXE)
                        .pattern("FFF")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('F', ModItems.FLUORITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.FLUORITE), has(ModItems.FLUORITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.FLUORITE_SHOVEL)
                        .pattern("F")
                        .pattern("S")
                        .pattern("S")
                        .define('F', ModItems.FLUORITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.FLUORITE), has(ModItems.FLUORITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.FLUORITE_AXE)
                        .pattern("FF")
                        .pattern("SF")
                        .pattern("S ")
                        .define('F', ModItems.FLUORITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.FLUORITE), has(ModItems.FLUORITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.FLUORITE_HOE)
                        .pattern("FF")
                        .pattern("S ")
                        .pattern("S ")
                        .define('F', ModItems.FLUORITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.FLUORITE), has(ModItems.FLUORITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.FLUORITE_SPEAR)
                        .pattern("  F")
                        .pattern(" S ")
                        .pattern("S  ")
                        .define('F', ModItems.FLUORITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.FLUORITE), has(ModItems.FLUORITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ModItems.FLUORITE_HELMET)
                        .pattern("FFF")
                        .pattern("F F")
                        .define('F', ModItems.FLUORITE)
                        .unlockedBy(getHasName(ModItems.FLUORITE), has(ModItems.FLUORITE))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.FLUORITE_CHESTPLATE)
                        .pattern("F F")
                        .pattern("FFF")
                        .pattern("FFF")
                        .define('F', ModItems.FLUORITE)
                        .unlockedBy(getHasName(ModItems.FLUORITE), has(ModItems.FLUORITE))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.FLUORITE_LEGGINGS)
                        .pattern("FFF")
                        .pattern("F F")
                        .pattern("F F")
                        .define('F', ModItems.FLUORITE)
                        .unlockedBy(getHasName(ModItems.FLUORITE), has(ModItems.FLUORITE))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.FLUORITE_BOOTS)
                        .pattern("F F")
                        .pattern("F F")
                        .define('F', ModItems.FLUORITE)
                        .unlockedBy(getHasName(ModItems.FLUORITE), has(ModItems.FLUORITE))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.RAW_AZURITE_BLOCK)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .define('R', ModItems.RAW_AZURITE)
                        .unlockedBy(getHasName(ModItems.RAW_AZURITE), has(ModItems.RAW_AZURITE))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.RAW_AZURITE, 9)
                        .requires(ModBlocks.RAW_AZURITE_BLOCK)
                        .unlockedBy(getHasName(ModBlocks.RAW_AZURITE_BLOCK), has(ModBlocks.RAW_AZURITE_BLOCK))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.AZURITE_SWORD)
                        .pattern("F")
                        .pattern("F")
                        .pattern("S")
                        .define('F', ModItems.AZURITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.AZURITE), has(ModItems.AZURITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.AZURITE_PICKAXE)
                        .pattern("FFF")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('F', ModItems.AZURITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.AZURITE), has(ModItems.AZURITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.AZURITE_SHOVEL)
                        .pattern("F")
                        .pattern("S")
                        .pattern("S")
                        .define('F', ModItems.AZURITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.AZURITE), has(ModItems.AZURITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.AZURITE_AXE)
                        .pattern("FF")
                        .pattern("SF")
                        .pattern("S ")
                        .define('F', ModItems.AZURITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.AZURITE), has(ModItems.AZURITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.AZURITE_HOE)
                        .pattern("FF")
                        .pattern("S ")
                        .pattern("S ")
                        .define('F', ModItems.AZURITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.AZURITE), has(ModItems.AZURITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.AZURITE_SPEAR)
                        .pattern("  F")
                        .pattern(" S ")
                        .pattern("S  ")
                        .define('F', ModItems.AZURITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.AZURITE), has(ModItems.AZURITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.AZURITE_HELMET)
                        .pattern("FFF")
                        .pattern("F F")
                        .define('F', ModItems.AZURITE)
                        .unlockedBy(getHasName(ModItems.AZURITE), has(ModItems.AZURITE))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.AZURITE_CHESTPLATE)
                        .pattern("F F")
                        .pattern("FFF")
                        .pattern("FFF")
                        .define('F', ModItems.AZURITE)
                        .unlockedBy(getHasName(ModItems.AZURITE), has(ModItems.AZURITE))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.AZURITE_LEGGINGS)
                        .pattern("FFF")
                        .pattern("F F")
                        .pattern("F F")
                        .define('F', ModItems.AZURITE)
                        .unlockedBy(getHasName(ModItems.AZURITE), has(ModItems.AZURITE))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.AZURITE_BOOTS)
                        .pattern("F F")
                        .pattern("F F")
                        .define('F', ModItems.AZURITE)
                        .unlockedBy(getHasName(ModItems.AZURITE), has(ModItems.AZURITE))
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.RAW_ALEXANDRITE_BLOCK)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .define('R', ModItems.RAW_ALEXANDRITE)
                        .unlockedBy(getHasName(ModItems.RAW_ALEXANDRITE), has(ModItems.RAW_ALEXANDRITE))
                        .save(output);
                shapeless(RecipeCategory.MISC, ModItems.RAW_ALEXANDRITE, 9)
                        .requires(ModBlocks.RAW_ALEXANDRITE_BLOCK)
                        .unlockedBy(getHasName(ModBlocks.RAW_ALEXANDRITE_BLOCK), has(ModBlocks.RAW_ALEXANDRITE_BLOCK))
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.RAW_BISMUTH_BLOCK)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .define('R', ModItems.RAW_BISMUTH)
                        .unlockedBy(getHasName(ModItems.RAW_BISMUTH), has(ModItems.RAW_BISMUTH))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.RAW_BISMUTH, 9)
                        .requires(ModBlocks.RAW_BISMUTH_BLOCK)
                        .unlockedBy(getHasName(ModBlocks.RAW_BISMUTH_BLOCK), has(ModBlocks.RAW_BISMUTH_BLOCK))
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.RAW_PINK_GARNET_BLOCK)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .define('R', ModItems.RAW_PINK_GARNET)
                        .unlockedBy(getHasName(ModItems.RAW_PINK_GARNET), has(ModItems.RAW_PINK_GARNET))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.RAW_PINK_GARNET, 9)
                        .requires(ModBlocks.RAW_PINK_GARNET_BLOCK)
                        .unlockedBy(getHasName(ModBlocks.RAW_PINK_GARNET_BLOCK), has(ModBlocks.RAW_PINK_GARNET_BLOCK))
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.RAW_ZIRCON_BLOCK)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .define('R', ModItems.RAW_ZIRCON)
                        .unlockedBy(getHasName(ModItems.RAW_ZIRCON), has(ModItems.RAW_ZIRCON))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.RAW_ZIRCON, 9)
                        .requires(ModBlocks.RAW_ZIRCON_BLOCK)
                        .unlockedBy(getHasName(ModBlocks.RAW_ZIRCON_BLOCK), has(ModBlocks.RAW_ZIRCON_BLOCK))
                        .save(output);

                // --- ALEXANDRITE ---
                shaped(RecipeCategory.COMBAT, ModItems.ALEXANDRITE_SWORD)
                        .pattern("F")
                        .pattern("F")
                        .pattern("S")
                        .define('F', ModItems.ALEXANDRITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.ALEXANDRITE), has(ModItems.ALEXANDRITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.ALEXANDRITE_PICKAXE)
                        .pattern("FFF")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('F', ModItems.ALEXANDRITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.ALEXANDRITE), has(ModItems.ALEXANDRITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.ALEXANDRITE_SHOVEL)
                        .pattern("F")
                        .pattern("S")
                        .pattern("S")
                        .define('F', ModItems.ALEXANDRITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.ALEXANDRITE), has(ModItems.ALEXANDRITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.ALEXANDRITE_AXE)
                        .pattern("FF")
                        .pattern("SF")
                        .pattern("S ")
                        .define('F', ModItems.ALEXANDRITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.ALEXANDRITE), has(ModItems.ALEXANDRITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.ALEXANDRITE_HOE)
                        .pattern("FF")
                        .pattern("S ")
                        .pattern("S ")
                        .define('F', ModItems.ALEXANDRITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.ALEXANDRITE), has(ModItems.ALEXANDRITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.ALEXANDRITE_SPEAR)
                        .pattern("  F")
                        .pattern(" S ")
                        .pattern("S  ")
                        .define('F', ModItems.ALEXANDRITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.ALEXANDRITE), has(ModItems.ALEXANDRITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.ALEXANDRITE_HELMET)
                        .pattern("FFF")
                        .pattern("F F")
                        .define('F', ModItems.ALEXANDRITE)
                        .unlockedBy(getHasName(ModItems.ALEXANDRITE), has(ModItems.ALEXANDRITE))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.ALEXANDRITE_CHESTPLATE)
                        .pattern("F F")
                        .pattern("FFF")
                        .pattern("FFF")
                        .define('F', ModItems.ALEXANDRITE)
                        .unlockedBy(getHasName(ModItems.ALEXANDRITE), has(ModItems.ALEXANDRITE))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.ALEXANDRITE_LEGGINGS)
                        .pattern("FFF")
                        .pattern("F F")
                        .pattern("F F")
                        .define('F', ModItems.ALEXANDRITE)
                        .unlockedBy(getHasName(ModItems.ALEXANDRITE), has(ModItems.ALEXANDRITE))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.ALEXANDRITE_BOOTS)
                        .pattern("F F")
                        .pattern("F F")
                        .define('F', ModItems.ALEXANDRITE)
                        .unlockedBy(getHasName(ModItems.ALEXANDRITE), has(ModItems.ALEXANDRITE))
                        .save(output);


                // --- BISMUTH ---
                shaped(RecipeCategory.COMBAT, ModItems.BISMUTH_SWORD)
                        .pattern("F")
                        .pattern("F")
                        .pattern("S")
                        .define('F', ModItems.BISMUTH)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.BISMUTH), has(ModItems.BISMUTH))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.BISMUTH_PICKAXE)
                        .pattern("FFF")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('F', ModItems.BISMUTH)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.BISMUTH), has(ModItems.BISMUTH))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.BISMUTH_SHOVEL)
                        .pattern("F")
                        .pattern("S")
                        .pattern("S")
                        .define('F', ModItems.BISMUTH)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.BISMUTH), has(ModItems.BISMUTH))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.BISMUTH_AXE)
                        .pattern("FF")
                        .pattern("SF")
                        .pattern("S ")
                        .define('F', ModItems.BISMUTH)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.BISMUTH), has(ModItems.BISMUTH))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.BISMUTH_HOE)
                        .pattern("FF")
                        .pattern("S ")
                        .pattern("S ")
                        .define('F', ModItems.BISMUTH)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.BISMUTH), has(ModItems.BISMUTH))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.BISMUTH_SPEAR)
                        .pattern("  F")
                        .pattern(" S ")
                        .pattern("S  ")
                        .define('F', ModItems.BISMUTH)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.BISMUTH), has(ModItems.BISMUTH))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.BISMUTH_HELMET)
                        .pattern("FFF")
                        .pattern("F F")
                        .define('F', ModItems.BISMUTH)
                        .unlockedBy(getHasName(ModItems.BISMUTH), has(ModItems.BISMUTH))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.BISMUTH_CHESTPLATE)
                        .pattern("F F")
                        .pattern("FFF")
                        .pattern("FFF")
                        .define('F', ModItems.BISMUTH)
                        .unlockedBy(getHasName(ModItems.BISMUTH), has(ModItems.BISMUTH))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.BISMUTH_LEGGINGS)
                        .pattern("FFF")
                        .pattern("F F")
                        .pattern("F F")
                        .define('F', ModItems.BISMUTH)
                        .unlockedBy(getHasName(ModItems.BISMUTH), has(ModItems.BISMUTH))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.BISMUTH_BOOTS)
                        .pattern("F F")
                        .pattern("F F")
                        .define('F', ModItems.BISMUTH)
                        .unlockedBy(getHasName(ModItems.BISMUTH), has(ModItems.BISMUTH))
                        .save(output);


                // --- PINK GARNET ---
                shaped(RecipeCategory.COMBAT, ModItems.PINK_GARNET_SWORD)
                        .pattern("F")
                        .pattern("F")
                        .pattern("S")
                        .define('F', ModItems.PINK_GARNET)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.PINK_GARNET), has(ModItems.PINK_GARNET))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.PINK_GARNET_PICKAXE)
                        .pattern("FFF")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('F', ModItems.PINK_GARNET)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.PINK_GARNET), has(ModItems.PINK_GARNET))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.PINK_GARNET_SHOVEL)
                        .pattern("F")
                        .pattern("S")
                        .pattern("S")
                        .define('F', ModItems.PINK_GARNET)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.PINK_GARNET), has(ModItems.PINK_GARNET))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.PINK_GARNET_AXE)
                        .pattern("FF")
                        .pattern("SF")
                        .pattern("S ")
                        .define('F', ModItems.PINK_GARNET)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.PINK_GARNET), has(ModItems.PINK_GARNET))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.PINK_GARNET_HOE)
                        .pattern("FF")
                        .pattern("S ")
                        .pattern("S ")
                        .define('F', ModItems.PINK_GARNET)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.PINK_GARNET), has(ModItems.PINK_GARNET))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.PINK_GARNET_SPEAR)
                        .pattern("  F")
                        .pattern(" S ")
                        .pattern("S  ")
                        .define('F', ModItems.PINK_GARNET)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.PINK_GARNET), has(ModItems.PINK_GARNET))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.PINK_GARNET_HELMET)
                        .pattern("FFF")
                        .pattern("F F")
                        .define('F', ModItems.PINK_GARNET)
                        .unlockedBy(getHasName(ModItems.PINK_GARNET), has(ModItems.PINK_GARNET))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.PINK_GARNET_CHESTPLATE)
                        .pattern("F F")
                        .pattern("FFF")
                        .pattern("FFF")
                        .define('F', ModItems.PINK_GARNET)
                        .unlockedBy(getHasName(ModItems.PINK_GARNET), has(ModItems.PINK_GARNET))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.PINK_GARNET_LEGGINGS)
                        .pattern("FFF")
                        .pattern("F F")
                        .pattern("F F")
                        .define('F', ModItems.PINK_GARNET)
                        .unlockedBy(getHasName(ModItems.PINK_GARNET), has(ModItems.PINK_GARNET))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.PINK_GARNET_BOOTS)
                        .pattern("F F")
                        .pattern("F F")
                        .define('F', ModItems.PINK_GARNET)
                        .unlockedBy(getHasName(ModItems.PINK_GARNET), has(ModItems.PINK_GARNET))
                        .save(output);


                // --- ZIRCON ---
                shaped(RecipeCategory.COMBAT, ModItems.ZIRCON_SWORD)
                        .pattern("F")
                        .pattern("F")
                        .pattern("S")
                        .define('F', ModItems.ZIRCON)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.ZIRCON), has(ModItems.ZIRCON))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.ZIRCON_PICKAXE)
                        .pattern("FFF")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('F', ModItems.ZIRCON)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.ZIRCON), has(ModItems.ZIRCON))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.ZIRCON_SHOVEL)
                        .pattern("F")
                        .pattern("S")
                        .pattern("S")
                        .define('F', ModItems.ZIRCON)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.ZIRCON), has(ModItems.ZIRCON))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.ZIRCON_AXE)
                        .pattern("FF")
                        .pattern("SF")
                        .pattern("S ")
                        .define('F', ModItems.ZIRCON)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.ZIRCON), has(ModItems.ZIRCON))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.ZIRCON_HOE)
                        .pattern("FF")
                        .pattern("S ")
                        .pattern("S ")
                        .define('F', ModItems.ZIRCON)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.ZIRCON), has(ModItems.ZIRCON))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.ZIRCON_SPEAR)
                        .pattern("  F")
                        .pattern(" S ")
                        .pattern("S  ")
                        .define('F', ModItems.ZIRCON)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.ZIRCON), has(ModItems.ZIRCON))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.ZIRCON_HELMET)
                        .pattern("FFF")
                        .pattern("F F")
                        .define('F', ModItems.ZIRCON)
                        .unlockedBy(getHasName(ModItems.ZIRCON), has(ModItems.ZIRCON))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.ZIRCON_CHESTPLATE)
                        .pattern("F F")
                        .pattern("FFF")
                        .pattern("FFF")
                        .define('F', ModItems.ZIRCON)
                        .unlockedBy(getHasName(ModItems.ZIRCON), has(ModItems.ZIRCON))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.ZIRCON_LEGGINGS)
                        .pattern("FFF")
                        .pattern("F F")
                        .pattern("F F")
                        .define('F', ModItems.ZIRCON)
                        .unlockedBy(getHasName(ModItems.ZIRCON), has(ModItems.ZIRCON))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.ZIRCON_BOOTS)
                        .pattern("F F")
                        .pattern("F F")
                        .define('F', ModItems.ZIRCON)
                        .unlockedBy(getHasName(ModItems.ZIRCON), has(ModItems.ZIRCON))
                        .save(output);
            }
        };
    }

    @Override
    public String getName() {
        return "TutorialMod Recipes";
    }
}