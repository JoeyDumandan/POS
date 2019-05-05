package com.atoysporkchop.order.api;

import java.io.Serializable;

public class DineInAPI implements Serializable {

    private Integer totalDineIn;

    public Integer getTotalDineIn() {
        return totalDineIn;
    }

    public void setTotalDineIn(Integer totalDineIn) {
        this.totalDineIn = totalDineIn;
    }

    @Override
    public String toString() {
        return "DineInAPI{" +
                "totalDineIn=" + totalDineIn +
                '}';
    }

}
