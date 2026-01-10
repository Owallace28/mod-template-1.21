package net.oscar.mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.oscar.mod.Mod;
import net.oscar.mod.item.custom.ModArmorItem;

import java.util.List;

public class ModItems {
    public static final Item GALAXITE = registerItem("galaxite", new Item(new Item.Settings()));
    public static final Item RAW_GALAXITE = registerItem("raw_galaxite", new Item(new Item.Settings()));

    public static final Item STARLIGHT_ASHES = registerItem("starlight_ashes", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.mod.starlight_ashes.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item GALAXITE_SWORD = registerItem("galaxite_sword",
            new SwordItem(ModToolMaterials.GALAXITE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.GALAXITE, 3, -2.4f))));

    public static final Item GALAXITE_PICKAXE = registerItem("galaxite_pickaxe",
            new PickaxeItem(ModToolMaterials.GALAXITE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.GALAXITE, 1, -2.8f))));

    public static final Item GALAXITE_SHOVEL = registerItem("galaxite_shovel",
            new ShovelItem(ModToolMaterials.GALAXITE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.GALAXITE, 1.5f, -3.0f))));

    public static final Item GALAXITE_AXE = registerItem("galaxite_axe",
            new AxeItem(ModToolMaterials.GALAXITE, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.GALAXITE, 6, -3.2f))));

    public static final Item GALAXITE_HOE = registerItem("galaxite_hoe",
            new HoeItem(ModToolMaterials.GALAXITE, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.GALAXITE, 0, -3.0f))));

    public static final Item GALAXITE_HELMET = registerItem("galaxite_helmet",
            new ModArmorItem(ModArmorMaterials.GALAXITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(45))));

    public static final Item GALAXITE_CHESTPLATE = registerItem("galaxite_chestplate",
            new ArmorItem(ModArmorMaterials.GALAXITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(45))));

    public static final Item GALAXITE_LEGGINGS = registerItem("galaxite_leggings",
            new ArmorItem(ModArmorMaterials.GALAXITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(45))));

    public static final Item GALAXITE_BOOTS = registerItem("galaxite_boots",
            new ArmorItem(ModArmorMaterials.GALAXITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(45))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Mod.MOD_ID, name), item);

    }

    public static void registerModItems()  {
        Mod.LOGGER.info("Registering Mod Items for " + Mod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(GALAXITE);
            entries.add(RAW_GALAXITE);
        });






    }


}


