package net.oscar.mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.oscar.mod.Mod;

public class ModItemGroups {
    public static final ItemGroup COSMIC_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Mod.MOD_ID, "cosmic_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.GALAXITE))
                    .displayName(Text.translatable("itemgroup.mod.cosmic_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.GALAXITE);




                    }).build());


    public static void registerItemGroups() {
        Mod.LOGGER.info("Registering Item Groups for " + Mod.MOD_ID);
    }

}
