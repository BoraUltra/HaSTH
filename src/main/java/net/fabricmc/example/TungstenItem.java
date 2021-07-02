package net.fabricmc.example;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TungstenItem {
	public static final Block TUNGSTEN_ORE = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f)
			.breakByTool(FabricToolTags.PICKAXES, 4).luminance(6).requiresTool());
	public static final Item RAW_TUNGSTEN = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Block TUNGSTEN_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(8.0f)
			.breakByTool(FabricToolTags.PICKAXES, 5).luminance(15).requiresTool());

	public static final Item TUNGSTEN_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final ArmorMaterial tungstenAromorMaterial = new TungstenArmor();
	public static final Item TUNGSTEN_HELMET = new ArmorItem(tungstenAromorMaterial, EquipmentSlot.HEAD,
			new Item.Settings().group(ItemGroup.COMBAT).fireproof());
	public static final Item TUNGSTEN_CHESTPLATE = new ArmorItem(tungstenAromorMaterial, EquipmentSlot.CHEST,
			new Item.Settings().group(ItemGroup.COMBAT).fireproof());
	public static final Item TUNGSTEN_LEGGINGS = new ArmorItem(tungstenAromorMaterial, EquipmentSlot.LEGS,
			new Item.Settings().group(ItemGroup.COMBAT).fireproof());
	public static final Item TUNGSTEN_BOOTS = new ArmorItem(tungstenAromorMaterial, EquipmentSlot.FEET,
			new Item.Settings().group(ItemGroup.COMBAT).fireproof());

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

	static void register() {
		Registry.register(Registry.BLOCK, new Identifier("tutorial", "tungsten_ore"), TUNGSTEN_ORE);
		Registry.register(Registry.BLOCK, new Identifier("tutorial", "tungsten_block"), TUNGSTEN_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("tutorial", "tungsten_ore"),
				new BlockItem(TUNGSTEN_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("tutorial", "tungsten_block"),
				new BlockItem(TUNGSTEN_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("tutorial", "raw_tungsten"), RAW_TUNGSTEN);
		Registry.register(Registry.ITEM, new Identifier("tutorial", "tungsten_ingot"), TUNGSTEN_INGOT);

		Registry.register(Registry.ITEM, new Identifier("tutorial", "tungsten_helmet"), TUNGSTEN_HELMET);
		Registry.register(Registry.ITEM, new Identifier("tutorial", "tungsten_chestplate"), TUNGSTEN_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier("tutorial", "tungsten_leggings"), TUNGSTEN_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier("tutorial", "tungsten_boots"), TUNGSTEN_BOOTS);

		Registry.register(Registry.ITEM, new Identifier("tutorial", "tungsten_sword"), TUNGSTEN_SWORD);
		Registry.register(Registry.ITEM, new Identifier("tutorial", "tungsten_pickaxe"), TUNGSTEN_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("tutorial", "tungsten_axe"), TUNGSTEN_AXE);
		Registry.register(Registry.ITEM, new Identifier("tutorial", "tungsten_hoe"), TUNGSTEN_HOE);
		Registry.register(Registry.ITEM, new Identifier("tutorial", "tungsten_shovel"), TUNGSTEN_SHOVEL);
		System.out.println("Added Tungsten Tools and Armors");
		System.out.println(TungstenTool.INSTANCE.getMiningLevel());
	}
}
