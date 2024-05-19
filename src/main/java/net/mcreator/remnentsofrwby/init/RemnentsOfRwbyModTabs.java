
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.remnentsofrwby.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.remnentsofrwby.RemnentsOfRwbyMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RemnentsOfRwbyModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RemnentsOfRwbyMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(RemnentsOfRwbyModBlocks.YOURMOM_LOG.get().asItem());
			tabData.accept(RemnentsOfRwbyModBlocks.YOURMOM_WOOD.get().asItem());
			tabData.accept(RemnentsOfRwbyModBlocks.YOURMOM_PLANKS.get().asItem());
			tabData.accept(RemnentsOfRwbyModBlocks.YOURMOM_STAIRS.get().asItem());
			tabData.accept(RemnentsOfRwbyModBlocks.YOURMOM_SLAB.get().asItem());
			tabData.accept(RemnentsOfRwbyModBlocks.YOURMOM_FENCE.get().asItem());
			tabData.accept(RemnentsOfRwbyModBlocks.YOURMOM_FENCE_GATE.get().asItem());
			tabData.accept(RemnentsOfRwbyModBlocks.YOURMOM_PRESSURE_PLATE.get().asItem());
			tabData.accept(RemnentsOfRwbyModBlocks.YOURMOM_BUTTON.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(RemnentsOfRwbyModBlocks.YOURMOM_LEAVES.get().asItem());
		}
	}
}
