package com.ls.vbuynet.service.provider.comments.controller;

import com.ls.vbuynet.commons.domain.Notice;
import com.ls.vbuynet.commons.mapper.NoticeMapper;
import com.ls.vbuynet.service.provider.comments.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Controller
public class CommentsController {

    @Autowired
    private NoticeMapper noticeMapper;

    @Autowired
    private CommentsService   commentsService;

    @ResponseBody
    @RequestMapping(value = "notice",method = RequestMethod.GET)
    public List<Notice> selectNotion(){
        return commentsService.selectAll();
    }

    @ResponseBody
    @RequestMapping(value = "noticeId",method = RequestMethod.GET)
    public Notice selectId(@RequestParam(value = "id",required = true) int id){
        Notice notice = noticeMapper.selectId(id);
        return notice;
    }

}
