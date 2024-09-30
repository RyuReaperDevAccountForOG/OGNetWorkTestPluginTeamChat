package com.ognetwork.teamchat;

import com.ognetwork.teamchat.commands.TeamChatCommand;
import com.ognetwork.teamchat.commands.TeamCommand;
import com.ognetwork.teamchat.managers.RedisManager;
import com.ognetwork.teamchat.managers.TeamManager;
import com.ognetwork.teamchat.utils.ConfigLoader;
import org.bukkit.plugin.java.JavaPlugin;

public class TestOgNetWorkPlugin extends JavaPlugin {

    private RedisManager redisManager;
    private TeamManager teamManager;

    @Override
    public void onEnable() {
        // Load configuration
        ConfigLoader.load(this);

        // Initialize managers
        this.redisManager = new RedisManager(this);
        this.teamManager = new TeamManager();

        // Register commands
        getCommand("team").setExecutor(new TeamCommand(this));
        getCommand("teamchat").setExecutor(new TeamChatCommand(this));

        getLogger().info("TestOgNetWork Plugin enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("TestOgNetWork Plugin disabled!");
    }

    public RedisManager getRedisManager() {
        return redisManager;
    }

    public TeamManager getTeamManager() {
        return teamManager;
    }
}
