package com.atoysporkchop.order.api;

import java.io.Serializable;

public class TakeOutAPI implements Serializable {

    private Integer totalTakeOut;

    public Integer getTotalTakeOut() {
        return totalTakeOut;
    }

    public void setTotalTakeOut(Integer totalTakeOut) {
        this.totalTakeOut = totalTakeOut;
    }

    @Override
    public String toString() {
        return "TakeOutAPI{" +
                "totalTakeOut=" + totalTakeOut +
                '}';
    }

}
