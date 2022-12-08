package net.geron.fastmod.block.custom;

import net.geron.fastmod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.client.event.sound.PlaySoundEvent;

import javax.annotation.Nullable;

public class SunBlock extends Block {
    public static final BooleanProperty LIT = BooleanProperty.create("lit");

    public SunBlock(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(BlockState blockState, Level level, BlockPos blockPos,
                                 Player player,InteractionHand hand, BlockHitResult blockHitResult) {
        if (player.isHolding(Items.CARROT) && !level.isClientSide()) {
            player.sendSystemMessage(Component.literal("Put the carrot away!"));
        } else if (player.isHolding(ModItems.TEST_ITEM.get()) && !level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
            player.sendSystemMessage(Component.literal("I ain't testin anythin'..."));
        } else if (!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
            level.setBlock(blockPos, blockState.cycle(LIT),3);
        }
        return super.use(blockState, level, blockPos, player, hand, blockHitResult);
    }

    @Override
    public void onProjectileHit(Level level, BlockState blockState,
                                BlockHitResult blockHitResult, Projectile projectile) {
        level.setBlock(blockHitResult.getBlockPos(),blockState.cycle(LIT),3);
        projectile.playSound(SoundEvents.ARROW_HIT_PLAYER);
        super.onProjectileHit(level, blockState, blockHitResult, projectile);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }
}
