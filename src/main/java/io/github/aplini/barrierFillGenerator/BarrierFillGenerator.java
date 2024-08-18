package io.github.aplini.barrierFillGenerator;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.generator.ChunkGenerator;
import org.jetbrains.annotations.NotNull;

public class BarrierFillGenerator extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    public ChunkGenerator getDefaultWorldGenerator(@NotNull String worldName, String id) {
        return new generator();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
