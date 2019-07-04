package com.ls.vbuynet.service.consumer.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.ls.vbuynet", exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EnableFeignClients
public class VbuynetServiceConsumerRedisApplication {
    public static void main(String[] args) {
        SpringApplication.run(VbuynetServiceConsumerRedisApplication.class,args);
    }

}

