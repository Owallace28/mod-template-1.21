package net.oscar.mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.oscar.mod.item.ModItems;
import net.oscar.mod.tags.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;


public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }



    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.GALAXITE_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.GALAXITE_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.GALAXITE_SHOVEL);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.GALAXITE_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.GALAXITE_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.GALAXITE_HELMET)
                .add(ModItems.GALAXITE_CHESTPLATE)
                .add(ModItems.GALAXITE_LEGGINGS)
                .add(ModItems.GALAXITE_BOOTS);

        getOrCreateTagBuilder(ItemTags.ARMOR_ENCHANTABLE)
                .add(ModItems.GALAXITE_HELMET)
                .add(ModItems.GALAXITE_CHESTPLATE)
                .add(ModItems.GALAXITE_LEGGINGS)
                .add(ModItems.GALAXITE_BOOTS);



    }

}
