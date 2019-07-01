package com.ls.vbuynet.commons.domain;

import com.ls.vbuynet.commons.domain.domain.BaseDomain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Table(name = "product_discount")
public class ProductDiscount  extends BaseDomain implements Serializable {
    /**
     * 折扣Id
     */

    /**
     * 折扣点数
     */
    private BigDecimal unmber;

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