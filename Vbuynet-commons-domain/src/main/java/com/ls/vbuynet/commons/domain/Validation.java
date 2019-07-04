package com.ls.vbuynet.commons.domain;


import com.ls.vbuynet.commons.dto.AbstractBaseDomain;

import javax.persistence.*;

@Table(name = "validation")
public class Validation  extends AbstractBaseDomain {

    /**
     * qq客服账号
     */
    private Integer qq;


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