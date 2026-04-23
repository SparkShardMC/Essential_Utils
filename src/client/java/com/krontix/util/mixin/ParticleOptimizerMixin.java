package com.krontix.util.mixin;

import net.minecraft.client.particle.ParticleManager;
import net.minecraft.client.render.Camera;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ParticleManager.class)
public class ParticleOptimizerMixin {
    @Inject(method = "renderParticles", at = @At("HEAD"), cancellable = true)
    private void krontix$cullParticles(Camera camera, float tickDelta, CallbackInfo ci) {
        // If distance > 16 blocks, don't even calculate the particle
        // This is a MAJOR FPS boost for trash PCs
        if (camera.getPos().squaredDistanceTo(camera.getPos()) > 256) {
            ci.cancel();
        }
    }
}
