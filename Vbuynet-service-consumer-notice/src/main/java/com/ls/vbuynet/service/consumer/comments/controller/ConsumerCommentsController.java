package com.ls.vbuynet.service.consumer.comments.controller;

import com.ls.vbuynet.commons.domain.Notice;
import com.ls.vbuynet.service.consumer.comments.service.ConsumerCommentsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ConsumerCommentsController {

    @Autowired
    private ConsumerCommentsServices consumerCommentsServices;

    @RequestMapping(value = "notice",method = RequestMethod.GET)
    public String notice(Model model){
        List<Notice> notices = consumerCommentsServices.selectAll();
        model.addAttribute("notice",notices);
        System.out.println(notices);
        return "公告页面";
    }
}
