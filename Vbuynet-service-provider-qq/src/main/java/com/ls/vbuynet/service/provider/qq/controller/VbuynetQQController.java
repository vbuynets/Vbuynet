package com.ls.vbuynet.service.provider.qq.controller;

import com.ls.vbuynet.commons.domain.Validation;
import com.ls.vbuynet.service.provider.qq.service.VbuynetQQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VbuynetQQController {

    @Autowired
    private VbuynetQQService vbuynetQQService;


    @RequestMapping(value = "qq",method = RequestMethod.GET)
    public Validation condition(int id){
        Validation condition = vbuynetQQService.condition(id);
        return condition;
    }
}
