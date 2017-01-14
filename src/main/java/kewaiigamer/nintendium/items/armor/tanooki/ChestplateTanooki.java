package kewaiigamer.nintendium.items.armor.tanooki;

import kewaiigamer.nintendium.Main;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ChestplateTanooki extends ItemArmor {
    public ChestplateTanooki(ArmorMaterial material) {
        super(material, 1, EntityEquipmentSlot.CHEST);
        this.setUnlocalizedName("tanooki_chestplate");
        this.setCreativeTab(Main.Nintendium);
    }
}

