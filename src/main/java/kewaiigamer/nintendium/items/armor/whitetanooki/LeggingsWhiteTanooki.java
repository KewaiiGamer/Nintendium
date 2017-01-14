package kewaiigamer.nintendium.items.armor.whitetanooki;

import kewaiigamer.nintendium.Main;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class LeggingsWhiteTanooki extends ItemArmor {
    public LeggingsWhiteTanooki(ArmorMaterial material) {
        super(material, 1, EntityEquipmentSlot.LEGS);
        this.setUnlocalizedName("whitetanooki_leggings");
        this.setCreativeTab(Main.Nintendium);
    }
}
