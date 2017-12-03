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


    public void setProductName(String productName) {
        if(productName.equals("")){
            throw new IllegalArgumentException("Product name can't be empty");
        }
        if(productName.equals(null)) {
            throw new NullPointerException("Product name can't be empty");
        }
        this.productName = productName;
    }

    public void setNetValue(BigDecimal netValue) {
        if(netValue.signum() <= 0 || netValue.scale() > 2) {
            throw new IllegalArgumentException("Net value must be a positive number with at most 2 decimal point places");
        }
        this.netValue = netValue;
    }

    public void setTaxRate(int taxRate) {
        if(!(taxRate > 0 && taxRate < 100)){
            throw new IllegalArgumentException("Taxrate must be between 0 and 100");
        }
        this.taxRate = taxRate;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getNetValue() {
        return netValue;
    }

    public int getTaxRate() {
        return taxRate;
    }


    public BigDecimal getGrossValue() {
        BigDecimal taxValue = this.getNetValue().multiply(new BigDecimal(0.01)) ;

        return this.getNetValue().add(taxValue);
    }
}
