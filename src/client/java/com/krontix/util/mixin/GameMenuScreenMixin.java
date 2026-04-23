package com.krontix.util.mixin;

import net.minecraft.client.gui.screen.GameMenuScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameMenuScreen.class)
public abstract class GameMenuScreenMixin extends Screen {
    protected GameMenuScreenMixin(Text title) { super(title); }

    @Inject(method = "init", at = @At("TAIL"))
    private void addTutorialButton(CallbackInfo ci) {
        // Adds a small button in the top-left corner
        this.addDrawableChild(ButtonWidget.builder(Text.literal("Tutorials"), button -> {
            // Logic to open your tutorial screen
            System.out.println("Krontix: Opening Tutorial Menu...");
        }).dimensions(10, 10, 70, 20).build());
    }
}
