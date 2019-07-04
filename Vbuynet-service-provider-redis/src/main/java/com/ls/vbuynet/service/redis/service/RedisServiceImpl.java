package com.ls.vbuynet.service.redis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;


@Service
public class RedisServiceImpl implements  RedisService {

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 向redis中添加数据
     * @param key
      * @param value
     * @param seconds   过期时间
     */
    @Override
    public void put(String key, Object value, long seconds) {
        redisTemplate.opsForValue().set(key, value, seconds, TimeUnit.SECONDS);

    }

    /**
     * 得到redis数据
     * @param key
     * @return
     */
    @Override
    public Object get(String key) {
        return redisTemplate.opsForValue().get(key);
    }
}
