package com.atoysporkchop.order.api;

import org.apache.commons.collections4.map.HashedMap;

import java.io.Serializable;
import java.util.List;

public class OrderAPI implements Serializable {

    private Integer orderNumber;
    private List<HashedMap<String, Integer>> orderList;
    private String orderType;

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public List<HashedMap<String, Integer>> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<HashedMap<String, Integer>> orderList) {
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
