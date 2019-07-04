package com.ls.vbuynet.service.provider.comments.service.impl;

import com.ls.Vbuynet.commons.service.impl.GeneralServiceImpl;
import com.ls.vbuynet.commons.domain.Notice;
import com.ls.vbuynet.commons.dto.AbstractBaseDomain;
import com.ls.vbuynet.commons.mapper.NoticeMapper;
import com.ls.vbuynet.service.provider.comments.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class CommentsServiceImpl implements CommentsService{

    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public List<Notice> selectAll() {
        List<Notice> notices = noticeMapper.selectAll();
        return notices;
    }

    @Override
    public Notice selectId(int id) {
        Example example=new Example(Notice.class);
        example.createCriteria().andEqualTo("id",id);
        Notice notice = noticeMapper.selectByPrimaryKey(example);
        return notice;
    }
}
