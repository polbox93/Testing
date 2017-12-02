package com.codecool;

import java.math.BigDecimal;

public class Sale {

    private String productName;
    private BigDecimal netValue;
    private int taxRate;

    public void Sale() {

    }

    public void Sale(String productName, BigDecimal netValue, int taxRate) {
        this.productName = productName;
        this.netValue = netValue;
        this.taxRate = taxRate;
    }


}
