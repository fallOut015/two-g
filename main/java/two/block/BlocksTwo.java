package two.block;

import java.util.LinkedList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.LogBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StandingSignBlock;
import net.minecraft.block.WallSignBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootParameterSets;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.player.PlayerSetSpawnEvent;
import net.minecraftforge.registries.ObjectHolder;
import two.Two;
import two.block.material.MaterialTwo;
import two.block.trees.CherryTree;
import two.block.trees.CloudwoodTree;
import two.block.trees.GhostwoodTree;
import two.block.trees.MapleTree;
import two.world.dimension.NightmareModDimension;

@ObjectHolder("two")
public class BlocksTwo {
	public static final Block TEST_BLOCK = register("test_block", new Block(Block.Properties.create(Material.MISCELLANEOUS).lightValue(1)));
    
	//public static final Block ADOBE = register("adobe", new AdobeBlock());
	
	//public static final Block CEDAR_PLANKS = register("cedar_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.BROWN_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	//public static final Block REDWOOD_PLANKS = register("redwood_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.BROWN_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final Block CHERRY_PLANKS = register("cherry_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.GRAY).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	//public static final Block ASPEN_PLANKS = register("aspen_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.BROWN_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	//public static final Block DRAGONBLOOD_PLANKS = register("dragonblood_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.BROWN_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	//public static final Block EUCALYPTUS_PLANKS = register("eucalyptus_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.BROWN_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	//public static final Block PINE_PLANKS = register("pine_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.BROWN_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	//public static final Block BALSA_PLANKS = register("balsa_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.BROWN_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	//public static final Block CONIFER_PLANKS = register("conifer_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.BROWN_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final Block MAPLE_PLANKS = register("maple_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.BROWN_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final Block GHOSTWOOD_PLANKS = register("ghostwood_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.RED_TERRACOTTA).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.WOOD)));
	//public static final Block DEADWOOD_PLANKS = register("deadwood_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.STONE).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.WOOD)));	
	public static final Block CLOUDWOOD_PLANKS = register("cloudwood_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.CYAN_TERRACOTTA).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.WOOD)));
	
	public static final Block WHITE_STAINED_PLANKS = register("white_stained_planks", new Block(Block.Properties.create(Material.WOOD, DyeColor.WHITE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final Block ORANGE_STAINED_PLANKS = register("orange_stained_planks", new Block(Block.Properties.create(Material.WOOD, DyeColor.ORANGE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final Block MAGENTA_STAINED_PLANKS = register("magenta_stained_planks", new Block(Block.Properties.create(Material.WOOD, DyeColor.MAGENTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final Block LIGHT_BLUE_STAINED_PLANKS = register("light_blue_stained_planks", new Block(Block.Properties.create(Material.WOOD, DyeColor.LIGHT_BLUE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final Block YELLOW_STAINED_PLANKS = register("yellow_stained_planks", new Block(Block.Properties.create(Material.WOOD, DyeColor.YELLOW).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final Block LIME_STAINED_PLANKS = register("lime_stained_planks", new Block(Block.Properties.create(Material.WOOD, DyeColor.LIME).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final Block PINK_STAINED_PLANKS = register("pink_stained_planks", new Block(Block.Properties.create(Material.WOOD, DyeColor.PINK).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final Block GRAY_STAINED_PLANKS = register("gray_stained_planks", new Block(Block.Properties.create(Material.WOOD, DyeColor.GRAY).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final Block LIGHT_GRAY_STAINED_PLANKS = register("light_gray_stained_planks", new Block(Block.Properties.create(Material.WOOD, DyeColor.LIGHT_GRAY).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final Block CYAN_STAINED_PLANKS = register("cyan_stained_planks", new Block(Block.Properties.create(Material.WOOD, DyeColor.CYAN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final Block PURPLE_STAINED_PLANKS = register("purple_stained_planks", new Block(Block.Properties.create(Material.WOOD, DyeColor.PURPLE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final Block BLUE_STAINED_PLANKS = register("blue_stained_planks", new Block(Block.Properties.create(Material.WOOD, DyeColor.BLUE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final Block BROWN_STAINED_PLANKS = register("brown_stained_planks", new Block(Block.Properties.create(Material.WOOD, DyeColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final Block GREEN_STAINED_PLANKS = register("green_stained_planks", new Block(Block.Properties.create(Material.WOOD, DyeColor.GREEN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final Block RED_STAINED_PLANKS = register("red_stained_planks", new Block(Block.Properties.create(Material.WOOD, DyeColor.RED).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final Block BLACK_STAINED_PLANKS = register("black_stained_planks", new Block(Block.Properties.create(Material.WOOD, DyeColor.BLACK).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
		
	public static final Block CHERRY_SAPLING = register("cherry_sapling", new SaplingBlockTwo(new CherryTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0).sound(SoundType.PLANT)));
	public static final Block MAPLE_SAPLING = register("maple_sapling", new SaplingBlockTwo(new MapleTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0).sound(SoundType.PLANT)));
	public static final Block GHOSTWOOD_SAPLING = register("ghostwood_sapling", new SaplingBlockTwo(new GhostwoodTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0).sound(SoundType.PLANT)));
	public static final Block CLOUDWOOD_SAPLING = register("cloudwood_sapling", new SaplingBlockTwo(new CloudwoodTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0).sound(SoundType.PLANT)));
	
	public static final Block POTTED_CHERRY_SAPLING = register("potted_cherry_sapling", new FlowerPotBlock(null, () -> CHERRY_SAPLING, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0).func_226896_b_()));
	public static final Block POTTED_MAPLE_SAPLING = register("potted_maple_sapling", new FlowerPotBlock(null, () -> MAPLE_SAPLING, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0).func_226896_b_()));
	public static final Block POTTED_GHOSTWOOD_SAPLING = register("potted_ghostwood_sapling", new FlowerPotBlock(null, () -> GHOSTWOOD_SAPLING, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0).func_226896_b_()));
	public static final Block POTTED_CLOUDWOOD_SAPLING = register("potted_cloudwood_sapling", new FlowerPotBlock(null, () -> CLOUDWOOD_SAPLING, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0).func_226896_b_()));
	
	public static final Block CHERRY_LOG = register("cherry_log", new LogBlock(MaterialColor.STONE, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).sound(SoundType.WOOD)));
	public static final Block MAPLE_LOG = register("maple_log", new LogBlock(MaterialColor.BROWN_TERRACOTTA, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final Block GHOSTWOOD_LOG = register("ghostwood_log", new LogBlock(MaterialColor.SNOW, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).sound(SoundType.WOOD)));
	public static final Block CLOUDWOOD_LOG = register("cloudwood_log", new LogBlock(MaterialColor.CYAN, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	
	public static final Block STRIPPED_CHERRY_LOG = register("stripped_cherry_log", new LogBlock(MaterialColor.RED, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).sound(SoundType.WOOD)));
	public static final Block STRIPPED_MAPLE_LOG = register("stripped_maple_log", new LogBlock(MaterialColor.SAND, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).sound(SoundType.WOOD)));
	public static final Block STRIPPED_GHOSTWOOD_LOG = register("stripped_ghostwood_log", new LogBlock(MaterialColor.RED_TERRACOTTA, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).sound(SoundType.WOOD)));
	public static final Block STRIPPED_CLOUDWOOD_LOG = register("stripped_cloudwood_log", new LogBlock(MaterialColor.SNOW, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).sound(SoundType.WOOD)));
	
	public static final Block STRIPPED_CHERRY_WOOD = register("stripped_cherry_wood", new RotatedPillarBlock(Block.Properties.create(Material.WOOD, MaterialColor.RED).hardnessAndResistance(2.0f).sound(SoundType.WOOD)));
	public static final Block STRIPPED_MAPLE_WOOD = register("stripped_maple_wood", new RotatedPillarBlock(Block.Properties.create(Material.WOOD, MaterialColor.SAND).hardnessAndResistance(2.0f).sound(SoundType.WOOD)));
	public static final Block STRIPPED_GHOSTWOOD_WOOD = register("stripped_ghostwood_wood", new RotatedPillarBlock(Block.Properties.create(Material.WOOD, MaterialColor.RED_TERRACOTTA).hardnessAndResistance(2.0f).sound(SoundType.WOOD)));
	public static final Block STRIPPED_CLOUDWOOD_WOOD = register("stripped_cloudwood_wood", new RotatedPillarBlock(Block.Properties.create(Material.WOOD, MaterialColor.SNOW).hardnessAndResistance(2.0f).sound(SoundType.WOOD)));
	
	public static final Block CHERRY_WOOD = register("cherry_wood", new RotatedPillarBlock(Block.Properties.create(Material.WOOD, MaterialColor.STONE).hardnessAndResistance(2.0f).sound(SoundType.WOOD)));
	public static final Block MAPLE_WOOD = register("maple_wood", new RotatedPillarBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN_TERRACOTTA).hardnessAndResistance(2.0f).sound(SoundType.WOOD)));
	public static final Block GHOSTWOOD_WOOD = register("ghostwood_wood", new RotatedPillarBlock(Block.Properties.create(Material.WOOD, MaterialColor.SNOW).hardnessAndResistance(2.0f).sound(SoundType.WOOD)));
	public static final Block CLOUDWOOD_WOOD = register("cloudwood_wood", new RotatedPillarBlock(Block.Properties.create(Material.WOOD, MaterialColor.CYAN).hardnessAndResistance(2.0f).sound(SoundType.WOOD)));
	
	public static final Block CHERRY_LEAVES = register("cherry_leaves", new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT).func_226896_b_()));
	public static final Block MAPLE_LEAVES = register("maple_leaves", new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT).func_226896_b_()));
	public static final Block GHOSTWOOD_LEAVES = register("ghostwood_leaves", new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT).func_226896_b_()));
	public static final Block CLOUDWOOD_LEAVES = register("cloudwood_leaves", new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT).func_226896_b_()));
	
	public static final Block CHERRY_SLAB = register("cherry_slab", new SlabBlock(Block.Properties.create(Material.WOOD, MaterialColor.PINK_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final Block MAPLE_SLAB = register("maple_slab", new SlabBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final Block GHOSTWOOD_SLAB = register("ghostwood_slab", new SlabBlock(Block.Properties.create(Material.WOOD, MaterialColor.RED_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final Block CLOUDWOOD_SLAB = register("cloudwood_slab", new SlabBlock(Block.Properties.create(Material.WOOD, MaterialColor.CYAN_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	
	public static final Block CHERRY_PRESSURE_PLATE = register("cherry_pressure_plate", new PressurePlateBlockTwo(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD, MaterialColor.PINK_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
	public static final Block MAPLE_PRESSURE_PLATE = register("maple_pressure_plate", new PressurePlateBlockTwo(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD, MaterialColor.BROWN_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
	public static final Block GHOSTWOOD_PRESSURE_PLATE = register("ghostwood_pressure_plate", new PressurePlateBlockTwo(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD, MaterialColor.RED_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
	public static final Block CLOUDWOOD_PRESSURE_PLATE = register("cloudwood_pressure_plate", new PressurePlateBlockTwo(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD, MaterialColor.CYAN_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
	
	public static final Block CHERRY_FENCE = register("cherry_fence", new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.PINK_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final Block MAPLE_FENCE = register("maple_fence", new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final Block GHOSTWOOD_FENCE = register("ghostwood_fence", new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.RED_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final Block CLOUDWOOD_FENCE = register("cloudwood_fence", new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.CYAN_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	
	public static final Block CHERRY_TRAPDOOR = register("cherry_trapdoor", new TrapDoorBlockTwo(Block.Properties.create(Material.WOOD, MaterialColor.PINK_TERRACOTTA).hardnessAndResistance(3.0F).sound(SoundType.WOOD).func_226896_b_()));
	public static final Block MAPLE_TRAPDOOR = register("maple_trapdoor", new TrapDoorBlockTwo(Block.Properties.create(Material.WOOD, MaterialColor.BROWN_TERRACOTTA).hardnessAndResistance(3.0F).sound(SoundType.WOOD).func_226896_b_()));
	public static final Block GHOSTWOOD_TRAPDOOR = register("ghostwood_trapdoor", new TrapDoorBlockTwo(Block.Properties.create(Material.WOOD, MaterialColor.RED_TERRACOTTA).hardnessAndResistance(3.0F).sound(SoundType.WOOD).func_226896_b_()));
	public static final Block CLOUDWOOD_TRAPDOOR = register("cloudwood_trapdoor", new TrapDoorBlockTwo(Block.Properties.create(Material.WOOD, MaterialColor.CYAN_TERRACOTTA).hardnessAndResistance(3.0F).sound(SoundType.WOOD).func_226896_b_()));
	
	public static final Block CHERRY_FENCE_GATE = register("cherry_fence_gate", new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.PINK_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final Block MAPLE_FENCE_GATE = register("maple_fence_gate", new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final Block GHOSTWOOD_FENCE_GATE = register("ghostwood_fence_gate", new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.RED_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final Block CLOUDWOOD_FENCE_GATE = register("cloudwood_fence_gate", new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.CYAN_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	
	public static final Block CHERRY_STAIRS = register("cherry_stairs", new StairsBlockTwo(CHERRY_PLANKS.getDefaultState(), Block.Properties.from(CHERRY_PLANKS)));
	public static final Block MAPLE_STAIRS = register("maple_stairs", new StairsBlockTwo(MAPLE_PLANKS.getDefaultState(), Block.Properties.from(MAPLE_PLANKS)));
	public static final Block GHOSTWOOD_STAIRS = register("ghostwood_stairs", new StairsBlockTwo(GHOSTWOOD_PLANKS.getDefaultState(), Block.Properties.from(GHOSTWOOD_PLANKS)));
	public static final Block CLOUDWOOD_STAIRS = register("cloudwood_stairs", new StairsBlockTwo(CLOUDWOOD_PLANKS.getDefaultState(), Block.Properties.from(CLOUDWOOD_PLANKS)));
	
	public static final Block CHERRY_BUTTON = register("cherry_button", new WoodButtonBlockTwo(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
	public static final Block MAPLE_BUTTON = register("maple_button", new WoodButtonBlockTwo(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
	public static final Block GHOSTWOOD_BUTTON = register("ghostwood_button", new WoodButtonBlockTwo(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
	public static final Block CLOUDWOOD_BUTTON = register("cloudwood_button", new WoodButtonBlockTwo(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
	
	public static final Block CHERRY_DOOR = register("cherry_door", new DoorBlockTwo(Block.Properties.create(Material.WOOD, MaterialColor.PINK_TERRACOTTA).hardnessAndResistance(3.0F).sound(SoundType.WOOD).func_226896_b_()));
	public static final Block MAPLE_DOOR = register("maple_door", new DoorBlockTwo(Block.Properties.create(Material.WOOD, MaterialColor.BROWN_TERRACOTTA).hardnessAndResistance(3.0F).sound(SoundType.WOOD).func_226896_b_()));
	public static final Block GHOSTWOOD_DOOR = register("ghostwood_door", new DoorBlockTwo(Block.Properties.create(Material.WOOD, MaterialColor.RED_TERRACOTTA).hardnessAndResistance(3.0F).sound(SoundType.WOOD).func_226896_b_()));
	public static final Block CLOUDWOOD_DOOR = register("cloudwood_door", new DoorBlockTwo(Block.Properties.create(Material.WOOD, MaterialColor.CYAN_TERRACOTTA).hardnessAndResistance(3.0F).sound(SoundType.WOOD).func_226896_b_()));
	
	public static final Block CHERRY_SIGN = register("cherry_sign", new StandingSignBlock(Block.Properties.create(Material.WOOD, MaterialColor.PINK_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD), WoodTypeTwo.CHERRY));
	public static final Block MAPLE_SIGN = register("maple_sign", new StandingSignBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD), WoodTypeTwo.MAPLE));
	public static final Block GHOSTWOOD_SIGN = register("ghostwood_sign", new StandingSignBlock(Block.Properties.create(Material.WOOD, MaterialColor.RED_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD), WoodTypeTwo.GHOSTWOOD));
	public static final Block CLOUDWOOD_SIGN = register("cloudwood_sign", new StandingSignBlock(Block.Properties.create(Material.WOOD, MaterialColor.CYAN_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD), WoodTypeTwo.CLOUDWOOD));
	
	public static final Block CHERRY_WALL_SIGN = register("cherry_wall_sign", new WallSignBlock(Block.Properties.create(Material.WOOD, MaterialColor.PINK_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD).lootFrom(CHERRY_SIGN), WoodTypeTwo.CHERRY));
	public static final Block MAPLE_WALL_SIGN = register("maple_wall_sign", new WallSignBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD).lootFrom(MAPLE_SIGN), WoodTypeTwo.MAPLE));
	public static final Block GHOSTWOOD_WALL_SIGN = register("ghostwood_wall_sign", new WallSignBlock(Block.Properties.create(Material.WOOD, MaterialColor.RED_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD).lootFrom(CHERRY_SIGN), WoodTypeTwo.GHOSTWOOD));
	public static final Block CLOUDWOOD_WALL_SIGN = register("cloudwood_wall_sign", new WallSignBlock(Block.Properties.create(Material.WOOD, MaterialColor.CYAN_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD).lootFrom(MAPLE_SIGN), WoodTypeTwo.CLOUDWOOD));
	
	
	
	public static final Block WHITE_GLAZED_BRICKS = register("white_glazed_bricks", new Block(Block.Properties.create(Material.ROCK, DyeColor.WHITE).hardnessAndResistance(2.0F, 6.0F)));
	public static final Block ORANGE_GLAZED_BRICKS = register("orange_glazed_bricks", new Block(Block.Properties.create(Material.ROCK, DyeColor.ORANGE).hardnessAndResistance(2.0F, 6.0F)));
	public static final Block MAGENTA_GLAZED_BRICKS = register("magenta_glazed_bricks", new Block(Block.Properties.create(Material.ROCK, DyeColor.MAGENTA).hardnessAndResistance(2.0F, 6.0F)));
	public static final Block LIGHT_BLUE_GLAZED_BRICKS = register("light_blue_glazed_bricks", new Block(Block.Properties.create(Material.ROCK, DyeColor.LIGHT_BLUE).hardnessAndResistance(2.0F, 6.0F)));
	public static final Block YELLOW_GLAZED_BRICKS = register("yellow_glazed_bricks", new Block(Block.Properties.create(Material.ROCK, DyeColor.YELLOW).hardnessAndResistance(2.0F, 6.0F)));
	public static final Block LIME_GLAZED_BRICKS = register("lime_glazed_bricks", new Block(Block.Properties.create(Material.ROCK, DyeColor.LIME).hardnessAndResistance(2.0F, 6.0F)));
	public static final Block PINK_GLAZED_BRICKS = register("pink_glazed_bricks", new Block(Block.Properties.create(Material.ROCK, DyeColor.PINK).hardnessAndResistance(2.0F, 6.0F)));
	public static final Block GRAY_GLAZED_BRICKS = register("gray_glazed_bricks", new Block(Block.Properties.create(Material.ROCK, DyeColor.GRAY).hardnessAndResistance(2.0F, 6.0F)));
	public static final Block LIGHT_GRAY_GLAZED_BRICKS = register("light_gray_glazed_bricks", new Block(Block.Properties.create(Material.ROCK, DyeColor.LIGHT_GRAY).hardnessAndResistance(2.0F, 6.0F)));
	public static final Block CYAN_GLAZED_BRICKS = register("cyan_glazed_bricks", new Block(Block.Properties.create(Material.ROCK, DyeColor.CYAN).hardnessAndResistance(2.0F, 6.0F)));
	public static final Block PURPLE_GLAZED_BRICKS = register("purple_glazed_bricks", new Block(Block.Properties.create(Material.ROCK, DyeColor.PURPLE).hardnessAndResistance(2.0F, 6.0F)));
	public static final Block BLUE_GLAZED_BRICKS = register("blue_glazed_bricks", new Block(Block.Properties.create(Material.ROCK, DyeColor.BLUE).hardnessAndResistance(2.0F, 6.0F)));
	public static final Block BROWN_GLAZED_BRICKS = register("brown_glazed_bricks", new Block(Block.Properties.create(Material.ROCK, DyeColor.BROWN).hardnessAndResistance(2.0F, 6.0F)));
	public static final Block GREEN_GLAZED_BRICKS = register("green_glazed_bricks", new Block(Block.Properties.create(Material.ROCK, DyeColor.GREEN).hardnessAndResistance(2.0F, 6.0F)));
	public static final Block RED_GLAZED_BRICKS = register("red_glazed_bricks", new Block(Block.Properties.create(Material.ROCK, DyeColor.RED).hardnessAndResistance(2.0F, 6.0F)));
	public static final Block BLACK_GLAZED_BRICKS = register("black_glazed_bricks", new Block(Block.Properties.create(Material.ROCK, DyeColor.BLACK).hardnessAndResistance(2.0F, 6.0F)));
	
	public static final Block GAULT = register("gault", new Block(Block.Properties.create(MaterialTwo.GAULT).hardnessAndResistance(2.0f)));
	public static final Block NIGHTSTONE = register("nightstone", new Block(Block.Properties.create(MaterialTwo.NIGHSTONE).hardnessAndResistance(7.0f)));

	public static final Block CLOUD = register("cloud", new Block(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.1f)));
	
	public static final Block COBALT_ORE = register("cobalt_ore", new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));
	public static final Block JADE_ORE = register("jade_ore", new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));
	public static final Block OPAL_ORE = register("opal_ore", new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));
	public static final Block TANZANITE_ORE = register("tanzanite_ore", new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));
	public static final Block AMETHYST_ORE = register("amethyst_ore", new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));
	public static final Block GARNET_ORE = register("garnet_ore", new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));
	public static final Block TOPAZ_ORE = register("topaz_ore", new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));
	public static final Block SAPPHIRE_ORE = register("sapphire_ore", new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));
	public static final Block RUBY_ORE = register("ruby_ore", new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));
	
	public static final Block COBALT_BLOCK = register("cobalt_block", new Block(Block.Properties.create(Material.IRON, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
	public static final Block JADE_BLOCK = register("jade_block", new Block(Block.Properties.create(Material.IRON, MaterialColor.GREEN).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
	public static final Block OPAL_BLOCK = register("opal_block", new Block(Block.Properties.create(Material.IRON, MaterialColor.LIGHT_BLUE).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
	public static final Block TANZANITE_BLOCK = register("tanzanite_block", new Block(Block.Properties.create(Material.IRON, MaterialColor.BLUE).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
	public static final Block AMETHYST_BLOCK = register("amethyst_block", new Block(Block.Properties.create(Material.IRON, MaterialColor.PURPLE).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
	public static final Block GARNET_BLOCK = register("garnet_block", new Block(Block.Properties.create(Material.IRON, MaterialColor.PINK).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
	public static final Block TOPAZ_BLOCK = register("topaz_block", new Block(Block.Properties.create(Material.IRON, MaterialColor.YELLOW).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
	public static final Block SAPPHIRE_BLOCK = register("sapphire_block", new Block(Block.Properties.create(Material.IRON, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
	public static final Block RUBY_BLOCK = register("ruby_block", new Block(Block.Properties.create(Material.IRON, MaterialColor.RED_TERRACOTTA).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
	
	public static final Block TALC_ORE = register("talc_ore", new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));
	public static final Block LEAD_ORE = register("lead_ore", new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));
	public static final Block TIN_ORE = register("tin_ore", new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));
	public static final Block ALUMINUM_ORE = register("aluminum_ore", new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));
	public static final Block SILVER_ORE = register("silver_ore", new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));
	public static final Block COPPER_ORE = register("copper_ore", new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));
	public static final Block PLATINUM_ORE = register("platinum_ore", new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));
	public static final Block TITANIUM_ORE = register("titanium_ore", new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));
	public static final Block PYRITE_ORE = register("pyrite_ore", new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));
	
	public static final Block TALC_BLOCK = register("talc_block", new Block(Block.Properties.create(Material.IRON, MaterialColor.SNOW).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
	public static final Block LEAD_BLOCK = register("lead_block", new Block(Block.Properties.create(Material.IRON, MaterialColor.LIGHT_GRAY).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
	public static final Block TIN_BLOCK = register("tin_block", new Block(Block.Properties.create(Material.IRON, MaterialColor.LIGHT_GRAY).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
	public static final Block ALUMINUM_BLOCK = register("aluminum_block", new Block(Block.Properties.create(Material.IRON, MaterialColor.LIGHT_GRAY).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
	public static final Block SILVER_BLOCK = register("silver_block", new Block(Block.Properties.create(Material.IRON, MaterialColor.GRAY_TERRACOTTA).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
	public static final Block COPPER_BLOCK = register("copper_block", new Block(Block.Properties.create(Material.IRON, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
	public static final Block PLATINUM_BLOCK = register("platinum_block", new Block(Block.Properties.create(Material.IRON, MaterialColor.LIGHT_GRAY_TERRACOTTA).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
	public static final Block TITANIUM_BLOCK = register("titanium_block", new Block(Block.Properties.create(Material.IRON, MaterialColor.LIGHT_GRAY_TERRACOTTA).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
	public static final Block PYRITE_BLOCK = register("pyrite_block", new Block(Block.Properties.create(Material.IRON, MaterialColor.GOLD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
	public static final Block STEEL_BLOCK = register("steel_block", new Block(Block.Properties.create(Material.IRON, MaterialColor.GRAY).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
	public static final Block HARDENED_STEEL_BLOCK = register("hardened_steel_block", new Block(Block.Properties.create(Material.IRON, MaterialColor.STONE).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
	
	public static final Block DREAMCATCHER_HEALING = register("dreamcatcher_healing", new DreamcatcherBlock(Block.Properties.create(Material.WOOL, MaterialColor.PINK).hardnessAndResistance(0.4F)) {
		@Override
		public void onPlayerSetSpawn(PlayerSetSpawnEvent playerSetSpawnEvent) {
			playerSetSpawnEvent.getPlayer().setHealth(20);
			// Other effects like healing will be applied later.
		}
	});
	public static final Block DREAMCATCHER_LOOT = register("dreamcatcher_loot", new DreamcatcherBlock(Block.Properties.create(Material.WOOL, MaterialColor.YELLOW).hardnessAndResistance(0.4F)) {
		@Override
		public void onPlayerSetSpawn(PlayerSetSpawnEvent playerSetSpawnEvent) {
            LootContext.Builder lootcontext$builder = (new LootContext.Builder((ServerWorld) playerSetSpawnEvent.getPlayer().getEntityWorld())).withRandom(playerSetSpawnEvent.getPlayer().getEntityWorld().getRandom()).withLuck(1);
            LootTable loottable = playerSetSpawnEvent.getPlayer().getEntityWorld().getServer().getLootTableManager().getLootTableFromLocation(new ResourceLocation("two", "gameplay/dreamcatcher_loot"));
            List<ItemStack> list = loottable.generate(lootcontext$builder.build(LootParameterSets.GIFT));

            playerSetSpawnEvent.getPlayer().world.addEntity(new ItemEntity(playerSetSpawnEvent.getPlayer().getEntityWorld(), playerSetSpawnEvent.getPlayer().prevPosX, playerSetSpawnEvent.getPlayer().prevPosY + 0.5, playerSetSpawnEvent.getPlayer().prevPosZ, list.get(playerSetSpawnEvent.getPlayer().getEntityWorld().getRandom().nextInt(list.size()))));
		}
	});
	public static final Block DREAMCATCHER_LUCKY = register("dreamcatcher_lucky", new DreamcatcherBlock(Block.Properties.create(Material.WOOL, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(0.4F)) {
		@Override
		public void onPlayerSetSpawn(PlayerSetSpawnEvent playerSetSpawnEvent) {
			// Luck stuff. 
		}
	});
	public static final Block DREAMCATCHER_NIGHTMARE = register("dreamcatcher_nightmare", new DreamcatcherBlock(Block.Properties.create(Material.WOOL, MaterialColor.STONE).hardnessAndResistance(0.4F)) {
		@Override
		public void onPlayerSetSpawn(PlayerSetSpawnEvent playerSetSpawnEvent) {
			Two.LOGGER.info("onPlayerWakeUp fired for a dreamcatcher_nightmare");
			playerSetSpawnEvent.getPlayer().changeDimension(DimensionManager.registerOrGetDimension(new ResourceLocation("two", "nightmare"), new NightmareModDimension(), null, false));
		}
	});
	
	
	
	public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
    	blockRegistryEvent.getRegistry().registerAll(Holder.BLOCKSTWO.toArray(new Block[] {}));
    }
	static Block register(String key, Block block) {
		Holder.BLOCKSTWO.add(block.setRegistryName(key));
		
	    return block;
	}
	static class Holder {
		public static final LinkedList<Block> BLOCKSTWO = new LinkedList<Block>();
	}
}