package com.atoysporkchop.order.impl;

import com.atoysporkchop.order.api.OrderAPI;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

public class OrderImpl {

    public OrderAPI processOrder(OrderAPI order) {

        OrderAPI orderAPI = new OrderAPI();

        if (order != null) {

            if(StringUtils.isNotEmpty(order.getOrderType())) {
                orderAPI.setOrderType(order.getOrderType());
            }

            if(CollectionUtils.isNotEmpty(order.getOrderList())) {

            }

        }

        return orderAPI;

    }
}
