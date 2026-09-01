package net.lucky.tutorialmod.item;

import net.lucky.tutorialmod.tags.ModTags;
import net.minecraft.world.item.ToolMaterial;

public class ModToolMaterials {
    public static final ToolMaterial FLUORITE = new ToolMaterial(ModTags.Blocks.INCORRECT_FOR_FLUORITE_TOOL,
            2500, 11f, 6f, 20, ModTags.Items.FLUORITE_REPAIR); //Defines the name for the tool material
    public static final ToolMaterial AZURITE = new ToolMaterial(ModTags.Blocks.INCORRECT_FOR_AZURITE_TOOL,
            2500, 11f, 6f, 20, ModTags.Items.AZURITE_REPAIR);

}