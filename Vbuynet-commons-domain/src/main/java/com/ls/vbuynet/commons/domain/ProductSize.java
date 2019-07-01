package com.ls.vbuynet.commons.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sl..product_size")
public class ProductSize {
    /**
     * 尺寸Id,不同商品size显示的值不同
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 尺寸说明:M L XL 中 大 等等
     */
    private String size;

    /**
     * 获取尺寸Id,不同商品size显示的值不同
     *
     * @return id - 尺寸Id,不同商品size显示的值不同
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置尺寸Id,不同商品size显示的值不同
     *
     * @param id 尺寸Id,不同商品size显示的值不同
     */
    public void setId(Integer id) {
        this.id = id;
    }

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