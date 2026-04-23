package com.krontix.util;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EssentialUtil implements ModInitializer {
    public static final String MOD_ID = "essential_util";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        // This code runs on BOTH Client and Server.
        LOGGER.info("Essential Util by Krontix is warming up...");
    }
}
