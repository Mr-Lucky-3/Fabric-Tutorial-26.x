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
                    .title(Component.translatable("creativemodetab.tutorialmod.azurite_items"))
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

    public static final CreativeModeTab ALEXANDRITE_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "alexandrite_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALEXANDRITE))
                    .title(Component.translatable("creativemodetab.tutorialmod.alexandrite_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.ALEXANDRITE);
                        output.accept(ModItems.RAW_ALEXANDRITE);
                        output.accept(ModItems.ALEXANDRITE_SWORD);
                        output.accept(ModItems.ALEXANDRITE_PICKAXE);
                        output.accept(ModItems.ALEXANDRITE_SHOVEL);
                        output.accept(ModItems.ALEXANDRITE_AXE);
                        output.accept(ModItems.ALEXANDRITE_HOE);
                        output.accept(ModItems.ALEXANDRITE_SPEAR);
                        output.accept(ModBlocks.ALEXANDRITE_BLOCK);
                        output.accept(ModBlocks.RAW_ALEXANDRITE_BLOCK);
                        output.accept(ModBlocks.ALEXANDRITE_ORE);
                        output.accept(ModBlocks.ALEXANDRITE_DEEPSLATE_ORE);
                        output.accept(ModItems.ALEXANDRITE_HELMET);
                        output.accept(ModItems.ALEXANDRITE_CHESTPLATE);
                        output.accept(ModItems.ALEXANDRITE_LEGGINGS);
                        output.accept(ModItems.ALEXANDRITE_BOOTS);
                    }).build()
    );

    public static final CreativeModeTab BISMUTH_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "bismuth_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BISMUTH))
                    .title(Component.translatable("creativemodetab.tutorialmod.bismuth_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.BISMUTH);
                        output.accept(ModItems.RAW_BISMUTH);
                        output.accept(ModItems.BISMUTH_SWORD);
                        output.accept(ModItems.BISMUTH_PICKAXE);
                        output.accept(ModItems.BISMUTH_SHOVEL);
                        output.accept(ModItems.BISMUTH_AXE);
                        output.accept(ModItems.BISMUTH_HOE);
                        output.accept(ModItems.BISMUTH_SPEAR);
                        output.accept(ModBlocks.BISMUTH_BLOCK);
                        output.accept(ModBlocks.RAW_BISMUTH_BLOCK);
                        output.accept(ModBlocks.BISMUTH_ORE);
                        output.accept(ModBlocks.BISMUTH_DEEPSLATE_ORE);
                        output.accept(ModItems.BISMUTH_HELMET);
                        output.accept(ModItems.BISMUTH_CHESTPLATE);
                        output.accept(ModItems.BISMUTH_LEGGINGS);
                        output.accept(ModItems.BISMUTH_BOOTS);
                    }).build()
    );

    public static final CreativeModeTab PINK_GARNET_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "pink_garnet_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .title(Component.translatable("creativemodetab.tutorialmod.pink_garnet_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.PINK_GARNET);
                        output.accept(ModItems.RAW_PINK_GARNET);
                        output.accept(ModItems.PINK_GARNET_SWORD);
                        output.accept(ModItems.PINK_GARNET_PICKAXE);
                        output.accept(ModItems.PINK_GARNET_SHOVEL);
                        output.accept(ModItems.PINK_GARNET_AXE);
                        output.accept(ModItems.PINK_GARNET_HOE);
                        output.accept(ModItems.PINK_GARNET_SPEAR);
                        output.accept(ModBlocks.PINK_GARNET_BLOCK);
                        output.accept(ModBlocks.RAW_PINK_GARNET_BLOCK);
                        output.accept(ModBlocks.PINK_GARNET_ORE);
                        output.accept(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
                        output.accept(ModItems.PINK_GARNET_HELMET);
                        output.accept(ModItems.PINK_GARNET_CHESTPLATE);
                        output.accept(ModItems.PINK_GARNET_LEGGINGS);
                        output.accept(ModItems.PINK_GARNET_BOOTS);
                    }).build()
    );

    public static final CreativeModeTab ZIRCON_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "zircon_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ZIRCON))
                    .title(Component.translatable("creativemodetab.tutorialmod.zircon_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.ZIRCON);
                        output.accept(ModItems.RAW_ZIRCON);
                        output.accept(ModItems.ZIRCON_SWORD);
                        output.accept(ModItems.ZIRCON_PICKAXE);
                        output.accept(ModItems.ZIRCON_SHOVEL);
                        output.accept(ModItems.ZIRCON_AXE);
                        output.accept(ModItems.ZIRCON_HOE);
                        output.accept(ModItems.ZIRCON_SPEAR);
                        output.accept(ModBlocks.ZIRCON_BLOCK);
                        output.accept(ModBlocks.RAW_ZIRCON_BLOCK);
                        output.accept(ModBlocks.ZIRCON_ORE);
                        output.accept(ModBlocks.ZIRCON_DEEPSLATE_ORE);
                        output.accept(ModItems.ZIRCON_HELMET);
                        output.accept(ModItems.ZIRCON_CHESTPLATE);
                        output.accept(ModItems.ZIRCON_LEGGINGS);
                        output.accept(ModItems.ZIRCON_BOOTS);
                    }).build()
    );

    public static void registerModCreativeModeTabs() {
        TutorialMod.LOGGER.info("Registering Creative Mode Tabs for " + TutorialMod.MOD_ID);
    }
}