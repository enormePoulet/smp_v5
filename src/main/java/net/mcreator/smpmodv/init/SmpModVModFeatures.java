
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.smpmodv.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.smpmodv.world.features.ores.TitaniumOreFeature;
import net.mcreator.smpmodv.world.features.ores.DeepslatetitaniumoreFeature;
import net.mcreator.smpmodv.SmpModVMod;

@Mod.EventBusSubscriber
public class SmpModVModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, SmpModVMod.MODID);
	public static final RegistryObject<Feature<?>> TITANIUM_ORE = REGISTRY.register("titanium_ore", TitaniumOreFeature::feature);
	public static final RegistryObject<Feature<?>> DEEPSLATETITANIUMORE = REGISTRY.register("deepslatetitaniumore", DeepslatetitaniumoreFeature::feature);
}
