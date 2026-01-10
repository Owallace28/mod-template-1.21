package net.oscar.mod.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.oscar.mod.Mod;


import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> GALAXITE_ARMOR_MATERIAL = registerArmorMaterial("galaxite",
            () ->new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), typeIntegerEnumMap -> {
                typeIntegerEnumMap.put(ArmorItem.Type.BOOTS, 4);
                typeIntegerEnumMap.put(ArmorItem.Type.LEGGINGS, 8);
                typeIntegerEnumMap.put(ArmorItem.Type.CHESTPLATE, 10);
                typeIntegerEnumMap.put(ArmorItem.Type.HELMET, 4);
                typeIntegerEnumMap.put(ArmorItem.Type.BODY, 15);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.GALAXITE),
                    List.of(new ArmorMaterial.Layer(Identifier.of(Mod.MOD_ID, "galaxite"))), 4.0f, 0.3f));


    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(Mod.MOD_ID, name), material.get());
    }
}
