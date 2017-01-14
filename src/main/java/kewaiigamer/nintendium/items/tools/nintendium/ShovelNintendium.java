package kewaiigamer.nintendium.items.tools.nintendium;

import kewaiigamer.nintendium.Main;
import net.minecraft.item.ItemSpade;

public class ShovelNintendium extends ItemSpade {
    public ShovelNintendium(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("nintendium_shovel");
        this.setCreativeTab(Main.Nintendium);
    }
}
