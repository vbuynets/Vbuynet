package com.ls.vbuynet.commons.domain;

import javax.persistence.*;

@Table(name = "sl..notice")
public class Notice {
    /**
     * 公告Id
     */
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 详情
     */
    private String desc;

    /**
     * 获取公告Id
     *
     * @return Id - 公告Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置公告Id
     *
     * @param id 公告Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

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