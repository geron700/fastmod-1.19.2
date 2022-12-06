package net.geron.fastmod.item;

import net.geron.fastmod.fastmod;
import net.geron.fastmod.item.custom.EightBallItem;
import net.geron.fastmod.item.custom.FireWandItem;
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
    public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
            () -> new EightBallItem(new Item.Properties().tab(ModCreativeModeTab.FASTMOD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> FIRE_WAND = ITEMS.register("fire_wand",
            () -> new FireWandItem(new Item.Properties().tab(ModCreativeModeTab.FASTMOD_TAB).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
