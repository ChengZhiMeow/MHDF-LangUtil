package cn.chengzhiya.langutil.manager.biome;

import org.bukkit.block.Biome;

public final class BukkitBiomeManagerImpl implements BiomeManager {
    @Override
    public String getKey(Biome biome) {
        return "biome.minecraft." + biome.getKey().getKey();
    }
}
