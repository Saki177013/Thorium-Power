
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thoriumpower.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.thoriumpower.item.ThoriumNuggetItem;
import net.mcreator.thoriumpower.item.ThoriumIngotItem;
import net.mcreator.thoriumpower.item.RawThoriumItem;
import net.mcreator.thoriumpower.ThoriumPowerMod;

public class ThoriumPowerModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ThoriumPowerMod.MODID);
	public static final RegistryObject<Item> THORIUM_INGOT = REGISTRY.register("thorium_ingot", () -> new ThoriumIngotItem());
	public static final RegistryObject<Item> RAW_THORIUM = REGISTRY.register("raw_thorium", () -> new RawThoriumItem());
	public static final RegistryObject<Item> THORIUM_NUGGET = REGISTRY.register("thorium_nugget", () -> new ThoriumNuggetItem());
	public static final RegistryObject<Item> THORIUM_ORE_STONE = block(ThoriumPowerModBlocks.THORIUM_ORE_STONE);
	public static final RegistryObject<Item> THORIUM_ORE_DEEPSLATE = block(ThoriumPowerModBlocks.THORIUM_ORE_DEEPSLATE);
	public static final RegistryObject<Item> RAW_THORIUM_BLOCK = block(ThoriumPowerModBlocks.RAW_THORIUM_BLOCK);
	public static final RegistryObject<Item> THORIUM_BLOCK = block(ThoriumPowerModBlocks.THORIUM_BLOCK);
	public static final RegistryObject<Item> THORIUM_RADIOISOTOPE_THERMOELECTRIC_GENERATOR = block(ThoriumPowerModBlocks.THORIUM_RADIOISOTOPE_THERMOELECTRIC_GENERATOR);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
