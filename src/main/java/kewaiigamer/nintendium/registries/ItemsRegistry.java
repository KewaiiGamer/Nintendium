package kewaiigamer.nintendium.registries;

import kewaiigamer.nintendium.items.*;
import kewaiigamer.nintendium.items.armor.nintendium.BootsNintendium;
import kewaiigamer.nintendium.items.armor.nintendium.ChestplateNintendium;
import kewaiigamer.nintendium.items.armor.nintendium.HelmetNintendium;
import kewaiigamer.nintendium.items.armor.nintendium.LeggingsNintendium;
import kewaiigamer.nintendium.items.armor.tanooki.BootsTanooki;
import kewaiigamer.nintendium.items.armor.tanooki.ChestplateTanooki;
import kewaiigamer.nintendium.items.armor.tanooki.HelmetTanooki;
import kewaiigamer.nintendium.items.armor.tanooki.LeggingsTanooki;
import kewaiigamer.nintendium.items.armor.whitetanooki.BootsWhiteTanooki;
import kewaiigamer.nintendium.items.armor.whitetanooki.ChestplateWhiteTanooki;
import kewaiigamer.nintendium.items.armor.whitetanooki.HelmetWhiteTanooki;
import kewaiigamer.nintendium.items.armor.whitetanooki.LeggingsWhiteTanooki;
import kewaiigamer.nintendium.items.tools.nintendium.*;
import kewaiigamer.nintendium.items.tools.tanooki.*;
import kewaiigamer.nintendium.items.tools.whitetanooki.*;
import kewaiigamer.nintendium.utils.NintendiumMaterials;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.lang.reflect.Method;

public final class ItemsRegistry {

	// Nintendium Items
	public static Item nintendium_ingot;
    public static Item nintendium_stick;

    // Nintendium Tools
	public static Item nintendium_sword;
	public static Item nintendium_axe;
	public static Item nintendium_pickaxe;
	public static Item nintendium_shovel;
	public static Item nintendium_hoe;

	// Nintendium Armor
	public static Item nintendium_helmet;
	public static Item nintendium_chestplate;
	public static Item nintendium_leggings;
	public static Item nintendium_boots;

	// Tanooki Items

	public static Item tanooki_leaf;

	// Tanooki Tools
	public static Item tanooki_sword;
	public static Item tanooki_axe;
	public static Item tanooki_pickaxe;
	public static Item tanooki_shovel;
	public static Item tanooki_hoe;

	// Tanooki Armor
	public static Item tanooki_helmet;
	public static Item tanooki_chestplate;
	public static Item tanooki_leggings;
	public static Item tanooki_boots;

	// WhiteTanooki Tools
	public static Item whitetanooki_sword;
	public static Item whitetanooki_axe;
	public static Item whitetanooki_pickaxe;
	public static Item whitetanooki_shovel;
	public static Item whitetanooki_hoe;

	// WhiteTanooki Armor
	public static Item whitetanooki_helmet;
	public static Item whitetanooki_chestplate;
	public static Item whitetanooki_leggings;
	public static Item whitetanooki_boots;

	public static final void init() {
        // EX: GameRegistry.registerItem(VARIABLENAME = new CLASSNAME(VARIABLES), "VARIABLENAME");

        // Nintendium Items
        GameRegistry.registerItem(nintendium_ingot = new CustomItem("nintendium_ingot"), "nintendium_ingot");
        GameRegistry.registerItem(nintendium_stick = new CustomItem("nintendium_stick"), "nintendium_stick");

        // Nintendium Tools
        GameRegistry.registerItem(nintendium_sword = new SwordNintendium(NintendiumMaterials.NintendiumTool), "nintendium_sword");
        GameRegistry.registerItem(nintendium_axe = new AxeNintendium(NintendiumMaterials.NintendiumTool), "nintendium_axe");
        GameRegistry.registerItem(nintendium_pickaxe = new PickaxeNintendium(NintendiumMaterials.NintendiumTool), "nintendium_pickaxe");
        GameRegistry.registerItem(nintendium_shovel = new ShovelNintendium(NintendiumMaterials.NintendiumTool), "nintendium_shovel");
        GameRegistry.registerItem(nintendium_hoe = new HoeNintendium(NintendiumMaterials.NintendiumTool), "nintendium_hoe");

        // Nintendium Armor

		GameRegistry.registerItem(nintendium_helmet = new HelmetNintendium(NintendiumMaterials.NintendiumArmor),"nintendium_helmet");
		GameRegistry.registerItem(nintendium_chestplate = new ChestplateNintendium(NintendiumMaterials.NintendiumArmor),"nintendium_chestplate");
		GameRegistry.registerItem(nintendium_leggings= new LeggingsNintendium(NintendiumMaterials.NintendiumArmor),"nintendium_leggings");
		GameRegistry.registerItem(nintendium_boots = new BootsNintendium(NintendiumMaterials.NintendiumArmor),"nintendium_boots");

        // Tanooki Items
        GameRegistry.registerItem(tanooki_leaf = new CustomItem("tanooki_leaf"), "tanooki_leaf");

        // Tanooki Tools
        GameRegistry.registerItem(tanooki_sword = new SwordTanooki(NintendiumMaterials.TanookiTool), "tanooki_sword");
        GameRegistry.registerItem(tanooki_axe = new AxeTanooki(NintendiumMaterials.TanookiTool), "tanooki_axe");
        GameRegistry.registerItem(tanooki_pickaxe = new PickaxeTanooki(NintendiumMaterials.TanookiTool), "tanooki_pickaxe");
        GameRegistry.registerItem(tanooki_shovel = new ShovelTanooki(NintendiumMaterials.TanookiTool), "tanooki_shovel");
        GameRegistry.registerItem(tanooki_hoe = new HoeTanooki(NintendiumMaterials.TanookiTool), "tanooki_hoe");

        // Tanooki Armor

        GameRegistry.registerItem(tanooki_helmet = new HelmetTanooki(NintendiumMaterials.TanookiArmor), "tanooki_helmet");
        GameRegistry.registerItem(tanooki_chestplate = new ChestplateTanooki(NintendiumMaterials.TanookiArmor), "tanooki_chestplate");
        GameRegistry.registerItem(tanooki_leggings = new LeggingsTanooki(NintendiumMaterials.TanookiArmor), "tanooki_leggings");
        GameRegistry.registerItem(tanooki_boots = new BootsTanooki(NintendiumMaterials.TanookiArmor), "tanooki_boots");


        // White Tanooki Tools
        GameRegistry.registerItem(whitetanooki_sword = new SwordWhiteTanooki(NintendiumMaterials.WhiteTanookiTool), "whitetanooki_sword");
        GameRegistry.registerItem(whitetanooki_axe = new AxeWhiteTanooki(NintendiumMaterials.WhiteTanookiTool), "whitetanooki_axe");
        GameRegistry.registerItem(whitetanooki_pickaxe = new PickaxeWhiteTanooki(NintendiumMaterials.WhiteTanookiTool), "whitetanooki_pickaxe");
        GameRegistry.registerItem(whitetanooki_shovel = new ShovelWhiteTanooki(NintendiumMaterials.WhiteTanookiTool), "whitetanooki_shovel");
        GameRegistry.registerItem(whitetanooki_hoe = new HoeWhiteTanooki(NintendiumMaterials.WhiteTanookiTool), "whitetanooki_hoe");

        // White Tanooki Armor
        GameRegistry.registerItem(whitetanooki_helmet = new HelmetWhiteTanooki(NintendiumMaterials.WhiteTanookiArmor), "whitetanooki_helmet");
        GameRegistry.registerItem(whitetanooki_chestplate = new ChestplateWhiteTanooki(NintendiumMaterials.WhiteTanookiArmor), "whitetanooki_chestplate");
        GameRegistry.registerItem(whitetanooki_leggings = new LeggingsWhiteTanooki(NintendiumMaterials.WhiteTanookiArmor), "whitetanooki_leggings");
        GameRegistry.registerItem(whitetanooki_boots = new BootsWhiteTanooki(NintendiumMaterials.WhiteTanookiArmor), "whitetanooki_boots");
    }
}