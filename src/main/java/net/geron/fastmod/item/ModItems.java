package net.geron.fastmod.item;

import net.geron.fastmod.block.ModBlocks;
import net.geron.fastmod.fastmod;
import net.geron.fastmod.item.custom.EightBallItem;
import net.geron.fastmod.item.custom.FireWandItem;
import net.geron.fastmod.item.custom.TestItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
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
    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item",
            () -> new TestItem(new Item.Properties().tab(ModCreativeModeTab.FASTMOD_TAB).stacksTo(1)));
    public static final RegistryObject<Item> BRAMBORINKY_SEEDS = ITEMS.register("bramborinky_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BRAMBORINKY_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.FASTMOD_CROPS_TAB)));
    public static final RegistryObject<Item> BRAMBORINKY = ITEMS.register("bramborinky",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FASTMOD_CROPS_TAB)
                    .food(new FoodProperties.Builder().nutrition(3).saturationMod(3f).build())));

    public static final RegistryObject<Item> ZLATOCROPKA_SEEDS = ITEMS.register("zlatocropka_seeds",
            () -> new ItemNameBlockItem(ModBlocks.ZLATOCROPKA_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.FASTMOD_CROPS_TAB)));
    public static final RegistryObject<Item> ZLATOCROPKA = ITEMS.register("zlatocropka",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FASTMOD_CROPS_TAB)
                    .food(new FoodProperties.Builder().nutrition(1)
                            .saturationMod(0.1f).fast().build())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
