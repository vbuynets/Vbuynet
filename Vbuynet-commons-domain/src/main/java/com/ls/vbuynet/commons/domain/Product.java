package com.ls.vbuynet.commons.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "sl..product")
public class Product {
    /**
     * 商品Id
     */
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 商品编码
     */
    @Column(name = "product_code")
    private String productCode;

    /**
     * 商品名称
     */
    @Column(name = "product_Name")
    private String productName;

    /**
     * 商品价格
     */
    private BigDecimal price;

    /**
     * 价格
     */
    private Integer stock;

    /**
     * 一级分类
     */
    private Integer cate1;

    /**
     * 二级分类
     */
    private Integer cate2;

    /**
     * 三级分类
     */
    private Integer cate3;

    /**
     * 尺寸Id
     */
    @Column(name = "size_id")
    private Integer sizeId;

    /**
     * 颜色Id
     */
    @Column(name = "color_id")
    private Integer colorId;

    /**
     * 商品展示图片地址
     */
    @Column(name = "filePath")
    private String filepath;

    /**
     * 折扣Id
     */
    @Column(name = "pdfId")
    private Integer pdfid;

    /**
     * 折扣Id
     */
    @Column(name = "disconutId")
    private Integer disconutid;

    /**
     * 所需积分
     */
    @Column(name = "need_integral")
    private Integer needIntegral;

    /**
     * 人气
     */
    private Integer moods;

    /**
     * 销量
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
     * @return Id - 商品Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置商品Id
     *
     * @param id 商品Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取商品编码
     *
     * @return product_code - 商品编码
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * 设置商品编码
     *
     * @param productCode 商品编码
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * 获取商品名称
     *
     * @return product_Name - 商品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置商品名称
     *
     * @param productName 商品名称
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 获取商品价格
     *
     * @return price - 商品价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置商品价格
     *
     * @param price 商品价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取价格
     *
     * @return stock - 价格
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 设置价格
     *
     * @param stock 价格
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * 获取一级分类
     *
     * @return cate1 - 一级分类
     */
    public Integer getCate1() {
        return cate1;
    }

    /**
     * 设置一级分类
     *
     * @param cate1 一级分类
     */
    public void setCate1(Integer cate1) {
        this.cate1 = cate1;
    }

    /**
     * 获取二级分类
     *
     * @return cate2 - 二级分类
     */
    public Integer getCate2() {
        return cate2;
    }

    /**
     * 设置二级分类
     *
     * @param cate2 二级分类
     */
    public void setCate2(Integer cate2) {
        this.cate2 = cate2;
    }

    /**
     * 获取三级分类
     *
     * @return cate3 - 三级分类
     */
    public Integer getCate3() {
        return cate3;
    }

    /**
     * 设置三级分类
     *
     * @param cate3 三级分类
     */
    public void setCate3(Integer cate3) {
        this.cate3 = cate3;
    }

    /**
     * 获取尺寸Id
     *
     * @return size_id - 尺寸Id
     */
    public Integer getSizeId() {
        return sizeId;
    }

    /**
     * 设置尺寸Id
     *
     * @param sizeId 尺寸Id
     */
    public void setSizeId(Integer sizeId) {
        this.sizeId = sizeId;
    }

    /**
     * 获取颜色Id
     *
     * @return color_id - 颜色Id
     */
    public Integer getColorId() {
        return colorId;
    }

    /**
     * 设置颜色Id
     *
     * @param colorId 颜色Id
     */
    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    /**
     * 获取商品展示图片地址
     *
     * @return filePath - 商品展示图片地址
     */
    public String getFilepath() {
        return filepath;
    }

    /**
     * 设置商品展示图片地址
     *
     * @param filepath 商品展示图片地址
     */
    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    /**
     * 获取折扣Id
     *
     * @return pdfId - 折扣Id
     */
    public Integer getPdfid() {
        return pdfid;
    }

    /**
     * 设置折扣Id
     *
     * @param pdfid 折扣Id
     */
    public void setPdfid(Integer pdfid) {
        this.pdfid = pdfid;
    }

    /**
     * 获取折扣Id
     *
     * @return disconutId - 折扣Id
     */
    public Integer getDisconutid() {
        return disconutid;
    }

    /**
     * 设置折扣Id
     *
     * @param disconutid 折扣Id
     */
    public void setDisconutid(Integer disconutid) {
        this.disconutid = disconutid;
    }

    /**
     * 获取所需积分
     *
     * @return need_integral - 所需积分
     */
    public Integer getNeedIntegral() {
        return needIntegral;
    }

    /**
     * 设置所需积分
     *
     * @param needIntegral 所需积分
     */
    public void setNeedIntegral(Integer needIntegral) {
        this.needIntegral = needIntegral;
    }

    /**
     * 获取人气
     *
     * @return moods - 人气
     */
    public Integer getMoods() {
        return moods;
    }

    /**
     * 设置人气
     *
     * @param moods 人气
     */
    public void setMoods(Integer moods) {
        this.moods = moods;
    }

    /**
     * 获取销量
     *
     * @return sales - 销量
     */
    public Integer getSales() {
        return sales;
    }

    /**
     * 设置销量
     *
     * @param sales 销量
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