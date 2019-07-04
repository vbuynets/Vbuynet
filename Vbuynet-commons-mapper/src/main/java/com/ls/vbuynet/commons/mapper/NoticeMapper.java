package com.ls.vbuynet.commons.mapper;

import com.ls.vbuynet.commons.domain.Notice;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

public interface NoticeMapper extends MyMapper<Notice> {
    public List<Notice> selectAll();

    Notice selectId(int id);
}