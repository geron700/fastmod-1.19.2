package net.geron.fastmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab FASTMOD_TAB = new CreativeModeTab("fastmodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DALIBOR.get());
        }
    };
}
