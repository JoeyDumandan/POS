package com.atoysporkchop.order.api;

import java.io.Serializable;

public class GarlicLongganisaAPI implements Serializable {

    private Integer totalGarlicLongganisaSold;
    private Integer totalGarlicLongganisaAvailable;
    private Double totalGarlicLongganisaSales;

    public Integer getTotalGarlicLongganisaSold() {
        return totalGarlicLongganisaSold;
    }

    public void setTotalGarlicLongganisaSold(Integer totalGarlicLongganisaSold) {
        this.totalGarlicLongganisaSold = totalGarlicLongganisaSold;
    }

    public Integer getTotalGarlicLongganisaAvailable() {
        return totalGarlicLongganisaAvailable;
    }

    public void setTotalGarlicLongganisaAvailable(Integer totalGarlicLongganisaAvailable) {
        this.totalGarlicLongganisaAvailable = totalGarlicLongganisaAvailable;
    }

    public Double getTotalGarlicLongganisaSales() {
        return totalGarlicLongganisaSales;
    }

    public void setTotalGarlicLongganisaSales(Double totalGarlicLongganisaSales) {
        this.totalGarlicLongganisaSales = totalGarlicLongganisaSales;
    }

    @Override
    public String toString() {
        return "GarlicLongganisaAPI{" +
                "totalGarlicLongganisaSold=" + totalGarlicLongganisaSold +
                ", totalGarlicLongganisaAvailable=" + totalGarlicLongganisaAvailable +
                ", totalGarlicLongganisaSales=" + totalGarlicLongganisaSales +
                '}';
    }

}
