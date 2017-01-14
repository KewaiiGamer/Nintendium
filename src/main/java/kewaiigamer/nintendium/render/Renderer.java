package kewaiigamer.nintendium.render;

import kewaiigamer.nintendium.Reference;
import kewaiigamer.nintendium.registries.BlocksRegistry;
import kewaiigamer.nintendium.registries.ItemsRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class Renderer {
    public static void registerItemRenderer() {

        // Nintendium Blocks & Items
        registerItem(ItemsRegistry.nintendium_ingot);
        registerBlock(BlocksRegistry.block_nintendium);

        // Nintendium Tools
        registerItem(ItemsRegistry.nintendium_sword);
        registerItem(ItemsRegistry.nintendium_axe);
        registerItem(ItemsRegistry.nintendium_pickaxe);
        registerItem(ItemsRegistry.nintendium_shovel);
        registerItem(ItemsRegistry.nintendium_hoe);

        // Nintendium Armor
        registerItem(ItemsRegistry.nintendium_helmet);
        registerItem(ItemsRegistry.nintendium_chestplate);
        registerItem(ItemsRegistry.nintendium_leggings);
        registerItem(ItemsRegistry.nintendium_boots);

        // Tanooki Items
        registerItem(ItemsRegistry.tanooki_leaf);

        // Tanooki Tools
        registerItem(ItemsRegistry.tanooki_sword);
        registerItem(ItemsRegistry.tanooki_axe);
        registerItem(ItemsRegistry.tanooki_pickaxe);
        registerItem(ItemsRegistry.tanooki_shovel);
        registerItem(ItemsRegistry.tanooki_hoe);
        // Tanooki Armor
        registerItem(ItemsRegistry.tanooki_helmet);
        registerItem(ItemsRegistry.tanooki_chestplate);
        registerItem(ItemsRegistry.tanooki_leggings);
        registerItem(ItemsRegistry.tanooki_boots);

        // White Tanooki Tools
        registerItem(ItemsRegistry.whitetanooki_sword);
        registerItem(ItemsRegistry.whitetanooki_axe);
        registerItem(ItemsRegistry.whitetanooki_pickaxe);
        registerItem(ItemsRegistry.whitetanooki_shovel);
        registerItem(ItemsRegistry.whitetanooki_hoe);
        // White Tanooki Armor
        registerItem(ItemsRegistry.whitetanooki_helmet);
        registerItem(ItemsRegistry.whitetanooki_chestplate);
        registerItem(ItemsRegistry.whitetanooki_leggings);
        registerItem(ItemsRegistry.whitetanooki_boots);
    }

    public static void registerBlock(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }

    public static void registerItem(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}


