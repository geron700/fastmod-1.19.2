package net.geron.fastmod.block;

import net.geron.fastmod.block.custom.BramborinkyCropBlock;
import net.geron.fastmod.block.custom.JumpyBlock;
import net.geron.fastmod.block.custom.SunBlock;
import net.geron.fastmod.block.custom.ZlatoCropkaBlock;
import net.geron.fastmod.Fastmod;
import net.geron.fastmod.item.ModCreativeModeTab;
import net.geron.fastmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Fastmod.MOD_ID);

    public static final RegistryObject<Block> DALIBOR_BLOCK = registerBlock("dalibor_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.CAKE).instabreak()), ModCreativeModeTab.FASTMOD_TAB);
    public static final RegistryObject<Block> ARON_BLOCK = registerBlock("aron_block",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)), ModCreativeModeTab.FASTMOD_TAB);
    public static final RegistryObject<Block> MAGIC_ORE_BLOCK = registerBlock("magic_ore_block",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)), ModCreativeModeTab.FASTMOD_TAB);
    public static final RegistryObject<Block> JUMPY_BLOCK = registerBlock("jumpy_block",
            () -> new JumpyBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD)), ModCreativeModeTab.FASTMOD_TAB);
    public static final RegistryObject<Block> SUN_BLOCK = registerBlock("sun_block",
                () -> new SunBlock(BlockBehaviour.Properties.of(Material.EGG)
                        .lightLevel(state -> state.getValue(SunBlock.LIT) ? 15 : 0)), ModCreativeModeTab.FASTMOD_TAB);
                //LightLayer.SKY
                //.lightLevel(state -> state.getValue(SunBlock.LIT) ? 15 : 0)
    public static final RegistryObject<Block> BRAMBORINKY_CROP = BLOCKS.register("bramborinky_crop",
            () -> new BramborinkyCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));
    public static final RegistryObject<Block> ZLATOCROPKA_CROP = BLOCKS.register("zlatocropka_crop",
            () -> new ZlatoCropkaBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name,toReturn,tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
