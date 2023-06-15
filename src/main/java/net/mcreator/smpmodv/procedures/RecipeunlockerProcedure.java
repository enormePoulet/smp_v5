package net.mcreator.smpmodv.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nullable;

import java.util.Collections;

@Mod.EventBusSubscriber
public class RecipeunlockerProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel ? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("smp_mod_v:quest_1"))).isDone() : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("minecraft:amethystmagicnecklace")});
		} else {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.server.getRecipeManager().byKey(new ResourceLocation("minecraft:amethystmagicnecklace")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
		}
		if (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel ? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("smp_mod_v:quest_2"))).isDone() : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("minecraft:alchemytablerecipe")});
		} else {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.server.getRecipeManager().byKey(new ResourceLocation("minecraft:alchemytablerecipe")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
		}
		if (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel ? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("smp_mod_v:quest_3"))).isDone() : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("minecraft:squeezerrecipe")});
		} else {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.server.getRecipeManager().byKey(new ResourceLocation("minecraft:squeezerrecipe")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
		}
		if (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel ? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("smp_mod_v:quest_4"))).isDone() : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("minecraft:coppercorerecipe")});
		} else {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.server.getRecipeManager().byKey(new ResourceLocation("minecraft:coppercorerecipe")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
		}
		if (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel ? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("smp_mod_v:quest_6"))).isDone() : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("minecraft:cropgrowerrecipe")});
		} else {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.server.getRecipeManager().byKey(new ResourceLocation("minecraft:cropgrowerrecipe")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
		}
		if (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel ? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("smp_mod_v:quest_7"))).isDone() : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("minecraft:amethystswordrecipe")});
		} else {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.server.getRecipeManager().byKey(new ResourceLocation("minecraft:amethystswordrecipe")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
		}
		if (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel ? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("smp_mod_v:quest_8"))).isDone() : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("minecraft:whitehoodrecipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("minecraft:whitecloakrecipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("minecraft:lightgrayhoodrecipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("minecraft:lightgraycloakrecipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("minecraft:grayhoodrecipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("minecraft:graycloakrecipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("minecraft:blackhoodrecipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("minecraft:blackcloakrecipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("minecraft:browncloakrecipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("minecraft:brownhoodrecipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("minecraft:greencloakrecipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("minecraft:greenhoodrecipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("minecraft:limecloakrecipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("minecraft:limehoodrecipe")});
		} else {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.server.getRecipeManager().byKey(new ResourceLocation("minecraft:whitehoodrecipe")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.server.getRecipeManager().byKey(new ResourceLocation("minecraft:whitecloakrecipe")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.server.getRecipeManager().byKey(new ResourceLocation("minecraft:lightgrayhoodrecipe")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.server.getRecipeManager().byKey(new ResourceLocation("minecraft:lightgraycloakrecipe")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.server.getRecipeManager().byKey(new ResourceLocation("minecraft:grayhoodrecipe")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.server.getRecipeManager().byKey(new ResourceLocation("minecraft:graycloakrecipe")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.server.getRecipeManager().byKey(new ResourceLocation("minecraft:blackhoodrecipe")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.server.getRecipeManager().byKey(new ResourceLocation("minecraft:blackcloakrecipe")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.server.getRecipeManager().byKey(new ResourceLocation("minecraft:browncloakrecipe")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.server.getRecipeManager().byKey(new ResourceLocation("minecraft:brownhoodrecipe")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.server.getRecipeManager().byKey(new ResourceLocation("minecraft:greencloakrecipe")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.server.getRecipeManager().byKey(new ResourceLocation("minecraft:greenhoodrecipe")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.server.getRecipeManager().byKey(new ResourceLocation("minecraft:limecloakrecipe")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.server.getRecipeManager().byKey(new ResourceLocation("minecraft:limehoodrecipe")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
		}
	}
}
