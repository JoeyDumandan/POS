package com.atoysporkchop.order.api;

import java.io.Serializable;

public class SodaInCanAPI implements Serializable {

    private Integer totalSodaInCanSold;
    private Integer totalSodaInCanAvailable;
    private Double totalSodaInCanSales;

    public Integer getTotalSodaInCanSold() {
        return totalSodaInCanSold;
    }

    public void setTotalSodaInCanSold(Integer totalSodaInCanSold) {
        this.totalSodaInCanSold = totalSodaInCanSold;
    }

    public Integer getTotalSodaInCanAvailable() {
        return totalSodaInCanAvailable;
    }

    public void setTotalSodaInCanAvailable(Integer totalSodaInCanAvailable) {
        this.totalSodaInCanAvailable = totalSodaInCanAvailable;
    }

    public Double getTotalSodaInCanSales() {
        return totalSodaInCanSales;
    }

    public void setTotalSodaInCanSales(Double totalSodaInCanSales) {
        this.totalSodaInCanSales = totalSodaInCanSales;
    }

    @Override
    public String toString() {
        return "SodaInCanAPI{" +
                "totalSodaInCanSold=" + totalSodaInCanSold +
                ", totalSodaInCanAvailable=" + totalSodaInCanAvailable +
                ", totalSodaInCanSales=" + totalSodaInCanSales +
                '}';
    }

}
