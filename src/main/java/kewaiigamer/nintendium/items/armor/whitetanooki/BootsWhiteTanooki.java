package kewaiigamer.nintendium.items.armor.whitetanooki;

import kewaiigamer.nintendium.Main;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class BootsWhiteTanooki extends ItemArmor {
    public BootsWhiteTanooki(ArmorMaterial material) {
        super(material, 1, EntityEquipmentSlot.FEET);
        this.setUnlocalizedName("whitetanooki_boots");
        this.setCreativeTab(Main.Nintendium);
    }
}
