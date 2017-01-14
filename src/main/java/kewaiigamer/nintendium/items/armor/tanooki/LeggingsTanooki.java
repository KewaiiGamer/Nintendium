package kewaiigamer.nintendium.items.armor.tanooki;

import kewaiigamer.nintendium.Main;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class LeggingsTanooki extends ItemArmor {
    public LeggingsTanooki(ArmorMaterial material) {
        super(material, 1, EntityEquipmentSlot.LEGS);
        this.setUnlocalizedName("tanooki_leggings");
        this.setCreativeTab(Main.Nintendium);
    }
}
