package com.ls.vbuynet.commons.domain;

import com.ls.vbuynet.commons.domain.domain.BaseDomain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Table(name = "capital")
public class Capital extends BaseDomain implements Serializable {
    /**
     * 资金表
     */


    /**
     * 用户资金
     */
    private BigDecimal banlance;

    /**
     * 所属用户
     */
    @Column(name = "userId")
    private Integer userid;

    /**
     * 备注
     */
    private String desc;


    /**
     * 获取用户资金
     *
     * @return banlance - 用户资金
     */
    public BigDecimal getBanlance() {
        return banlance;
    }

    /**
     * 设置用户资金
     *
     * @param banlance 用户资金
     */
    public void setBanlance(BigDecimal banlance) {
        this.banlance = banlance;
    }

    /**
     * 获取所属用户
     *
     * @return userId - 所属用户
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置所属用户
     *
     * @param userid 所属用户
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 获取备注
     *
     * @return desc - 备注
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置备注
     *
     * @param desc 备注
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
}