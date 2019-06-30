package com.ls.vbuynet.service.redis.controller;

import com.ls.vbuynet.service.redis.api.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    private static final String RESULT_OK = "ok";
    private static final int REST_1=1;

    @Autowired
    private RedisService redisService;

    @RequestMapping(value = "puts", method = RequestMethod.GET)
    public String set(String key, String value, long seconds) {
        redisService.set(key, value, seconds);
        return RESULT_OK;
    }

    @RequestMapping(value = "put", method = RequestMethod.GET)
    public String set(String key, String value) {
        redisService.set(key, value);
        return RESULT_OK;
    }

    @RequestMapping(value = "find", method = RequestMethod.GET)
    public String get(String key) {
        String json = null;

        Object obj = redisService.get(key);
        if (obj != null) {
            json = (String) redisService.get(key);
        }

        return json;
    }

    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public int delete(String key) {
        redisService.delete(key);
        return REST_1;
    }
}
