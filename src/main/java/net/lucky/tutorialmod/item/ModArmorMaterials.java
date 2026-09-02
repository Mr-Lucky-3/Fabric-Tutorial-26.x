package net.lucky.tutorialmod.item;

import net.lucky.tutorialmod.TutorialMod;
import net.lucky.tutorialmod.tags.ModTags;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.EquipmentAsset;

public class ModArmorMaterials {
    public static final ResourceKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY =
            ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset")); //Defines key as equipment

    public static final ResourceKey<EquipmentAsset> FLUORITE_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "fluorite")); //Creates key for material
    public static final ResourceKey<EquipmentAsset> AZURITE_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "azurite"));
    public static final ResourceKey<EquipmentAsset> ALEXANDRITE_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "alexandrite"));
    public static final ResourceKey<EquipmentAsset> BISMUTH_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "bismuth"));
    public static final ResourceKey<EquipmentAsset> PINK_GARNET_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "pink_garnet"));
    public static final ResourceKey<EquipmentAsset> ZIRCON_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "zircon"));

    public static final ArmorMaterial FLUORITE_ARMOR_MATERIAL = new ArmorMaterial(40    , ArmorMaterials.makeDefense(3, 7, 9, 4, 20), 20, SoundEvents.ARMOR_EQUIP_CHAIN, 4, 0.2f, ModTags.Items.FLUORITE_REPAIR, FLUORITE_KEY); //Basic Armor Tier/Material
    public static final ArmorMaterial AZURITE_ARMOR_MATERIAL = new ArmorMaterial(40    , ArmorMaterials.makeDefense(3, 7, 9, 4, 20), 20, SoundEvents.ARMOR_EQUIP_CHAIN, 4, 0.2f, ModTags.Items.AZURITE_REPAIR, AZURITE_KEY);
    public static final ArmorMaterial ALEXANDRITE_ARMOR_MATERIAL = new ArmorMaterial(40, ArmorMaterials.makeDefense(3, 7, 9, 4, 20), 20, SoundEvents.ARMOR_EQUIP_CHAIN, 4, 0.2f, ModTags.Items.ALEXANDRITE_REPAIR, ALEXANDRITE_KEY);
    public static final ArmorMaterial BISMUTH_ARMOR_MATERIAL = new ArmorMaterial(40, ArmorMaterials.makeDefense(3, 7, 9, 4, 20), 20, SoundEvents.ARMOR_EQUIP_CHAIN, 4, 0.2f, ModTags.Items.BISMUTH_REPAIR, BISMUTH_KEY);
    public static final ArmorMaterial PINK_GARNET_ARMOR_MATERIAL = new ArmorMaterial(40, ArmorMaterials.makeDefense(3, 7, 9, 4, 20), 20, SoundEvents.ARMOR_EQUIP_CHAIN, 4, 0.2f, ModTags.Items.PINK_GARNET_REPAIR, PINK_GARNET_KEY);
    public static final ArmorMaterial ZIRCON_ARMOR_MATERIAL = new ArmorMaterial(40, ArmorMaterials.makeDefense(3, 7, 9, 4, 20), 20, SoundEvents.ARMOR_EQUIP_CHAIN, 4, 0.2f, ModTags.Items.ZIRCON_REPAIR, ZIRCON_KEY);
}