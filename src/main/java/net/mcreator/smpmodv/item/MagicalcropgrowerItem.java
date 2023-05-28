
package net.mcreator.smpmodv.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.InteractionResult;

import net.mcreator.smpmodv.procedures.MagicalcropgrowerRightclickedProcedure;

public class MagicalcropgrowerItem extends Item {
	public MagicalcropgrowerItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).durability(30).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		MagicalcropgrowerRightclickedProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ());
		return InteractionResult.SUCCESS;
	}
}
