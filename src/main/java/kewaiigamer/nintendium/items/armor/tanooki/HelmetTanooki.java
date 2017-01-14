package kewaiigamer.nintendium.items.armor.tanooki;

import kewaiigamer.nintendium.Main;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class HelmetTanooki extends ItemArmor {
    public HelmetTanooki(ArmorMaterial material) {
        super(material, 1, EntityEquipmentSlot.HEAD);
        this.setUnlocalizedName("tanooki_helmet");
        this.setCreativeTab(Main.Nintendium);
    }
}
