package net.lucky.tutorialmod.tags;

import net.lucky.tutorialmod.TutorialMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_FLUORITE_TOOL = createTag("needs_fluorite_tool"); //Tag for blocks that require tiered tool
        public static final TagKey<Block> INCORRECT_FOR_FLUORITE_TOOL = createTag("incorrect_for_fluorite_tool"); //Tag for blocks that aren't the right block for tiered tool
        public static final TagKey<Block> NEEDS_AZURITE_TOOL = createTag("needs_azurite_tool");
        public static final TagKey<Block> INCORRECT_FOR_AZURITE_TOOL = createTag("incorrect_for_azurite_tool");
        public static final TagKey<Block> NEEDS_ALEXANDRITE_TOOL = createTag("needs_alexandrite_tool");
        public static final TagKey<Block> INCORRECT_FOR_ALEXANDRITE_TOOL = createTag("incorrect_for_alexandrite_tool");
        public static final TagKey<Block> NEEDS_BISMUTH_TOOL = createTag("needs_bismuth_tool");
        public static final TagKey<Block> INCORRECT_FOR_BISMUTH_TOOL = createTag("incorrect_for_bismuth_tool");
        public static final TagKey<Block> NEEDS_PINK_GARNET_TOOL = createTag("needs_pink_garnet_tool");
        public static final TagKey<Block> INCORRECT_FOR_PINK_GARNET_TOOL = createTag("incorrect_for_pink_garnet_tool");
        public static final TagKey<Block> NEEDS_ZIRCON_TOOL = createTag("needs_zircon_tool");
        public static final TagKey<Block> INCORRECT_FOR_ZIRCON_TOOL = createTag("incorrect_for_zircon_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items"); //Used for items that can change based off something

        public static final TagKey<Item> FLUORITE_REPAIR = createTag("fluorite_repair"); //Tag to use with tool material so it knows it can repair fluorite tools
        public static final TagKey<Item> AZURITE_REPAIR = createTag("azurite_repair");
        public static final TagKey<Item> ALEXANDRITE_REPAIR = createTag("alexandrite_repair");
        public static final TagKey<Item> BISMUTH_REPAIR = createTag("bismuth_repair");
        public static final TagKey<Item> PINK_GARNET_REPAIR = createTag("pink_garnet_repair");
        public static final TagKey<Item> ZIRCON_REPAIR = createTag("zircon_repair");

        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, name));
        }
    }
}