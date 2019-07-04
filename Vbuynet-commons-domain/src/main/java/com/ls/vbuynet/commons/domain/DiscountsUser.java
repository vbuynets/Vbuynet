package com.ls.vbuynet.commons.domain;

import com.ls.vbuynet.commons.dto.AbstractBaseDomain;

import javax.persistence.*;

@Table(name = "discounts_user")
public class DiscountsUser  extends AbstractBaseDomain {
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