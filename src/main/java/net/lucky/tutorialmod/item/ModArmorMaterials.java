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

    public static final ArmorMaterial FLUORITE_ARMOR_MATERIAL = new ArmorMaterial(750,
            ArmorMaterials.makeDefense(3, 7, 9, 4, 20),
            20, SoundEvents.ARMOR_EQUIP_CHAIN, 4, 0.2f, ModTags.Items.FLUORITE_REPAIR, FLUORITE_KEY); //Basic Armor Tier/Material

}