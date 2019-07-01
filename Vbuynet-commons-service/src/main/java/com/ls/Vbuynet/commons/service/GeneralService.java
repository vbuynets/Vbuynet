package com.ls.Vbuynet.commons.service;

import com.github.pagehelper.PageInfo;
import com.ls.vbuynet.commons.domain.domain.BaseDomain;

public interface GeneralService<T extends BaseDomain> {
    int insert(T t);

    int delete(T t);

    int update(T t);

    int count(T t);

    T selectOne(T t);

    PageInfo<T> page(int pageNum, int pageSize, T t);
}
