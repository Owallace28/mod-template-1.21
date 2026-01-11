package net.oscar.mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.oscar.mod.Mod;
import net.oscar.mod.item.custom.ModArmorItem;

import java.util.List;
import java.util.function.Function;

public class ModItems {
    public static final Item GALAXITE = registerItem("galaxite", Item::new);
    public static final Item RAW_GALAXITE = registerItem("raw_galaxite", Item::new);

    public static final Item STARLIGHT_ASHES = registerItem("starlight_ashes", setting -> new Item(setting){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.mod.starlight_ashes.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item GALAXITE_SWORD = registerItem("galaxite_sword",
            setting -> new SwordItem(ModToolMaterials.GALAXITE, 3, -2.4f, setting));

    public static final Item GALAXITE_PICKAXE = registerItem("galaxite_pickaxe",
            setting -> new PickaxeItem(ModToolMaterials.GALAXITE, 1, -2.8f, setting));

    public static final Item GALAXITE_SHOVEL = registerItem("galaxite_shovel",
            setting -> new ShovelItem(ModToolMaterials.GALAXITE, 1.5f, -3.0f, setting));

    public static final Item GALAXITE_AXE = registerItem("galaxite_axe",
            setting -> new AxeItem(ModToolMaterials.GALAXITE, 6, -3.2f, setting));

    public static final Item GALAXITE_HOE = registerItem("galaxite_hoe",
            setting -> new HoeItem(ModToolMaterials.GALAXITE, 0, -3.0f, setting));

    public static final Item GALAXITE_HELMET = registerItem("galaxite_helmet",
            setting -> new ModArmorItem(ModArmorMaterials.GALAXITE_ARMOR_MATERIAL, EquipmentType.HELMET, setting
                    .maxDamage(EquipmentType.HELMET.getMaxDamage(45))));

    public static final Item GALAXITE_CHESTPLATE = registerItem("galaxite_chestplate",
            setting -> new ArmorItem(ModArmorMaterials.GALAXITE_ARMOR_MATERIAL, EquipmentType.CHESTPLATE, setting
                    .maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(45))));

    public static final Item GALAXITE_LEGGINGS = registerItem("galaxite_leggings",
            setting -> new ArmorItem(ModArmorMaterials.GALAXITE_ARMOR_MATERIAL, EquipmentType.LEGGINGS, setting
                    .maxDamage(EquipmentType.LEGGINGS.getMaxDamage(45))));

    public static final Item GALAXITE_BOOTS = registerItem("galaxite_boots",
            setting -> new ArmorItem(ModArmorMaterials.GALAXITE_ARMOR_MATERIAL, EquipmentType.BOOTS, setting
                    .maxDamage(EquipmentType.BOOTS.getMaxDamage(45))));


    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(Mod.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Mod.MOD_ID, name)))));
    }

    public static void registerModItems()  {
        Mod.LOGGER.info("Registering Mod Items for " + Mod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(GALAXITE);
            entries.add(RAW_GALAXITE);
        });






    }


}


