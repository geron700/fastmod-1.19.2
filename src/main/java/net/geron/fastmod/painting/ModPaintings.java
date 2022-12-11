package net.geron.fastmod.painting;

import net.geron.fastmod.Fastmod;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, Fastmod.MOD_ID);

    public static final RegistryObject<PaintingVariant> ADAM_STAND
            = PAINTING_VARIANTS.register("adam_stand",
            () -> new PaintingVariant(32,48));
    public static final RegistryObject<PaintingVariant> ARON_TORTURE
            = PAINTING_VARIANTS.register("aron_torture",
            () -> new PaintingVariant(32,48));
    public static final RegistryObject<PaintingVariant> BABICAWAVE
            = PAINTING_VARIANTS.register("babicawave",
            () -> new PaintingVariant(48,32));
    public static final RegistryObject<PaintingVariant> FILIP_MORPHEUS
            = PAINTING_VARIANTS.register("filip_morpheus",
            () -> new PaintingVariant(32,48));
    public static final RegistryObject<PaintingVariant> GRIMMAG_THE_CAT
            = PAINTING_VARIANTS.register("grimmag_the_cat",
            () -> new PaintingVariant(32,32));
    public static final RegistryObject<PaintingVariant> HITLER_PARIS
            = PAINTING_VARIANTS.register("hitler_paris",
            () -> new PaintingVariant(16,32));
    public static final RegistryObject<PaintingVariant> ITSUKI
            = PAINTING_VARIANTS.register("itsuki",
            () -> new PaintingVariant(16,16));
    public static final RegistryObject<PaintingVariant> KIKI_THINKING
            = PAINTING_VARIANTS.register("kiki_thinking",
            () -> new PaintingVariant(48,32));
    public static final RegistryObject<PaintingVariant> KOICHI_POSE
            = PAINTING_VARIANTS.register("koichi_pose",
            () -> new PaintingVariant(32,48));
    public static final RegistryObject<PaintingVariant> KRYSLE_1X1
            = PAINTING_VARIANTS.register("krysle_1x1",
            () -> new PaintingVariant(16,16));
    public static final RegistryObject<PaintingVariant> KRYSLE_2X2
            = PAINTING_VARIANTS.register("krysle_2x2",
            () -> new PaintingVariant(32,32));
    public static final RegistryObject<PaintingVariant> KRYSLE_3X3
            = PAINTING_VARIANTS.register("krysle_3x3",
            () -> new PaintingVariant(48,48));
    public static final RegistryObject<PaintingVariant> KRYSLE_4X4
            = PAINTING_VARIANTS.register("krysle_4x4",
            () -> new PaintingVariant(64,64));
    public static final RegistryObject<PaintingVariant> KRYSLE_5X5
            = PAINTING_VARIANTS.register("krysle_5x5",
            () -> new PaintingVariant(80,80));
    public static final RegistryObject<PaintingVariant> ONDRA_AND_BOTEK_HANDSHAKE
            = PAINTING_VARIANTS.register("ondra_botek_handshake",
            () -> new PaintingVariant(48,32));
    public static final RegistryObject<PaintingVariant> PEE_IS_STORED_IN_THE_BALLS
            = PAINTING_VARIANTS.register("pee_is_stored_in_the_balls",
            () -> new PaintingVariant(48,32));
    public static final RegistryObject<PaintingVariant> POLAKOVA_RIDE
            = PAINTING_VARIANTS.register("polakova_ride",
            () -> new PaintingVariant(64,64));
    public static final RegistryObject<PaintingVariant> POOL_FIORA
            = PAINTING_VARIANTS.register("pool_fiora",
            () -> new PaintingVariant(32,48));
    public static final RegistryObject<PaintingVariant> ROHANKO
            = PAINTING_VARIANTS.register("rohanko",
            () -> new PaintingVariant(32,48));
    public static final RegistryObject<PaintingVariant> VASEK_ISEKAI
            = PAINTING_VARIANTS.register("vasek_isekai",
            () -> new PaintingVariant(48,32));
    public static final RegistryObject<PaintingVariant> VASEK_PASSING
            = PAINTING_VARIANTS.register("vasek_passing",
            () -> new PaintingVariant(16,32));
    public static final RegistryObject<PaintingVariant> VASEK_ZOOM
            = PAINTING_VARIANTS.register("vasek_zoom",
            () -> new PaintingVariant(16,16));
    public static final RegistryObject<PaintingVariant> VOJTA_WOLVERINE
            = PAINTING_VARIANTS.register("vojta_wolverine",
            () -> new PaintingVariant(32,32));
    public static final RegistryObject<PaintingVariant> ZLATOKOPKA_AND_CMUCYCH
            = PAINTING_VARIANTS.register("zlatokopka_and_cmucych",
            () -> new PaintingVariant(32,48));


    public static void register(IEventBus eventBus) {
        PAINTING_VARIANTS.register(eventBus);
    }
}
