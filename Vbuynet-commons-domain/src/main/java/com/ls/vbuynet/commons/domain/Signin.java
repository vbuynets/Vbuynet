package com.ls.vbuynet.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "sl..signin")
public class Signin {
    /**
     * 签到Id
     */
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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
     * 获取签到Id
     *
     * @return Id - 签到Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置签到Id
     *
     * @param id 签到Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

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