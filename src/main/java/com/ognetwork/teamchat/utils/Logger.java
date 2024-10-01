package com.ognetwork.teamchat.utils;

import org.bukkit.Bukkit;

public class Logger {
    public static void info(String message) {
        Bukkit.getLogger().info("[TeamChat] " + message);
    }

    public static void error(String message) {
        Bukkit.getLogger().severe("[TeamChat] " + message);
    }
}
