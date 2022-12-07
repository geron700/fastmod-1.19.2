package net.geron.fastmod.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class FireWandItem extends Item {
    public FireWandItem(Properties properties) {
        super(properties);
    }
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
            player.setSecondsOnFire(3);
            player.getCooldowns().addCooldown(this, 100);
        }
        return super.use(level, player, hand);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
        if(Screen.hasShiftDown()) {
            components.add(Component.literal("Right click to set the target on FIRE").withStyle(ChatFormatting.RED));
            components.add(Component.literal("You are the target").withStyle(ChatFormatting.AQUA));
        } else {
            components.add(Component.literal("Right click to set the target on FIRE").withStyle(ChatFormatting.RED));
            components.add(Component.literal("Hold SHIFT for more info").withStyle(ChatFormatting.YELLOW));
        }

        super.appendHoverText(itemStack, level, components, tooltipFlag);
    }
}
