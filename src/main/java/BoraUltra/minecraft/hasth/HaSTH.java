package BoraUltra.minecraft.hasth;

import BoraUltra.minecraft.hasth.Blocks.TungstenBlock;
import BoraUltra.minecraft.hasth.Dimentions.Dimension;
import BoraUltra.minecraft.hasth.Items.Armor.TungstenArmorItem;
import BoraUltra.minecraft.hasth.Items.Tool.TungstenToolItem;
import BoraUltra.minecraft.hasth.Items.misc.TungstenMiscItem;
import net.fabricmc.api.ModInitializer;

public class HaSTH implements ModInitializer {
	@Override
	public void onInitialize() {
		TungstenBlock.register();
		TungstenArmorItem.register();
		TungstenToolItem.register();
		TungstenMiscItem.register();
		Dimension.setDimension();
	}
}