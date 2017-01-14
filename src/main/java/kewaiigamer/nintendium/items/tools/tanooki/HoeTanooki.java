package kewaiigamer.nintendium.items.tools.tanooki;

import kewaiigamer.nintendium.Main;
import net.minecraft.item.ItemHoe;

public class HoeTanooki extends ItemHoe {
    public HoeTanooki(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("tanooki_hoe");
        this.setCreativeTab(Main.Nintendium);
    }
}
