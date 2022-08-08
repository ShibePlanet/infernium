package io.github.shibeplanet.infernium.init;

import io.github.shibeplanet.infernium.Infernium;
import io.github.shibeplanet.infernium.items.AdvBowItem;
import io.github.shibeplanet.infernium.items.AutoBowItem;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
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
import java.util.UUID;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Infernium.MODID);




    //// Vanilla Bows
    // Note: wooden bow
    //       baseArrowDamage: 2.0d
    //       drawSpeed: 20.0f

    /* Reinforced String */
    public static final RegistryObject<Item> REINFORCED_STRING = ITEMS.register("reinforced_string",
            () -> new Item(new Item.Properties()
                    .tab(CreativeModeTab.TAB_MISC)
            ));

    /* Stone Bow */
    public static final RegistryObject<AdvBowItem> STONE_BOW = ITEMS.register("stone_bow",
            () -> new AdvBowItem(2.5d, 20.0f, new Item.Properties()
                    .tab(CreativeModeTab.TAB_COMBAT)
                    .durability(456)
            ));

    /* Iron Bow  */
    public static final RegistryObject<AdvBowItem> IRON_BOW = ITEMS.register("iron_bow",
            () -> new AdvBowItem(3.0d, 20.0f, new Item.Properties()
                    .tab(CreativeModeTab.TAB_COMBAT)
                    .durability(575)
            ));

    /* Golden Bow */
    public static final RegistryObject<AdvBowItem> GOLDEN_BOW = ITEMS.register("golden_bow",
            () -> new AdvBowItem(2.0d, 15.0f, new Item.Properties()
                    .tab(CreativeModeTab.TAB_COMBAT)
                    .durability(91)
            ));

    /* Diamond Bow */
    public static final RegistryObject<AdvBowItem> DIAMOND_BOW = ITEMS.register("diamond_bow",
            () -> new AdvBowItem(3.5d, 20.0f, new Item.Properties()
                    .tab(CreativeModeTab.TAB_COMBAT)
                    .durability(1886)
            ));

    /* Netherite Bow */
    public static final RegistryObject<AdvBowItem> NETHERITE_BOW = ITEMS.register("netherite_bow",
            () -> new AdvBowItem(4.0d, 20.0f, new Item.Properties()
                    .tab(CreativeModeTab.TAB_COMBAT)
                    .durability(2356)
            ));




    //// Auto-Bows
    /* Auto-Bow */
    public static final RegistryObject<AutoBowItem> AUTO_BOW = ITEMS.register("auto_bow",
            () -> new AutoBowItem(3.3d, 6.6f, new Item.Properties()
                    .tab(Infernium.TAB)
                    .durability(1229)
            ));

    /* Super Auto-Bow */
    public static final RegistryObject<AutoBowItem> SUPER_AUTO_BOW = ITEMS.register("super_auto_bow",
            () -> new AutoBowItem(3.8d, 3.3f, new Item.Properties()
                    .tab(Infernium.TAB)
                    .durability(2151)
            ) {
                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    super.appendHoverText(stack, level, components, flag);
                    components.add(Component.translatable(Infernium.MODID + ".super_auto_bow.tooltip"));
                }
            });




    //// Infernium Items
    /* Infernium Ingot */
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

    /* Infernium Sword */
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

    /* Infernium Pickaxe */
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

    /* Infernium Axe */
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

    /* Infernium Shovel */
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

    /* Infernium Hoe */
    public static final RegistryObject<HoeItem> INFERNIUM_HOE = ITEMS.register("infernium_hoe",
            () -> new HoeItem(Tiers.TIERFIVE, -4 /*ATK dmg*/, 0f /*ATK spd*/, new Item.Properties()
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




    //// Nihilium Items
    /* Dragon Scale */
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

    /* Nihilium Ingot */
    public static final RegistryObject<Item> NIHILIUM_INGOT = ITEMS.register("nihilium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(Infernium.TAB)
    ){
            @Override
            public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                super.appendHoverText(stack, level, components, flag);
                components.add(Component.translatable(Infernium.MODID + ".nihilium_ingot.tooltip"));
            }
    });

    /* Nihilium Bow */
    public static final RegistryObject<AdvBowItem> NIHILIUM_BOW = ITEMS.register("nihilium_bow",
            () -> new AdvBowItem(5.0d, 20.0f, new Item.Properties()
                    .tab(Infernium.TAB)
                    .durability(2856)
    ){
            @Override
            public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                super.appendHoverText(stack, level, components, flag);
                components.add(Component.translatable(Infernium.MODID + ".nihilium_bow.tooltip"));
            }
    });

    /* Nihilium Pickaxe */
    public static final RegistryObject<PickaxeItem> NIHILIUM_PICKAXE = ITEMS.register("nihilium_pickaxe",
            () -> new PickaxeItem(Tiers.TIERFIVE, 1 /*ATK dmg*/, -3f /*ATK spd*/, new Item.Properties()
                    .tab(Infernium.TAB)
                    .fireResistant()
            ) {
                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    super.appendHoverText(stack, level, components, flag);
                    components.add(Component.translatable(Infernium.MODID + ".nihilium_pickaxe.tooltip"));
                }
    });

    /* Nihilium Axe */
    public static final RegistryObject<AxeItem> NIHILIUM_AXE = ITEMS.register("nihilium_axe",
            () -> new AxeItem(Tiers.TIERFIVE, 5 /*ATK dmg*/, -3f /*ATK spd*/, new Item.Properties()
                    .tab(Infernium.TAB)
                    .fireResistant()
            ) {
                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    super.appendHoverText(stack, level, components, flag);
                    components.add(Component.translatable(Infernium.MODID + ".nihilium_axe.tooltip"));
                }
    });

    /* Nihilium Shovel */
    public static final RegistryObject<ShovelItem> NIHILIUM_SHOVEL = ITEMS.register("nihilium_shovel",
            () -> new ShovelItem(Tiers.TIERFIVE, 1.5f /*ATK dmg*/, -3f /*ATK spd*/, new Item.Properties()
                    .tab(Infernium.TAB)
                    .fireResistant()
            ) {
                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    super.appendHoverText(stack, level, components, flag);
                    components.add(Component.translatable(Infernium.MODID + ".nihilium_shovel.tooltip"));
                }
    });

    /* Nihilium Hoe */
    public static final RegistryObject<HoeItem> NIHILIUM_HOE = ITEMS.register("nihilium_hoe",
            () -> new HoeItem(Tiers.TIERFIVE, -5 /*ATK dmg*/, 0f /*ATK spd*/, new Item.Properties()
                    .tab(Infernium.TAB)
                    .fireResistant()
            ) {
                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    super.appendHoverText(stack, level, components, flag);
                    components.add(Component.translatable(Infernium.MODID + ".nihilium_hoe.tooltip"));
                }
    });




    //// Developer Items
    /* One Millimeter Defeater */
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

    /* 4 */
    public static final RegistryObject<AdvBowItem> FOUR = ITEMS.register("four",
            () -> new AdvBowItem(4444.4444d, 4.4f, new Item.Properties()
                    .tab(Infernium.TAB)
                    .fireResistant()
                    .stacksTo(4)
            ) {
                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    super.appendHoverText(stack, level, components, flag);
                    components.add(Component.translatable(Infernium.MODID + ".four.tooltip"));
                }
    });




    //// Tiers Class
    public static class Tiers {
        public static final Tier TIERFIVE = new ForgeTier(5, 2531, 11.0f, 5.0f, 23, null,
                () -> Ingredient.of(ItemInit.INFERNIUM_INGOT.get()));

        public static final Tier TIERMM = new ForgeTier(42069, 10000000, 69420f, 1000000f, 23459080, null,
                () -> Ingredient.EMPTY);

    }


}
