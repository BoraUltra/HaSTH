package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;

public class ExampleMod implements ModInitializer {
	public static final String MOD_ID = "HaSTH";

	@Override
	public void onInitialize() {
		TungstenItem.register();
		Dimension.setDimension();
	}
}