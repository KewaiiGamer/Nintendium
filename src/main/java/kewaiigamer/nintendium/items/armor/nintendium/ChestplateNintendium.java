package kewaiigamer.nintendium.items.armor.nintendium;

import kewaiigamer.nintendium.Main;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ChestplateNintendium extends ItemArmor {
    public ChestplateNintendium(ArmorMaterial material) {
        super(material, 1, EntityEquipmentSlot.CHEST);
        this.setUnlocalizedName("nintendium_chestplate");
        this.setCreativeTab(Main.Nintendium);
    }
}

