package com.ls.vbuynet.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "sl..cart")
public class Cart {
    /**
     * 购物车Id
     */
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 商品Id
     */
    @Column(name = "productId")
    private Integer productid;

    /**
     * 用户Id
     */
    @Column(name = "userId")
    private Integer userid;

    /**
     * 购买数量
     */
    private Integer number;

    /**
     * 加入时间
     */
    private Date jointime;

    /**
     * 获取购物车Id
     *
     * @return Id - 购物车Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置购物车Id
     *
     * @param id 购物车Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取商品Id
     *
     * @return productId - 商品Id
     */
    public Integer getProductid() {
        return productid;
    }

    /**
     * 设置商品Id
     *
     * @param productid 商品Id
     */
    public void setProductid(Integer productid) {
        this.productid = productid;
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
     * 获取购买数量
     *
     * @return number - 购买数量
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置购买数量
     *
     * @param number 购买数量
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 获取加入时间
     *
     * @return jointime - 加入时间
     */
    public Date getJointime() {
        return jointime;
    }

    /**
     * 设置加入时间
     *
     * @param jointime 加入时间
     */
    public void setJointime(Date jointime) {
        this.jointime = jointime;
    }
}