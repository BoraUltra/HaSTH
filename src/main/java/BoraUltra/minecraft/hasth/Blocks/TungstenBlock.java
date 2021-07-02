package BoraUltra.minecraft.hasth.Blocks;

import BoraUltra.minecraft.hasth.utils.Iden;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class TungstenBlock {
	public static final Block TUNGSTEN_ORE = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f)
			.breakByTool(FabricToolTags.PICKAXES, 4).luminance(6).requiresTool());
	public static final Block TUNGSTEN_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(8.0f)
			.breakByTool(FabricToolTags.PICKAXES, 5).luminance(15).requiresTool());

	public static void register() {
		Registry.register(Registry.BLOCK, Iden.id("tungsten_ore"), TUNGSTEN_ORE);
		Registry.register(Registry.BLOCK, Iden.id("tungsten_block"), TUNGSTEN_BLOCK);
		Registry.register(Registry.ITEM, Iden.id("tungsten_ore"),
				new BlockItem(TUNGSTEN_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, Iden.id("tungsten_block"),
				new BlockItem(TUNGSTEN_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	}
}
