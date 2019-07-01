package com.ls.vbuynet.commons.domain;

import com.ls.vbuynet.commons.domain.domain.BaseDomain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "product_status")
public class ProductStatus  extends BaseDomain implements Serializable {
    /**
     * 商品状态Id
     */

    /**
     * 商品状态（1,上架2，下架）
     */
    @Column(name = "statusId")
    private Integer statusid;

    /**
     * 上架时间
     */
    private Date shelvesdate;

    /**
     * 下架时间
     */
    @Column(name = "Theshelvesdate")
    private Date theshelvesdate;

    /**
     * 商品Id
     */
    @Column(name = "productId")
    private Integer productid;


    /**
     * 获取商品状态（1,上架2，下架）
     *
     * @return statusId - 商品状态（1,上架2，下架）
     */
    public Integer getStatusid() {
        return statusid;
    }

    /**
     * 设置商品状态（1,上架2，下架）
     *
     * @param statusid 商品状态（1,上架2，下架）
     */
    public void setStatusid(Integer statusid) {
        this.statusid = statusid;
    }

    /**
     * 获取上架时间
     *
     * @return shelvesdate - 上架时间
     */
    public Date getShelvesdate() {
        return shelvesdate;
    }

    /**
     * 设置上架时间
     *
     * @param shelvesdate 上架时间
     */
    public void setShelvesdate(Date shelvesdate) {
        this.shelvesdate = shelvesdate;
    }

    /**
     * 获取下架时间
     *
     * @return Theshelvesdate - 下架时间
     */
    public Date getTheshelvesdate() {
        return theshelvesdate;
    }

    /**
     * 设置下架时间
     *
     * @param theshelvesdate 下架时间
     */
    public void setTheshelvesdate(Date theshelvesdate) {
        this.theshelvesdate = theshelvesdate;
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
}