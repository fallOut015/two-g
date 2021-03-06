package io.github.fallout015.two.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.inventory.EquipmentSlotType;

public class BoundingEnchantment extends Enchantment {
	public BoundingEnchantment(Enchantment.Rarity rarityIn, EquipmentSlotType... slots) {
		super(rarityIn, EnchantmentsTwo.Holder.DOUBLE_JUMP_BOOTS, slots);
	}
	
	@Override
	public int getMaxLevel() {
		return 3;
	}
}