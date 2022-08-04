package io.github.shibeplanet.infernium.init;


import io.github.shibeplanet.infernium.Infernium;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.List;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Infernium.MODID);




    //// Vanilla Bows
    /*Stone Bow*/
    public static final RegistryObject<BowItem> STONE_BOW = ITEMS.register("stone_bow",
            () -> new BowItem(new Item.Properties()
                    .tab(CreativeModeTab.TAB_COMBAT)
                    .durability(515)
            ));




    //// Infernium Items
    /*Infernium Ingot*/
    public static final RegistryObject<Item> INFERNIUM_INGOT = ITEMS.register("infernium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(Infernium.TAB)
                    .fireResistant()
            ) {
                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    super.appendHoverText(stack, level, components, flag);
                    components.add(Component.translatable(Infernium.MODID + ".infernium_ingot.tooltip"));
                }

                @Override
                public boolean hurtEnemy(ItemStack stack, LivingEntity enemy, LivingEntity player) {
                    enemy.setSecondsOnFire(1);
                    return super.hurtEnemy(stack, enemy, player);
                }
    });

    /*Infernium Sword*/
    public static final RegistryObject<SwordItem> INFERNIUM_SWORD = ITEMS.register("infernium_sword",
            () -> new SwordItem(Tiers.TIERFIVE, 4 /*ATK dmg*/, -2.2f /*ATK spd*/, new Item.Properties()
                    .tab(Infernium.TAB)
                    .fireResistant()
            ) {
                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    super.appendHoverText(stack, level, components, flag);
                    components.add(Component.translatable(Infernium.MODID + ".infernium_sword.tooltip"));
                }

                @Override
                public boolean hurtEnemy(ItemStack stack, LivingEntity enemy, LivingEntity player) {
                    enemy.setSecondsOnFire(2);
                    return super.hurtEnemy(stack, enemy, player);
                }
    });

    /*Infernium Pickaxe*/
    public static final RegistryObject<PickaxeItem> INFERNIUM_PICKAXE = ITEMS.register("infernium_pickaxe",
            () -> new PickaxeItem(Tiers.TIERFIVE, 2 /*ATK dmg*/, -2.6f /*ATK spd*/, new Item.Properties()
                    .tab(Infernium.TAB)
                    .fireResistant()
            ) {
                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    super.appendHoverText(stack, level, components, flag);
                    components.add(Component.translatable(Infernium.MODID + ".infernium_pickaxe.tooltip"));
                }

                @Override
                public boolean hurtEnemy(ItemStack stack, LivingEntity enemy, LivingEntity player) {
                    enemy.setSecondsOnFire(2);
                    return super.hurtEnemy(stack, enemy, player);
                }
            });

    /*Infernium Axe*/
    public static final RegistryObject<AxeItem> INFERNIUM_AXE = ITEMS.register("infernium_axe",
            () -> new AxeItem(Tiers.TIERFIVE, 6 /*ATK dmg*/, -2.8f /*ATK spd*/, new Item.Properties()
                    .tab(Infernium.TAB)
                    .fireResistant()
            ) {
                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    super.appendHoverText(stack, level, components, flag);
                    components.add(Component.translatable(Infernium.MODID + ".infernium_axe.tooltip"));
                }

                @Override
                public boolean hurtEnemy(ItemStack stack, LivingEntity enemy, LivingEntity player) {
                    enemy.setSecondsOnFire(3);
                    return super.hurtEnemy(stack, enemy, player);
                }
            });

    /*Infernium Shovel*/
    public static final RegistryObject<ShovelItem> INFERNIUM_SHOVEL = ITEMS.register("infernium_shovel",
            () -> new ShovelItem(Tiers.TIERFIVE, 2.5f /*ATK dmg*/, -2.8f /*ATK spd*/, new Item.Properties()
                    .tab(Infernium.TAB)
                    .fireResistant()
            ) {
                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    super.appendHoverText(stack, level, components, flag);
                    components.add(Component.translatable(Infernium.MODID + ".infernium_shovel.tooltip"));
                }

                @Override
                public boolean hurtEnemy(ItemStack stack, LivingEntity enemy, LivingEntity player) {
                    enemy.setSecondsOnFire(2);
                    return super.hurtEnemy(stack, enemy, player);
                }
            });

    /*Infernium Hoe*/
    public static final RegistryObject<HoeItem> INFERNIUM_HOE = ITEMS.register("infernium_hoe",
            () -> new HoeItem(Tiers.TIERFIVE, -4 /*ATK dmg*/, -3f /*ATK spd*/, new Item.Properties()
                    .tab(Infernium.TAB)
                    .fireResistant()
            ) {
                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    super.appendHoverText(stack, level, components, flag);
                    components.add(Component.translatable(Infernium.MODID + ".infernium_hoe.tooltip"));
                }

                @Override
                public boolean hurtEnemy(ItemStack stack, LivingEntity enemy, LivingEntity player) {
                    enemy.setSecondsOnFire(1);
                    return super.hurtEnemy(stack, enemy, player);
                }
            });




    //// Dragonium Items
    /*Dragon Scale*/
    public static final RegistryObject<Item> DRAGON_SCALE = ITEMS.register("dragon_scale",
            () -> new Item(new Item.Properties()
                    .tab(Infernium.TAB)
            ) {
                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    super.appendHoverText(stack, level, components, flag);
                    components.add(Component.translatable(Infernium.MODID + ".dragon_scale.tooltip"));
            }
    });

    /* Dragonium Ingot */
    public static final RegistryObject<Item> DRAGONIUM_INGOT = ITEMS.register("dragonium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(Infernium.TAB)
    ){
            @Override
            public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                super.appendHoverText(stack, level, components, flag);
                components.add(Component.translatable(Infernium.MODID + ".dragonium_ingot.tooltip"));
            }
    });




    //// Developer Items
    /*One Millimeter Defeater*/
    public static final RegistryObject<SwordItem> ONE_MM_DEFEATER = ITEMS.register("one_mm_defeater",
            () -> new SwordItem(Tiers.TIERMM, 1000 /*ATK dmg*/, 1000.0f /*ATK spd*/, new Item.Properties()
                    .tab(Infernium.TAB)
                    .fireResistant()
            ) {
                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    super.appendHoverText(stack, level, components, flag);
                    components.add(Component.translatable(Infernium.MODID + ".one_mm_defeater.tooltip"));
                }

                @Override
                public boolean hurtEnemy(ItemStack stack, LivingEntity enemy, LivingEntity player) {
                    enemy.setSecondsOnFire(10);
                    return super.hurtEnemy(stack, enemy, player);
                }

    });




    // Tiers Class
    public static class Tiers {
        public static final Tier TIERFIVE = new ForgeTier(5, 2531, 11.0f, 5.0f, 23, null,
                () -> Ingredient.of(ItemInit.INFERNIUM_INGOT.get()));

        public static final Tier TIERMM = new ForgeTier(42069, 10000000, 69420f, 1000000f, 23459080, null,
                () -> Ingredient.EMPTY);
    }


}
