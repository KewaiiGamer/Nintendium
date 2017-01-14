package kewaiigamer.nintendium.items.armor.whitetanooki;

import kewaiigamer.nintendium.Main;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ChestplateWhiteTanooki extends ItemArmor {
    public ChestplateWhiteTanooki(ArmorMaterial material) {
        super(material, 1, EntityEquipmentSlot.CHEST);
        this.setUnlocalizedName("whitetanooki_chestplate");
        this.setCreativeTab(Main.Nintendium);
    }
}

