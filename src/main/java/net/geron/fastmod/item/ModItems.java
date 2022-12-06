package net.geron.fastmod.item;

import net.geron.fastmod.fastmod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, fastmod.MOD_ID);

    public static final RegistryObject<Item> DALIBOR = ITEMS.register("dalibor",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FASTMOD_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
