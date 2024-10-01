package com.ognetwork.teamchat.listeners;

import com.ognetwork.teamchat.TestOgNetWorkPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        if (TestOgNetWorkPlugin.getInstance().getTeamManager().hasTeam(event.getPlayer())) {
            String teamName = TestOgNetWorkPlugin.getInstance().getTeamManager().getTeamName(event.getPlayer());
            String message = String.format("[%s] %s: %s", teamName, event.getPlayer().getName(), event.getMessage());
            TestOgNetWorkPlugin.getInstance().getRedisManager().sendMessageToRedis(message); // Assuming you have this method
        }
    }
}
