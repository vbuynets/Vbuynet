package com.ls.vbuynet.commons.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "sl..discounts")
public class Discounts {
    /**
     * 优惠券Id
     */
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "smileMoney")
    private Integer smilemoney;

    @Column(name = "bigMoney")
    private Integer bigmoney;

    /**
     * 金额
     */
    private BigDecimal money;

    /**
     * 积分额数
     */
    private Integer limit;

    /**
     * 劵号
     */
    @Column(name = "Securities")
    private String securities;

    /**
     * 使用期限
     */
    private Date period;

    /**
     * 获取优惠券Id
     *
     * @return Id - 优惠券Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置优惠券Id
     *
     * @param id 优惠券Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return smileMoney
     */
    public Integer getSmilemoney() {
        return smilemoney;
    }

    /**
     * @param smilemoney
     */
    public void setSmilemoney(Integer smilemoney) {
        this.smilemoney = smilemoney;
    }

    /**
     * @return bigMoney
     */
    public Integer getBigmoney() {
        return bigmoney;
    }

    /**
     * @param bigmoney
     */
    public void setBigmoney(Integer bigmoney) {
        this.bigmoney = bigmoney;
    }

    /**
     * 获取金额
     *
     * @return money - 金额
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 设置金额
     *
     * @param money 金额
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * 获取积分额数
     *
     * @return limit - 积分额数
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * 设置积分额数
     *
     * @param limit 积分额数
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * 获取劵号
     *
     * @return Securities - 劵号
     */
    public String getSecurities() {
        return securities;
    }

    /**
     * 设置劵号
     *
     * @param securities 劵号
     */
    public void setSecurities(String securities) {
        this.securities = securities;
    }

    /**
     * 获取使用期限
     *
     * @return period - 使用期限
     */
    public Date getPeriod() {
        return period;
    }

    /**
     * 设置使用期限
     *
     * @param period 使用期限
     */
    public void setPeriod(Date period) {
        this.period = period;
    }
}