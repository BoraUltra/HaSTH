package BoraUltra.minecraft.hasth.Items.Tool;

import BoraUltra.minecraft.hasth.utils.Iden;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.registry.Registry;

public class TungstenToolItem {
	public static final ToolItem TUNGSTEN_SWORD = new SwordItem(TungstenTool.INSTANCE, 3, -2.4F,
			new Item.Settings().fireproof().group(ItemGroup.COMBAT));
	public static final ToolItem TUNGSTEN_PICKAXE = new CustomPickaxeItem(TungstenTool.INSTANCE, 1, -2.8F,
			new Item.Settings().fireproof().group(ItemGroup.TOOLS));
	public static final ToolItem TUNGSTEN_AXE = new CustomAxeItem(TungstenTool.INSTANCE, 5, -3.0F,
			new Item.Settings().fireproof().group(ItemGroup.TOOLS));
	public static final ToolItem TUNGSTEN_HOE = new CustomHoeItem(TungstenTool.INSTANCE, -6, 0.0F,
			new Item.Settings().fireproof().group(ItemGroup.TOOLS));
	public static final ToolItem TUNGSTEN_SHOVEL = new ShovelItem(TungstenTool.INSTANCE, 1.5F, -3.0F,
			new Item.Settings().fireproof().group(ItemGroup.TOOLS));

	public static void register() {
		Registry.register(Registry.ITEM, Iden.id("tungsten_sword"), TUNGSTEN_SWORD);
		Registry.register(Registry.ITEM, Iden.id("tungsten_pickaxe"), TUNGSTEN_PICKAXE);
		Registry.register(Registry.ITEM, Iden.id("tungsten_axe"), TUNGSTEN_AXE);
		Registry.register(Registry.ITEM, Iden.id("tungsten_hoe"), TUNGSTEN_HOE);
		Registry.register(Registry.ITEM, Iden.id("tungsten_shovel"), TUNGSTEN_SHOVEL);
	}
}
