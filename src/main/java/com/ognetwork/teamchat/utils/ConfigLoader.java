package com.ognetwork.teamchat.utils;

import com.ognetwork.teamchat.TestOgNetWorkPlugin;
import org.bukkit.configuration.file.FileConfiguration;

public class ConfigLoader {
    public static void loadConfig() {
        FileConfiguration config = TestOgNetWorkPlugin.getInstance().getConfig();
        config.addDefault("redis.host", "localhost");
        config.addDefault("redis.port", 6379);
        config.addDefault("redis.password", "yourpassword");
        config.options().copyDefaults(true);
        TestOgNetWorkPlugin.getInstance().saveConfig();
    }
}
