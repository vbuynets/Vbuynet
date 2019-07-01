package com.ls.Vbuynet.commons.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ls.Vbuynet.commons.service.GeneralService;
import com.ls.vbuynet.commons.domain.domain.BaseDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.MyMapper;

import java.util.Date;

/**
 * 通用的业务逻辑
 * @param <T>
 * @param <D>
 * name liang
 * date 2019/7/1 15:26
 */

public class GeneralServiceImpl<T extends BaseDomain,D extends MyMapper<T>> implements GeneralService<T> {
    @Autowired
    private D dao;

    @Override
    @Transactional(readOnly = false)
    public int insert(T t) {
        t.setCreated(new Date());
        t.setUpdated(new Date());
        return dao.insert(t);
    }

    @Override
    @Transactional(readOnly = false)
    public int delete(T t) {
        return dao.delete(t);
    }

    @Override
    @Transactional(readOnly = false)
    public int update(T t) {
        t.setUpdated(new Date());
        return dao.updateByPrimaryKey(t);
    }

    @Override
    public int count(T t) {
        return dao.selectCount(t);
    }

    @Override
    public T selectOne(T t) {
        return dao.selectOne(t);
    }

    @Override
    public PageInfo<T> page(int pageNum, int pageSize, T t) {
        PageHelper pageHelper = new PageHelper();
        pageHelper.startPage(pageNum, pageSize);

        PageInfo<T> pageInfo = new PageInfo<>(dao.select(t));
        return pageInfo;
    }
}
