package com.ls.vbuynet.commons.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "sl..product_discount")
public class ProductDiscount {
    /**
     * 折扣Id
     */
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 折扣点数
     */
    private BigDecimal unmber;

    /**
     * 获取折扣Id
     *
     * @return Id - 折扣Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置折扣Id
     *
     * @param id 折扣Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取折扣点数
     *
     * @return unmber - 折扣点数
     */
    public BigDecimal getUnmber() {
        return unmber;
    }

    /**
     * 设置折扣点数
     *
     * @param unmber 折扣点数
     */
    public void setUnmber(BigDecimal unmber) {
        this.unmber = unmber;
    }
}