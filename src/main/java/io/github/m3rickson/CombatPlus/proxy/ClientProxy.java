package io.github.m3rickson.CombatPlus.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	
	@Override
    public void preInit(FMLPreInitializationEvent event)
    {
        // do common stuff
        super.preInit(event);

        // do client-specific stuff

    }

    @Override
    public void init(FMLInitializationEvent event)
    {
        // do common stuff
        super.init(event);

        // do client-specific stuff
        // registerKeyBindings();
        // registerEntityRenderers();
        // registerItemRenderers();
        // registerBlockRenderers();
    }
    
    @Override
    public void postInit(FMLPostInitializationEvent event)
    {
        // do common stuff
        super.postInit(event);

        // do client-specific stuff
        // BlockSmith.versionChecker = new VersionChecker();
        // Thread versionCheckThread = new Thread(BlockSmith.versionChecker, 
        //       "Version Check");
        // versionCheckThread.start();
    }

}
