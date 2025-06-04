package cn.chengzhiya.langutil.manager.biome;

import org.bukkit.block.Biome;

public final class BukkitBiomeManagerImpl implements BiomeManager {
    @Override
    public String getKey(Object biome) {
        return "biome.minecraft." + ((Biome) biome).getKey().getKey();
    }
}
