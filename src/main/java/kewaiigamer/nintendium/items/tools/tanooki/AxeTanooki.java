package kewaiigamer.nintendium.items.tools.tanooki;

import kewaiigamer.nintendium.Main;
import kewaiigamer.nintendium.items.ItemAxeCustom;

public class AxeTanooki extends ItemAxeCustom {
    public AxeTanooki(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("tanooki_axe");
        this.setCreativeTab(Main.Nintendium);
        this.damageVsEntity = 10.0F;
        this.attackSpeed = -3.2F;
    }
}
