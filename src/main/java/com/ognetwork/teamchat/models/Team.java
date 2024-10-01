package com.ognetwork.teamchat.models;

import org.bukkit.entity.Player;

import java.util.HashSet;
import java.util.Set;

public class Team {
    private final String name;
    private final Set<Player> players;

    public Team(String name) {
        this.name = name;
        this.players = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public Set<Player> getPlayers() {
        return players;
    }
}
