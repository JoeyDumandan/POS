package com.atoysporkchop.order.api;

import java.io.Serializable;

public class ChickenLongganisaAPI implements Serializable {

    private Integer totalChickenLongganisaSold;
    private Integer totalChickenLongganisaAvailable;
    private Double totalChickenLongganisaSales;

    public Integer getTotalChickenLongganisaSold() {
        return totalChickenLongganisaSold;
    }

    public void setTotalChickenLongganisaSold(Integer totalChickenLongganisaSold) {
        this.totalChickenLongganisaSold = totalChickenLongganisaSold;
    }

    public Integer getTotalChickenLongganisaAvailable() {
        return totalChickenLongganisaAvailable;
    }

    public void setTotalChickenLongganisaAvailable(Integer totalChickenLongganisaAvailable) {
        this.totalChickenLongganisaAvailable = totalChickenLongganisaAvailable;
    }

    public Double getTotalChickenLongganisaSales() {
        return totalChickenLongganisaSales;
    }

    public void setTotalChickenLongganisaSales(Double totalChickenLongganisaSales) {
        this.totalChickenLongganisaSales = totalChickenLongganisaSales;
    }

    @Override
    public String toString() {
        return "ChickenLongganisaAPI{" +
                "totalChickenLongganisaSold=" + totalChickenLongganisaSold +
                ", totalChickenLongganisaAvailable=" + totalChickenLongganisaAvailable +
                ", totalChickenLongganisaSales=" + totalChickenLongganisaSales +
                '}';
    }
    
}
