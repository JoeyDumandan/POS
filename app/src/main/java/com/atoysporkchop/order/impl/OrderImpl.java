package com.atoysporkchop.order.impl;

import android.content.Context;
import android.content.res.Resources;

import com.atoysporkchop.R;
import com.atoysporkchop.order.api.OrderAPI;
import com.atoysporkchop.order.api.TotalAPI;
import com.atoysporkchop.order.constants.AtoysConstants;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.map.HashedMap;
import org.apache.commons.lang3.StringUtils;

public class OrderImpl {

    public OrderAPI processOrder(Context context, OrderAPI order, TotalAPI totalAPI) {

        OrderAPI orderAPI = new OrderAPI();
        Resources res = context.getResources();

        if (order != null) {
            if(StringUtils.isNotEmpty(order.getOrderType())) {
                orderAPI.setOrderType(order.getOrderType());
                if(res.getString(R.string.takeOut).equals(order.getOrderType())) {
                    Integer numberOfItems = 0;
                    if(CollectionUtils.isNotEmpty(order.getOrderList())) {
                        for(HashedMap<String, Integer> item :  order.getOrderList()) {

                            if(item.containsKey(res.getString(R.string.porkchop))) {
                                Integer quantity = item.get(res.getString(R.string.porkchop));
                                numberOfItems = numberOfItems + quantity;

                                totalAPI.getPorkchopAPI().setTotalPorkchopSold(
                                        totalAPI.getPorkchopAPI().getTotalPorkchopSold()
                                                + quantity);
                                totalAPI.getPorkchopAPI().setTotalPorkchopAvailable(
                                        totalAPI.getPorkchopAPI().getTotalPorkchopAvailable()
                                                - quantity);
                                totalAPI.getPorkchopAPI().setTotalPorkchopSales(
                                        totalAPI.getPorkchopAPI().getTotalPorkchopSales()
                                                + quantity*AtoysConstants.PORKCHOP_MEAL
                                                + AtoysConstants.TAKE_OUT_FEE);
                            }

                            if(item.containsKey(res.getString(R.string.tapa))) {
                                Integer quantity = item.get(res.getString(R.string.tapa));
                                numberOfItems = numberOfItems + quantity;

                                totalAPI.getTapaAPI().setTotalTapaSold(
                                        totalAPI.getTapaAPI().getTotalTapaSold()
                                                + quantity);
                                totalAPI.getTapaAPI().setTotalTapaAvailable(
                                        totalAPI.getTapaAPI().getTotalTapaAvailable()
                                                - quantity);
                                totalAPI.getTapaAPI().setTotalTapaSales(
                                        totalAPI.getTapaAPI().getTotalTapaSales()
                                                + quantity*AtoysConstants.TAPA_MEAL
                                                + AtoysConstants.TAKE_OUT_FEE);
                            }

                            if(item.containsKey(res.getString(R.string.tocino))) {
                                Integer quantity = item.get(res.getString(R.string.tocino));
                                numberOfItems = numberOfItems + quantity;

                                totalAPI.getTocinoAPI().setTotalTocinoSold(
                                        totalAPI.getTocinoAPI().getTotalTocinoSold()
                                                + quantity);
                                totalAPI.getTocinoAPI().setTotalTocinoAvailable(
                                        totalAPI.getTocinoAPI().getTotalTocinoAvailable()
                                                - quantity);
                                totalAPI.getTocinoAPI().setTotalTocinoSales(
                                        totalAPI.getTocinoAPI().getTotalTocinoSales()
                                                + quantity*AtoysConstants.TOCINO_MEAL
                                                + AtoysConstants.TAKE_OUT_FEE);
                            }

                        }
                    }

                }
            }
        }
        return orderAPI;
    }
}
