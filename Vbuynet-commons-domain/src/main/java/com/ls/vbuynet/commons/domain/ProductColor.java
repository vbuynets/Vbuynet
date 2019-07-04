package com.ls.vbuynet.commons.domain;

import com.ls.vbuynet.commons.dto.AbstractBaseDomain;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "product_color")
public class ProductColor extends AbstractBaseDomain {
    /**
     * 比如: 黑色 白色 绿色
     */
    @Column(name = "colorName")
    private String colorname;

    /**
     * 获取比如: 黑色 白色 绿色
     *
     * @return colorName - 比如: 黑色 白色 绿色
     */
    public String getColorname() {
        return colorname;
    }

    /**
     * 设置比如: 黑色 白色 绿色
     *
     * @param colorname 比如: 黑色 白色 绿色
     */
    public void setColorname(String colorname) {
        this.colorname = colorname;
    }
}