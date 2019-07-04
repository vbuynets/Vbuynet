package com.ls.vbuynet.service.consumer.comments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = "com.ls.vbuynet", exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EnableSwagger2
@EnableFeignClients
public class VbuynetServiceConsumerComments {
    public static void main(String[] args) {
        SpringApplication.run(VbuynetServiceConsumerComments.class,args);
    }
}
