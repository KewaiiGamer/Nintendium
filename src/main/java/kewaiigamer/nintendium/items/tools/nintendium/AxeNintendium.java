package kewaiigamer.nintendium.items.tools.nintendium;

import kewaiigamer.nintendium.Main;
import kewaiigamer.nintendium.items.ItemAxeCustom;

public class AxeNintendium extends ItemAxeCustom {
    public AxeNintendium(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("nintendium_axe");
        this.setCreativeTab(Main.Nintendium);
        this.damageVsEntity = 9.0F;
        this.attackSpeed = -3.3F;
    }
}
