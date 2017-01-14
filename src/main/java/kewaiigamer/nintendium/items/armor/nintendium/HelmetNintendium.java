package kewaiigamer.nintendium.items.armor.nintendium;

import kewaiigamer.nintendium.Main;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class HelmetNintendium extends ItemArmor {
    public HelmetNintendium(ArmorMaterial material) {
        super(material, 1, EntityEquipmentSlot.HEAD);
        this.setUnlocalizedName("nintendium_helmet");
        this.setCreativeTab(Main.Nintendium);
    }
}
