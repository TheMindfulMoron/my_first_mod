package net.themindfulmoron.test;

import net.fabricmc.api.ModInitializer;
import net.themindfulmoron.test.block.ModBlocks;
import net.themindfulmoron.test.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TalonModTest implements ModInitializer {

	public static final String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		ModItems.registerModItems();
		ModBlocks.registerModBlocks();


	}
}
