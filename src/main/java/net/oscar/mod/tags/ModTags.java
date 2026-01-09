package net.oscar.mod.tags;

import net.minecraft.block.Block;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.oscar.mod.Mod;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_GALAXITE_TOOL = createTag("needs_galaxite_tool");
        public static final TagKey<Block> INCORRECT_FOR_GALAXITE_TOOL = createTag("incorrect_for_galaxite_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Mod.MOD_ID, name));
        }
    }
}
