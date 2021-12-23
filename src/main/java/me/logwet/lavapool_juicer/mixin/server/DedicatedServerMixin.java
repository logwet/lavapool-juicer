package me.logwet.lavapool_juicer.mixin.server;

import me.logwet.lavapool_juicer.LavapoolJuicer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.server.dedicated.DedicatedServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.SERVER)
@Mixin(DedicatedServer.class)
public abstract class DedicatedServerMixin {
    @Inject(method = "initServer", at = @At("HEAD"))
    private void onServerObjectCreated(CallbackInfoReturnable<Boolean> cir) {
        LavapoolJuicer.onServerStart((DedicatedServer) (Object) this);
    }
}
