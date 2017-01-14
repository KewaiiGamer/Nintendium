package kewaiigamer.nintendium.items.tools.nintendium;

import kewaiigamer.nintendium.Main;
import net.minecraft.item.ItemPickaxe;

public class PickaxeNintendium extends ItemPickaxe {
    public PickaxeNintendium(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("nintendium_pickaxe");
        this.setCreativeTab(Main.Nintendium);
    }
}
