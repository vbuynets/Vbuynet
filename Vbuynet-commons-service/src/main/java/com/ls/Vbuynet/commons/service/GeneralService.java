package com.ls.Vbuynet.commons.service;

import com.github.pagehelper.PageInfo;
import com.ls.vbuynet.commons.dto.AbstractBaseDomain;

/**
 * 通用的业务访问层
 * @param <T>
 */
public interface GeneralService<T extends AbstractBaseDomain> {
    /**
     * 查询属性值是否唯一
     * @param property
     * @param value
     * @return
     * true 唯一 false 不唯一
     */
    default  Boolean unique(String property, String value){
        return  false;
    }

    /**
     * 保存
     * @param domain
     * @return
     */
        default T save(T domain) {
        return null;
    }

        default int delete(T t){return  0;}

         default    int update(T t){return  0;};

         default  int count(T t){return 0; }

         default   T selectOne(T t){return  null;}

    /**
     *
     * @param domain
     * @param pageNum 页码
     * @param pageSize 显示条数
     * @return
     */
        default PageInfo<T> page(int pageNum, int pageSize, T domain){
        return  null;
    }
}
