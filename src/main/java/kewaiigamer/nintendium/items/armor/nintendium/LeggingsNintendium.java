package kewaiigamer.nintendium.items.armor.nintendium;

import kewaiigamer.nintendium.Main;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class LeggingsNintendium extends ItemArmor {
    public LeggingsNintendium(ArmorMaterial material) {
        super(material, 1, EntityEquipmentSlot.LEGS);
        this.setUnlocalizedName("nintendium_leggings");
        this.setCreativeTab(Main.Nintendium);
    }
}
