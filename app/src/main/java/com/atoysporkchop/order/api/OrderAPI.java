package com.atoysporkchop.order.api;

import java.io.Serializable;
import java.util.List;

public class OrderAPI implements Serializable {

    private Integer orderNumber;
    private List<String> orderList;
    private String orderType;

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public List<String> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<String> orderList) {
        this.orderList = orderList;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    @Override
    public String toString() {
        return "OrderAPI{" +
                "orderNumber=" + orderNumber +
                ", orderList=" + orderList +
                ", orderType='" + orderType + '\'' +
                '}';
    }

}
