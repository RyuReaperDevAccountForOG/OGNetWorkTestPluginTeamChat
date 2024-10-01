package com.ryureaper.teamchat.utils;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class ConfigLoader {

    private JavaPlugin plugin;
    private FileConfiguration config;

    public ConfigLoader(JavaPlugin plugin) {
        this.plugin = plugin;
        this.config = plugin.getConfig();
    }

    public String getRedisHost() {
        return config.getString("redis.host", "localhost");
    }

    public int getRedisPort() {
        return config.getInt("redis.port", 6379);
    }
}
