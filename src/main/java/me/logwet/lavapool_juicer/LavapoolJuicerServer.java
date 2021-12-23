package me.logwet.lavapool_juicer;

import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.apache.logging.log4j.Level;

@Environment(EnvType.SERVER)
public class LavapoolJuicerServer implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        LavapoolJuicer.log(Level.INFO, "Server class initialized!");
    }
}
