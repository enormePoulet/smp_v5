
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.smpmodv.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.smpmodv.client.model.Modelcustom_model;
import net.mcreator.smpmodv.client.model.Modelcopper_rigth_leg;
import net.mcreator.smpmodv.client.model.Modelcopper_rigth_arm;
import net.mcreator.smpmodv.client.model.Modelcopper_left_leg;
import net.mcreator.smpmodv.client.model.Modelcopper_left_arm;
import net.mcreator.smpmodv.client.model.Modelcopper_center_plate;
import net.mcreator.smpmodv.client.model.Modelcopper_armor;
import net.mcreator.smpmodv.client.model.Modelcopper_2arms;
import net.mcreator.smpmodv.client.model.Modelcloak;
import net.mcreator.smpmodv.client.model.Modelbody;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SmpModVModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(Modelcopper_center_plate.LAYER_LOCATION, Modelcopper_center_plate::createBodyLayer);
		event.registerLayerDefinition(Modelcopper_rigth_arm.LAYER_LOCATION, Modelcopper_rigth_arm::createBodyLayer);
		event.registerLayerDefinition(Modelcopper_left_leg.LAYER_LOCATION, Modelcopper_left_leg::createBodyLayer);
		event.registerLayerDefinition(Modelcopper_armor.LAYER_LOCATION, Modelcopper_armor::createBodyLayer);
		event.registerLayerDefinition(Modelcopper_rigth_leg.LAYER_LOCATION, Modelcopper_rigth_leg::createBodyLayer);
		event.registerLayerDefinition(Modelbody.LAYER_LOCATION, Modelbody::createBodyLayer);
		event.registerLayerDefinition(Modelcopper_2arms.LAYER_LOCATION, Modelcopper_2arms::createBodyLayer);
		event.registerLayerDefinition(Modelcopper_left_arm.LAYER_LOCATION, Modelcopper_left_arm::createBodyLayer);
		event.registerLayerDefinition(Modelcloak.LAYER_LOCATION, Modelcloak::createBodyLayer);
	}
}
