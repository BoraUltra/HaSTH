package BoraUltra.minecraft.hasth.Items.misc;

import BoraUltra.minecraft.hasth.utils.Iden;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class TungstenMiscItem {
	public static final Item RAW_TUNGSTEN = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item TUNGSTEN_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));

	public static void register() {
		Registry.register(Registry.ITEM, Iden.id("raw_tungsten"), RAW_TUNGSTEN);
		Registry.register(Registry.ITEM, Iden.id("tungsten_ingot"), TUNGSTEN_INGOT);
	}
}
