package kewaiigamer.nintendium.items;

import kewaiigamer.nintendium.Main;
import net.minecraft.item.Item;

public class CustomItem extends Item {
    public CustomItem(String name) {
        super();
        this.setUnlocalizedName(name);
        this.setCreativeTab(Main.Nintendium);
    }
}
