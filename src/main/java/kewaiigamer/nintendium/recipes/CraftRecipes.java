package kewaiigamer.nintendium.recipes;

import kewaiigamer.nintendium.registries.BlocksRegistry;
import kewaiigamer.nintendium.registries.ItemsRegistry;
import net.minecraft.enchantment.EnchantmentFishingSpeed;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static kewaiigamer.nintendium.registries.BlocksRegistry.*;
import static kewaiigamer.nintendium.registries.ItemsRegistry.*;


public class CraftRecipes {

    public static void initRecipes() {
        ItemsRegistry i;
        BlocksRegistry b;
        GameRegistry.addRecipe
                (new ItemStack(block_nintendium),
                        "III", "III", "III",
                        'I', nintendium_ingot);

        GameRegistry.addRecipe
                (new ItemStack(nintendium_stick, 4),
                        "I", "I",
                        'I', nintendium_ingot);

        GameRegistry.addRecipe
                (new ItemStack( nintendium_sword),
                        " I ", " I ", " S ",
                        'I', nintendium_ingot,
                        'S', nintendium_stick);

        GameRegistry.addRecipe
                (new ItemStack(nintendium_axe),
                        "II ", "IS ", " S ",
                        'I', nintendium_ingot,
                        'S', nintendium_stick);

        GameRegistry.addRecipe
                (new ItemStack(nintendium_pickaxe),
                        "III", " S ", " S ",
                        'I', nintendium_ingot,
                        'S', nintendium_stick);

        GameRegistry.addRecipe
                (new ItemStack(nintendium_shovel),
                        " I ", " S ", " S ",
                        'I', nintendium_ingot,
                        'S', nintendium_stick);

        GameRegistry.addRecipe
                (new ItemStack(nintendium_hoe),
                        "II ", " S ", " S ",
                        'I', nintendium_ingot,
                        'S', nintendium_stick);

        GameRegistry.addRecipe
                (new ItemStack(nintendium_helmet),
                        "III", "I I",
                        'I', nintendium_ingot);

        GameRegistry.addRecipe
                (new ItemStack(nintendium_chestplate),
                        "I I", "III", "III",
                        'I', nintendium_ingot);

        GameRegistry.addRecipe
                (new ItemStack(nintendium_leggings),
                        "III", "I I", "I I",
                        'I', nintendium_ingot);

        GameRegistry.addRecipe
                (new ItemStack(nintendium_boots),
                        "I I", "I I",
                        'I', nintendium_ingot);

        ItemStack enchanted_tanooki_helmet = new ItemStack(tanooki_helmet);
        ItemStack enchanted_tanooki_chestplate = new ItemStack(tanooki_chestplate);
        ItemStack enchanted_tanooki_leggings = new ItemStack(tanooki_leggings);
        ItemStack enchanted_tanooki_boots = new ItemStack(tanooki_boots);
        enchanted_tanooki_helmet.addEnchantment(Enchantments.FEATHER_FALLING, 1);
        enchanted_tanooki_chestplate.addEnchantment(Enchantments.FEATHER_FALLING, 1);
        enchanted_tanooki_leggings.addEnchantment(Enchantments.FEATHER_FALLING, 1);
        enchanted_tanooki_boots.addEnchantment(Enchantments.FEATHER_FALLING, 1);
    }
}
