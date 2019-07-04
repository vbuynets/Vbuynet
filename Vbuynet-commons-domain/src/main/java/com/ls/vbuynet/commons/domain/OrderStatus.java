package com.ls.vbuynet.commons.domain;

import com.ls.vbuynet.commons.dto.AbstractBaseDomain;

import javax.persistence.*;

@Table(name = "order_status")
public class OrderStatus  extends AbstractBaseDomain {

    /**
     * 订单状态示例
     */
    @Column(name = "statusName")
    private String statusname;



    /**
     * 获取订单状态示例
     *
     * @return statusName - 订单状态示例
     */
    public String getStatusname() {
        return statusname;
    }

    /**
     * 设置订单状态示例
     *
     * @param statusname 订单状态示例
     */
    public void setStatusname(String statusname) {
        this.statusname = statusname;
    }
}