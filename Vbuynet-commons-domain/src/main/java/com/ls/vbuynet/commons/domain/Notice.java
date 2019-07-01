package com.ls.vbuynet.commons.domain;

import com.ls.vbuynet.commons.domain.domain.BaseDomain;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "notice")
public class Notice  extends BaseDomain implements Serializable {
    /**
     * 公告Id
     */


    /**
     * 标题
     */
    private String title;

    /**
     * 详情
     */
    private String desc;


    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取详情
     *
     * @return desc - 详情
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置详情
     *
     * @param desc 详情
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
}