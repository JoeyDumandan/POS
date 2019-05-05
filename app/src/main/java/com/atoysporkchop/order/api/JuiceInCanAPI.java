package com.atoysporkchop.order.api;

import java.io.Serializable;

public class JuiceInCanAPI implements Serializable {

    private Integer totalJuiceInCanSold;
    private Integer totalJuiceInCanAvailable;
    private Double totalJuiceInCanSales;

    public Integer getTotalJuiceInCanSold() {
        return totalJuiceInCanSold;
    }

    public void setTotalJuiceInCanSold(Integer totalJuiceInCanSold) {
        this.totalJuiceInCanSold = totalJuiceInCanSold;
    }

    public Integer getTotalJuiceInCanAvailable() {
        return totalJuiceInCanAvailable;
    }

    public void setTotalJuiceInCanAvailable(Integer totalJuiceInCanAvailable) {
        this.totalJuiceInCanAvailable = totalJuiceInCanAvailable;
    }

    public Double getTotalJuiceInCanSales() {
        return totalJuiceInCanSales;
    }

    public void setTotalJuiceInCanSales(Double totalJuiceInCanSales) {
        this.totalJuiceInCanSales = totalJuiceInCanSales;
    }

    @Override
    public String toString() {
        return "JuiceInCanAPI{" +
                "totalJuiceInCanSold=" + totalJuiceInCanSold +
                ", totalJuiceInCanAvailable=" + totalJuiceInCanAvailable +
                ", totalJuiceInCanSales=" + totalJuiceInCanSales +
                '}';
    }

}
