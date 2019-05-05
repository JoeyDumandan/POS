package com.atoysporkchop.order.api;

import java.io.Serializable;

public class TocinoAPI implements Serializable {

    private Integer totalTocinoSold;
    private Integer totalTocinoAvailable;
    private Double totalTocinoSales;

    public Integer getTotalTocinoSold() {
        return totalTocinoSold;
    }

    public void setTotalTocinoSold(Integer totalTocinoSold) {
        this.totalTocinoSold = totalTocinoSold;
    }

    public Integer getTotalTocinoAvailable() {
        return totalTocinoAvailable;
    }

    public void setTotalTocinoAvailable(Integer totalTocinoAvailable) {
        this.totalTocinoAvailable = totalTocinoAvailable;
    }

    public Double getTotalTocinoSales() {
        return totalTocinoSales;
    }

    public void setTotalTocinoSales(Double totalTocinoSales) {
        this.totalTocinoSales = totalTocinoSales;
    }

    @Override
    public String toString() {
        return "TocinoAPI{" +
                "totalTocinoSold=" + totalTocinoSold +
                ", totalTocinoAvailable=" + totalTocinoAvailable +
                ", totalTocinoSales=" + totalTocinoSales +
                '}';
    }

}
