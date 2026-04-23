package com.krontix.util.screen;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class TutorialScreen extends Screen {
    public TutorialScreen() { super(Text.literal("Essential Util Tutorials")); }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
        // Draw a dark semi-transparent background
        context.fill(0, 0, this.width, this.height, 0x88000000);
        
        // Draw the Tutorial Text
        context.drawCenteredTextWithShadow(this.textRenderer, "--- Krontix's Essential Util Guide ---", this.width / 2, 40, 0xFFFFFF);
        context.drawText(this.textRenderer, "1. FPS Boost: Particles are culled > 16 blocks away.", 20, 70, 0xAAAAAA, false);
        context.drawText(this.textRenderer, "2. Inventory: Use the red 'X' to trash items.", 20, 90, 0xAAAAAA, false);
        context.drawText(this.textRenderer, "3. Fog: Removed automatically to save GPU power.", 20, 110, 0xAAAAAA, false);
    }
}
