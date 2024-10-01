package com.ognetwork.teamchat;

import com.ognetwork.teamchat.commands.RedisCommand;
import com.ognetwork.teamchat.commands.TeamChatCommand;
import com.ognetwork.teamchat.commands.TeamCommand;
import com.ognetwork.teamchat.listeners.ChatListener;
import com.ognetwork.teamchat.managers.RedisManager;
import com.ognetwork.teamchat.managers.TeamManager;
import com.ognetwork.teamchat.utils.ConfigLoader;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class TestOgNetWorkPlugin extends JavaPlugin {

    private static TestOgNetWorkPlugin instance;
    private TeamManager teamManager;
    private RedisManager redisManager;

    @Override
    public void onEnable() {
        instance = this;

        ConfigLoader.loadConfig();
        teamManager = new TeamManager();
        redisManager = new RedisManager();

        getCommand("redis").setExecutor(new RedisCommand());
        getCommand("team").setExecutor(new TeamCommand());
        getCommand("teamchat").setExecutor(new TeamChatCommand());
        getServer().getPluginManager().registerEvents(new ChatListener(), this);

        Bukkit.getLogger().info("TestOgNetWorkPlugin has been enabled.");
    }

    @Override
    public void onDisable() {
        redisManager.closeConnection();
        Bukkit.getLogger().info("TestOgNetWorkPlugin has been disabled.");
    }

    public static TestOgNetWorkPlugin getInstance() {
        return instance;
    }

    public TeamManager getTeamManager() {
        return teamManager;
    }

    public RedisManager getRedisManager() {
        return redisManager;
    }
}
