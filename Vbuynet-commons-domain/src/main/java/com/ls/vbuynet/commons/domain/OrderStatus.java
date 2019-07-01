package com.ls.vbuynet.commons.domain;

import com.ls.vbuynet.commons.domain.domain.BaseDomain;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "order_status")
public class OrderStatus  extends BaseDomain implements Serializable {
    /**
     * 订单状态表Id
     */


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