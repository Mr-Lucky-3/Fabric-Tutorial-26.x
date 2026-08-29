package net.lucky.tutorialmod.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.lucky.tutorialmod.TutorialMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.function.Consumer;
import java.util.function.Function;

public class ModItems {
    public static final Item FLUORITE = registerItem("fluorite", Item::new); //Basic Generic Item, No Properties
    public static final Item RAW_FLUORITE = registerItem("raw_fluorite", Item::new);

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

    public static final Item FLUORITE_HELMET = registerItem("fluorite_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.FLUORITE_ARMOR_MATERIAL, ArmorType.HELMET).repairable(ModItems.FLUORITE))); //Basic Helmet Item
    public static final Item FLUORITE_CHESTPLATE = registerItem("fluorite_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.FLUORITE_ARMOR_MATERIAL, ArmorType.CHESTPLATE).repairable(ModItems.FLUORITE))); //Basic Chestplate Item
    public static final Item FLUORITE_LEGGINGS = registerItem("fluorite_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.FLUORITE_ARMOR_MATERIAL, ArmorType.LEGGINGS).repairable(ModItems.FLUORITE))); //Basic Leggings Item
    public static final Item FLUORITE_BOOTS = registerItem("fluorite_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.FLUORITE_ARMOR_MATERIAL, ArmorType.BOOTS).repairable(ModItems.FLUORITE))); //Basic Boots Item


    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, name))))); //General Item Register
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID); //Logger to tell us our items our being registered

    }
}