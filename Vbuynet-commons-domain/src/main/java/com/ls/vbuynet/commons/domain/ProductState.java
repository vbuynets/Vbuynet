package com.ls.vbuynet.commons.domain;

import javax.persistence.*;

@Table(name = "sl..product_state")
public class ProductState {
    /**
     * 评论状态Id
     */
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 评论总数
     */
    private Integer pquantity;

    /**
     * 好评总数
     */
    private Integer good;

    /**
     * 中评总数
     */
    private Integer centre;

    /**
     * 差评总数
     */
    private Integer poor;

    /**
     * 获取评论状态Id
     *
     * @return Id - 评论状态Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置评论状态Id
     *
     * @param id 评论状态Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取评论总数
     *
     * @return pquantity - 评论总数
     */
    public Integer getPquantity() {
        return pquantity;
    }

    /**
     * 设置评论总数
     *
     * @param pquantity 评论总数
     */
    public void setPquantity(Integer pquantity) {
        this.pquantity = pquantity;
    }

    /**
     * 获取好评总数
     *
     * @return good - 好评总数
     */
    public Integer getGood() {
        return good;
    }

    /**
     * 设置好评总数
     *
     * @param good 好评总数
     */
    public void setGood(Integer good) {
        this.good = good;
    }

    /**
     * 获取中评总数
     *
     * @return centre - 中评总数
     */
    public Integer getCentre() {
        return centre;
    }

    /**
     * 设置中评总数
     *
     * @param centre 中评总数
     */
    public void setCentre(Integer centre) {
        this.centre = centre;
    }

    /**
     * 获取差评总数
     *
     * @return poor - 差评总数
     */
    public Integer getPoor() {
        return poor;
    }

    /**
     * 设置差评总数
     *
     * @param poor 差评总数
     */
    public void setPoor(Integer poor) {
        this.poor = poor;
    }
}