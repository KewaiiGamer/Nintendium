package kewaiigamer.nintendium.items.tools.tanooki;

import kewaiigamer.nintendium.Main;
import net.minecraft.item.ItemPickaxe;

public class PickaxeTanooki extends ItemPickaxe {
    public PickaxeTanooki(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("tanooki_pickaxe");
        this.setCreativeTab(Main.Nintendium);
    }
}
