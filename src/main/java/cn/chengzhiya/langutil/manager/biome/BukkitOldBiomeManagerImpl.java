package cn.chengzhiya.langutil.manager.biome;

import org.bukkit.block.Biome;

public final class BukkitOldBiomeManagerImpl implements BiomeManager {
    @Override
    public String getKey(Biome biome) {
        return "biome.minecraft." + biome.name().toLowerCase();
    }
}
