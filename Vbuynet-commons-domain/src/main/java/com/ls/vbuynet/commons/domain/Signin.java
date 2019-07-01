package com.ls.vbuynet.commons.domain;

import com.ls.vbuynet.commons.domain.domain.BaseDomain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "signin")
public class Signin  extends BaseDomain implements Serializable {
    /**
     * 签到Id
     */

    /**
     * 用户Id
     */
    @Column(name = "userId")
    private Integer userid;

    /**
     * 签到时间
     */
    private Date sigetime;

    /**
     * 连续签到
     */
    private Integer continuous;


    /**
     * 获取用户Id
     *
     * @return userId - 用户Id
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置用户Id
     *
     * @param userid 用户Id
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 获取签到时间
     *
     * @return sigetime - 签到时间
     */
    public Date getSigetime() {
        return sigetime;
    }

    /**
     * 设置签到时间
     *
     * @param sigetime 签到时间
     */
    public void setSigetime(Date sigetime) {
        this.sigetime = sigetime;
    }

    /**
     * 获取连续签到
     *
     * @return continuous - 连续签到
     */
    public Integer getContinuous() {
        return continuous;
    }

    /**
     * 设置连续签到
     *
     * @param continuous 连续签到
     */
    public void setContinuous(Integer continuous) {
        this.continuous = continuous;
    }
}