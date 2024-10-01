package com.ryureaper.teamchat.commands;

import com.ryureaper.teamchat.TeamChatPlugin;
import com.ryureaper.teamchat.managers.TeamManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeamChatCommand implements CommandExecutor {

    private TeamChatPlugin plugin;
    private TeamManager teamManager;

    public TeamChatCommand(TeamChatPlugin plugin, TeamManager teamManager) {
        this.plugin = plugin;
        this.teamManager = teamManager;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command.");
            return true;
        }

        Player player = (Player) sender;
        String teamName = teamManager.getPlayerTeam(player.getUniqueId());

        if (teamName == null) {
            player.sendMessage("You are not part of a team.");
            return true;
        }

        String message = String.join(" ", args);
        if (message.isEmpty()) {
            player.sendMessage("Please provide a message to send.");
            return true;
        }

        // Publish the message to Redis for the team
        plugin.getRedisManager().publishTeamMessage(teamName, player.getName(), message);
        player.sendMessage("Message sent to your team!");

        return true;
    }
}
