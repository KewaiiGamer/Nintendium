package kewaiigamer.nintendium.items.armor.whitetanooki;

import kewaiigamer.nintendium.Main;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class HelmetWhiteTanooki extends ItemArmor {
    public HelmetWhiteTanooki(ArmorMaterial material) {
        super(material, 1, EntityEquipmentSlot.HEAD);
        this.setUnlocalizedName("whitetanooki_helmet");
        this.setCreativeTab(Main.Nintendium);
    }
}
