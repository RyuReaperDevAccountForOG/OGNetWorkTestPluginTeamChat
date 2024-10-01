package com.ryureaper.teamchat.commands;

import com.ryureaper.teamchat.managers.TeamManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeamCommand implements CommandExecutor {

    private TeamManager teamManager;

    public TeamCommand(TeamManager teamManager) {
        this.teamManager = teamManager;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can manage teams.");
            return true;
        }

        Player player = (Player) sender;

        if (args.length < 1) {
            player.sendMessage("Usage: /team <create|join|leave> [teamName]");
            return true;
        }

        String subCommand = args[0].toLowerCase();

        switch (subCommand) {
            case "create":
                if (args.length < 2) {
                    player.sendMessage("Please specify a team name.");
                    return true;
                }
                String teamName = args[1];
                if (teamManager.createTeam(player, teamName)) {
                    player.sendMessage("Team " + teamName + " created successfully.");
                } else {
                    player.sendMessage("Failed to create team (maybe it already exists).");
                }
                break;

            case "join":
                if (args.length < 2) {
                    player.sendMessage("Please specify a team to join.");
                    return true;
                }
                teamName = args[1];
                if (teamManager.joinTeam(player, teamName)) {
                    player.sendMessage("You have joined the team " + teamName + ".");
                } else {
                    player.sendMessage("Failed to join the team.");
                }
                break;

            case "leave":
                if (teamManager.leaveTeam(player)) {
                    player.sendMessage("You have left your team.");
                } else {
                    player.sendMessage("You are not part of any team.");
                }
                break;

            default:
                player.sendMessage("Unknown command. Usage: /team <create|join|leave> [teamName]");
                break;
        }

        return true;
    }
}
