package com.ls.vbuynet.commons.mapper;

import com.ls.vbuynet.commons.domain.Product;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

public interface ProductMapper extends MyMapper<Product> {
    default List<Product> selectAll() {
        return null;
    }
}