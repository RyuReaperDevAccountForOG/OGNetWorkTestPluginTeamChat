package com.ryureaper.teamchat.listeners;

import com.ryureaper.teamchat.TeamChatPlugin;
import com.ryureaper.teamchat.managers.TeamManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    private TeamChatPlugin plugin;
    private TeamManager teamManager;

    public ChatListener(TeamChatPlugin plugin, TeamManager teamManager) {
        this.plugin = plugin;
        this.teamManager = teamManager;
    }

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        String teamName = teamManager.getPlayerTeam(player.getUniqueId());

        if (teamName != null) {
            // If the player is in a team, send the message through Redis
            plugin.getRedisManager().publishTeamMessage(teamName, player.getName(), event.getMessage());
            event.setCancelled(true); // Cancel the normal chat event
        }
    }
}