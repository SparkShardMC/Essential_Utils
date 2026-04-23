package com.krontix.util.mixin;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InventoryScreen.class)
public class InventoryScreenMixin {
    @Inject(method = "render", at = @At("TAIL"))
    private void drawKrontixTrashSlot(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        // Procedurally draws a red 'Trash' box at the bottom right of the inventory
        int x = 200; // You'll adjust these based on screen size
        int y = 200;
        context.fill(x, y, x + 18, y + 18, 0xFFFF0000); // Red Background
        context.drawText(null, "X", x + 6, y + 5, 0xFFFFFF, false); // White X
    }
}
