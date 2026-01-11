package net.oscar.mod.item;

import net.minecraft.item.equipment.EquipmentModel;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.oscar.mod.Mod;
import net.oscar.mod.tags.ModTags;

import java.util.EnumMap;

public class ModArmorMaterials {
    public static EquipmentModel GALAXITE = EquipmentModel.builder().addHumanoidLayers(Identifier.of(Mod.MOD_ID, "galaxite")).build();

    public static final net.minecraft.item.equipment.ArmorMaterial GALAXITE_ARMOR_MATERIAL = new net.minecraft.item.equipment.ArmorMaterial(500, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 2);
        map.put(EquipmentType.LEGGINGS, 4);
        map.put(EquipmentType.CHESTPLATE, 6);
        map.put(EquipmentType.HELMET, 2);
        map.put(EquipmentType.BODY, 4);
    }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0, 0, ModTags.Items.GALAXITE_REPAIR,
            Identifier.of(Mod.MOD_ID, "galaxite"));
}
