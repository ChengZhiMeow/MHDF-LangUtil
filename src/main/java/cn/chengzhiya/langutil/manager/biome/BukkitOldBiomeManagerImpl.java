package cn.chengzhiya.langutil.manager.biome;

import cn.chengzhiya.langutil.LangAPI;

import java.util.Objects;

public final class BukkitOldBiomeManagerImpl implements BiomeManager {
    @Override
    public String getKey(Object biome) {
        String name = LangAPI.instance.getReflectionManager().invokeMethod(
                LangAPI.instance.getReflectionManager().getMethod(
                        biome.getClass(),
                        "name",
                        true
                ),
                biome
        );

        return "biome.minecraft." + Objects.requireNonNull(name).toLowerCase();
    }
}
