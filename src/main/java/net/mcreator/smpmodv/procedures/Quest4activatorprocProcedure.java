package net.mcreator.smpmodv.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.smpmodv.entity.LushgoblinEntity;

public class Quest4activatorprocProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LushgoblinEntity) {
			entity.getPersistentData().putBoolean("quest4", (true));
			entity.getPersistentData().putBoolean("quest4b", (true));
		}
	}
}
