package kewaiigamer.nintendium.proxies;

import kewaiigamer.nintendium.render.Renderer;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e){
        super.preInit(e);
       // EntitiesRegistry.initModels();
    }
    @Override
    public void init(FMLInitializationEvent e){
        super.init(e);
        Renderer.registerItemRenderer();
    }
    @Override
    public void postInit(FMLPostInitializationEvent e){
        super.postInit(e);
    }

}
