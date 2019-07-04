package com.ls.vbuynet.service.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = "com.ls.vbuynet",exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@MapperScan(basePackages = "com.ls.vbuynet.commons.mapper")
public class VbuynetServiceSSOApplication {
    public static void main(String[] args) {
        SpringApplication.run(VbuynetServiceSSOApplication.class,args);
    }
}
