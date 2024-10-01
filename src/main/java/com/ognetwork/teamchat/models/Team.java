package com.ryureaper.teamchat.models;

import java.util.HashSet;
import java.util.Set;

public class Team {

    private String name;
    private Set<String> members;

    public Team(String name) {
        this.name = name;
        this.members = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Set<String> getMembers() {
        return members;
    }

    public void addMember(String playerName) {
        members.add(playerName);
    }

    public void removeMember(String playerName) {
        members.remove(playerName);
    }
}
