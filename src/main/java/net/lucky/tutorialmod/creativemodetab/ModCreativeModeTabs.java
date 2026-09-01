package net.lucky.tutorialmod.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.lucky.tutorialmod.TutorialMod;
import net.lucky.tutorialmod.block.ModBlocks;
import net.lucky.tutorialmod.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    //Defining custom creative mode tab
    public static final CreativeModeTab FLUORITE_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "fluorite_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FLUORITE))
                    .title(Component.translatable("creativemodetab.tutorialmod.fluorite_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.FLUORITE);
                        output.accept(ModItems.RAW_FLUORITE);

                        output.accept(ModItems.FLUORITE_SWORD);
                        output.accept(ModItems.FLUORITE_PICKAXE);
                        output.accept(ModItems.FLUORITE_SHOVEL);
                        output.accept(ModItems.FLUORITE_AXE);
                        output.accept(ModItems.FLUORITE_HOE);
                        output.accept(ModItems.FLUORITE_SPEAR);

                        output.accept(ModBlocks.FLUORITE_BLOCK);
                        output.accept(ModBlocks.RAW_FLUORITE_BLOCK);
                        output.accept(ModBlocks.FLUORITE_ORE);
                        output.accept(ModBlocks.FLUORITE_DEEPSLATE_ORE);

                        output.accept(ModItems.FLUORITE_HELMET);
                        output.accept(ModItems.FLUORITE_CHESTPLATE);
                        output.accept(ModItems.FLUORITE_LEGGINGS);
                        output.accept(ModItems.FLUORITE_BOOTS);
                    }).build()
    );

    public static final CreativeModeTab AZURITE_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "azurite_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AZURITE))
                    .title(Component.translatable("creativemodetab.tutorialmod.fluorite_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.AZURITE);
                        output.accept(ModItems.RAW_AZURITE);

                        output.accept(ModItems.AZURITE_SWORD);
                        output.accept(ModItems.AZURITE_PICKAXE);
                        output.accept(ModItems.AZURITE_SHOVEL);
                        output.accept(ModItems.AZURITE_AXE);
                        output.accept(ModItems.AZURITE_HOE);
                        output.accept(ModItems.AZURITE_SPEAR);

                        output.accept(ModBlocks.AZURITE_BLOCK);
                        output.accept(ModBlocks.RAW_AZURITE_BLOCK);
                        output.accept(ModBlocks.AZURITE_ORE);
                        output.accept(ModBlocks.AZURITE_DEEPSLATE_ORE);

                        output.accept(ModItems.AZURITE_HELMET);
                        output.accept(ModItems.AZURITE_CHESTPLATE);
                        output.accept(ModItems.AZURITE_LEGGINGS);
                        output.accept(ModItems.AZURITE_BOOTS);
                    }).build()
    );

    public static void registerModCreativeModeTabs() {
        TutorialMod.LOGGER.info("Registering Creative Mode Tabs for " + TutorialMod.MOD_ID);
    }
}