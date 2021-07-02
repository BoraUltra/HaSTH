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

public class AdamantiteBlock {
	public static final Block ADAMANTITE_ORE = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f)
			.breakByTool(FabricToolTags.PICKAXES, 4).luminance(6).requiresTool());
	public static final Block ADAMANTITE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(8.0f)
			.breakByTool(FabricToolTags.PICKAXES, 5).luminance(15).requiresTool());

	public static void register() {
		Registry.register(Registry.BLOCK, Iden.id("adamantite_ore"), ADAMANTITE_ORE);
		Registry.register(Registry.BLOCK, Iden.id("adamantite_block"), ADAMANTITE_BLOCK);
		Registry.register(Registry.ITEM, Iden.id("adamantite_ore"),
				new BlockItem(ADAMANTITE_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, Iden.id("adamantite_block"),
				new BlockItem(ADAMANTITE_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	}
}
