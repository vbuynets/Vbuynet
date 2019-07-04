package com.ls.vbuynet.commons.domain;


import com.ls.vbuynet.commons.dto.AbstractBaseDomain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "order")
public class Order extends AbstractBaseDomain {
    /**
     * 订单Id
     */
    /**
     * 用户Id
     */
    @Column(name = "userId")
    private Integer userid;

    /**
     * 订单收货地址Id
     */
    @Column(name = "siteId")
    private Integer siteid;

    /**
     * 交易时间
     */
    private Date datetime;

    /**
     * 交易号
     */
    @Column(name = "transtaionId")
    private Integer transtaionid;

    /**
     * 可使用优惠券
     */
    @Column(name = "discountsId")
    private Integer discountsid;

    /**
     * 已优惠价格
     */
    @Column(name = "discountsPrice")
    private BigDecimal discountsprice;

    /**
     * 订单总价格
     */
    @Column(name = "alwasMoney")
    private BigDecimal alwasmoney;

    /**
     * 可获得积分
     */
    @Column(name = "getIntegral")
    private Integer getintegral;

    /**
     * 订单状态Id
     */
    private Integer status;

    @Column(name = "order_code")
    private String orderCode;

    /**
     * 用户名称
     */
    @Column(name = "userName")
    private byte[] username;



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
     * 获取订单收货地址Id
     *
     * @return siteId - 订单收货地址Id
     */
    public Integer getSiteid() {
        return siteid;
    }

    /**
     * 设置订单收货地址Id
     *
     * @param siteid 订单收货地址Id
     */
    public void setSiteid(Integer siteid) {
        this.siteid = siteid;
    }

    /**
     * 获取交易时间
     *
     * @return datetime - 交易时间
     */
    public Date getDatetime() {
        return datetime;
    }

    /**
     * 设置交易时间
     *
     * @param datetime 交易时间
     */
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    /**
     * 获取交易号
     *
     * @return transtaionId - 交易号
     */
    public Integer getTranstaionid() {
        return transtaionid;
    }

    /**
     * 设置交易号
     *
     * @param transtaionid 交易号
     */
    public void setTranstaionid(Integer transtaionid) {
        this.transtaionid = transtaionid;
    }

    /**
     * 获取可使用优惠券
     *
     * @return discountsId - 可使用优惠券
     */
    public Integer getDiscountsid() {
        return discountsid;
    }

    /**
     * 设置可使用优惠券
     *
     * @param discountsid 可使用优惠券
     */
    public void setDiscountsid(Integer discountsid) {
        this.discountsid = discountsid;
    }

    /**
     * 获取已优惠价格
     *
     * @return discountsPrice - 已优惠价格
     */
    public BigDecimal getDiscountsprice() {
        return discountsprice;
    }

    /**
     * 设置已优惠价格
     *
     * @param discountsprice 已优惠价格
     */
    public void setDiscountsprice(BigDecimal discountsprice) {
        this.discountsprice = discountsprice;
    }

    /**
     * 获取订单总价格
     *
     * @return alwasMoney - 订单总价格
     */
    public BigDecimal getAlwasmoney() {
        return alwasmoney;
    }

    /**
     * 设置订单总价格
     *
     * @param alwasmoney 订单总价格
     */
    public void setAlwasmoney(BigDecimal alwasmoney) {
        this.alwasmoney = alwasmoney;
    }

    /**
     * 获取可获得积分
     *
     * @return getIntegral - 可获得积分
     */
    public Integer getGetintegral() {
        return getintegral;
    }

    /**
     * 设置可获得积分
     *
     * @param getintegral 可获得积分
     */
    public void setGetintegral(Integer getintegral) {
        this.getintegral = getintegral;
    }

    /**
     * 获取订单状态Id
     *
     * @return status - 订单状态Id
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置订单状态Id
     *
     * @param status 订单状态Id
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return order_code
     */
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * @param orderCode
     */
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    /**
     * 获取用户名称
     *
     * @return userName - 用户名称
     */
    public byte[] getUsername() {
        return username;
    }

    /**
     * 设置用户名称
     *
     * @param username 用户名称
     */
    public void setUsername(byte[] username) {
        this.username = username;
    }
}