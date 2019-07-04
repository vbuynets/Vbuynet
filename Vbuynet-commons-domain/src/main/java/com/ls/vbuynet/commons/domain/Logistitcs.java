package com.ls.vbuynet.commons.domain;

import com.ls.vbuynet.commons.dto.AbstractBaseDomain;

import javax.persistence.*;

@Table(name = "logistitcs")
public class Logistitcs  extends AbstractBaseDomain {

    @Column(name = "logistitcs_code")
    private String logistitcsCode;

    @Column(name = "order_code")
    private String orderCode;

    @Column(name = "order_status_id")
    private Integer orderStatusId;

    /**
     * @return logistitcs_code
     */
    public String getLogistitcsCode() {
        return logistitcsCode;
    }

    /**
     * @param logistitcsCode
     */
    public void setLogistitcsCode(String logistitcsCode) {
        this.logistitcsCode = logistitcsCode;
    }

    /**
     * @return order_code
     */
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * @param orderCode
     */
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    /**
     * @return order_status_id
     */
    public Integer getOrderStatusId() {
        return orderStatusId;
    }

    /**
     * @param orderStatusId
     */
    public void setOrderStatusId(Integer orderStatusId) {
        this.orderStatusId = orderStatusId;
    }
}