
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.remnentsofrwby.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.remnentsofrwby.RemnentsOfRwbyMod;

public class RemnentsOfRwbyModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RemnentsOfRwbyMod.MODID);
	public static final RegistryObject<Item> YOURMOM_WOOD = block(RemnentsOfRwbyModBlocks.YOURMOM_WOOD);
	public static final RegistryObject<Item> YOURMOM_LOG = block(RemnentsOfRwbyModBlocks.YOURMOM_LOG);
	public static final RegistryObject<Item> YOURMOM_PLANKS = block(RemnentsOfRwbyModBlocks.YOURMOM_PLANKS);
	public static final RegistryObject<Item> YOURMOM_LEAVES = block(RemnentsOfRwbyModBlocks.YOURMOM_LEAVES);
	public static final RegistryObject<Item> YOURMOM_STAIRS = block(RemnentsOfRwbyModBlocks.YOURMOM_STAIRS);
	public static final RegistryObject<Item> YOURMOM_SLAB = block(RemnentsOfRwbyModBlocks.YOURMOM_SLAB);
	public static final RegistryObject<Item> YOURMOM_FENCE = block(RemnentsOfRwbyModBlocks.YOURMOM_FENCE);
	public static final RegistryObject<Item> YOURMOM_FENCE_GATE = block(RemnentsOfRwbyModBlocks.YOURMOM_FENCE_GATE);
	public static final RegistryObject<Item> YOURMOM_PRESSURE_PLATE = block(RemnentsOfRwbyModBlocks.YOURMOM_PRESSURE_PLATE);
	public static final RegistryObject<Item> YOURMOM_BUTTON = block(RemnentsOfRwbyModBlocks.YOURMOM_BUTTON);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
