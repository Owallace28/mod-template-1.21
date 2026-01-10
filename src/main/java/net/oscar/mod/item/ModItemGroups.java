package net.oscar.mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.oscar.mod.Mod;
import net.oscar.mod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup COSMIC_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Mod.MOD_ID, "cosmic_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RAW_GALAXITE))
                    .displayName(Text.translatable("itemgroup.mod.cosmic_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.GALAXITE);
                        entries.add(ModItems.RAW_GALAXITE);

                        entries.add(ModItems.STARLIGHT_ASHES);





                    }).build());
    public static final ItemGroup COSMIC_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Mod.MOD_ID, "cosmic_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.RAW_GALAXITE_BLOCK))
                    .displayName(Text.translatable("itemgroup.mod.cosmic_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.GALAXITE_BLOCK);
                        entries.add(ModBlocks.RAW_GALAXITE_BLOCK);

                        entries.add(ModBlocks.GALAXITE_ORE);
                        entries.add(ModBlocks.GALAXITE_DEEPSLATE_ORE);






                    }).build());
        public static final ItemGroup COSMIC_TOOLS_GROUP = Registry.register(Registries.ITEM_GROUP,
                Identifier.of(Mod.MOD_ID, "cosmic_tools"),
                FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.GALAXITE_PICKAXE))
                        .displayName(Text.translatable("itemgroup.mod.cosmic_tools"))
                        .entries((displayContext, entries) -> {

                            entries.add(ModItems.GALAXITE_PICKAXE);
                            entries.add(ModItems.GALAXITE_SHOVEL);
                            entries.add(ModItems.GALAXITE_AXE);
                            entries.add(ModItems.GALAXITE_HOE);





                        }).build());
    public static final ItemGroup COSMIC_WEAPONS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Mod.MOD_ID, "cosmic_weapons"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.GALAXITE_SWORD))
                    .displayName(Text.translatable("itemgroup.mod.cosmic_weapons"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.GALAXITE_SWORD);






                    }).build());
    public static final ItemGroup COSMIC_ARMOR_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Mod.MOD_ID, "cosmic_armor"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.GALAXITE_CHESTPLATE))
                    .displayName(Text.translatable("itemgroup.mod.cosmic_armor"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.GALAXITE_HELMET);
                        entries.add(ModItems.GALAXITE_CHESTPLATE);
                        entries.add(ModItems.GALAXITE_LEGGINGS);
                        entries.add(ModItems.GALAXITE_BOOTS);






                    }).build());


    public static void registerItemGroups() {
        Mod.LOGGER.info("Registering Item Groups for " + Mod.MOD_ID);
    }

}
