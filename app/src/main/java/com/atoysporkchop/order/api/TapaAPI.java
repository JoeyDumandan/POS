package com.atoysporkchop.order.api;

import java.io.Serializable;

public class TapaAPI implements Serializable {

    private Integer totalTapaSold;
    private Integer totalTapaAvailable;
    private Double totalTapaSales;

    public Integer getTotalTapaSold() {
        return totalTapaSold;
    }

    public void setTotalTapaSold(Integer totalTapaSold) {
        this.totalTapaSold = totalTapaSold;
    }

    public Integer getTotalTapaAvailable() {
        return totalTapaAvailable;
    }

    public void setTotalTapaAvailable(Integer totalTapaAvailable) {
        this.totalTapaAvailable = totalTapaAvailable;
    }

    public Double getTotalTapaSales() {
        return totalTapaSales;
    }

    public void setTotalTapaSales(Double totalTapaSales) {
        this.totalTapaSales = totalTapaSales;
    }

    @Override
    public String toString() {
        return "TapaAPI{" +
                "totalTapaSold=" + totalTapaSold +
                ", totalTapaAvailable=" + totalTapaAvailable +
                ", totalTapaSales=" + totalTapaSales +
                '}';
    }

}
