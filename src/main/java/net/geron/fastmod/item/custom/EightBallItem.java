package net.geron.fastmod.item.custom;

import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.multiplayer.chat.LoggedChatMessage;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import javax.xml.stream.Location;

public class EightBallItem extends Item {
    public EightBallItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
            outputRandomNumber(player);
            //player.playSound(player.getLocation(), Sound.NOTE_BASS, 1f, 1f);
            player.getCooldowns().addCooldown(this,20);
        }

        return super.use(level, player, hand);
    }

    private void outputRandomNumber(Player player) {
        player.sendSystemMessage(Component.literal("Your number is " + getRandomNumber()));
    }
    private int getRandomNumber() {
        return RandomSource.createNewThreadLocalInstance().nextInt(10);
    }
}

