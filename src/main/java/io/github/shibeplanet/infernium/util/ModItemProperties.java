package io.github.shibeplanet.infernium.util;

import io.github.shibeplanet.infernium.init.ItemInit;
import io.github.shibeplanet.infernium.items.AdvBowItem;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;

public class ModItemProperties {
    public static void addCustomItemProperties() {
        // By default, drawSpeed is 20. The only reason the argument is there is to support custom bows with custom draw speeds.
        makeBow(20.0f, ItemInit.STONE_BOW.get());
        makeBow(20.0f, ItemInit.IRON_BOW.get());
        makeBow(15.0f, ItemInit.GOLDEN_BOW.get());
        makeBow(20.0f, ItemInit.DIAMOND_BOW.get());
        makeBow(20.0f, ItemInit.NETHERITE_BOW.get());
        makeBow(4.4f, ItemInit.FOUR.get());
        makeBow(20.0f, ItemInit.NIHILIUM_BOW.get());
    }

    public static void makeBow(float drawSpeed, AdvBowItem item) {
        ItemProperties.register(item, new ResourceLocation("pull"), (p_174635_, p_174636_, p_174637_, p_174638_) -> {
            if (p_174637_ == null) {
                return 0.0F;
            } else {
                return p_174637_.getUseItem() != p_174635_ ? 0.0F : (float)(p_174635_.getUseDuration() - p_174637_.getUseItemRemainingTicks()) / drawSpeed;
            }
        });

        ItemProperties.register(item, new ResourceLocation("pulling"), (p_174630_, p_174631_, p_174632_, p_174633_) -> {
            return p_174632_ != null && p_174632_.isUsingItem() && p_174632_.getUseItem() == p_174630_ ? 1.0F : 0.0F;
        });
    }

}
