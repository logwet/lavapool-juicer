package me.logwet.lavapool_juicer.mixin.common;

import net.minecraft.world.level.biome.BiomeDefaultFeatures;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(BiomeDefaultFeatures.class)
public abstract class BiomeDefaultFeaturesMixin {
    @Unique private static final int FREQUENCY = 40;

    @ModifyConstant(method = "addDefaultLakes", constant = @Constant(intValue = 80))
    private static int modifyLavaLakeFrequency(int original) {
        return FREQUENCY;
    }

    @ModifyConstant(method = "addDesertLakes", constant = @Constant(intValue = 80))
    private static int modifyDesertLavaLakeFrequency(int original) {
        return FREQUENCY;
    }
}
