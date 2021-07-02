package BoraUltra.minecraft.hasth.Items.Armor;

import BoraUltra.minecraft.hasth.utils.Iden;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class AdamantiteArmorItem {
	public static final ArmorMaterial adamantiteAromorMaterial = new AdamantiteArmor();
	public static final Item ADAMANTITE_HELMET = new ArmorItem(adamantiteAromorMaterial, EquipmentSlot.HEAD,
			new Item.Settings().group(ItemGroup.COMBAT).fireproof());
	public static final Item ADAMANTITE_CHESTPLATE = new ArmorItem(adamantiteAromorMaterial, EquipmentSlot.CHEST,
			new Item.Settings().group(ItemGroup.COMBAT).fireproof());
	public static final Item ADAMANTITE_LEGGINGS = new ArmorItem(adamantiteAromorMaterial, EquipmentSlot.LEGS,
			new Item.Settings().group(ItemGroup.COMBAT).fireproof());
	public static final Item ADAMANTITE_BOOTS = new ArmorItem(adamantiteAromorMaterial, EquipmentSlot.FEET,
			new Item.Settings().group(ItemGroup.COMBAT).fireproof());

	public static void register() {
		Registry.register(Registry.ITEM, Iden.id("adamantite_helmet"), ADAMANTITE_HELMET);
		Registry.register(Registry.ITEM, Iden.id("adamantite_chestplate"), ADAMANTITE_CHESTPLATE);
		Registry.register(Registry.ITEM, Iden.id("adamantite_leggings"), ADAMANTITE_LEGGINGS);
		Registry.register(Registry.ITEM, Iden.id("adamantite_boots"), ADAMANTITE_BOOTS);
	}
}
