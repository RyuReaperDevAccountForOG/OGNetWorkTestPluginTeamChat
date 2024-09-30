package com.ognetwork.teamchat.managers;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

public class TeamManager {

    private Map<String, String> playerTeams = new HashMap<>();

    public void createTeam(Player player, String teamName) {
        playerTeams.put(player.getName(), teamName);
        player.sendMessage("Team " + teamName + " created and you have joined.");
    }

    public void joinTeam(Player player, String teamName) {
        playerTeams.put(player.getName(), teamName);
        player.sendMessage("You have joined team " + teamName + ".");
    }

    public void leaveTeam(Player player) {
        if (playerTeams.containsKey(player.getName())) {
            playerTeams.remove(player.getName());
            player.sendMessage("You have left your team.");
        } else {
            player.sendMessage("You are not in any team.");
        }
    }

    public String getPlayerTeam(Player player) {
        return playerTeams.get(player.getName());
    }
}
