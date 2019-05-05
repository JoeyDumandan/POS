package com.atoysporkchop.order.api;

import java.io.Serializable;

public class PorkchopAPI implements Serializable {

    private Integer totalPorkchopSold;
    private Integer totalPorkchopAvailable;
    private Double totalPorkchopSales;

    public Integer getTotalPorkchopSold() {
        return totalPorkchopSold;
    }

    public void setTotalPorkchopSold(Integer totalPorkchopSold) {
        this.totalPorkchopSold = totalPorkchopSold;
    }

    public Integer getTotalPorkchopAvailable() {
        return totalPorkchopAvailable;
    }

    public void setTotalPorkchopAvailable(Integer totalPorkchopAvailable) {
        this.totalPorkchopAvailable = totalPorkchopAvailable;
    }

    public Double getTotalPorkchopSales() {
        return totalPorkchopSales;
    }

    public void setTotalPorkchopSales(Double totalPorkchopSales) {
        this.totalPorkchopSales = totalPorkchopSales;
    }

    @Override
    public String toString() {
        return "PorkchopAPI{" +
                "totalPorkchopSold=" + totalPorkchopSold +
                ", totalPorkchopAvailable=" + totalPorkchopAvailable +
                ", totalPorkchopSales=" + totalPorkchopSales +
                '}';
    }

}
