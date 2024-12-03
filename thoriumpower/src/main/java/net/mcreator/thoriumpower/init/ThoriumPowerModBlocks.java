
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thoriumpower.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.thoriumpower.block.ThoriumRadioisotopeThermoelectricGeneratorBlock;
import net.mcreator.thoriumpower.block.ThoriumOreStoneBlock;
import net.mcreator.thoriumpower.block.ThoriumOreDeepslateBlock;
import net.mcreator.thoriumpower.block.ThoriumBlockBlock;
import net.mcreator.thoriumpower.block.RawThoriumBlockBlock;
import net.mcreator.thoriumpower.ThoriumPowerMod;

public class ThoriumPowerModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ThoriumPowerMod.MODID);
	public static final RegistryObject<Block> THORIUM_ORE_STONE = REGISTRY.register("thorium_ore_stone", () -> new ThoriumOreStoneBlock());
	public static final RegistryObject<Block> THORIUM_ORE_DEEPSLATE = REGISTRY.register("thorium_ore_deepslate", () -> new ThoriumOreDeepslateBlock());
	public static final RegistryObject<Block> RAW_THORIUM_BLOCK = REGISTRY.register("raw_thorium_block", () -> new RawThoriumBlockBlock());
	public static final RegistryObject<Block> THORIUM_BLOCK = REGISTRY.register("thorium_block", () -> new ThoriumBlockBlock());
	public static final RegistryObject<Block> THORIUM_RADIOISOTOPE_THERMOELECTRIC_GENERATOR = REGISTRY.register("thorium_radioisotope_thermoelectric_generator", () -> new ThoriumRadioisotopeThermoelectricGeneratorBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
