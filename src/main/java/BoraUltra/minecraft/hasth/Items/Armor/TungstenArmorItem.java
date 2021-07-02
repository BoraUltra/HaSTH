package BoraUltra.minecraft.hasth.Items.Armor;

import BoraUltra.minecraft.hasth.utils.Iden;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class TungstenArmorItem {
	public static final ArmorMaterial tungstenAromorMaterial = new TungstenArmor();
	public static final Item TUNGSTEN_HELMET = new ArmorItem(tungstenAromorMaterial, EquipmentSlot.HEAD,
			new Item.Settings().group(ItemGroup.COMBAT).fireproof());
	public static final Item TUNGSTEN_CHESTPLATE = new ArmorItem(tungstenAromorMaterial, EquipmentSlot.CHEST,
			new Item.Settings().group(ItemGroup.COMBAT).fireproof());
	public static final Item TUNGSTEN_LEGGINGS = new ArmorItem(tungstenAromorMaterial, EquipmentSlot.LEGS,
			new Item.Settings().group(ItemGroup.COMBAT).fireproof());
	public static final Item TUNGSTEN_BOOTS = new ArmorItem(tungstenAromorMaterial, EquipmentSlot.FEET,
			new Item.Settings().group(ItemGroup.COMBAT).fireproof());

	public static void register() {
		Registry.register(Registry.ITEM, Iden.id("tungsten_helmet"), TUNGSTEN_HELMET);
		Registry.register(Registry.ITEM, Iden.id("tungsten_chestplate"), TUNGSTEN_CHESTPLATE);
		Registry.register(Registry.ITEM, Iden.id("tungsten_leggings"), TUNGSTEN_LEGGINGS);
		Registry.register(Registry.ITEM, Iden.id("tungsten_boots"), TUNGSTEN_BOOTS);
	}
}
