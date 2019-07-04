package com.ls.vbuynet.commons.domain;


import com.ls.vbuynet.commons.dto.AbstractBaseDomain;

import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "product_size")
public class ProductSize extends AbstractBaseDomain {


    /**
     * 尺寸说明:M L XL 中 大 等等
     */
    private String size;


    /**
     * 获取尺寸说明:M L XL 中 大 等等
     *
     * @return size - 尺寸说明:M L XL 中 大 等等
     */
    public String getSize() {
        return size;
    }

    /**
     * 设置尺寸说明:M L XL 中 大 等等
     *
     * @param size 尺寸说明:M L XL 中 大 等等
     */
    public void setSize(String size) {
        this.size = size;
    }
}