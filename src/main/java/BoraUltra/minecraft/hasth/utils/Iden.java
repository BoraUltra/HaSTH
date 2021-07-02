package BoraUltra.minecraft.hasth.utils;

import net.minecraft.util.Identifier;

public class Iden {
	public static final String MODID = "hasth";

	public static Identifier id(String name) {
		return new Identifier(MODID, name);
	}
}
