package com.ls.vbuynet.commons.domain;

import com.ls.vbuynet.commons.domain.domain.BaseDomain;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "county")
public class County  extends BaseDomain implements Serializable {
    /**
     * 区县Id
     */


    /**
     * 当前省，市，县名称
     */
    private String name;

    /**
     * 上一级地区ID
     */
    @Column(name = "parentId")
    private Integer parentid;


    /**
     * 获取当前省，市，县名称
     *
     * @return name - 当前省，市，县名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置当前省，市，县名称
     *
     * @param name 当前省，市，县名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取上一级地区ID
     *
     * @return parentId - 上一级地区ID
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * 设置上一级地区ID
     *
     * @param parentid 上一级地区ID
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}