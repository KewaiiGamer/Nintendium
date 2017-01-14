package kewaiigamer.nintendium.items.tools.nintendium;

import kewaiigamer.nintendium.Main;
import net.minecraft.item.ItemHoe;

public class HoeNintendium extends ItemHoe {
    public HoeNintendium(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("nintendium_hoe");
        this.setCreativeTab(Main.Nintendium);
    }
}
