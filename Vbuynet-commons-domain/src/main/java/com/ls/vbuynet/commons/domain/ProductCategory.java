package com.ls.vbuynet.commons.domain;

import javax.persistence.*;

@Table(name = "sl..product_category")
public class ProductCategory {
    /**
     * 分类Id
     */
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 父级分类名称
     */
    @Column(name = "cateName")
    private String catename;

    /**
     * 父级分类标识
     */
    @Column(name = "parentId")
    private Integer parentid;

    /**
     * 当前分类所属分类等级
     */
    private Integer type;

    /**
     * 获取分类Id
     *
     * @return Id - 分类Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置分类Id
     *
     * @param id 分类Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取父级分类名称
     *
     * @return cateName - 父级分类名称
     */
    public String getCatename() {
        return catename;
    }

    /**
     * 设置父级分类名称
     *
     * @param catename 父级分类名称
     */
    public void setCatename(String catename) {
        this.catename = catename;
    }

    /**
     * 获取父级分类标识
     *
     * @return parentId - 父级分类标识
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * 设置父级分类标识
     *
     * @param parentid 父级分类标识
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * 获取当前分类所属分类等级
     *
     * @return type - 当前分类所属分类等级
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置当前分类所属分类等级
     *
     * @param type 当前分类所属分类等级
     */
    public void setType(Integer type) {
        this.type = type;
    }
}