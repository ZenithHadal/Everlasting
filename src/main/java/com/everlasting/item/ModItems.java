package com.everlasting.item;

import com.everlasting.Everlasting;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PYRORITA = registerItem("pyrorita", new Item(new Item.Settings()));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Everlasting.MOD_ID, name), item);
    }

  public static void registerModItems() {
      Everlasting.LOGGER.info("Registering Mod Items //" + Everlasting.MOD_ID);


      ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
      entries.add(PYRORITA);

      });
  }
}
