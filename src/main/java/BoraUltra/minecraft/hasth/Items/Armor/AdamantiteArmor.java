package BoraUltra.minecraft.hasth.Items.Armor;

import BoraUltra.minecraft.hasth.Items.misc.AdamantiteMiscItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class AdamantiteArmor implements ArmorMaterial {
	private static final int[] BASE_DURABILITY = new int[] { 13, 15, 16, 11 };
	private static final int[] PROTECTION_VALUES = new int[] { 4, 7, 9, 4 };

	@Override
	public int getDurability(EquipmentSlot slot) {
		return BASE_DURABILITY[slot.getEntitySlotId()] * 40;
	}

	@Override
	public int getProtectionAmount(EquipmentSlot slot) {
		return PROTECTION_VALUES[slot.getEntitySlotId()];
	}

	@Override
	public int getEnchantability() {
		return 15;
	}

	@Override
	public SoundEvent getEquipSound() {
		return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(AdamantiteMiscItem.ADAMANTITE_INGOT);
	}

	@Override
	public String getName() {
		return "adamantite";
	}

	@Override
	public float getToughness() {
		return 3.0F;
	}

	@Override
	public float getKnockbackResistance() {
		return 0.1F;
	}
}
