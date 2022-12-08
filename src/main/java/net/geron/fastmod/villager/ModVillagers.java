package net.geron.fastmod.villager;

import com.google.common.collect.ImmutableSet;
import net.geron.fastmod.Fastmod;
import net.geron.fastmod.block.ModBlocks;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.InvocationTargetException;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, Fastmod.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSION_DEFERRED_REGISTER =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, Fastmod.MOD_ID);

    public static final RegistryObject<PoiType> DALIBOR_BLOCK_POI = POI_TYPES.register("dalibor_block_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.DALIBOR_BLOCK.get().getStateDefinition().getPossibleStates()),
                    1,1));

    public static final RegistryObject<VillagerProfession> DALIBOR_KUN = VILLAGER_PROFESSION_DEFERRED_REGISTER.register("dalibor_kun",
            () -> new VillagerProfession("dalibor_kun", x -> x.get() == DALIBOR_BLOCK_POI.get(),
                    x -> x.get() == DALIBOR_BLOCK_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_CARTOGRAPHER));

    public static void registerPOIs() {
        try {
            ObfuscationReflectionHelper.findMethod(PoiType.class,
            "registerBlockStates", PoiType.class).invoke(null,DALIBOR_BLOCK_POI.get());
        } catch (InvocationTargetException | IllegalAccessException exception) {
            exception.printStackTrace();
        }
    }

    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSION_DEFERRED_REGISTER.register(eventBus);
    }
}
