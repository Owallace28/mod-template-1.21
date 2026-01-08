package net.oscar.mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.oscar.mod.Mod;

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

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Mod.MOD_ID, name), item);
    }

    public static void registerModItems()  {
        Mod.LOGGER.info("Registering Mod Items for " + Mod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(GALAXITE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RAW_GALAXITE);
        });



    }


}


