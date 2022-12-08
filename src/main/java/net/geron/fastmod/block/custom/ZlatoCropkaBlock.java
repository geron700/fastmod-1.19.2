package net.geron.fastmod.block.custom;

import net.geron.fastmod.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class ZlatoCropkaBlock extends CropBlock {
    public static final IntegerProperty AGE = IntegerProperty.create("age",0,7);
    public ZlatoCropkaBlock(Properties properties) {
        super(properties);
    }
    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.ZLATOCROPKA_SEEDS.get();
    }
    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }
    @Override
    public int getMaxAge() {
        return 7;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}
