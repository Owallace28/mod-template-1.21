package net.oscar.mod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.oscar.mod.block.ModBlocks;
import net.oscar.mod.component.ModDataComponentTypes;
import net.oscar.mod.item.ModItemGroups;
import net.oscar.mod.item.ModItems;
import net.oscar.mod.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mod implements ModInitializer {
	public static final String MOD_ID = "mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

		ModBlocks.registerModBlocks();

		ModDataComponentTypes.registerDataComponentTypes();

		ModWorldGeneration.generateModWorldGen();

		FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 30000);

	}
}