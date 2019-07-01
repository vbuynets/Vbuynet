package com.ls.vbuynet.commons.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "sl..payment")
public class Payment {
    /**
     * 支付表Id
     */
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 订单Id
     */
    @Column(name = "orderId")
    private Integer orderid;

    /**
     * 交易号
     */
    @Column(name = "transtauinId")
    private Integer transtauinid;

    /**
     * 支付方式
     */
    @Column(name = "paymentType")
    private String paymenttype;

    /**
     * 用户Id
     */
    @Column(name = "userId")
    private Integer userid;

    /**
     * 支付金额
     */
    private BigDecimal money;

    /**
     * 获取支付表Id
     *
     * @return Id - 支付表Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置支付表Id
     *
     * @param id 支付表Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取订单Id
     *
     * @return orderId - 订单Id
     */
    public Integer getOrderid() {
        return orderid;
    }

    /**
     * 设置订单Id
     *
     * @param orderid 订单Id
     */
    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    /**
     * 获取交易号
     *
     * @return transtauinId - 交易号
     */
    public Integer getTranstauinid() {
        return transtauinid;
    }

    /**
     * 设置交易号
     *
     * @param transtauinid 交易号
     */
    public void setTranstauinid(Integer transtauinid) {
        this.transtauinid = transtauinid;
    }

    /**
     * 获取支付方式
     *
     * @return paymentType - 支付方式
     */
    public String getPaymenttype() {
        return paymenttype;
    }

    /**
     * 设置支付方式
     *
     * @param paymenttype 支付方式
     */
    public void setPaymenttype(String paymenttype) {
        this.paymenttype = paymenttype;
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
     * 获取支付金额
     *
     * @return money - 支付金额
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 设置支付金额
     *
     * @param money 支付金额
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}