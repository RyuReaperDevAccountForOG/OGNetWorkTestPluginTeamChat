package com.ognetwork.teamchat.commands;

import com.ognetwork.teamchat.TestOgNetWorkPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeamChatCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be executed by a player.");
            return true;
        }

        Player player = (Player) sender;

        if (args.length == 0) {
            player.sendMessage("Usage: /teamchat <message>");
            return true;
        }

        String message = String.join(" ", args);
        TestOgNetWorkPlugin.getInstance().getTeamManager().sendTeamMessage(player, message);
        return true;
    }
}
