package com.ryureaper.teamchat;

import com.ryureaper.teamchat.commands.TeamChatCommand;
import com.ryureaper.teamchat.commands.TeamCommand;
import com.ryureaper.teamchat.listeners.ChatListener;
import com.ryureaper.teamchat.managers.RedisManager;
import com.ryureaper.teamchat.managers.TeamManager;
import org.bukkit.plugin.java.JavaPlugin;

public class TeamChatPlugin extends JavaPlugin {

    private RedisManager redisManager;
    private TeamManager teamManager;

    @Override
    public void onEnable() {
        // Load the default configuration file
        saveDefaultConfig();

        // Initialize Redis and Team Manager
        redisManager = new RedisManager(this);
        teamManager = new TeamManager();

        // Register commands
        getCommand("teamchat").setExecutor(new TeamChatCommand(this, teamManager));
        getCommand("team").setExecutor(new TeamCommand(this, teamManager));

        // Register event listeners
        getServer().getPluginManager().registerEvents(new ChatListener(this, teamManager), this);
    }

    @Override
    public void onDisable() {
        // Close Redis connection
        redisManager.close();
    }

    public RedisManager getRedisManager() {
        return redisManager;
    }

    public TeamManager getTeamManager() {
        return teamManager;
    }
}
