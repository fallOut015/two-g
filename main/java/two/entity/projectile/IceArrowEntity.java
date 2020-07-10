package two.entity.projectile;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.IPacket;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;
import two.entity.EntityTypeTwo;
import two.item.ItemsTwo;

public class IceArrowEntity extends AbstractArrowEntity {
	public IceArrowEntity(EntityType<? extends IceArrowEntity> entityType, World worldIn) {
		super(entityType, worldIn);
	}
	public IceArrowEntity(World worldIn, double x, double y, double z) {
		super(EntityTypeTwo.ICE_ARROW, x, y, z, worldIn);
	}
	public IceArrowEntity(World worldIn, LivingEntity shooter) {
		super(EntityTypeTwo.ICE_ARROW, shooter, worldIn);
	}
	
	@Override
	protected ItemStack getArrowStack() {
		return new ItemStack(ItemsTwo.ICE_ARROW);
	}
	@Override
	public IPacket<?> createSpawnPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}
	@Override
	public void tick() {
		super.tick();
		if (this.world.isRemote && !this.inGround) {
			this.world.addParticle(ParticleTypes.CLOUD, this.getPosX(), this.getPosY(), this.getPosZ(), 0.0D, 0.0D, 0.0D);
		}
	}
}