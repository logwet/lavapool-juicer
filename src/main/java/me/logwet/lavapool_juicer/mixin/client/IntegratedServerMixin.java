package me.logwet.lavapool_juicer.mixin.client;

import me.logwet.lavapool_juicer.LavapoolJuicer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.server.IntegratedServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin(IntegratedServer.class)
public abstract class IntegratedServerMixin {
    @Inject(method = "initServer", at = @At("HEAD"))
    private void onServerObjectCreated(CallbackInfoReturnable<Boolean> cir) {
        LavapoolJuicer.onServerStart((IntegratedServer) (Object) this);
    }
}
