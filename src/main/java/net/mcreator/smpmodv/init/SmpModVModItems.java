
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

import net.mcreator.smpmodv.item.WhitewoolpatchItem;
import net.mcreator.smpmodv.item.WhitecloakItem;
import net.mcreator.smpmodv.item.TitaniumingotItem;
import net.mcreator.smpmodv.item.Titanium_toolsSwordItem;
import net.mcreator.smpmodv.item.Titanium_toolsShovelItem;
import net.mcreator.smpmodv.item.Titanium_toolsPickaxeItem;
import net.mcreator.smpmodv.item.Titanium_toolsHoeItem;
import net.mcreator.smpmodv.item.Titanium_toolsAxeItem;
import net.mcreator.smpmodv.item.Titanium_armorArmorItem;
import net.mcreator.smpmodv.item.TitaniumItem;
import net.mcreator.smpmodv.item.QuesteraserItem;
import net.mcreator.smpmodv.item.MagicalcropgrowerItem;
import net.mcreator.smpmodv.item.LimewoolpatchItem;
import net.mcreator.smpmodv.item.LimecloakItem;
import net.mcreator.smpmodv.item.LightgraywoolpatchItem;
import net.mcreator.smpmodv.item.LightgraycloakItem;
import net.mcreator.smpmodv.item.HermitcrabscutItem;
import net.mcreator.smpmodv.item.GreenwoolpatchItem;
import net.mcreator.smpmodv.item.GreencloakItem;
import net.mcreator.smpmodv.item.GraywoolpatchItem;
import net.mcreator.smpmodv.item.GraycloakItem;
import net.mcreator.smpmodv.item.GlowberriejuiceItem;
import net.mcreator.smpmodv.item.CoppernuggetItem;
import net.mcreator.smpmodv.item.CoppergearItem;
import net.mcreator.smpmodv.item.CoppercoreItem;
import net.mcreator.smpmodv.item.CoppercenterpieceItem;
import net.mcreator.smpmodv.item.CopperarmorrightItem;
import net.mcreator.smpmodv.item.CopperarmorleftItem;
import net.mcreator.smpmodv.item.CopperarmorItem;
import net.mcreator.smpmodv.item.Copperarmor2armsItem;
import net.mcreator.smpmodv.item.CagekeyItem;
import net.mcreator.smpmodv.item.BrownwoolpatchItem;
import net.mcreator.smpmodv.item.BrowncloakItem;
import net.mcreator.smpmodv.item.BlackwoolpatchItem;
import net.mcreator.smpmodv.item.BlackcloakItem;
import net.mcreator.smpmodv.item.AncientruneItem;
import net.mcreator.smpmodv.item.AmethystswordhandleItem;
import net.mcreator.smpmodv.item.AmethystnecklaceItem;
import net.mcreator.smpmodv.item.AmethystdustItem;
import net.mcreator.smpmodv.item.AmethystbladeItem;
import net.mcreator.smpmodv.item.AlmethystswordItem;
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
	public static final RegistryObject<Item> TITANIUM_ORE = block(SmpModVModBlocks.TITANIUM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TITANIUM_BLOCK = block(SmpModVModBlocks.TITANIUM_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TITANIUM = REGISTRY.register("titanium", () -> new TitaniumItem());
	public static final RegistryObject<Item> DEEPSLATETITANIUMORE = block(SmpModVModBlocks.DEEPSLATETITANIUMORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TITANIUMINGOT = REGISTRY.register("titaniumingot", () -> new TitaniumingotItem());
	public static final RegistryObject<Item> RAWTITANIUMBLOCK = block(SmpModVModBlocks.RAWTITANIUMBLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TITANIUM_ARMOR_ARMOR_HELMET = REGISTRY.register("titanium_armor_armor_helmet", () -> new Titanium_armorArmorItem.Helmet());
	public static final RegistryObject<Item> TITANIUM_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("titanium_armor_armor_chestplate", () -> new Titanium_armorArmorItem.Chestplate());
	public static final RegistryObject<Item> TITANIUM_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("titanium_armor_armor_leggings", () -> new Titanium_armorArmorItem.Leggings());
	public static final RegistryObject<Item> TITANIUM_ARMOR_ARMOR_BOOTS = REGISTRY.register("titanium_armor_armor_boots", () -> new Titanium_armorArmorItem.Boots());
	public static final RegistryObject<Item> TITANIUM_TOOLS_AXE = REGISTRY.register("titanium_tools_axe", () -> new Titanium_toolsAxeItem());
	public static final RegistryObject<Item> TITANIUM_TOOLS_PICKAXE = REGISTRY.register("titanium_tools_pickaxe", () -> new Titanium_toolsPickaxeItem());
	public static final RegistryObject<Item> TITANIUM_TOOLS_SWORD = REGISTRY.register("titanium_tools_sword", () -> new Titanium_toolsSwordItem());
	public static final RegistryObject<Item> TITANIUM_TOOLS_SHOVEL = REGISTRY.register("titanium_tools_shovel", () -> new Titanium_toolsShovelItem());
	public static final RegistryObject<Item> TITANIUM_TOOLS_HOE = REGISTRY.register("titanium_tools_hoe", () -> new Titanium_toolsHoeItem());
	public static final RegistryObject<Item> QUEST_5ACTIVATOR = block(SmpModVModBlocks.QUEST_5ACTIVATOR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> QUEST_6ACTIVATOR = block(SmpModVModBlocks.QUEST_6ACTIVATOR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MAGICALCROPGROWER = REGISTRY.register("magicalcropgrower", () -> new MagicalcropgrowerItem());
	public static final RegistryObject<Item> QUEST_7ACTIVATOR = block(SmpModVModBlocks.QUEST_7ACTIVATOR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LUSHGOBLINKING_SPAWN_EGG = REGISTRY.register("lushgoblinking_spawn_egg",
			() -> new ForgeSpawnEggItem(SmpModVModEntities.LUSHGOBLINKING, -16738048, -256, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> AMETHYSTBLADE = REGISTRY.register("amethystblade", () -> new AmethystbladeItem());
	public static final RegistryObject<Item> AMETHYSTSWORDHANDLE = REGISTRY.register("amethystswordhandle", () -> new AmethystswordhandleItem());
	public static final RegistryObject<Item> ALMETHYSTSWORD = REGISTRY.register("almethystsword", () -> new AlmethystswordItem());
	public static final RegistryObject<Item> CAGEKEY = REGISTRY.register("cagekey", () -> new CagekeyItem());
	public static final RegistryObject<Item> QUEST_8ACTIVATOR = block(SmpModVModBlocks.QUEST_8ACTIVATOR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> WHITEWOOLPATCH = REGISTRY.register("whitewoolpatch", () -> new WhitewoolpatchItem());
	public static final RegistryObject<Item> WHITECLOAK_HELMET = REGISTRY.register("whitecloak_helmet", () -> new WhitecloakItem.Helmet());
	public static final RegistryObject<Item> WHITECLOAK_CHESTPLATE = REGISTRY.register("whitecloak_chestplate", () -> new WhitecloakItem.Chestplate());
	public static final RegistryObject<Item> LIGHTGRAYCLOAK_HELMET = REGISTRY.register("lightgraycloak_helmet", () -> new LightgraycloakItem.Helmet());
	public static final RegistryObject<Item> LIGHTGRAYCLOAK_CHESTPLATE = REGISTRY.register("lightgraycloak_chestplate", () -> new LightgraycloakItem.Chestplate());
	public static final RegistryObject<Item> LIGHTGRAYWOOLPATCH = REGISTRY.register("lightgraywoolpatch", () -> new LightgraywoolpatchItem());
	public static final RegistryObject<Item> GRAYWOOLPATCH = REGISTRY.register("graywoolpatch", () -> new GraywoolpatchItem());
	public static final RegistryObject<Item> GRAYCLOAK_HELMET = REGISTRY.register("graycloak_helmet", () -> new GraycloakItem.Helmet());
	public static final RegistryObject<Item> GRAYCLOAK_CHESTPLATE = REGISTRY.register("graycloak_chestplate", () -> new GraycloakItem.Chestplate());
	public static final RegistryObject<Item> BLACKWOOLPATCH = REGISTRY.register("blackwoolpatch", () -> new BlackwoolpatchItem());
	public static final RegistryObject<Item> BLACKCLOAK_HELMET = REGISTRY.register("blackcloak_helmet", () -> new BlackcloakItem.Helmet());
	public static final RegistryObject<Item> BLACKCLOAK_CHESTPLATE = REGISTRY.register("blackcloak_chestplate", () -> new BlackcloakItem.Chestplate());
	public static final RegistryObject<Item> BROWNWOOLPATCH = REGISTRY.register("brownwoolpatch", () -> new BrownwoolpatchItem());
	public static final RegistryObject<Item> BROWNCLOAK_HELMET = REGISTRY.register("browncloak_helmet", () -> new BrowncloakItem.Helmet());
	public static final RegistryObject<Item> BROWNCLOAK_CHESTPLATE = REGISTRY.register("browncloak_chestplate", () -> new BrowncloakItem.Chestplate());
	public static final RegistryObject<Item> GREENWOOLPATCH = REGISTRY.register("greenwoolpatch", () -> new GreenwoolpatchItem());
	public static final RegistryObject<Item> GREENCLOAK_HELMET = REGISTRY.register("greencloak_helmet", () -> new GreencloakItem.Helmet());
	public static final RegistryObject<Item> GREENCLOAK_CHESTPLATE = REGISTRY.register("greencloak_chestplate", () -> new GreencloakItem.Chestplate());
	public static final RegistryObject<Item> LIMEWOOLPATCH = REGISTRY.register("limewoolpatch", () -> new LimewoolpatchItem());
	public static final RegistryObject<Item> LIMECLOAK_HELMET = REGISTRY.register("limecloak_helmet", () -> new LimecloakItem.Helmet());
	public static final RegistryObject<Item> LIMECLOAK_CHESTPLATE = REGISTRY.register("limecloak_chestplate", () -> new LimecloakItem.Chestplate());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
