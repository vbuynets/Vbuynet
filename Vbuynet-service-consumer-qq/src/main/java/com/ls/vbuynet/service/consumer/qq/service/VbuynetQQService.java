package com.ls.vbuynet.service.consumer.qq.service;


import com.ls.vbuynet.commons.domain.Validation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "Vbuynet-service-provider-qq")
public interface VbuynetQQService {

    @GetMapping(value = "qq")
    public Validation condition(int id);
}
