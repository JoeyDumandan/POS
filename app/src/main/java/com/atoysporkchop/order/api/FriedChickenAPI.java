package com.atoysporkchop.order.api;

import java.io.Serializable;

public class FriedChickenAPI implements Serializable {

    private Integer totalFriedChickenSold;
    private Integer totalFriedChickenAvailable;
    private Double totalFriedChickenSales;

    public Integer getTotalFriedChickenSold() {
        return totalFriedChickenSold;
    }

    public void setTotalFriedChickenSold(Integer totalFriedChickenSold) {
        this.totalFriedChickenSold = totalFriedChickenSold;
    }

    public Integer getTotalFriedChickenAvailable() {
        return totalFriedChickenAvailable;
    }

    public void setTotalFriedChickenAvailable(Integer totalFriedChickenAvailable) {
        this.totalFriedChickenAvailable = totalFriedChickenAvailable;
    }

    public Double getTotalFriedChickenSales() {
        return totalFriedChickenSales;
    }

    public void setTotalFriedChickenSales(Double totalFriedChickenSales) {
        this.totalFriedChickenSales = totalFriedChickenSales;
    }

    @Override
    public String toString() {
        return "FriedChickenAPI{" +
                "totalFriedChickenSold=" + totalFriedChickenSold +
                ", totalFriedChickenAvailable=" + totalFriedChickenAvailable +
                ", totalFriedChickenSales=" + totalFriedChickenSales +
                '}';
    }

}
