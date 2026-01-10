package net.oscar.mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
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

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GALAXITE_SWORD)
                .pattern("G")
                .pattern("G")
                .pattern("S")
                .input('G', ModItems.GALAXITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.GALAXITE), conditionsFromItem(ModItems.GALAXITE))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GALAXITE_PICKAXE)
                .pattern("GGG")
                .pattern(" S ")
                .pattern(" S ")
                .input('G', ModItems.GALAXITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.GALAXITE), conditionsFromItem(ModItems.GALAXITE))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GALAXITE_SHOVEL)
                .pattern("G")
                .pattern("S")
                .pattern("S")
                .input('G', ModItems.GALAXITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.GALAXITE), conditionsFromItem(ModItems.GALAXITE))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GALAXITE_AXE)
                .pattern("GG")
                .pattern("GS")
                .pattern(" S")
                .input('G', ModItems.GALAXITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.GALAXITE), conditionsFromItem(ModItems.GALAXITE))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GALAXITE_HOE)
                .pattern("GG")
                .pattern(" S")
                .pattern(" S")
                .input('G', ModItems.GALAXITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.GALAXITE), conditionsFromItem(ModItems.GALAXITE))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GALAXITE_HELMET)
                .pattern("GGG")
                .pattern("G G")
                .pattern("   ")
                .input('G', ModItems.GALAXITE)
                .criterion(hasItem(ModItems.GALAXITE), conditionsFromItem(ModItems.GALAXITE))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GALAXITE_CHESTPLATE)
                .pattern("G G")
                .pattern("GGG")
                .pattern("GGG")
                .input('G', ModItems.GALAXITE)
                .criterion(hasItem(ModItems.GALAXITE), conditionsFromItem(ModItems.GALAXITE))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GALAXITE_LEGGINGS)
                .pattern("GGG")
                .pattern("G G")
                .pattern("G G")
                .input('G', ModItems.GALAXITE)
                .criterion(hasItem(ModItems.GALAXITE), conditionsFromItem(ModItems.GALAXITE))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GALAXITE_BOOTS)
                .pattern("   ")
                .pattern("G G")
                .pattern("G G")
                .input('G', ModItems.GALAXITE)
                .criterion(hasItem(ModItems.GALAXITE), conditionsFromItem(ModItems.GALAXITE))
                .offerTo(recipeExporter);





        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_GALAXITE, 9)
                .input(ModBlocks.RAW_GALAXITE_BLOCK)
                .criterion(hasItem(ModBlocks.RAW_GALAXITE_BLOCK), conditionsFromItem(ModBlocks.RAW_GALAXITE_BLOCK))
                .offerTo(recipeExporter);





    }

}
