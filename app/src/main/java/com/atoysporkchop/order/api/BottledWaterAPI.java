package com.atoysporkchop.order.api;

import java.io.Serializable;

public class BottledWaterAPI implements Serializable {

    private Integer totalBottledWaterSold;
    private Integer totalBottledWaterAvailable;
    private Double totalBottledWaterSales;

    public Integer getTotalBottledWaterSold() {
        return totalBottledWaterSold;
    }

    public void setTotalBottledWaterSold(Integer totalBottledWaterSold) {
        this.totalBottledWaterSold = totalBottledWaterSold;
    }

    public Integer getTotalBottledWaterAvailable() {
        return totalBottledWaterAvailable;
    }

    public void setTotalBottledWaterAvailable(Integer totalBottledWaterAvailable) {
        this.totalBottledWaterAvailable = totalBottledWaterAvailable;
    }

    public Double getTotalBottledWaterSales() {
        return totalBottledWaterSales;
    }

    public void setTotalBottledWaterSales(Double totalBottledWaterSales) {
        this.totalBottledWaterSales = totalBottledWaterSales;
    }

    @Override
    public String toString() {
        return "BottledWaterAPI{" +
                "totalBottledWaterSold=" + totalBottledWaterSold +
                ", totalBottledWaterAvailable=" + totalBottledWaterAvailable +
                ", totalBottledWaterSales=" + totalBottledWaterSales +
                '}';
    }

}
