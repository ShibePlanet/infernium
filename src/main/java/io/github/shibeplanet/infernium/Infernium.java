package io.github.shibeplanet.infernium;

import io.github.shibeplanet.infernium.init.ItemInit;
import io.github.shibeplanet.infernium.util.ModItemProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;

@Mod(Infernium.MODID)
public class Infernium {
    public static final String MODID = "infernium";

    public Infernium() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(this::clientSetup);

        ItemInit.ITEMS.register(bus);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        ModItemProperties.addCustomItemProperties();
    }

    public static final CreativeModeTab TAB = new CreativeModeTab(MODID) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return ItemInit.INFERNIUM_INGOT.get().getDefaultInstance();
        }
    };
}

