package net.themindfulmoron.test.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.themindfulmoron.test.TalonModTest;

public class ModItemGroups {
    public static final ItemGroup MOCREATURES = FabricItemGroupBuilder.build(new Identifier(TalonModTest.MOD_ID, "mocreatures"),
            () -> new ItemStack(ModItems.ASCENDANT_SHARD));


}
