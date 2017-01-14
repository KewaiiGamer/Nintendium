package kewaiigamer.nintendium.utils;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class NintendiumMaterials {
    public static ItemArmor.ArmorMaterial NintendiumArmor = EnumHelper.addArmorMaterial("Nintendium", "nintendium:nintendium", 100, new int[]{3, 8, 6, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.3F);
    public static Item.ToolMaterial NintendiumTool = EnumHelper.addToolMaterial("Nintendium", 16, 16384, 6.0F, 5.0F, 9);

    public static ItemArmor.ArmorMaterial WhiteNintendiumArmor = EnumHelper.addArmorMaterial("WhiteNintendium", "nintendium:whitenintendium", 100, new int[]{3, 8, 6, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.6F);
    public static Item.ToolMaterial WhiteNintendiumTool = EnumHelper.addToolMaterial("WhiteNintendium", 17, 16384, 7.0F, 8.0F, 12);

    public static ItemArmor.ArmorMaterial TanookiArmor = EnumHelper.addArmorMaterial("Tanooki", "nintendium:tanooki", 200, new int[]{3, 8, 6, 3}, 13, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1F);
    public static Item.ToolMaterial TanookiTool = EnumHelper.addToolMaterial("Tanooki", 17, 8192, 7.0F, 7.0F, 12);

    public static ItemArmor.ArmorMaterial WhiteTanookiArmor = EnumHelper.addArmorMaterial("WhiteTanooki", "nintendium:whitetanooki", 400, new int[]{3, 8, 6, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5F);
    public static Item.ToolMaterial WhiteTanookiTool = EnumHelper.addToolMaterial("WhiteTanooki", 18, 16384, 8.0F, 8.0F, 15);


}
