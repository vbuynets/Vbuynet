package com.ls.vbuynet.service.provider.site;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = "com.ls.vbuynet")
@EnableDiscoveryClient
@MapperScan(basePackages = "com.ls.vbuynet.commons.mapper")
public class VbuynetServiceProviderSite {
    public static void main(String[] args) {
        SpringApplication.run(VbuynetServiceProviderSite.class,args);
    }
}
