package io.github.aplini.barrierFillGenerator;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.generator.WorldInfo;
import org.jetbrains.annotations.NotNull;

public class generator extends ChunkGenerator {

    public void generateBedrock(@NotNull WorldInfo worldInfo, @NotNull Random random, int chunkX, int chunkZ, @NotNull ChunkData chunkData) {

        for (int x = 0; x < 16; x++) {
            for (int z = 0; z < 16; z++) {
                for (int y = chunkData.getMinHeight(); y < chunkData.getMaxHeight(); y++) {
                    chunkData.setBlock(x, y, z, Material.BARRIER);
                }
            }
        }

    }
}