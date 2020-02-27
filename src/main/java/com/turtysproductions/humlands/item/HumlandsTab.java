package com.turtysproductions.humlands.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class HumlandsTab extends ItemGroup {
	
	public static final ItemGroup HUMLANDS = new HumlandsTab(ItemGroup.GROUPS.length, "humlands");

	public HumlandsTab(int index, String label) {
		super(index, label);
	}

	@Override
	public ItemStack createIcon() {
		return null;
	}
}
