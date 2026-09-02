package net.lucky.tutorialmod.item;

import net.lucky.tutorialmod.TutorialMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.function.Function;

public class ModItems {
    public static final Item FLUORITE = registerItem("fluorite", Item::new); //Basic Generic Item, No Properties
    public static final Item RAW_FLUORITE = registerItem("raw_fluorite", Item::new);
    public static final Item AZURITE = registerItem("azurite", Item::new);
    public static final Item RAW_AZURITE = registerItem("raw_azurite", Item::new);
    public static final Item ALEXANDRITE = registerItem("alexandrite", Item::new);
    public static final Item RAW_ALEXANDRITE = registerItem("raw_alexandrite", Item::new);
    public static final Item BISMUTH = registerItem("bismuth", Item::new);
    public static final Item RAW_BISMUTH = registerItem("raw_bismuth", Item::new);
    public static final Item PINK_GARNET = registerItem("pink_garnet", Item::new);
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", Item::new);
    public static final Item ZIRCON = registerItem("zircon", Item::new);
    public static final Item RAW_ZIRCON = registerItem("raw_zircon", Item::new);

    public static final Item FLUORITE_SWORD = registerItem("fluorite_sword",
            properties -> new Item(properties.sword(ModToolMaterials.FLUORITE, 10, -2.0f).repairable(ModItems.FLUORITE))); //Basic Sword Item
    public static final Item FLUORITE_PICKAXE = registerItem("fluorite_pickaxe",
            properties -> new Item(properties.pickaxe(ModToolMaterials.FLUORITE, 5, -2.8f).repairable(ModItems.FLUORITE))); //Basic Pickaxe Item
    public static final Item FLUORITE_SHOVEL = registerItem("fluorite_shovel",
            properties -> new ShovelItem(ModToolMaterials.FLUORITE, 6.5f, -3.0f, properties.repairable(ModItems.FLUORITE))); //Basic Shovel Item
    public static final Item FLUORITE_AXE = registerItem("fluorite_axe",
            properties -> new AxeItem(ModToolMaterials.FLUORITE, 12f, -3.0f, properties.repairable(ModItems.FLUORITE))); //Basic Axe Item
    public static final Item FLUORITE_HOE = registerItem("fluorite_hoe",
            properties -> new HoeItem(ModToolMaterials.FLUORITE, 1f, -3.0f, properties.repairable(ModItems.FLUORITE))); //Basic Hoe Item
    public static final Item FLUORITE_SPEAR = registerItem("fluorite_spear",
            properties -> new Item(properties.spear(ModToolMaterials.FLUORITE, 0.95F, 0.95F, 0.6F,
                    2.5F, 11.0F, 6.75F, 5.1F, 11.25F, 4.6F).repairable(ModItems.FLUORITE))); //Basic Spear Item
    public static final Item AZURITE_SWORD = registerItem("azurite_sword",
            properties -> new Item(properties.sword(ModToolMaterials.AZURITE, 10, -2.0f).repairable(ModItems.AZURITE)));
    public static final Item AZURITE_PICKAXE = registerItem("azurite_pickaxe",
            properties -> new Item(properties.pickaxe(ModToolMaterials.AZURITE, 5, -2.8f).repairable(ModItems.AZURITE)));
    public static final Item AZURITE_SHOVEL = registerItem("azurite_shovel",
            properties -> new ShovelItem(ModToolMaterials.AZURITE, 6.5f, -3.0f, properties.repairable(ModItems.AZURITE)));
    public static final Item AZURITE_AXE = registerItem("azurite_axe",
            properties -> new AxeItem(ModToolMaterials.AZURITE, 12f, -3.0f, properties.repairable(ModItems.AZURITE)));
    public static final Item AZURITE_HOE = registerItem("azurite_hoe",
            properties -> new HoeItem(ModToolMaterials.AZURITE, 1f, -3.0f, properties.repairable(ModItems.AZURITE)));
    public static final Item AZURITE_SPEAR = registerItem("azurite_spear",
            properties -> new Item(properties.spear(ModToolMaterials.AZURITE, 0.95F, 0.95F, 0.6F,
                    2.5F, 11.0F, 6.75F, 5.1F, 11.25F, 4.6F).repairable(ModItems.AZURITE)));

    public static final Item FLUORITE_HELMET = registerItem("fluorite_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.FLUORITE_ARMOR_MATERIAL, ArmorType.HELMET).repairable(ModItems.FLUORITE))); //Basic Helmet Item
    public static final Item FLUORITE_CHESTPLATE = registerItem("fluorite_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.FLUORITE_ARMOR_MATERIAL, ArmorType.CHESTPLATE).repairable(ModItems.FLUORITE))); //Basic Chestplate Item
    public static final Item FLUORITE_LEGGINGS = registerItem("fluorite_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.FLUORITE_ARMOR_MATERIAL, ArmorType.LEGGINGS).repairable(ModItems.FLUORITE))); //Basic Leggings Item
    public static final Item FLUORITE_BOOTS = registerItem("fluorite_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.FLUORITE_ARMOR_MATERIAL, ArmorType.BOOTS).repairable(ModItems.FLUORITE))); //Basic Boots Item
    public static final Item AZURITE_HELMET = registerItem("azurite_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.AZURITE_ARMOR_MATERIAL, ArmorType.HELMET).repairable(ModItems.AZURITE)));
    public static final Item AZURITE_CHESTPLATE = registerItem("azurite_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.AZURITE_ARMOR_MATERIAL, ArmorType.CHESTPLATE).repairable(ModItems.AZURITE)));
    public static final Item AZURITE_LEGGINGS = registerItem("azurite_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.AZURITE_ARMOR_MATERIAL, ArmorType.LEGGINGS).repairable(ModItems.AZURITE)));
    public static final Item AZURITE_BOOTS = registerItem("azurite_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.AZURITE_ARMOR_MATERIAL, ArmorType.BOOTS).repairable(ModItems.AZURITE)));
    public static final Item ALEXANDRITE_SWORD = registerItem("alexandrite_sword", properties -> new Item(properties.sword(ModToolMaterials.ALEXANDRITE, 10, -2.0f).repairable(ModItems.ALEXANDRITE)));
    public static final Item ALEXANDRITE_PICKAXE = registerItem("alexandrite_pickaxe", properties -> new Item(properties.pickaxe(ModToolMaterials.ALEXANDRITE, 5, -2.8f).repairable(ModItems.ALEXANDRITE)));
    public static final Item ALEXANDRITE_SHOVEL = registerItem("alexandrite_shovel", properties -> new ShovelItem(ModToolMaterials.ALEXANDRITE, 6.5f, -3.0f, properties.repairable(ModItems.ALEXANDRITE)));
    public static final Item ALEXANDRITE_AXE = registerItem("alexandrite_axe", properties -> new AxeItem(ModToolMaterials.ALEXANDRITE, 12f, -3.0f, properties.repairable(ModItems.ALEXANDRITE)));
    public static final Item ALEXANDRITE_HOE = registerItem("alexandrite_hoe", properties -> new HoeItem(ModToolMaterials.ALEXANDRITE, 1f, -3.0f, properties.repairable(ModItems.ALEXANDRITE)));
    public static final Item ALEXANDRITE_SPEAR = registerItem("alexandrite_spear", properties -> new Item(properties.spear(ModToolMaterials.ALEXANDRITE, 0.95F, 0.95F, 0.6F, 2.5F, 11.0F, 6.75F, 5.1F, 11.25F, 4.6F).repairable(ModItems.ALEXANDRITE)));

    public static final Item BISMUTH_SWORD = registerItem("bismuth_sword", properties -> new Item(properties.sword(ModToolMaterials.BISMUTH, 10, -2.0f).repairable(ModItems.BISMUTH)));
    public static final Item BISMUTH_PICKAXE = registerItem("bismuth_pickaxe", properties -> new Item(properties.pickaxe(ModToolMaterials.BISMUTH, 5, -2.8f).repairable(ModItems.BISMUTH)));
    public static final Item BISMUTH_SHOVEL = registerItem("bismuth_shovel", properties -> new ShovelItem(ModToolMaterials.BISMUTH, 6.5f, -3.0f, properties.repairable(ModItems.BISMUTH)));
    public static final Item BISMUTH_AXE = registerItem("bismuth_axe", properties -> new AxeItem(ModToolMaterials.BISMUTH, 12f, -3.0f, properties.repairable(ModItems.BISMUTH)));
    public static final Item BISMUTH_HOE = registerItem("bismuth_hoe", properties -> new HoeItem(ModToolMaterials.BISMUTH, 1f, -3.0f, properties.repairable(ModItems.BISMUTH)));
    public static final Item BISMUTH_SPEAR = registerItem("bismuth_spear", properties -> new Item(properties.spear(ModToolMaterials.BISMUTH, 0.95F, 0.95F, 0.6F, 2.5F, 11.0F, 6.75F, 5.1F, 11.25F, 4.6F).repairable(ModItems.BISMUTH)));

    public static final Item PINK_GARNET_SWORD = registerItem("pink_garnet_sword", properties -> new Item(properties.sword(ModToolMaterials.PINK_GARNET, 10, -2.0f).repairable(ModItems.PINK_GARNET)));
    public static final Item PINK_GARNET_PICKAXE = registerItem("pink_garnet_pickaxe", properties -> new Item(properties.pickaxe(ModToolMaterials.PINK_GARNET, 5, -2.8f).repairable(ModItems.PINK_GARNET)));
    public static final Item PINK_GARNET_SHOVEL = registerItem("pink_garnet_shovel", properties -> new ShovelItem(ModToolMaterials.PINK_GARNET, 6.5f, -3.0f, properties.repairable(ModItems.PINK_GARNET)));
    public static final Item PINK_GARNET_AXE = registerItem("pink_garnet_axe", properties -> new AxeItem(ModToolMaterials.PINK_GARNET, 12f, -3.0f, properties.repairable(ModItems.PINK_GARNET)));
    public static final Item PINK_GARNET_HOE = registerItem("pink_garnet_hoe", properties -> new HoeItem(ModToolMaterials.PINK_GARNET, 1f, -3.0f, properties.repairable(ModItems.PINK_GARNET)));
    public static final Item PINK_GARNET_SPEAR = registerItem("pink_garnet_spear", properties -> new Item(properties.spear(ModToolMaterials.PINK_GARNET, 0.95F, 0.95F, 0.6F, 2.5F, 11.0F, 6.75F, 5.1F, 11.25F, 4.6F).repairable(ModItems.PINK_GARNET)));

    public static final Item ZIRCON_SWORD = registerItem("zircon_sword", properties -> new Item(properties.sword(ModToolMaterials.ZIRCON, 10, -2.0f).repairable(ModItems.ZIRCON)));
    public static final Item ZIRCON_PICKAXE = registerItem("zircon_pickaxe", properties -> new Item(properties.pickaxe(ModToolMaterials.ZIRCON, 5, -2.8f).repairable(ModItems.ZIRCON)));
    public static final Item ZIRCON_SHOVEL = registerItem("zircon_shovel", properties -> new ShovelItem(ModToolMaterials.ZIRCON, 6.5f, -3.0f, properties.repairable(ModItems.ZIRCON)));
    public static final Item ZIRCON_AXE = registerItem("zircon_axe", properties -> new AxeItem(ModToolMaterials.ZIRCON, 12f, -3.0f, properties.repairable(ModItems.ZIRCON)));
    public static final Item ZIRCON_HOE = registerItem("zircon_hoe", properties -> new HoeItem(ModToolMaterials.ZIRCON, 1f, -3.0f, properties.repairable(ModItems.ZIRCON)));
    public static final Item ZIRCON_SPEAR = registerItem("zircon_spear", properties -> new Item(properties.spear(ModToolMaterials.ZIRCON, 0.95F, 0.95F, 0.6F, 2.5F, 11.0F, 6.75F, 5.1F, 11.25F, 4.6F).repairable(ModItems.ZIRCON)));

    public static final Item ALEXANDRITE_HELMET = registerItem("alexandrite_helmet", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.ALEXANDRITE_ARMOR_MATERIAL, ArmorType.HELMET).repairable(ModItems.ALEXANDRITE)));
    public static final Item ALEXANDRITE_CHESTPLATE = registerItem("alexandrite_chestplate", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.ALEXANDRITE_ARMOR_MATERIAL, ArmorType.CHESTPLATE).repairable(ModItems.ALEXANDRITE)));
    public static final Item ALEXANDRITE_LEGGINGS = registerItem("alexandrite_leggings", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.ALEXANDRITE_ARMOR_MATERIAL, ArmorType.LEGGINGS).repairable(ModItems.ALEXANDRITE)));
    public static final Item ALEXANDRITE_BOOTS = registerItem("alexandrite_boots", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.ALEXANDRITE_ARMOR_MATERIAL, ArmorType.BOOTS).repairable(ModItems.ALEXANDRITE)));

    public static final Item BISMUTH_HELMET = registerItem("bismuth_helmet", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.BISMUTH_ARMOR_MATERIAL, ArmorType.HELMET).repairable(ModItems.BISMUTH)));
    public static final Item BISMUTH_CHESTPLATE = registerItem("bismuth_chestplate", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.BISMUTH_ARMOR_MATERIAL, ArmorType.CHESTPLATE).repairable(ModItems.BISMUTH)));
    public static final Item BISMUTH_LEGGINGS = registerItem("bismuth_leggings", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.BISMUTH_ARMOR_MATERIAL, ArmorType.LEGGINGS).repairable(ModItems.BISMUTH)));
    public static final Item BISMUTH_BOOTS = registerItem("bismuth_boots", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.BISMUTH_ARMOR_MATERIAL, ArmorType.BOOTS).repairable(ModItems.BISMUTH)));

    public static final Item PINK_GARNET_HELMET = registerItem("pink_garnet_helmet", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorType.HELMET).repairable(ModItems.PINK_GARNET)));
    public static final Item PINK_GARNET_CHESTPLATE = registerItem("pink_garnet_chestplate", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorType.CHESTPLATE).repairable(ModItems.PINK_GARNET)));
    public static final Item PINK_GARNET_LEGGINGS = registerItem("pink_garnet_leggings", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorType.LEGGINGS).repairable(ModItems.PINK_GARNET)));
    public static final Item PINK_GARNET_BOOTS = registerItem("pink_garnet_boots", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorType.BOOTS).repairable(ModItems.PINK_GARNET)));

    public static final Item ZIRCON_HELMET = registerItem("zircon_helmet", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.ZIRCON_ARMOR_MATERIAL, ArmorType.HELMET).repairable(ModItems.ZIRCON)));
    public static final Item ZIRCON_CHESTPLATE = registerItem("zircon_chestplate", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.ZIRCON_ARMOR_MATERIAL, ArmorType.CHESTPLATE).repairable(ModItems.ZIRCON)));
    public static final Item ZIRCON_LEGGINGS = registerItem("zircon_leggings", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.ZIRCON_ARMOR_MATERIAL, ArmorType.LEGGINGS).repairable(ModItems.ZIRCON)));
    public static final Item ZIRCON_BOOTS = registerItem("zircon_boots", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.ZIRCON_ARMOR_MATERIAL, ArmorType.BOOTS).repairable(ModItems.ZIRCON)));

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, name))))); //General Item Register
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID); //Logger to tell us our items our being registered

    }
}