
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thoriumpower.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.thoriumpower.block.entity.ThoriumRadioisotopeThermoelectricGeneratorBlockEntity;
import net.mcreator.thoriumpower.ThoriumPowerMod;

public class ThoriumPowerModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ThoriumPowerMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> THORIUM_RADIOISOTOPE_THERMOELECTRIC_GENERATOR = register("thorium_radioisotope_thermoelectric_generator", ThoriumPowerModBlocks.THORIUM_RADIOISOTOPE_THERMOELECTRIC_GENERATOR,
			ThoriumRadioisotopeThermoelectricGeneratorBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
