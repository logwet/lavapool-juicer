package me.logwet.lavapool_juicer;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.apache.logging.log4j.Level;

@Environment(EnvType.CLIENT)
public class LavapoolJuicerClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        LavapoolJuicer.log(Level.INFO, "Client class initialized!");
    }
}
