package cn.chengzhiya.langutil.manager.biome;

public interface BiomeManager {
    /**
     * 获取群系在服务端版本对应的语言文件中所对应key
     *
     * @param biome 群系实例
     * @return 语言文件中所对应key
     */
    String getKey(Object biome);
}
