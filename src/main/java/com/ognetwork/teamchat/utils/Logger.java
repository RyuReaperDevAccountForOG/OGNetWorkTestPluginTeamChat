package com.ryureaper.teamchat.utils;

import org.bukkit.plugin.java.JavaPlugin;

public class Logger {

    private JavaPlugin plugin;

    public Logger(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public void info(String message) {
        plugin.getLogger().info(message);
    }

    public void warn(String message) {
        plugin.getLogger().warning(message);
    }

    public void error(String message) {
        plugin.getLogger().severe(message);
    }
}
