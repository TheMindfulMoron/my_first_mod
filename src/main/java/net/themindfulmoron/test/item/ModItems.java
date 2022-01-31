package net.themindfulmoron.test.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.themindfulmoron.test.TalonModTest;

public class ModItems {


    public static final Item ASCENDANT_SHARD = registerItem("ascendant_shard",
        new Item(new FabricItemSettings().group(ModItemGroups.MOCREATURES)));

    public static final Item ENHANCEMENT_CORE = registerItem("enhancement_core",
            new Item(new FabricItemSettings().group(ModItemGroups.MOCREATURES)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TalonModTest.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + TalonModTest.MOD_ID);
    }




}
