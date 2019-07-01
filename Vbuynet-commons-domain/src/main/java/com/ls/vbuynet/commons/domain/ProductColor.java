package com.ls.vbuynet.commons.domain;

import javax.persistence.*;

@Table(name = "sl..product_color")
public class ProductColor {
    /**
     * 颜色Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 比如: 黑色 白色 绿色
     */
    @Column(name = "colorName")
    private String colorname;

    /**
     * 获取颜色Id
     *
     * @return id - 颜色Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置颜色Id
     *
     * @param id 颜色Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

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