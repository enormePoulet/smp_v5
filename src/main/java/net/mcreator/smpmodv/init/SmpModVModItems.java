
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.smpmodv.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.smpmodv.item.QuesteraserItem;
import net.mcreator.smpmodv.item.HermitcrabscutItem;
import net.mcreator.smpmodv.item.GlowberriejuiceItem;
import net.mcreator.smpmodv.item.CoppernuggetItem;
import net.mcreator.smpmodv.item.CoppergearItem;
import net.mcreator.smpmodv.item.CoppercoreItem;
import net.mcreator.smpmodv.item.CoppercenterpieceItem;
import net.mcreator.smpmodv.item.CopperarmorrightItem;
import net.mcreator.smpmodv.item.CopperarmorleftItem;
import net.mcreator.smpmodv.item.CopperarmorItem;
import net.mcreator.smpmodv.item.Copperarmor2armsItem;
import net.mcreator.smpmodv.item.AncientruneItem;
import net.mcreator.smpmodv.item.AmethystnecklaceItem;
import net.mcreator.smpmodv.item.AmethystdustItem;
import net.mcreator.smpmodv.block.display.SqueezerDisplayItem;
import net.mcreator.smpmodv.block.display.SnaildensignDisplayItem;
import net.mcreator.smpmodv.block.display.AlchemytableDisplayItem;
import net.mcreator.smpmodv.SmpModVMod;

public class SmpModVModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SmpModVMod.MODID);
	public static final RegistryObject<Item> LUSHHERMITCRAB_SPAWN_EGG = REGISTRY.register("lushhermitcrab_spawn_egg", () -> new ForgeSpawnEggItem(SmpModVModEntities.LUSHHERMITCRAB, -52, -26317, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> HERMITCRABSCUT = REGISTRY.register("hermitcrabscut", () -> new HermitcrabscutItem());
	public static final RegistryObject<Item> BLSSOMCREATURE_SPAWN_EGG = REGISTRY.register("blssomcreature_spawn_egg",
			() -> new ForgeSpawnEggItem(SmpModVModEntities.BLSSOMCREATURE, -13382656, -3407668, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> LUSHGOBLIN_SPAWN_EGG = REGISTRY.register("lushgoblin_spawn_egg", () -> new ForgeSpawnEggItem(SmpModVModEntities.LUSHGOBLIN, -16764160, -13408768, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> QUEST_1ACTIVATOR = block(SmpModVModBlocks.QUEST_1ACTIVATOR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> QUESTERASER = REGISTRY.register("questeraser", () -> new QuesteraserItem());
	public static final RegistryObject<Item> AMETHYSTNECKLACE_CHESTPLATE = REGISTRY.register("amethystnecklace_chestplate", () -> new AmethystnecklaceItem.Chestplate());
	public static final RegistryObject<Item> QUEST_2ACTIVATOR = block(SmpModVModBlocks.QUEST_2ACTIVATOR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> AMETHYSTDUST = REGISTRY.register("amethystdust", () -> new AmethystdustItem());
	public static final RegistryObject<Item> ALCHEMYTABLE = REGISTRY.register(SmpModVModBlocks.ALCHEMYTABLE.getId().getPath(),
			() -> new AlchemytableDisplayItem(SmpModVModBlocks.ALCHEMYTABLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<Item> GLOWBERRIEJUICE = REGISTRY.register("glowberriejuice", () -> new GlowberriejuiceItem());
	public static final RegistryObject<Item> EMPTYJARBLOCK = block(SmpModVModBlocks.EMPTYJARBLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GLOWBERRYJAR = block(SmpModVModBlocks.GLOWBERRYJAR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SQUEEZER = REGISTRY.register(SmpModVModBlocks.SQUEEZER.getId().getPath(), () -> new SqueezerDisplayItem(SmpModVModBlocks.SQUEEZER.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<Item> QUEST_3ACTIVATOR = block(SmpModVModBlocks.QUEST_3ACTIVATOR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> QUEST_4ACTIVATOR = block(SmpModVModBlocks.QUEST_4ACTIVATOR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SNAILDENSIGN = REGISTRY.register(SmpModVModBlocks.SNAILDENSIGN.getId().getPath(),
			() -> new SnaildensignDisplayItem(SmpModVModBlocks.SNAILDENSIGN.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<Item> ANCIENTRUNE = REGISTRY.register("ancientrune", () -> new AncientruneItem());
	public static final RegistryObject<Item> COPPERARMOR_HELMET = REGISTRY.register("copperarmor_helmet", () -> new CopperarmorItem.Helmet());
	public static final RegistryObject<Item> COPPERARMOR_CHESTPLATE = REGISTRY.register("copperarmor_chestplate", () -> new CopperarmorItem.Chestplate());
	public static final RegistryObject<Item> COPPERARMOR_LEGGINGS = REGISTRY.register("copperarmor_leggings", () -> new CopperarmorItem.Leggings());
	public static final RegistryObject<Item> COPPERARMORRIGHT_CHESTPLATE = REGISTRY.register("copperarmorright_chestplate", () -> new CopperarmorrightItem.Chestplate());
	public static final RegistryObject<Item> COPPERARMORRIGHT_LEGGINGS = REGISTRY.register("copperarmorright_leggings", () -> new CopperarmorrightItem.Leggings());
	public static final RegistryObject<Item> COPPERARMORLEFT_CHESTPLATE = REGISTRY.register("copperarmorleft_chestplate", () -> new CopperarmorleftItem.Chestplate());
	public static final RegistryObject<Item> COPPERARMORLEFT_LEGGINGS = REGISTRY.register("copperarmorleft_leggings", () -> new CopperarmorleftItem.Leggings());
	public static final RegistryObject<Item> COPPERCENTERPIECE_CHESTPLATE = REGISTRY.register("coppercenterpiece_chestplate", () -> new CoppercenterpieceItem.Chestplate());
	public static final RegistryObject<Item> COPPERGEAR = REGISTRY.register("coppergear", () -> new CoppergearItem());
	public static final RegistryObject<Item> COPPERNUGGET = REGISTRY.register("coppernugget", () -> new CoppernuggetItem());
	public static final RegistryObject<Item> COPPERCORE = REGISTRY.register("coppercore", () -> new CoppercoreItem());
	public static final RegistryObject<Item> COPPERARMOR_2ARMS_CHESTPLATE = REGISTRY.register("copperarmor_2arms_chestplate", () -> new Copperarmor2armsItem.Chestplate());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
