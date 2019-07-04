package com.ls.vbuynet.commons.domain;

import com.ls.vbuynet.commons.dto.AbstractBaseDomain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "product_comments")
public class ProductComments  extends AbstractBaseDomain {

    /**
     * 商品Id
     */
    @Column(name = "productId")
    private Integer productid;

    /**
     * 评论用户Id
     */
    @Column(name = "userId")
    private Integer userid;

    /**
     * 评论描述
     */
    @Column(name = "PCDesc")
    private String pcdesc;

    /**
     * 评论时间
     */
    @Column(name = "PCDate")
    private Date pcdate;

    /**
     * 评论状态Id
     */
    @Column(name = "PSId")
    private Integer psid;



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
     * 获取评论用户Id
     *
     * @return userId - 评论用户Id
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置评论用户Id
     *
     * @param userid 评论用户Id
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 获取评论描述
     *
     * @return PCDesc - 评论描述
     */
    public String getPcdesc() {
        return pcdesc;
    }

    /**
     * 设置评论描述
     *
     * @param pcdesc 评论描述
     */
    public void setPcdesc(String pcdesc) {
        this.pcdesc = pcdesc;
    }

    /**
     * 获取评论时间
     *
     * @return PCDate - 评论时间
     */
    public Date getPcdate() {
        return pcdate;
    }

    /**
     * 设置评论时间
     *
     * @param pcdate 评论时间
     */
    public void setPcdate(Date pcdate) {
        this.pcdate = pcdate;
    }

    /**
     * 获取评论状态Id
     *
     * @return PSId - 评论状态Id
     */
    public Integer getPsid() {
        return psid;
    }

    /**
     * 设置评论状态Id
     *
     * @param psid 评论状态Id
     */
    public void setPsid(Integer psid) {
        this.psid = psid;
    }
}