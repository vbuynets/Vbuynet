package com.ls.vbuynet.commons.domain;

import javax.persistence.*;

@Table(name = "sl..product_pdf")
public class ProductPdf {
    /**
     * 专区Id
     */
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 专区类型名称
     */
    @Column(name = "typeName")
    private String typename;

    /**
     * 获取专区Id
     *
     * @return Id - 专区Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置专区Id
     *
     * @param id 专区Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

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