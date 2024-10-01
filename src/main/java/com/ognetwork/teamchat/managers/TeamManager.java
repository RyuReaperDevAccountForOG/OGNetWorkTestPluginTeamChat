package com.ognetwork.teamchat.managers;

import com.ognetwork.teamchat.TestOgNetWorkPlugin;
import com.ognetwork.teamchat.models.Team;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

public class TeamManager {

    private final Map<Player, Team> playerTeams = new HashMap<>();

    public void createTeam(Player player, String teamName) {
        if (playerTeams.containsKey(player)) {
            player.sendMessage("You are already in a team.");
            return;
        }
        Team team = new Team(teamName);
        team.addPlayer(player);
        playerTeams.put(player, team);
        player.sendMessage("Team " + teamName + " created and you have joined it.");
    }

    public void joinTeam(Player player, String teamName) {
        for (Team team : playerTeams.values()) {
            if (team.getName().equalsIgnoreCase(teamName)) {
                team.addPlayer(player);
                playerTeams.put(player, team);
                player.sendMessage("You have joined team " + teamName + ".");
                return;
            }
        }
        player.sendMessage("Team " + teamName + " does not exist.");
    }

    public void leaveTeam(Player player) {
        if (!playerTeams.containsKey(player)) {
            player.sendMessage("You are not in a team.");
            return;
        }
        Team team = playerTeams.get(player);
        team.removePlayer(player);
        playerTeams.remove(player);
        player.sendMessage("You have left team " + team.getName() + ".");
    }

    public boolean hasTeam(Player player) {
        return playerTeams.containsKey(player);
    }

    public String getTeamName(Player player) {
        if (hasTeam(player)) {
            return playerTeams.get(player).getName();
        }
        return null;
    }
}
