package com.ls.vbuynet.service.consumer.comments.service;

import com.ls.vbuynet.commons.domain.Notice;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "Vbuynet-service-provider-comments")
public interface ConsumerCommentsServices {

    @GetMapping(value = "notice")
    public List<Notice> selectAll();

}
