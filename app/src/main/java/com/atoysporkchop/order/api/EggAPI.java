package com.atoysporkchop.order.api;

import java.io.Serializable;

public class EggAPI implements Serializable {

    private Integer totalEggSold;
    private Integer totalEggAvailable;
    private Double totalEggSales;

    public Integer getTotalEggSold() {
        return totalEggSold;
    }

    public void setTotalEggSold(Integer totalEggSold) {
        this.totalEggSold = totalEggSold;
    }

    public Integer getTotalEggAvailable() {
        return totalEggAvailable;
    }

    public void setTotalEggAvailable(Integer totalEggAvailable) {
        this.totalEggAvailable = totalEggAvailable;
    }

    public Double getTotalEggSales() {
        return totalEggSales;
    }

    public void setTotalEggSales(Double totalEggSales) {
        this.totalEggSales = totalEggSales;
    }

    @Override
    public String toString() {
        return "EggAPI{" +
                "totalEggSold=" + totalEggSold +
                ", totalEggAvailable=" + totalEggAvailable +
                ", totalEggSales=" + totalEggSales +
                '}';
    }

}
