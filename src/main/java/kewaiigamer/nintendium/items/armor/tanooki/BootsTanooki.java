package kewaiigamer.nintendium.items.armor.tanooki;

import kewaiigamer.nintendium.Main;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class BootsTanooki extends ItemArmor {
    public BootsTanooki(ArmorMaterial material) {
        super(material, 1, EntityEquipmentSlot.FEET);
        this.setUnlocalizedName("tanooki_boots");
        this.setCreativeTab(Main.Nintendium);
    }
}
