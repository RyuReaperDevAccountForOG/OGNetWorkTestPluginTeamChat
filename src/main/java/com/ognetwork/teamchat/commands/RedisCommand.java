package com.ognetwork.teamchat.commands;

import com.ognetwork.teamchat.TestOgNetWorkPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class RedisCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length < 3) {
            sender.sendMessage("Usage: /redis <host> <port> <password>");
            return false;
        }

        String host = args[0];
        int port;
        try {
            port = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            sender.sendMessage("Port must be a number.");
            return false;
        }
        String password = args[2];

        TestOgNetWorkPlugin.getInstance().getRedisManager().setupRedisConnection();
        TestOgNetWorkPlugin.getInstance().getConfig().set("redis.host", host);
        TestOgNetWorkPlugin.getInstance().getConfig().set("redis.port", port);
        TestOgNetWorkPlugin.getInstance().getConfig().set("redis.password", password);
        TestOgNetWorkPlugin.getInstance().saveConfig();

        sender.sendMessage("Redis connection details updated.");
        return true;
    }
}
