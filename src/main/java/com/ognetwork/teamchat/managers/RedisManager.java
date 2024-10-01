package com.ryureaper.teamchat.managers;

import com.ryureaper.teamchat.TeamChatPlugin;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;

public class RedisManager {

    private Jedis jedis;
    private TeamChatPlugin plugin;

    public RedisManager(TeamChatPlugin plugin) {
        this.plugin = plugin;
        jedis = new Jedis(plugin.getConfig().getString("redis.host"), plugin.getConfig().getInt("redis.port"));

        // Subscribe to all team channels
        new Thread(() -> {
            jedis.subscribe(new JedisPubSub() {
                @Override
                public void onMessage(String channel, String message) {
                    String[] parts = message.split(": ", 2);
                    String playerName = parts[0];
                    String msg = parts[1];
                    plugin.getServer().getOnlinePlayers().forEach(player -> {
                        if (plugin.getTeamManager().getPlayerTeam(player.getUniqueId()).equals(channel.split(":")[1])) {
                            player.sendMessage("[" + playerName + "]: " + msg);
                        }
                    });
                }
            }, "team:*");
        }).start();
    }

    public void publishTeamMessage(String teamName, String playerName, String message) {
        jedis.publish("team:" + teamName, playerName + ": " + message);
    }

    public void close() {
        jedis.close();
    }
}
