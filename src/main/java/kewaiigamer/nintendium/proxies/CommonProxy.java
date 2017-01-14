package kewaiigamer.nintendium.proxies;

import kewaiigamer.nintendium.recipes.CraftRecipes;
import kewaiigamer.nintendium.registries.BlocksRegistry;
import kewaiigamer.nintendium.registries.ItemsRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
        ItemsRegistry.init();
        BlocksRegistry.init();
        //EntitiesRegistry.init();
    }

    public void init(FMLInitializationEvent e) {
        CraftRecipes.initRecipes();
        //CraftingRegistry.init();
        //GameRegistry.registerWorldGenerator(new PermafrostWorldGenerator(), 1);
        //MinecraftForge.EVENT_BUS.register(new EventOnEntityCreated());
    }

    public void postInit(FMLPostInitializationEvent e) {
    }
}