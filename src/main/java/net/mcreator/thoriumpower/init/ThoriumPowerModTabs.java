
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thoriumpower.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.thoriumpower.ThoriumPowerMod;

public class ThoriumPowerModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ThoriumPowerMod.MODID);
	public static final RegistryObject<CreativeModeTab> THORIUM_POWER_CREATIVE_TAB = REGISTRY.register("thorium_power_creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.thorium_power.thorium_power_creative_tab")).icon(() -> new ItemStack(ThoriumPowerModItems.THORIUM_INGOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ThoriumPowerModItems.THORIUM_INGOT.get());
				tabData.accept(ThoriumPowerModItems.RAW_THORIUM.get());
				tabData.accept(ThoriumPowerModItems.THORIUM_NUGGET.get());
				tabData.accept(ThoriumPowerModBlocks.THORIUM_ORE_STONE.get().asItem());
				tabData.accept(ThoriumPowerModBlocks.THORIUM_ORE_DEEPSLATE.get().asItem());
				tabData.accept(ThoriumPowerModBlocks.RAW_THORIUM_BLOCK.get().asItem());
				tabData.accept(ThoriumPowerModBlocks.THORIUM_BLOCK.get().asItem());
				tabData.accept(ThoriumPowerModBlocks.THORIUM_RADIOISOTOPE_THERMOELECTRIC_GENERATOR.get().asItem());
			})

					.build());
}
