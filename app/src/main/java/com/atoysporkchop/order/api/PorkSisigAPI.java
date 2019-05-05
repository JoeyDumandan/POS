package com.atoysporkchop.order.api;

import java.io.Serializable;

public class PorkSisigAPI implements Serializable {

    private Integer totalPorkSisigSold;
    private Integer totalPorkSisigAvailable;
    private Double totalPorkSisigSales;

    public Integer getTotalPorkSisigSold() {
        return totalPorkSisigSold;
    }

    public void setTotalPorkSisigSold(Integer totalPorkSisigSold) {
        this.totalPorkSisigSold = totalPorkSisigSold;
    }

    public Integer getTotalPorkSisigAvailable() {
        return totalPorkSisigAvailable;
    }

    public void setTotalPorkSisigAvailable(Integer totalPorkSisigAvailable) {
        this.totalPorkSisigAvailable = totalPorkSisigAvailable;
    }

    public Double getTotalPorkSisigSales() {
        return totalPorkSisigSales;
    }

    public void setTotalPorkSisigSales(Double totalPorkSisigSales) {
        this.totalPorkSisigSales = totalPorkSisigSales;
    }

    @Override
    public String toString() {
        return "PorkSisigAPI{" +
                "totalPorkSisigSold=" + totalPorkSisigSold +
                ", totalPorkSisigAvailable=" + totalPorkSisigAvailable +
                ", totalPorkSisigSales=" + totalPorkSisigSales +
                '}';
    }

}
