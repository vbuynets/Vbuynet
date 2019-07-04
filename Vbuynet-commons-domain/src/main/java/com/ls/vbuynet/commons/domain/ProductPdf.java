package com.ls.vbuynet.commons.domain;

import com.ls.vbuynet.commons.dto.AbstractBaseDomain;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "product_pdf")
public class ProductPdf extends AbstractBaseDomain {


    /**
     * 专区类型名称
     */
    @Column(name = "typeName")
    private String typename;

    /**
     * 获取专区类型名称
     *
     * @return typeName - 专区类型名称
     */
    public String getTypename() {
        return typename;
    }

    /**
     * 设置专区类型名称
     *
     * @param typename 专区类型名称
     */
    public void setTypename(String typename) {
        this.typename = typename;
    }
}