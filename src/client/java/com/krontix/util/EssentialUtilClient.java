package com.krontix.util;

import net.fabricmc.api.ClientModInitializer;

public class EssentialUtilClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This code ONLY runs on the player's computer.
        // This is the place to initialize your high-FPS rendering and custom UI.
        EssentialUtil.LOGGER.info("Krontix Client Engine: High-Performance Mode Engaged.");
    }
}
