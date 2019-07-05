package com.ls.vbuynet.service.provider.qq.service;

import com.ls.vbuynet.commons.domain.Validation;
import com.ls.vbuynet.commons.mapper.ValidationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

@Service
public class VbuynetQQServiceImpl implements VbuynetQQService{

    @Autowired
    private ValidationMapper validationMapper;

    @Override
    public Validation condition(int id) {
        Example example=new Example(Validation.class);
        example.createCriteria().andEqualTo("id",id);
        Validation validation = validationMapper.selectByPrimaryKey(example);
        return validation;
    }
}
