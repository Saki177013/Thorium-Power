package net.mcreator.thoriumpower.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.thoriumpower.init.ThoriumPowerModItems;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

public class ThoriumRadioisotopeThermoelectricGeneratorOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double energy = 0;
		boolean up = false;
		boolean down = false;
		boolean east = false;
		boolean west = false;
		boolean north = false;
		boolean south = false;
		if (Mth.nextInt(RandomSource.create(), 0, 1000) == 69) {
			if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem() == ThoriumPowerModItems.THORIUM_INGOT.get()) {
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 0;
						final int _amount = 1;
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								ItemStack _stk = capability.getStackInSlot(_slotid).copy();
								_stk.shrink(_amount);
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
							}
						});
					}
				}
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("on") instanceof BooleanProperty _booleanProp)
						world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
				}
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					int _amount = 1000;
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
				}
			} else if (!((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem() == ThoriumPowerModItems.THORIUM_INGOT.get())) {
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("on") instanceof BooleanProperty _booleanProp)
						world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
				}
			}
		}
		if (new Object() {
			public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, Direction.DOWN).ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
				return _retval.get();
			}
		}.receiveEnergySimulate(world, BlockPos.containing(x, y + 1, z), 150) != 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y + 1, z));
				int _amount = 150;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, Direction.DOWN).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		} else if (new Object() {
			public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, Direction.WEST).ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
				return _retval.get();
			}
		}.receiveEnergySimulate(world, BlockPos.containing(x + 1, y, z), 150) != 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x + 1, y, z));
				int _amount = 150;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, Direction.WEST).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		} else if (new Object() {
			public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, Direction.NORTH).ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
				return _retval.get();
			}
		}.receiveEnergySimulate(world, BlockPos.containing(x, y, z + 1), 150) != 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z + 1));
				int _amount = 150;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, Direction.NORTH).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		} else if (new Object() {
			public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, Direction.UP).ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
				return _retval.get();
			}
		}.receiveEnergySimulate(world, BlockPos.containing(x, y - 1, z), 150) != 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 1, z));
				int _amount = 150;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, Direction.UP).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		} else if (new Object() {
			public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, Direction.WEST).ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
				return _retval.get();
			}
		}.receiveEnergySimulate(world, BlockPos.containing(x + 1, y, z), 150) != 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x + 1, y, z));
				int _amount = 150;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, Direction.WEST).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		} else if (new Object() {
			public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, Direction.SOUTH).ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
				return _retval.get();
			}
		}.receiveEnergySimulate(world, BlockPos.containing(x, y, z - 1), 150) != 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z - 1));
				int _amount = 150;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, Direction.SOUTH).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		}
	}
}
