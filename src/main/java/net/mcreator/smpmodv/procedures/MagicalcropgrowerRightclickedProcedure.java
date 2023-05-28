package net.mcreator.smpmodv.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.core.BlockPos;

public class MagicalcropgrowerRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < (int) (64); index0++) {
			if (world instanceof Level _level) {
				BlockPos _bp = new BlockPos(x, y, z);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
		}
	}
}
