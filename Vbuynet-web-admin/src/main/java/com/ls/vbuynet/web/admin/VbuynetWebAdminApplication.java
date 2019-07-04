package com.ls.vbuynet.web.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com.ls.vbuynet")
@EnableDiscoveryClient
public class VbuynetWebAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(VbuynetWebAdminApplication.class,args);
    }

}