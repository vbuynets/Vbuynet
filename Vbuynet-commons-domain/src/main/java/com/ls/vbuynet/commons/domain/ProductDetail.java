package com.ls.vbuynet.commons.domain;


import com.ls.vbuynet.commons.dto.AbstractBaseDomain;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "product_detail")
public class ProductDetail extends AbstractBaseDomain {
    /**
     * 商品详情表
     */

    /**
     * 商品Id
     */
    @Column(name = "productId")
    private Integer productid;

    /**
     * 商品编号
     */
    @Column(name = "productCode")
    private String productcode;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 销售个数
     */
    private Integer sales;

    /**
     * 赠送积分
     */
    private Integer integral;

    /**
     * 商品描述
     */
    @Column(name = "product_describe")
    private String productDescribe;


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
     * 获取商品编号
     *
     * @return productCode - 商品编号
     */
    public String getProductcode() {
        return productcode;
    }

    /**
     * 设置商品编号
     *
     * @param productcode 商品编号
     */
    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    /**
     * 获取库存
     *
     * @return stock - 库存
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 设置库存
     *
     * @param stock 库存
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * 获取销售个数
     *
     * @return sales - 销售个数
     */
    public Integer getSales() {
        return sales;
    }

    /**
     * 设置销售个数
     *
     * @param sales 销售个数
     */
    public void setSales(Integer sales) {
        this.sales = sales;
    }

    /**
     * 获取赠送积分
     *
     * @return integral - 赠送积分
     */
    public Integer getIntegral() {
        return integral;
    }

    /**
     * 设置赠送积分
     *
     * @param integral 赠送积分
     */
    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    /**
     * 获取商品描述
     *
     * @return product_describe - 商品描述
     */
    public String getProductDescribe() {
        return productDescribe;
    }

    /**
     * 设置商品描述
     *
     * @param productDescribe 商品描述
     */
    public void setProductDescribe(String productDescribe) {
        this.productDescribe = productDescribe;
    }
}