package io.github.m3rickson.combatplus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.m3rickson.combatplus.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerAboutToStartEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppedEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppingEvent;

@Mod(modid=CombatPlus.MOD_ID, name=CombatPlus.MOD_NAME, version=CombatPlus.VERSION)
public class CombatPlus {
	
	public static final String MOD_ID = "combatplus";
	public static final String MOD_NAME = "Combat Plus";
	public static final String VERSION = "$VERSION$";
	
	@Mod.Instance(MOD_ID)
	public static CombatPlus instance;
	
	@SidedProxy(
		      clientSide="io.github.m3rickson.combatplus.proxy.ClientProxy", 
		      serverSide="io.github.m3rickson.combatplus.proxy.CommonProxy"
		    )
	public static CommonProxy proxy;
	
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{    
	    LOGGER.info("Starting Pre-Initialization");
		proxy.preInit(event);
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) 
	{
		LOGGER.info("Starting Initialization");
		proxy.init(event);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) 
	{
		LOGGER.info("Starting Post-Initialization");
		proxy.postInit(event);
	}

	@Mod.EventHandler
	public void serverAboutToStart(FMLServerAboutToStartEvent event)
	{
	    proxy.serverAboutToStart(event);
	}

	@Mod.EventHandler
	public void serverStarting(FMLServerStartingEvent event)
	{
	    proxy.serverStarting(event);
	}

	@Mod.EventHandler
	public void serverStarted(FMLServerStartedEvent event)
	{
	    proxy.serverStarted(event);
	}

	@Mod.EventHandler
	public void serverStopping(FMLServerStoppingEvent event)
	{
	    proxy.serverStopping(event);
	}

	@Mod.EventHandler
	public void serverStopped(FMLServerStoppedEvent event)
	{
	    proxy.serverStopped(event);
	}

}
