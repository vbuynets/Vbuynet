package com.ls.vbuynet.commons.domain;

import com.ls.vbuynet.commons.domain.domain.BaseDomain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "user")
public class User  extends BaseDomain implements Serializable {
    /**
     * 用户id
     */

    /**
     * 用户姓名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 性别
     */
    private String sex;

    /**
     * 电话
     */
    private Integer phone;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 用户积分
     */
    @Column(name = "userIntegral")
    private Integer userintegral;

    /**
     * 头像途径
     */
    @Column(name = "headerPictrue")
    private String headerpictrue;

    /**
     * 用户等级
     */
    private String level;



    /**
     * 默认收货Id
     */
    @Column(name = "siteId")
    private Integer siteid;


    /**
     * 获取用户姓名
     *
     * @return username - 用户姓名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户姓名
     *
     * @param username 用户姓名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取用户密码
     *
     * @return password - 用户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户密码
     *
     * @param password 用户密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取电话
     *
     * @return phone - 电话
     */
    public Integer getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    /**
     * 获取出生日期
     *
     * @return birthday - 出生日期
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置出生日期
     *
     * @param birthday 出生日期
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取用户积分
     *
     * @return userIntegral - 用户积分
     */
    public Integer getUserintegral() {
        return userintegral;
    }

    /**
     * 设置用户积分
     *
     * @param userintegral 用户积分
     */
    public void setUserintegral(Integer userintegral) {
        this.userintegral = userintegral;
    }

    /**
     * 获取头像途径
     *
     * @return headerPictrue - 头像途径
     */
    public String getHeaderpictrue() {
        return headerpictrue;
    }

    /**
     * 设置头像途径
     *
     * @param headerpictrue 头像途径
     */
    public void setHeaderpictrue(String headerpictrue) {
        this.headerpictrue = headerpictrue;
    }

    /**
     * 获取用户等级
     *
     * @return level - 用户等级
     */
    public String getLevel() {
        return level;
    }

    /**
     * 设置用户等级
     *
     * @param level 用户等级
     */
    public void setLevel(String level) {
        this.level = level;
    }


    /**
     * 获取默认收货Id
     *
     * @return siteId - 默认收货Id
     */
    public Integer getSiteid() {
        return siteid;
    }

    /**
     * 设置默认收货Id
     *
     * @param siteid 默认收货Id
     */
    public void setSiteid(Integer siteid) {
        this.siteid = siteid;
    }
}