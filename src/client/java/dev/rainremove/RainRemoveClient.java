package dev.rainremove;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class RainRemoveClient implements ClientModInitializer {
	public static final String MOD_ID = "rainremove";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitializeClient() {
		LOGGER.info("Rain Remove loaded: weather visuals and weather particles are disabled.");
	}
}
