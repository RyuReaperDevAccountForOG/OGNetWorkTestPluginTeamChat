package com.ognetwork.teamchat.commands;

import com.ognetwork.teamchat.TestOgNetWorkPlugin;
import com.ognetwork.teamchat.managers.TeamManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeamCommand implements CommandExecutor {

    private TestOgNetWorkPlugin plugin;

    public TeamCommand(TestOgNetWorkPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be run by players.");
            return true;
        }

        Player player = (Player) sender;
        TeamManager teamManager = plugin.getTeamManager();

        if (args.length < 1) {
            player.sendMessage("Usage: /team <create|join|leave> [team_name]");
            return true;
        }

        String subCommand = args[0];

        switch (subCommand.toLowerCase()) {
            case "create":
                if (args.length < 2) {
                    player.sendMessage("Usage: /team create <team_name>");
                    return true;
                }
                teamManager.createTeam(player, args[1]);
                break;

            case "join":
                if (args.length < 2) {
                    player.sendMessage("Usage: /team join <team_name>");
                    return true;
                }
                teamManager.joinTeam(player, args[1]);
                break;

            case "leave":
                teamManager.leaveTeam(player);
                break;

            default:
                player.sendMessage("Unknown sub-command.");
        }

        return true;
    }
}
