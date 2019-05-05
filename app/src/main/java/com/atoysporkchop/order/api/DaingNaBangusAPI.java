package com.atoysporkchop.order.api;

import java.io.Serializable;

public class DaingNaBangusAPI implements Serializable {

    private Integer totalDaingNaBangusSold;
    private Integer totalDaingNaBangusAvailable;
    private Double totalDaingNaBangusSales;

    public Integer getTotalDaingNaBangusSold() {
        return totalDaingNaBangusSold;
    }

    public void setTotalDaingNaBangusSold(Integer totalDaingNaBangusSold) {
        this.totalDaingNaBangusSold = totalDaingNaBangusSold;
    }

    public Integer getTotalDaingNaBangusAvailable() {
        return totalDaingNaBangusAvailable;
    }

    public void setTotalDaingNaBangusAvailable(Integer totalDaingNaBangusAvailable) {
        this.totalDaingNaBangusAvailable = totalDaingNaBangusAvailable;
    }

    public Double getTotalDaingNaBangusSales() {
        return totalDaingNaBangusSales;
    }

    public void setTotalDaingNaBangusSales(Double totalDaingNaBangusSales) {
        this.totalDaingNaBangusSales = totalDaingNaBangusSales;
    }

    @Override
    public String toString() {
        return "DaingNaBangusAPI{" +
                "totalDaingNaBangusSold=" + totalDaingNaBangusSold +
                ", totalDaingNaBangusAvailable=" + totalDaingNaBangusAvailable +
                ", totalDaingNaBangusSales=" + totalDaingNaBangusSales +
                '}';
    }

}
