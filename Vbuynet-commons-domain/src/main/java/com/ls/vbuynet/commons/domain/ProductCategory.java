package com.ls.vbuynet.commons.domain;

import com.ls.vbuynet.commons.domain.domain.BaseDomain;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "product_category")
public class ProductCategory  extends BaseDomain implements Serializable {
    /**
     * 分类Id
     */


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