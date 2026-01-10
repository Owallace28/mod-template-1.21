package net.oscar.mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.oscar.mod.block.ModBlocks;
import net.oscar.mod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GALAXITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_GALAXITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GALAXITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GALAXITE_DEEPSLATE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.GALAXITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_GALAXITE, Models.GENERATED);

        itemModelGenerator.register(ModItems.STARLIGHT_ASHES, Models.GENERATED);

        itemModelGenerator.register(ModItems.GALAXITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GALAXITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GALAXITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GALAXITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GALAXITE_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GALAXITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GALAXITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GALAXITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GALAXITE_BOOTS));

    }
}
