package com.ls.Vbuynet.commons.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ls.Vbuynet.commons.service.GeneralService;
import com.ls.vbuynet.commons.dto.AbstractBaseDomain;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.MyMapper;
import tk.mybatis.mapper.entity.Example;

import java.lang.reflect.ParameterizedType;
import java.util.Date;

/**
 * 通用的业务逻辑
 * @param <T>
 * @param <D>
 * name liang
 * date 2019/7/1 15:26
 */

/**
 * 通用的业务实现
 * @param <T>
 */
public class GeneralServiceImpl<T extends AbstractBaseDomain,M extends MyMapper<T>> implements GeneralService<T> {

    @Autowired
    protected  M mapper;
    //可以得到泛型得类型
    private Class<T> entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

    /**
     * 查询属性值是否存在
     * @param property
     * @param value
     * @return
     */
    @Override
    public Boolean unique(String property, String value) {
        Example example=new Example(entityClass);
        example.createCriteria().andEqualTo(property,value);
        int result=mapper.selectCountByExample(example);
        if(result>0){
            //说明存在
            return  false;
        }
        //不存在
        return true;
    }

    @Override
    public T save(T domain) {
        int result = 0;
        Date currentDate = new Date();

        // 创建
        if (domain.getId() == null) {

            /**
             * 用于自动回显 ID，领域模型中需要 @ID 注解的支持
             * {@link AbstractBaseDomain}
             */
            result = mapper.insertUseGeneratedKeys(domain);
        }

        // 更新
        else {
            result = mapper.updateByPrimaryKey(domain);
        }

        // 保存数据成功
        if (result > 0) {
            return domain;
        }

        // 保存数据失败
        return null;
    }


    @Override
    public PageInfo<T> page(int pageNum, int pageSize, T domain) {
        Example example =new Example(entityClass);
        example.createCriteria().andEqualTo(domain);//条件
        PageHelper.startPage(pageNum,pageSize);
        PageInfo<T> pageInfo=new PageInfo<>(mapper.selectByExample(example));
        return  pageInfo;
    }
}
