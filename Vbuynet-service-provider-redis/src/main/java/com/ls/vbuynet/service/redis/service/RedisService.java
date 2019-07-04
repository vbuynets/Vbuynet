package com.ls.vbuynet.service.redis.service;

/**
 * 缓存接口
 */
public interface RedisService {
    /**
     * 设置缓存
     * @param key
     * @param value
     * @param seconds
     */
     void put(String key, Object value, long seconds);

    /**
     * 获取缓存
     * @param key
     * @return
     */
     Object get(String key);
}
