package com.ognetwork.teamchat.managers;

import com.ognetwork.teamchat.TestOgNetWorkPlugin;
import com.ognetwork.teamchat.utils.Logger;
import redis.clients.jedis.Jedis;

public class RedisManager {

    private Jedis jedis;

    public RedisManager() {
        setupRedisConnection();
    }

    public void setupRedisConnection() {
        try {
            String host = TestOgNetWorkPlugin.getInstance().getConfig().getString("redis.host");
            int port = TestOgNetWorkPlugin.getInstance().getConfig().getInt("redis.port");
            String password = TestOgNetWorkPlugin.getInstance().getConfig().getString("redis.password");

            jedis = new Jedis(host, port);
            jedis.auth(password);
            Logger.info("Connected to Redis.");
        } catch (Exception e) {
            Logger.error("Failed to connect to Redis: " + e.getMessage());
        }
    }

    public void sendMessageToRedis(String message) {
        if (jedis != null) {
            jedis.publish("teamchat", message);
        }
    }

    public void closeConnection() {
        if (jedis != null) {
            jedis.close();
            Logger.info("Redis connection closed.");
        }
    }
}
