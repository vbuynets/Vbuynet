package com.ls.vbuynet.commons.domain;

import javax.persistence.*;

@Table(name = "sl..discounts_user")
public class DiscountsUser {
    /**
     * 用户优惠券Id
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
     * 优惠券Id
     */
    @Column(name = "dicconutsId")
    private Integer dicconutsid;

    /**
     * unknownstate:优惠券状态优惠券状态(1未使用,2,已使用3,已过期)
     */
    private String unkonwnstate;

    /**
     * 获取用户优惠券Id
     *
     * @return Id - 用户优惠券Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户优惠券Id
     *
     * @param id 用户优惠券Id
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
     * 获取优惠券Id
     *
     * @return dicconutsId - 优惠券Id
     */
    public Integer getDicconutsid() {
        return dicconutsid;
    }

    /**
     * 设置优惠券Id
     *
     * @param dicconutsid 优惠券Id
     */
    public void setDicconutsid(Integer dicconutsid) {
        this.dicconutsid = dicconutsid;
    }

    /**
     * 获取unknownstate:优惠券状态优惠券状态(1未使用,2,已使用3,已过期)
     *
     * @return unkonwnstate - unknownstate:优惠券状态优惠券状态(1未使用,2,已使用3,已过期)
     */
    public String getUnkonwnstate() {
        return unkonwnstate;
    }

    /**
     * 设置unknownstate:优惠券状态优惠券状态(1未使用,2,已使用3,已过期)
     *
     * @param unkonwnstate unknownstate:优惠券状态优惠券状态(1未使用,2,已使用3,已过期)
     */
    public void setUnkonwnstate(String unkonwnstate) {
        this.unkonwnstate = unkonwnstate;
    }
}