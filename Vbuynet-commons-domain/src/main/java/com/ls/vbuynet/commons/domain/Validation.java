package com.ls.vbuynet.commons.domain;

import javax.persistence.*;

@Table(name = "sl..validation")
public class Validation {
    /**
     * QQ客服Id
     */
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * qq客服账号
     */
    private Integer qq;

    /**
     * 获取QQ客服Id
     *
     * @return Id - QQ客服Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置QQ客服Id
     *
     * @param id QQ客服Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取qq客服账号
     *
     * @return qq - qq客服账号
     */
    public Integer getQq() {
        return qq;
    }

    /**
     * 设置qq客服账号
     *
     * @param qq qq客服账号
     */
    public void setQq(Integer qq) {
        this.qq = qq;
    }
}