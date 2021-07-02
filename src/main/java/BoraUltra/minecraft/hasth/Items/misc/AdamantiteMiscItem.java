package BoraUltra.minecraft.hasth.Items.misc;

import BoraUltra.minecraft.hasth.utils.Iden;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class AdamantiteMiscItem {
	public static final Item RAW_ADAMANTITE = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item ADAMANTITE_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));

	public static void register() {
		Registry.register(Registry.ITEM, Iden.id("raw_adamantite"), RAW_ADAMANTITE);
		Registry.register(Registry.ITEM, Iden.id("adamantite_ingot"), ADAMANTITE_INGOT);
	}
}
