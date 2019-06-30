package com.ls.vbuynet.service.redis.api;

public interface RedisService {
    /**
     * 设置缓存时间
     * @param key key
     * @param value value
     * @param seconds 存放时间
     */
     void set(String key,String value,Long seconds);

    /**
     * 设置缓存时间
     * @param key key
     * @param value value
     */
     void set(String key,String value);

    /**
     * 根据key拿到缓存
     * @param key key
     * @return
     */
     Object get(String key);

    /**
     * 根据key删除缓存
     * @param key
     */
    void delete(String key);

}
