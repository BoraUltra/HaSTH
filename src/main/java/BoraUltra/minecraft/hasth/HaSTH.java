package BoraUltra.minecraft.hasth;

import BoraUltra.minecraft.hasth.Blocks.AdamantiteBlock;
import BoraUltra.minecraft.hasth.Dimentions.Dimension;
import BoraUltra.minecraft.hasth.Items.Armor.AdamantiteArmorItem;
import BoraUltra.minecraft.hasth.Items.Tool.AdamantiteToolItem;
import BoraUltra.minecraft.hasth.Items.misc.AdamantiteMiscItem;
import net.fabricmc.api.ModInitializer;

public class HaSTH implements ModInitializer {
	@Override
	public void onInitialize() {
		AdamantiteBlock.register();
		AdamantiteArmorItem.register();
		AdamantiteToolItem.register();
		AdamantiteMiscItem.register();
		Dimension.setDimension();
	}
}