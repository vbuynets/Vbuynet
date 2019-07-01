package com.ls.vbuynet.commons.domain;

import javax.persistence.*;

@Table(name = "sl..order_status")
public class OrderStatus {
    /**
     * 订单状态表Id
     */
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 订单状态示例
     */
    @Column(name = "statusName")
    private String statusname;

    /**
     * 获取订单状态表Id
     *
     * @return Id - 订单状态表Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置订单状态表Id
     *
     * @param id 订单状态表Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

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