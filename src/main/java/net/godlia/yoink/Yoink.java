package net.godlia.yoink;

import net.fabricmc.api.ModInitializer;

import net.godlia.yoink.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//test
public class Yoink implements ModInitializer {
	public static final String MOD_ID = "yoink";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItem();
	}
}