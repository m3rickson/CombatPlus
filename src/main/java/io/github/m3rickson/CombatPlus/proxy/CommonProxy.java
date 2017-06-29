package io.github.m3rickson.CombatPlus.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerAboutToStartEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppedEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppingEvent;

public class CommonProxy {
	
	protected int modEntityID = 0;
    
    public void preInit(FMLPreInitializationEvent event)
    { 
        // load configuration before doing anything else, because might use 
        // config values during registration
        // initConfig(event);
        // register stuff
        // registerBlocks();
        // registerItems();
        // registerTileEntities();
        // registerModEntities();
        // registerEntitySpawns();
        // registerFuelHandlers();
        // registerSimpleNetworking();
        // registerVillagers();
    }

    public void init(FMLInitializationEvent event)
    {
        // register custom event listeners
        // registerEventListeners();
         
        // register recipes here to allow use of items from other mods
        // registerRecipes();
        
        // register achievements here to allow use of items from other mods
        // registerAchievements();
        
        // register gui handlers
        // registerGuiHandlers();
    }

    public void postInit(FMLPostInitializationEvent event)
    {
    }

    public void serverAboutToStart(FMLServerAboutToStartEvent event) 
    {
    }
    
    public void serverStarting(FMLServerStartingEvent event) 
    {
        // register server commands
        // event.registerServerCommand(new CommandStructureCapture());
    }

    public void serverStarted(FMLServerStartedEvent event) 
    {
    }

    public void serverStopping(FMLServerStoppingEvent event) 
    {
    }

    public void serverStopped(FMLServerStoppedEvent event) 
    {
    }

}
