package com.ls.vbuynet.commons.domain;

import javax.persistence.*;

@Table(name = "sl..site")
public class Site {
    /**
     * 地址Id
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
     * 收货人姓名
     */
    @Column(name = "consigneeName")
    private String consigneename;

    /**
     * 所在地
     */
    @Column(name = "siteName")
    private String sitename;

    /**
     * 详细地址
     */
    @Column(name = "consigneeSize")
    private String consigneesize;

    /**
     * 手机号码
     */
    private Integer cellphone;

    /**
     * 电话号码
     */
    private Integer phone;

    /**
     * 获取地址Id
     *
     * @return Id - 地址Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置地址Id
     *
     * @param id 地址Id
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
     * 获取收货人姓名
     *
     * @return consigneeName - 收货人姓名
     */
    public String getConsigneename() {
        return consigneename;
    }

    /**
     * 设置收货人姓名
     *
     * @param consigneename 收货人姓名
     */
    public void setConsigneename(String consigneename) {
        this.consigneename = consigneename;
    }

    /**
     * 获取所在地
     *
     * @return siteName - 所在地
     */
    public String getSitename() {
        return sitename;
    }

    /**
     * 设置所在地
     *
     * @param sitename 所在地
     */
    public void setSitename(String sitename) {
        this.sitename = sitename;
    }

    /**
     * 获取详细地址
     *
     * @return consigneeSize - 详细地址
     */
    public String getConsigneesize() {
        return consigneesize;
    }

    /**
     * 设置详细地址
     *
     * @param consigneesize 详细地址
     */
    public void setConsigneesize(String consigneesize) {
        this.consigneesize = consigneesize;
    }

    /**
     * 获取手机号码
     *
     * @return cellphone - 手机号码
     */
    public Integer getCellphone() {
        return cellphone;
    }

    /**
     * 设置手机号码
     *
     * @param cellphone 手机号码
     */
    public void setCellphone(Integer cellphone) {
        this.cellphone = cellphone;
    }

    /**
     * 获取电话号码
     *
     * @return phone - 电话号码
     */
    public Integer getPhone() {
        return phone;
    }

    /**
     * 设置电话号码
     *
     * @param phone 电话号码
     */
    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}