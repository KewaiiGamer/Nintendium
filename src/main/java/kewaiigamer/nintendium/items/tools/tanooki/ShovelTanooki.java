package kewaiigamer.nintendium.items.tools.tanooki;

import kewaiigamer.nintendium.Main;
import net.minecraft.item.ItemSpade;

public class ShovelTanooki extends ItemSpade {
    public ShovelTanooki(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("tanooki_shovel");
        this.setCreativeTab(Main.Nintendium);
    }
}
