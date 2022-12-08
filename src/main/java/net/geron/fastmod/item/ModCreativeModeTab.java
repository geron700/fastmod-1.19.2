package net.geron.fastmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab FASTMOD_TAB = new CreativeModeTab("fastmodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TEST_ITEM.get());
        }
    };
    public static final CreativeModeTab FASTMOD_CROPS_TAB = new CreativeModeTab("fastmodcropstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ZLATOCROPKA_SEEDS.get());
        }
    };
}
