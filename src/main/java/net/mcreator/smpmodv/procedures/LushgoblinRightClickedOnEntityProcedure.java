package net.mcreator.smpmodv.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.smpmodv.init.SmpModVModItems;
import net.mcreator.smpmodv.init.SmpModVModBlocks;
import net.mcreator.smpmodv.SmpModVMod;

import java.util.Iterator;

public class LushgoblinRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		if (!(sourceentity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel ? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("smp_mod_v:quest_1"))).isDone() : false)) {
			if (sourceentity.getPersistentData().getBoolean("accepted1") == true) {
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.AMETHYST_SHARD) {
					if ((itemstack).getCount() >= 5) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"tellraw @p [\"\",{\"text\":\"[Jeweler]\",\"color\":\"light_purple\"},{\"text\":\" tu les as trouv\u00E9! merci a toi, voila ta r\u00E9compense!\",\"color\":\"black\"}]");
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.celebrate")), SoundSource.NEUTRAL, 3, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.celebrate")), SoundSource.NEUTRAL, 3, 1, false);
							}
						}
						if (sourceentity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("smp_mod_v:quest_1"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								Iterator _iterator = _ap.getRemainingCriteria().iterator();
								while (_iterator.hasNext())
									_player.getAdvancements().award(_adv, (String) _iterator.next());
							}
						}
						if (sourceentity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(SmpModVModItems.AMETHYSTNECKLACE_CHESTPLATE.get());
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				}
			}
			if (sourceentity.getPersistentData().getBoolean("accepted1") == false) {
				if (entity.getPersistentData().getBoolean("quest1") == true) {
					sourceentity.getPersistentData().putBoolean("accepted1", (true));
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"tellraw @p [\"\",{\"text\":\"[Jeweler]\",\"color\":\"light_purple\"},{\"text\":\" salut toi!\",\"color\":\"black\"}]");
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 3, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 3, 1, false);
						}
					}
					SmpModVMod.queueServerWork(20, () -> {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"tellraw @p [\"\",{\"text\":\"[Jeweler]\",\"color\":\"light_purple\"},{\"text\":\" pourrais tu m'aider?\",\"color\":\"black\"}]");
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1, false);
							}
						}
						SmpModVMod.queueServerWork(20, () -> {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"tellraw @p [\"\",{\"text\":\"[Jeweler]\",\"color\":\"light_purple\"},{\"text\":\" jai besoin de \",\"color\":\"black\"},{\"text\":\"x 5 \u00E9clat d'amethyste!\",\"color\":\"light_purple\"}]");
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 3, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 3, 1, false);
								}
							}
							SmpModVMod.queueServerWork(20, () -> {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"tellraw @p [\"\",{\"text\":\"[Jeweler]\",\"color\":\"light_purple\"},{\"text\":\" en \u00E9change je t'offrirais un joli \",\"color\":\"black\"},{\"text\":\"colier magique d'amethyste\",\"color\":\"light_purple\"}]");
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1, false);
									}
								}
								SmpModVMod.queueServerWork(20, () -> {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"tellraw @p [\"\",{\"text\":\"[Jeweler]\",\"color\":\"light_purple\"},{\"text\":\" merci beaucoup!\",\"color\":\"black\"}]");
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1, false);
										}
									}
								});
							});
						});
					});
				}
			}
		}
		if (entity.getPersistentData().getBoolean("quest1") == true) {
			if (sourceentity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel ? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("smp_mod_v:quest_1"))).isDone() : false) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"tellraw @p [\"\",{\"text\":\"[Jeweler]\",\"color\":\"light_purple\"},{\"text\":\" ton aide etait la bienvenue!\",\"color\":\"black\"}]");
			}
		}
		if (!(sourceentity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel ? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("smp_mod_v:quest_2"))).isDone() : false)) {
			if (sourceentity.getPersistentData().getBoolean("accepted2") == true) {
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == SmpModVModItems.HERMITCRABSCUT.get()) {
					if ((itemstack).getCount() >= 7) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"tellraw @p [\"\",{\"text\":\"[Brewer]\",\"color\":\"dark_green\"},{\"text\":\" tu as reussi a t'en procurer? tr\u00E9s bien! voila ta r\u00E9compense\",\"color\":\"black\"}]");
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.celebrate")), SoundSource.NEUTRAL, 3, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.celebrate")), SoundSource.NEUTRAL, 3, 1, false);
							}
						}
						if (sourceentity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("smp_mod_v:quest_2"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								Iterator _iterator = _ap.getRemainingCriteria().iterator();
								while (_iterator.hasNext())
									_player.getAdvancements().award(_adv, (String) _iterator.next());
							}
						}
						if (sourceentity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(SmpModVModBlocks.ALCHEMYTABLE.get());
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				}
			}
			if (sourceentity.getPersistentData().getBoolean("accepted2") == false) {
				if (entity.getPersistentData().getBoolean("quest2") == true) {
					sourceentity.getPersistentData().putBoolean("accepted2", (true));
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"tellraw @p [\"\",{\"text\":\"[Brewer]\",\"color\":\"dark_green\"},{\"text\":\" Bonjour jeune aventurier.e!\",\"color\":\"black\"}]");
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 3, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 3, 1, false);
						}
					}
					SmpModVMod.queueServerWork(20, () -> {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"tellraw @p [\"\",{\"text\":\"[Brewer]\",\"color\":\"dark_green\"},{\"text\":\" Pourriez vous me donnez un coup de main?\",\"color\":\"black\"}]");
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1, false);
							}
						}
						SmpModVMod.queueServerWork(20, () -> {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"tellraw @p [\"\",{\"text\":\"[Brewer]\",\"color\":\"dark_green\"},{\"text\":\" Il faudrait que vous vous procuriez \",\"color\":\"black\"},{\"text\":\"x7 ecaille de bernard l'hermite \",\"color\":\"gold\"},{\"text\":\"pour moi.\",\"color\":\"black\"}]");
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 3, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 3, 1, false);
								}
							}
							SmpModVMod.queueServerWork(20, () -> {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"tellraw @p [\"\",{\"text\":\"[Brewer]\",\"color\":\"dark_green\"},{\"text\":\" une jolie r\u00E9compense vous attend a la fin!\",\"color\":\"black\"}]");
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1, false);
									}
								}
								SmpModVMod.queueServerWork(20, () -> {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"tellraw @p [\"\",{\"text\":\"[Brewer]\",\"color\":\"dark_green\"},{\"text\":\" merci d'avoir accept\u00E9!\",\"color\":\"black\"}]");
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1, false);
										}
									}
								});
							});
						});
					});
				}
			}
		}
		if (entity.getPersistentData().getBoolean("quest2") == true) {
			if (sourceentity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel ? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("smp_mod_v:quest_2"))).isDone() : false) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"tellraw @p [\"\",{\"text\":\"[Brewer]\",\"color\":\"dark_green\"},{\"text\":\" votre aide m'etait tr\u00E9s utile dans mes recherches\",\"color\":\"black\"}]");
			}
		}
		if (!(sourceentity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel ? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("smp_mod_v:quest_3"))).isDone() : false)) {
			if (sourceentity.getPersistentData().getBoolean("accepted3") == true) {
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.GLOW_BERRIES) {
					if ((itemstack).getCount() >= 32) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"/tellraw @a [\"\",{\"text\":\"[Barman]\",\"color\":\"gold\"},{\"text\":\" voila pour toi! passe boire un coup un de ces 4\",\"color\":\"black\"}]");
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.celebrate")), SoundSource.NEUTRAL, 3, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.celebrate")), SoundSource.NEUTRAL, 3, 1, false);
							}
						}
						if (sourceentity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("smp_mod_v:quest_3"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								Iterator _iterator = _ap.getRemainingCriteria().iterator();
								while (_iterator.hasNext())
									_player.getAdvancements().award(_adv, (String) _iterator.next());
							}
						}
						if (sourceentity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(SmpModVModBlocks.SQUEEZER.get());
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				}
			}
			if (sourceentity.getPersistentData().getBoolean("accepted3") == false) {
				if (entity.getPersistentData().getBoolean("quest3") == true) {
					sourceentity.getPersistentData().putBoolean("accepted3", (true));
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"/tellraw @a [\"\",{\"text\":\"[Barman]\",\"color\":\"gold\"},{\"text\":\" salut toi!\",\"color\":\"black\"}]");
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 3, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 3, 1, false);
						}
					}
					SmpModVMod.queueServerWork(20, () -> {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"/tellraw @a [\"\",{\"text\":\"[Barman]\",\"color\":\"gold\"},{\"text\":\" tu pourrais me donner une coup de main?\",\"color\":\"black\"}]");
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1, false);
							}
						}
						SmpModVMod.queueServerWork(20, () -> {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"/tellraw @a [\"\",{\"text\":\"[Barman]\",\"color\":\"gold\"},{\"text\":\" mon stock de \",\"color\":\"black\"},{\"text\":\"glow berries\",\"color\":\"gold\"},{\"text\":\" est un peu en retard\",\"color\":\"black\"}]");
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 3, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 3, 1, false);
								}
							}
							SmpModVMod.queueServerWork(20, () -> {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"/tellraw @a [\"\",{\"text\":\"[Barman]\",\"color\":\"gold\"},{\"text\":\" tu pourrais t'en procurer \",\"color\":\"black\"},{\"text\":\"x32 glow berries\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"? je te recompenserai genereusement!\",\"color\":\"black\"}]");
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1, false);
									}
								}
								SmpModVMod.queueServerWork(20, () -> {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"/tellraw @a [\"\",{\"text\":\"[Barman]\",\"color\":\"gold\"},{\"text\":\" merci beaucoup! et a bientot!\",\"color\":\"black\"}]");
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1, false);
										}
									}
								});
							});
						});
					});
				}
			}
		}
		if (entity.getPersistentData().getBoolean("quest3") == true) {
			if (sourceentity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel ? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("smp_mod_v:quest_3"))).isDone() : false) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/tellraw @a [\"\",{\"text\":\"[Barman]\",\"color\":\"gold\"},{\"text\":\" salut! tu es venu pour un rafraichissement?\",\"color\":\"black\"}]");
			}
		}
		if (!(sourceentity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel ? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("smp_mod_v:quest_4"))).isDone() : false)) {
			if (sourceentity.getPersistentData().getBoolean("accepted4") == true) {
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == SmpModVModItems.ANCIENTRUNE.get()) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"/tellraw @p [\"\",{\"text\":\"[Traveler] \",\"color\":\"#DE6B44\"},{\"text\":\"je te revaudrait ca un de ces jours!\",\"color\":\"black\"}]");
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.celebrate")), SoundSource.NEUTRAL, 3, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.celebrate")), SoundSource.NEUTRAL, 3, 1, false);
						}
					}
					if (sourceentity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.AIR);
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					SmpModVMod.queueServerWork(20, () -> {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"/tellraw @a [\"\",{\"text\":\"[Traveler]\",\"color\":\"#DE6B44\"},{\"text\":\"OH! j'allais oubli\u00E9 voila ta r\u00E9compense! je lai trouv\u00E9 en me baladant dans le royaume des nains\",\"color\":\"black\"}]");
						if (sourceentity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(SmpModVModItems.COPPERCORE.get());
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
						if (sourceentity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("smp_mod_v:quest_4"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								Iterator _iterator = _ap.getRemainingCriteria().iterator();
								while (_iterator.hasNext())
									_player.getAdvancements().award(_adv, (String) _iterator.next());
							}
						}
					});
				}
			}
			if (sourceentity.getPersistentData().getBoolean("accepted4") == false) {
				if (entity.getPersistentData().getBoolean("quest4") == true) {
					sourceentity.getPersistentData().putBoolean("accepted4", (true));
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"/tellraw @p [\"\",{\"text\":\"[Traveler] \",\"color\":\"#DE6B44\"},{\"text\":\"h\u00E9ho toi la!\",\"color\":\"black\"}]");
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 3, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 3, 1, false);
						}
					}
					SmpModVMod.queueServerWork(20, () -> {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"/tellraw @p [\"\",{\"text\":\"[Traveler] \",\"color\":\"#DE6B44\"},{\"text\":\"tu peut m'aider?\",\"color\":\"black\"}]");
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1, false);
							}
						}
						SmpModVMod.queueServerWork(20, () -> {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"/tellraw @p [\"\",{\"text\":\"[Traveler]\",\"color\":\"#DE6B44\"},{\"text\":\"je recherche une fragment de rune ancienne! tu pourrais maider a le trouver?\",\"color\":\"black\"}]");
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 3, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 3, 1, false);
								}
							}
							SmpModVMod.queueServerWork(20, () -> {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"/tellraw @p [\"\",{\"text\":\"[Traveler] \",\"color\":\"#DE6B44\"},{\"text\":\"merci beaucoup!\",\"color\":\"black\"}]");
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1, false);
									}
								}
							});
						});
					});
				}
			}
		}
		if (entity.getPersistentData().getBoolean("quest4") == true) {
			if (sourceentity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel ? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("smp_mod_v:quest_4"))).isDone() : false) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/tellraw @p [\"\",{\"text\":\"[Traveler] \",\"color\":\"#DE6B44\"},{\"text\":\"bienvenue au bazar des aventuriers! arme, nouriture, armure de tout genre!\",\"color\":\"black\"}]");
			}
		}
		if (!(sourceentity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel ? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("smp_mod_v:quest_5"))).isDone() : false)) {
			if (sourceentity.getPersistentData().getBoolean("accepted5") == true) {
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == SmpModVModItems.TITANIUM.get()) {
					if (((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() == 15) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"/tellraw @p [\"\",{\"text\":\"[Toolsmith]\",\"color\":\"dark_blue\"},{\"text\":\"merci! voila pour toi!\",\"color\":\"black\"}]");
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.pillager.celebrate")), SoundSource.NEUTRAL, 3, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.pillager.celebrate")), SoundSource.NEUTRAL, 3, 1, false);
							}
						}
						if (sourceentity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(Items.NETHERITE_PICKAXE);
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
						if (sourceentity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("smp_mod_v:quest_5"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								Iterator _iterator = _ap.getRemainingCriteria().iterator();
								while (_iterator.hasNext())
									_player.getAdvancements().award(_adv, (String) _iterator.next());
							}
						}
					}
				}
			}
			if (sourceentity.getPersistentData().getBoolean("accepted5") == false) {
				if (entity.getPersistentData().getBoolean("quest5") == true) {
					sourceentity.getPersistentData().putBoolean("accepted5", (true));
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"/tellraw @p [\"\",{\"text\":\"[Toolsmith]\",\"color\":\"dark_blue\"},{\"text\":\"toi la!\",\"color\":\"black\"}]");
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 3, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 3, 1, false);
						}
					}
					SmpModVMod.queueServerWork(20, () -> {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"/tellraw @p [\"\",{\"text\":\"[Toolsmith]\",\"color\":\"dark_blue\"},{\"text\":\"jai besoin d'un coup de main!\",\"color\":\"black\"}]");
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.pillager.ambient")), SoundSource.NEUTRAL, 3, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.pillager.ambient")), SoundSource.NEUTRAL, 3, 1, false);
							}
						}
						SmpModVMod.queueServerWork(20, () -> {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"/tellraw @p [\"\",{\"text\":\"[Toolsmith]\",\"color\":\"dark_blue\"},{\"text\":\"il me manque\",\"color\":\"black\"},{\"text\":\" x5 raw titanium \",\"color\":\"blue\"},{\"text\":\"tu peut me les trouver?\",\"color\":\"black\"}]");
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 3, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 3, 1, false);
								}
							}
							SmpModVMod.queueServerWork(20, () -> {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"/tellraw @p [\"\",{\"text\":\"[Toolsmith]\",\"color\":\"dark_blue\"},{\"text\":\"merci beaucoup!\",\"color\":\"black\"}]");
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.pillager.ambient")), SoundSource.NEUTRAL, 3, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.pillager.ambient")), SoundSource.NEUTRAL, 3, 1, false);
									}
								}
							});
						});
					});
				}
			}
		}
		if (entity.getPersistentData().getBoolean("quest5") == true) {
			if (sourceentity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel ? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("smp_mod_v:quest_5"))).isDone() : false) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/tellraw @p [\"\",{\"text\":\"[Toolsmith]\",\"color\":\"dark_blue\"},{\"text\":\"bienvenue a la forge!\",\"color\":\"black\"}]");
			}
		}
		if (sourceentity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
				? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("smp_mod_v:tier_2questlush"))).isDone()
				: false) {
			if (!(sourceentity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel ? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("smp_mod_v:quest_6"))).isDone() : false)) {
				if (sourceentity.getPersistentData().getBoolean("accepted6") == true) {
					if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.TROPICAL_FISH) {
						if (((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() == 28) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"/tellraw @p [\"\",{\"text\":\"[Farmer]\",\"color\":\"green\"},{\"text\":\"tiens un petit cadeau pour ton aide!\",\"color\":\"black\"}]");
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.pillager.celebrate")), SoundSource.NEUTRAL, 3, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.pillager.celebrate")), SoundSource.NEUTRAL, 3, 1, false);
								}
							}
							if (sourceentity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(SmpModVModItems.MAGICALCROPGROWER.get());
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
							if (sourceentity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("smp_mod_v:quest_6"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									Iterator _iterator = _ap.getRemainingCriteria().iterator();
									while (_iterator.hasNext())
										_player.getAdvancements().award(_adv, (String) _iterator.next());
								}
							}
						}
					}
				}
				if (sourceentity.getPersistentData().getBoolean("accepted6") == false) {
					if (entity.getPersistentData().getBoolean("quest6") == true) {
						sourceentity.getPersistentData().putBoolean("accepted6", (true));
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"/tellraw @p [\"\",{\"text\":\"[Farmer]\",\"color\":\"green\"},{\"text\":\"heho jeune homme!\",\"color\":\"black\"}]");
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 3, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 3, 1, false);
							}
						}
						SmpModVMod.queueServerWork(20, () -> {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"/tellraw @p [\"\",{\"text\":\"[Farmer]\",\"color\":\"green\"},{\"text\":\"jai besoin de ton aide!\",\"color\":\"black\"}]");
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1, false);
								}
							}
							SmpModVMod.queueServerWork(20, () -> {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"/tellraw @p [\"\",{\"text\":\"[Farmer]\",\"color\":\"green\"},{\"text\":\"je nai plus de poisson pour le diner de ce soir. tu pourrais me ramener \",\"color\":\"black\"},{\"text\":\"tropical fish x28\",\"color\":\"gold\"},{\"text\":\"?\",\"color\":\"black\"}]");
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 3, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 3, 1, false);
									}
								}
								SmpModVMod.queueServerWork(20, () -> {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"/tellraw @p [\"\",{\"text\":\"[Farmer]\",\"color\":\"green\"},{\"text\":\"Merci jeune personne!\",\"color\":\"black\"}]");
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1, false);
										}
									}
								});
							});
						});
					}
				}
			}
			if (entity.getPersistentData().getBoolean("quest6") == true) {
				if (sourceentity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
						? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("smp_mod_v:quest_6"))).isDone()
						: false) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"/tellraw @p [\"\",{\"text\":\"[Farmer]\",\"color\":\"green\"},{\"text\":\"Merci de ton aide je ten suis reconnaissant!\",\"color\":\"black\"}]");
				}
			}
			if (entity.getPersistentData().getBoolean("quest7") == true) {
				if (sourceentity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
						? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("smp_mod_v:quest_7"))).isDone()
						: false) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"/tellraw @p [\"\",{\"text\":\"[Guard]\",\"color\":\"dark_blue\"},{\"text\":\" merci! sa majest\u00E9 etait tr\u00E9s amus\u00E9!\",\"color\":\"black\"}]");
				}
			}
			if (!(sourceentity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel ? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("smp_mod_v:quest_7"))).isDone() : false)) {
				if (sourceentity.getPersistentData().getBoolean("accepted7") == false) {
					if (entity.getPersistentData().getBoolean("quest7") == true) {
						sourceentity.getPersistentData().putBoolean("accepted7", (true));
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"/tellraw @p [\"\",{\"text\":\"[Guard]\",\"color\":\"dark_blue\"},{\"text\":\" toi! par ici!\",\"color\":\"black\"}]");
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 3, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 3, 1, false);
							}
						}
						SmpModVMod.queueServerWork(20, () -> {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"/tellraw @p [\"\",{\"text\":\"[Guard]\",\"color\":\"dark_blue\"},{\"text\":\" tu peut me donner un coup de pouce\",\"color\":\"black\"}]");
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1, false);
								}
							}
							SmpModVMod.queueServerWork(20, () -> {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"/tellraw @p [\"\",{\"text\":\"[Guard]\",\"color\":\"dark_blue\"},{\"text\":\" notre roi, est vraiment mechant! il faudrait que tu lui donne une bonne lecon\",\"color\":\"black\"}]");
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 3, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 3, 1, false);
									}
								}
								SmpModVMod.queueServerWork(20, () -> {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"/tellraw @p [\"\",{\"text\":\"[Guard]\",\"color\":\"dark_blue\"},{\"text\":\" si tu y arrive il te donneras son l\u00E9gendaire \",\"color\":\"black\"},{\"text\":\"\u00E9p\u00E9e d'amethyst\",\"color\":\"light_purple\"}]");
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), SoundSource.NEUTRAL, 3, 1, false);
										}
									}
								});
							});
						});
					}
				}
			}
		}
	}
}
