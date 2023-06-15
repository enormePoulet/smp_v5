
package net.mcreator.smpmodv.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class GreenwoolpatchItem extends Item {
	public GreenwoolpatchItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(16).rarity(Rarity.COMMON));
	}
}
