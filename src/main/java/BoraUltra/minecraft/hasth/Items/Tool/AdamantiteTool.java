package BoraUltra.minecraft.hasth.Items.Tool;

import BoraUltra.minecraft.hasth.Items.misc.AdamantiteMiscItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class AdamantiteTool implements ToolMaterial {
	public static final AdamantiteTool INSTANCE = new AdamantiteTool();

	@Override
	public int getDurability() {
		return 2500;
	}

	@Override
	public float getMiningSpeedMultiplier() {
		return 20.0F;
	}

	@Override
	public float getAttackDamage() {
		return 10.0F;
	}

	@Override
	public int getMiningLevel() {
		return 5;
	}

	@Override
	public int getEnchantability() {
		return 20;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(AdamantiteMiscItem.ADAMANTITE_INGOT);
	}
}
