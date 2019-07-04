package com.ls.vbuynet.service.consumer.redis.RedisService.fallback;

import com.ls.vbuynet.service.consumer.redis.RedisService.RedisService;
import org.springframework.stereotype.Component;

@Component
public class RedisFallback implements RedisService {
    @Override
    public String put(String key, String value, Long seconds) {
        return "无法连接到redis提供者";
    }

    @Override
    public String get(String key) {
        return "无法连接到redis提供者";
    }
}
