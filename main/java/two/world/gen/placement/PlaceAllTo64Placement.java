package two.world.gen.placement;

import java.util.Objects;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.mojang.datafixers.Dynamic;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.placement.NoPlacementConfig;
import net.minecraft.world.gen.placement.SimplePlacement;

public class PlaceAllTo64Placement extends SimplePlacement<NoPlacementConfig> {
	public PlaceAllTo64Placement(Function<Dynamic<?>, ? extends NoPlacementConfig> p_i51362_1_) {
		super(p_i51362_1_);
	}

	@Override
	protected Stream<BlockPos> getPositions(Random random, NoPlacementConfig p_212852_2_, BlockPos pos) {
		return IntStream.range(0, 16 * 64 * 16).mapToObj(i -> {
			float x = ((i / (256 * 4)) % 16) + pos.getX();
			float y = (i / 16) % (16 * 4);
			float z = (i % 16) + pos.getZ();
			return y <= 0 ? null : new BlockPos(x, y, z);
		}).filter(Objects::nonNull);
	}
}