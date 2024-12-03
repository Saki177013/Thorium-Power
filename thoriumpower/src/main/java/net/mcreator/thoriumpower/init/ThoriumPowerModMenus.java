
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thoriumpower.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.thoriumpower.world.inventory.ThoriumRadioisotopeThermalelectricGeneratorGUIMenu;
import net.mcreator.thoriumpower.ThoriumPowerMod;

public class ThoriumPowerModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ThoriumPowerMod.MODID);
	public static final RegistryObject<MenuType<ThoriumRadioisotopeThermalelectricGeneratorGUIMenu>> THORIUM_RADIOISOTOPE_THERMALELECTRIC_GENERATOR_GUI = REGISTRY.register("thorium_radioisotope_thermalelectric_generator_gui",
			() -> IForgeMenuType.create(ThoriumRadioisotopeThermalelectricGeneratorGUIMenu::new));
}
