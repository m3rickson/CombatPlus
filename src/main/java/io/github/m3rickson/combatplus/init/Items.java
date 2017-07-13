package io.github.m3rickson.combatplus.init;

import io.github.m3rickson.combatplus.CombatPlus;
import io.github.m3rickson.combatplus.item.ItemSpear;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = CombatPlus.MOD_ID)
@ObjectHolder(CombatPlus.MOD_ID)
public class Items {
	
    public static final Item iron_spear = new ItemSpear("iron_spear", CreativeTabs.COMBAT, 64, Item.ToolMaterial.IRON);
	
	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<Item> event) {
		final Item[] items = {
				iron_spear,
		};
		
		IForgeRegistry<Item> registry = event.getRegistry();
		
		for (Item item : items) {
			registry.register(item);
		}
	}
}
