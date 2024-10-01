package com.ryureaper.teamchat.managers;

import com.ryureaper.teamchat.models.Team;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class TeamManager {

    private HashMap<String, Team> teams = new HashMap<>();
    private HashMap<UUID, String> playerTeams = new HashMap<>();

    public boolean createTeam(Player player, String teamName) {
        if (teams.containsKey(teamName)) {
            return false; // Team already exists
        }
        teams.put(teamName, new Team(teamName));
        playerTeams.put(player.getUniqueId(), teamName);
        return true;
    }

    public boolean joinTeam(Player player, String teamName) {
        if (!teams.containsKey(teamName)) {
            return false; // Team does not exist
        }
        playerTeams.put(player.getUniqueId(), teamName);
        teams.get(teamName).addMember(player.getName());
        return true;
    }

    public boolean leaveTeam(Player player) {
        String teamName = playerTeams.remove(player.getUniqueId());
        if (teamName == null) {
            return false; // Player is not in any team
        }
        teams.get(teamName).removeMember(player.getName());
        return true;
    }

    public String getPlayerTeam(UUID playerId) {
        return playerTeams.get(playerId);
    }
}
