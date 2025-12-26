package com.sydney.tutorialmod.item;

import com.sydney.tutorialmod.TutorialMod;
import com.sydney.tutorialmod.block.ModBlocks;
import com.sydney.tutorialmod.item.custom.ModArmorItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {

    public static final Item CAULIFLOWER = registerItem("cauliflower", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "cauliflower")))
            .food(ModFoodComponents.CAULIFLOWER)));


    public static final Item BELL_PEPPER_GREEN = registerItem("bell_pepper_green", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "bell_pepper_green")))
            .food(ModFoodComponents.CAULIFLOWER)));


    public static final Item BELL_PEPPER_YELLOW = registerItem("bell_pepper_yellow", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "bell_pepper_yellow")))
            .food(ModFoodComponents.CAULIFLOWER)));

    public static final Item BELL_PEPPER_RED = registerItem("bell_pepper_red", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "bell_pepper_red")))
            .food(ModFoodComponents.CAULIFLOWER)));








    public static final Item BELL_PEPPER_SEEDS = registerItem("bell_pepper_seeds",
            new BlockItem(ModBlocks.BELL_PEPPERS, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "bell_pepper_seeds")))));





    public static final Item GLOWBERRY_CUBECAKE = registerItem("glowberry_cubecake", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "glowberry_cubecake")))
            .food(ModFoodComponents.GLOWBERRY_CUBECAKE)));

    public static final Item WAFER_CONE = registerItem("wafer_cone", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "wafer_cone")))));

    public static final Item WAFER = registerItem("wafer", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "wafer")))));

    public static final Item GLOWBERRY_ICE_CREAM = registerItem("glowberry_ice_cream", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "glowberry_ice_cream")))
            .food(ModFoodComponents.ICE_CREAM)));


    public static final Item CHOCOLATE_BAR = registerItem("chocolate_bar", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "chocolate_bar")))
            .food(ModFoodComponents.CHOCOLATE)));


    public static final Item MINT_CHOCOLATE = registerItem("mint_chocolate", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "mint_chocolate")))
            .food(ModFoodComponents.CHOCOLATE)));


    public static final Item MINT_LEAVES= registerItem("mint_leaves", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "mint_leaves")))));




    public static final Item GLOWBERRY_ICE_CREAM_CONE = registerItem("glowberry_ice_cream_cone", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "glowberry_ice_cream_cone")))
            .food(ModFoodComponents.ICE_CREAM_CONE)));


    public static final Item ICE_CUBES = registerItem("ice_cubes", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "ice_cubes")))));

    public static final Item SWEETBERRY_CUPCAKE = registerItem("sweetberry_cupcake", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "sweetberry_cupcake")))
            .food(ModFoodComponents.SWEETBERRY_CUPCAKE)));


    public static final Item STRAWBERRY = registerItem("strawberry", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "strawberry")))
            .food(ModFoodComponents.STRAWBERRY)));

    public static final Item STRAWBERRY_SEEDS = registerItem("strawberry_seeds",
            new BlockItem(ModBlocks.STRAWBERRY, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "strawberry_seeds")))));



    public static final Item CAKE_DOUGH = registerItem("cake_dough", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "cake_dough")))));

    public static final Item SWEETBERRY_JAM = registerItem("sweetberry_jam", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "sweetberry_jam")))));

    public static final Item JAR = registerItem("jar", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "jar")))));


    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "raw_pink_garnet")))));

    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "pink_garnet")))));

    public static final Item STRAW = registerItem("straw", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "straw")))));

    public static final Item ROPE = registerItem("rope", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "rope")))));


    public static final Item CRANBERRY = registerItem("cranberry",
            new  BlockItem(ModBlocks.CRANBERRY_BUSH, new Item.Settings().food(ModFoodComponents.CRANBERRY)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "cranberry")))));


    public static final Item SILT_BALL = registerItem("silt_ball", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "silt_ball")))));

    public static final Item SILT_BRICK = registerItem("silt_brick", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "silt_brick")))));


    public static final Item LILYFISH = registerItem("lilyfish", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "lilyfish")))));

    public static final Item PIE_CRUST = registerItem("pie_crust", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "pie_crust")))));


    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new BlockItem(ModBlocks.TOMATO, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "tomato_seeds")))));

    public static final Item TOMATO = registerItem("tomato",
            new  BlockItem(ModBlocks.TOMATO, new Item.Settings().food(ModFoodComponents.TOMATO)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "tomato")))));


    public static final Item GREEN_APPLE = registerItem("green_apple", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "green_apple")))
                    .food(FoodComponents.APPLE)));



    public static final Item GREEN_APPLE_PIE= registerItem("green_apple_pie", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "green_apple_pie")))
            .food(FoodComponents.PUMPKIN_PIE)));


    public static final Item KIWI = registerItem("kiwi", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "kiwi")))
            .food(FoodComponents.APPLE)));


    public static final Item ROSE = registerItem("rose", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "rose")))));


/////cookie cutters
public static final Item CIRCLE_COOKIE_CUTTER = registerItem("circle_cookie_cutter", new Item(new Item.Settings()
        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "circle_cookie_cutter")))));


    public static final Item ROSE_FLOWER_CROWN = registerItem("rose_flower_crown",
            setting -> new ModArmorItem(setting.armor(ModArmorMaterials.ROSE_FLOWER_CROWN, EquipmentType.HELMET)));


    public static final Item FLOUR = registerItem("flour", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "flour")))));





    public static final Item SUGAR_COOKIE = registerItem("sugar_cookie", new Item(new Item.Settings()
      .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "sugar_cookie")))
            .food(ModFoodComponents.SUGAR_COOKIE)));


    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, name)))));
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
            entries.add(LILYFISH);
            entries.add(TOMATO_SEEDS);
            entries.add(TOMATO);

        });

    }

    public static void init() {
    }


}