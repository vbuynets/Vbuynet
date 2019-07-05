package com.ls.vbuynet.service.provider.comments.service;

import com.ls.vbuynet.commons.domain.Notice;

import java.util.List;

public interface CommentsService {
    /**
     * 查询全部新闻
     * @return
     */
    List<Notice> selectAll();


    /**
     * 根据id查询新闻
     * @param id
     * @return
     */
    Notice selectId(int id) ;
}
