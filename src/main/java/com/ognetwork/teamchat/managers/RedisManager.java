package com.ognetwork.teamchat.managers;

import com.ognetwork.teamchat.TestOgNetWorkPlugin;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisManager {

    private JedisPool jedisPool;

    public RedisManager(TestOgNetWorkPlugin plugin) {
        String redisHost = plugin.getConfig().getString("redis.host");
        int redisPort = plugin.getConfig().getInt("redis.port");
        String redisPassword = plugin.getConfig().getString("redis.password");

        this.jedisPool = new JedisPool(redisHost, redisPort);
    }

    public void sendMessage(String channel, String message) {
        try (Jedis jedis = jedisPool.getResource()) {
            jedis.publish(channel, message);
        }
    }

    public void close() {
        jedisPool.close();
    }
}
