package net.geron.fastmod.item.custom;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class FireWandItem extends Item {
    public FireWandItem(Properties properties) { super(properties); }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
            setSelfOnFire(player, this);
            player.playSound(SoundEvents.FIREWORK_ROCKET_TWINKLE);
            player.getCooldowns().addCooldown(this, 100);

        }

        return super.use(level, player, hand);
    }

    private void setSelfOnFire(Player player, FireWandItem wandItem){
        if(player.getCooldowns().isOnCooldown(wandItem)) {
            player.setSecondsOnFire(2);
        }
    }
}
