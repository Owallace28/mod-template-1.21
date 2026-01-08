package net.oscar.mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.ShapelessRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.oscar.mod.block.ModBlocks;
import net.oscar.mod.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {

        List<ItemConvertible> GALAXITE_SMELTABLES = List.of(ModItems.RAW_GALAXITE, ModBlocks.GALAXITE_ORE,
            ModBlocks.GALAXITE_DEEPSLATE_ORE);

        offerSmelting(recipeExporter, GALAXITE_SMELTABLES, RecipeCategory.MISC, ModItems.GALAXITE, 0.25f, 200, "galaxite");
        offerBlasting(recipeExporter, GALAXITE_SMELTABLES, RecipeCategory.MISC, ModItems.GALAXITE, 0.25f, 100, "galaxite");

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.GALAXITE, RecipeCategory.DECORATIONS, ModBlocks.GALAXITE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_GALAXITE_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.RAW_GALAXITE)
                .criterion(hasItem(ModItems.RAW_GALAXITE), conditionsFromItem(ModItems.RAW_GALAXITE))
                .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_GALAXITE, 9)
                .input(ModBlocks.RAW_GALAXITE_BLOCK)
                .criterion(hasItem(ModBlocks.RAW_GALAXITE_BLOCK), conditionsFromItem(ModBlocks.RAW_GALAXITE_BLOCK))
                .offerTo(recipeExporter);





    }

}
