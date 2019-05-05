package com.atoysporkchop.order.api;

import java.io.Serializable;

public class GrilledSpareribsAPI implements Serializable {

    private Integer totalGrilledSpareribsSold;
    private Integer totalGrilledSpareribsAvailable;
    private Double totalGrilledSpareribsSales;

    public Integer getTotalGrilledSpareribsSold() {
        return totalGrilledSpareribsSold;
    }

    public void setTotalGrilledSpareribsSold(Integer totalGrilledSpareribsSold) {
        this.totalGrilledSpareribsSold = totalGrilledSpareribsSold;
    }

    public Integer getTotalGrilledSpareribsAvailable() {
        return totalGrilledSpareribsAvailable;
    }

    public void setTotalGrilledSpareribsAvailable(Integer totalGrilledSpareribsAvailable) {
        this.totalGrilledSpareribsAvailable = totalGrilledSpareribsAvailable;
    }

    public Double getTotalGrilledSpareribsSales() {
        return totalGrilledSpareribsSales;
    }

    public void setTotalGrilledSpareribsSales(Double totalGrilledSpareribsSales) {
        this.totalGrilledSpareribsSales = totalGrilledSpareribsSales;
    }

    @Override
    public String toString() {
        return "GrilledSpareribsAPI{" +
                "totalGrilledSpareribsSold=" + totalGrilledSpareribsSold +
                ", totalGrilledSpareribsAvailable=" + totalGrilledSpareribsAvailable +
                ", totalGrilledSpareribsSales=" + totalGrilledSpareribsSales +
                '}';
    }

}
