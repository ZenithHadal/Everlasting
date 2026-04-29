package com.everlasting;

import com.everlasting.block.ModBlocks;
import com.everlasting.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Everlasting implements ModInitializer {
	public static final String MOD_ID = "everlasting";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}