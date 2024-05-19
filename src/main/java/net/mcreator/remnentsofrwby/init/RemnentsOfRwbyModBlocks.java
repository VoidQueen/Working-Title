
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.remnentsofrwby.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.remnentsofrwby.block.YourmomWoodBlock;
import net.mcreator.remnentsofrwby.block.YourmomStairsBlock;
import net.mcreator.remnentsofrwby.block.YourmomSlabBlock;
import net.mcreator.remnentsofrwby.block.YourmomPressurePlateBlock;
import net.mcreator.remnentsofrwby.block.YourmomPlanksBlock;
import net.mcreator.remnentsofrwby.block.YourmomLogBlock;
import net.mcreator.remnentsofrwby.block.YourmomLeavesBlock;
import net.mcreator.remnentsofrwby.block.YourmomFenceGateBlock;
import net.mcreator.remnentsofrwby.block.YourmomFenceBlock;
import net.mcreator.remnentsofrwby.block.YourmomButtonBlock;
import net.mcreator.remnentsofrwby.RemnentsOfRwbyMod;

public class RemnentsOfRwbyModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RemnentsOfRwbyMod.MODID);
	public static final RegistryObject<Block> YOURMOM_WOOD = REGISTRY.register("yourmom_wood", () -> new YourmomWoodBlock());
	public static final RegistryObject<Block> YOURMOM_LOG = REGISTRY.register("yourmom_log", () -> new YourmomLogBlock());
	public static final RegistryObject<Block> YOURMOM_PLANKS = REGISTRY.register("yourmom_planks", () -> new YourmomPlanksBlock());
	public static final RegistryObject<Block> YOURMOM_LEAVES = REGISTRY.register("yourmom_leaves", () -> new YourmomLeavesBlock());
	public static final RegistryObject<Block> YOURMOM_STAIRS = REGISTRY.register("yourmom_stairs", () -> new YourmomStairsBlock());
	public static final RegistryObject<Block> YOURMOM_SLAB = REGISTRY.register("yourmom_slab", () -> new YourmomSlabBlock());
	public static final RegistryObject<Block> YOURMOM_FENCE = REGISTRY.register("yourmom_fence", () -> new YourmomFenceBlock());
	public static final RegistryObject<Block> YOURMOM_FENCE_GATE = REGISTRY.register("yourmom_fence_gate", () -> new YourmomFenceGateBlock());
	public static final RegistryObject<Block> YOURMOM_PRESSURE_PLATE = REGISTRY.register("yourmom_pressure_plate", () -> new YourmomPressurePlateBlock());
	public static final RegistryObject<Block> YOURMOM_BUTTON = REGISTRY.register("yourmom_button", () -> new YourmomButtonBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
