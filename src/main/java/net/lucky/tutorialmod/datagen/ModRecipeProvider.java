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

                oreSmelting(FLUORITE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.FLUORITE, 0.25f, 200, "fluorite");
                oreBlasting(FLUORITE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.FLUORITE, 0.25f, 100, "fluorite");
                oreSmelting(AZURITE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.AZURITE, 0.25f, 200, "azurite");
                oreBlasting(AZURITE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.AZURITE, 0.25f, 100, "azurite");

                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.FLUORITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLUORITE_BLOCK);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.AZURITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZURITE_BLOCK);

                //Generic recipe creation method
                shaped(RecipeCategory.MISC, ModBlocks.RAW_FLUORITE_BLOCK)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .define('R', ModItems.RAW_FLUORITE)
                        .unlockedBy(getHasName(ModItems.RAW_FLUORITE), has(ModItems.RAW_FLUORITE))
                        .group("fluorite")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.RAW_FLUORITE, 9)
                        .requires(ModBlocks.RAW_FLUORITE_BLOCK)
                        .unlockedBy(getHasName(ModBlocks.RAW_FLUORITE_BLOCK), has(ModBlocks.RAW_FLUORITE_BLOCK))
                        .group("fluorite")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.FLUORITE_SWORD)
                        .pattern("F")
                        .pattern("F")
                        .pattern("S")
                        .define('F', ModItems.FLUORITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.FLUORITE), has(ModItems.FLUORITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .group("fluorite")
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.FLUORITE_PICKAXE)
                        .pattern("FFF")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('F', ModItems.FLUORITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.FLUORITE), has(ModItems.FLUORITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .group("fluorite")
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.FLUORITE_SHOVEL)
                        .pattern("F")
                        .pattern("S")
                        .pattern("S")
                        .define('F', ModItems.FLUORITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.FLUORITE), has(ModItems.FLUORITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .group("fluorite")
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.FLUORITE_AXE)
                        .pattern("FF")
                        .pattern("SF")
                        .pattern("S ")
                        .define('F', ModItems.FLUORITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.FLUORITE), has(ModItems.FLUORITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .group("fluorite")
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.FLUORITE_HOE)
                        .pattern("FF")
                        .pattern("S ")
                        .pattern("S ")
                        .define('F', ModItems.FLUORITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.FLUORITE), has(ModItems.FLUORITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .group("fluorite")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.FLUORITE_SPEAR)
                        .pattern("  F")
                        .pattern(" S ")
                        .pattern("S  ")
                        .define('F', ModItems.FLUORITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.FLUORITE), has(ModItems.FLUORITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .group("fluorite")
                        .save(output);
                shaped(RecipeCategory.COMBAT, ModItems.FLUORITE_HELMET)
                        .pattern("FFF")
                        .pattern("F F")
                        .define('F', ModItems.FLUORITE)
                        .unlockedBy(getHasName(ModItems.FLUORITE), has(ModItems.FLUORITE))
                        .group("fluorite")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.FLUORITE_CHESTPLATE)
                        .pattern("F F")
                        .pattern("FFF")
                        .pattern("FFF")
                        .define('F', ModItems.FLUORITE)
                        .unlockedBy(getHasName(ModItems.FLUORITE), has(ModItems.FLUORITE))
                        .group("fluorite")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.FLUORITE_LEGGINGS)
                        .pattern("FFF")
                        .pattern("F F")
                        .pattern("F F")
                        .define('F', ModItems.FLUORITE)
                        .unlockedBy(getHasName(ModItems.FLUORITE), has(ModItems.FLUORITE))
                        .group("fluorite")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.FLUORITE_BOOTS)
                        .pattern("F F")
                        .pattern("F F")
                        .define('F', ModItems.FLUORITE)
                        .unlockedBy(getHasName(ModItems.FLUORITE), has(ModItems.FLUORITE))
                        .group("fluorite")
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.RAW_AZURITE_BLOCK)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .define('R', ModItems.RAW_AZURITE)
                        .unlockedBy(getHasName(ModItems.RAW_AZURITE), has(ModItems.RAW_AZURITE))
                        .group("azurite")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.RAW_AZURITE, 9)
                        .requires(ModBlocks.RAW_AZURITE_BLOCK)
                        .unlockedBy(getHasName(ModBlocks.RAW_AZURITE_BLOCK), has(ModBlocks.RAW_AZURITE_BLOCK))
                        .group("azurite")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.AZURITE_SWORD)
                        .pattern("F")
                        .pattern("F")
                        .pattern("S")
                        .define('F', ModItems.AZURITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.AZURITE), has(ModItems.AZURITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .group("azurite")
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.AZURITE_PICKAXE)
                        .pattern("FFF")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('F', ModItems.AZURITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.AZURITE), has(ModItems.AZURITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .group("azurite")
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.AZURITE_SHOVEL)
                        .pattern("F")
                        .pattern("S")
                        .pattern("S")
                        .define('F', ModItems.AZURITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.AZURITE), has(ModItems.AZURITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .group("azurite")
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.AZURITE_AXE)
                        .pattern("FF")
                        .pattern("SF")
                        .pattern("S ")
                        .define('F', ModItems.AZURITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.AZURITE), has(ModItems.AZURITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .group("azurite")
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.AZURITE_HOE)
                        .pattern("FF")
                        .pattern("S ")
                        .pattern("S ")
                        .define('F', ModItems.AZURITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.AZURITE), has(ModItems.AZURITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .group("azurite")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.AZURITE_SPEAR)
                        .pattern("  F")
                        .pattern(" S ")
                        .pattern("S  ")
                        .define('F', ModItems.AZURITE)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.AZURITE), has(ModItems.AZURITE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .group("azurite")
                        .save(output);
                shaped(RecipeCategory.COMBAT, ModItems.AZURITE_HELMET)
                        .pattern("FFF")
                        .pattern("F F")
                        .define('F', ModItems.AZURITE)
                        .unlockedBy(getHasName(ModItems.AZURITE), has(ModItems.AZURITE))
                        .group("azurite")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.AZURITE_CHESTPLATE)
                        .pattern("F F")
                        .pattern("FFF")
                        .pattern("FFF")
                        .define('F', ModItems.AZURITE)
                        .unlockedBy(getHasName(ModItems.AZURITE), has(ModItems.AZURITE))
                        .group("azurite")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.AZURITE_LEGGINGS)
                        .pattern("FFF")
                        .pattern("F F")
                        .pattern("F F")
                        .define('F', ModItems.AZURITE)
                        .unlockedBy(getHasName(ModItems.AZURITE), has(ModItems.AZURITE))
                        .group("azurite")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.AZURITE_BOOTS)
                        .pattern("F F")
                        .pattern("F F")
                        .define('F', ModItems.AZURITE)
                        .unlockedBy(getHasName(ModItems.AZURITE), has(ModItems.AZURITE))
                        .group("azurite")
                        .save(output);

            }
        };
    }

    @Override
    public String getName() {
        return "TutorialMod Recipes";
    }
}