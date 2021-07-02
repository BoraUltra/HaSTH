package net.fabricmc.example;

import net.kyrptonaught.customportalapi.CustomPortalApiRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;

public class Dimension {
	public static void setDimension() {
		CustomPortalApiRegistry.addPortal(Blocks.GOLD_BLOCK, new Identifier("my_dim"), 234, 183, 8);
	}
}
