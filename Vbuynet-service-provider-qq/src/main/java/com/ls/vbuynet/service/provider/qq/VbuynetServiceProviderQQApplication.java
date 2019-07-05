package com.ls.vbuynet.service.provider.qq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VbuynetServiceProviderQQApplication {
    public static void main(String[] args) {
        SpringApplication.run(VbuynetServiceProviderQQApplication.class,args);
    }
}
