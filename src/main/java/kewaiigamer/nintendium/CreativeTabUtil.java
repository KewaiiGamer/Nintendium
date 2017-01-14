package kewaiigamer.nintendium;

import kewaiigamer.nintendium.registries.BlocksRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by kewaii on 13-01-2017.
 */
public class CreativeTabUtil extends CreativeTabs{
    public CreativeTabUtil(String tabLabel){
        super(tabLabel);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem(){
        return Item.getItemFromBlock(BlocksRegistry.block_nintendium);
    }

}