package com.ognetwork.teamchat.commands;

import com.ognetwork.teamchat.TestOgNetWorkPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeamCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be executed by a player.");
            return true;
        }

        Player player = (Player) sender;

        if (args.length < 1) {
            player.sendMessage("Usage: /team <create/join/leave> [teamName]");
            return true;
        }

        String action = args[0].toLowerCase();
        switch (action) {
            case "create":
                if (args.length < 2) {
                    player.sendMessage("Usage: /team create <teamName>");
                    return false;
                }
                TestOgNetWorkPlugin.getInstance().getTeamManager().createTeam(player, args[1]);
                break;
            case "join":
                if (args.length < 2) {
                    player.sendMessage("Usage: /team join <teamName>");
                    return false;
                }
                TestOgNetWorkPlugin.getInstance().getTeamManager().joinTeam(player, args[1]);
                break;
            case "leave":
                TestOgNetWorkPlugin.getInstance().getTeamManager().leaveTeam(player);
                break;
            default:
                player.sendMessage("Unknown action. Use create, join, or leave.");
                break;
        }
        return true;
    }
}
