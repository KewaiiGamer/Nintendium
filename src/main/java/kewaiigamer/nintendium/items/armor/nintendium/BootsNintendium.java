package kewaiigamer.nintendium.items.armor.nintendium;

import kewaiigamer.nintendium.Main;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class BootsNintendium extends ItemArmor {
    public BootsNintendium(ArmorMaterial material) {
        super(material, 1, EntityEquipmentSlot.FEET);
        this.setUnlocalizedName("nintendium_boots");
        this.setCreativeTab(Main.Nintendium);
    }
}
