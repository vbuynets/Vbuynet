package com.ls.vbuynet.service.consumer.redis.RedisService;

import com.ls.vbuynet.service.consumer.redis.RedisService.fallback.RedisFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "vbuynet-service-provider-redis",fallback = RedisFallback.class)
public interface RedisService {

    @PostMapping(value = "put")
    public  String    put(@RequestParam(value = "key")String key, @RequestParam(value = "value")String value, @RequestParam(value = "seconds")Long seconds);
    @GetMapping(value = "get")
    public   String get(@RequestParam(value = "key")String key);

}
