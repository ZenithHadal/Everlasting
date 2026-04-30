package com.everlasting.item;

import com.everlasting.Everlasting;
import com.everlasting.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup NEVERLASTING_TAB = Registry.register(Registries.ITEM_GROUP, Identifier.of(Everlasting.MOD_ID, "dimensiongroup"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.VOID_BRICKS))
                    .displayName(Text.translatable("itemgroup.everlasting.dimensiongroup"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.VOID_BRICKS);
                    })
                    .build());

    public static void registerItemGroups() {
        Everlasting.LOGGER.info("Registering Mod Item Groups for" + Everlasting.MOD_ID);




    }
}
