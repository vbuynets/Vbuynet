package com.ls.vbuynet.service.consumer.qq.controller;

import com.ls.vbuynet.commons.domain.Validation;
import com.ls.vbuynet.service.consumer.qq.service.VbuynetQQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VbuynetQQController {

    @Autowired
    private VbuynetQQService vbuynetQQService;

    @RequestMapping(value = "qq",method = RequestMethod.GET)
    public String controller(int id, Model model){
        Validation condition = vbuynetQQService.condition(id);
        model.addAttribute("condition",condition);
        return "qq查询";
    }
}
