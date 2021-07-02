package BoraUltra.minecraft.hasth.Items.Tool;

import BoraUltra.minecraft.hasth.utils.Iden;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.registry.Registry;

public class AdamantiteToolItem {
	public static final ToolItem ADAMANTITE_SWORD = new SwordItem(AdamantiteTool.INSTANCE, 3, -2.4F,
			new Item.Settings().fireproof().group(ItemGroup.COMBAT));
	public static final ToolItem ADAMANTITE_PICKAXE = new CustomPickaxeItem(AdamantiteTool.INSTANCE, 1, -2.8F,
			new Item.Settings().fireproof().group(ItemGroup.TOOLS));
	public static final ToolItem ADAMANTITE_AXE = new CustomAxeItem(AdamantiteTool.INSTANCE, 5, -3.0F,
			new Item.Settings().fireproof().group(ItemGroup.TOOLS));
	public static final ToolItem ADAMANTITE_HOE = new CustomHoeItem(AdamantiteTool.INSTANCE, -6, 0.0F,
			new Item.Settings().fireproof().group(ItemGroup.TOOLS));
	public static final ToolItem ADAMANTITE_SHOVEL = new ShovelItem(AdamantiteTool.INSTANCE, 1.5F, -3.0F,
			new Item.Settings().fireproof().group(ItemGroup.TOOLS));

	public static void register() {
		Registry.register(Registry.ITEM, Iden.id("adamantite_sword"), ADAMANTITE_SWORD);
		Registry.register(Registry.ITEM, Iden.id("adamantite_pickaxe"), ADAMANTITE_PICKAXE);
		Registry.register(Registry.ITEM, Iden.id("adamantite_axe"), ADAMANTITE_AXE);
		Registry.register(Registry.ITEM, Iden.id("adamantite_hoe"), ADAMANTITE_HOE);
		Registry.register(Registry.ITEM, Iden.id("adamantite_shovel"), ADAMANTITE_SHOVEL);
	}
}
