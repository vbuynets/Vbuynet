package com.ls.vbuynet.service.redis.controller;


import com.ls.vbuynet.service.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "redis")
public class RedisController {


    @Autowired
    private RedisService redisService;


    private static final String RESULT_OK = "ok";


    @PostMapping(value = "put")
    public String set(@RequestParam(value = "key")String key,@RequestParam(value = "value") String value,@RequestParam(value = "seconds") long seconds) {
        redisService.put(key, value, seconds);
        System.out.println("redis添加OK");
        return RESULT_OK;
    }



    @GetMapping(value = "find")
    public String find(@RequestParam(value = "key") String key) {
        String json = null;

        json =(String) redisService.get(key);
        if(json!=null){
            return  json;
        }
        return  null;
    }



}

