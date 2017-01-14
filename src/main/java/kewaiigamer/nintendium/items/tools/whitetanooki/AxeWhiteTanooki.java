package kewaiigamer.nintendium.items.tools.whitetanooki;

import kewaiigamer.nintendium.Main;
import kewaiigamer.nintendium.items.ItemAxeCustom;

public class AxeWhiteTanooki extends ItemAxeCustom {
    public AxeWhiteTanooki(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("whitetanooki_axe");
        this.setCreativeTab(Main.Nintendium);
        this.damageVsEntity = 11.0F;
        this.attackSpeed = -3.1F;
    }
}
