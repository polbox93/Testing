package com.codecool;

import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class SaleTest extends TestCase {

    private Sale sale;

    @BeforeEach
    public void setUp() {
        sale = new Sale("Kalafior", new BigDecimal(100), 20);
    }

    @Test
    public void testFirstConstructor() throws Exception {
        Sale newSale = new Sale();
        assertNotNull(newSale);
    }

    @Test
    public void testSecondConstructor() throws Exception {
        assertNotNull(sale);
    }

    @Test
    public void testSetProductName() throws Exception {
        sale.setProductName("Srajtaśma");
        assertEquals("Srajtaśma", sale.getProductName());
    }

    @Test
    public void testSetNetValue() throws Exception {
        sale.setNetValue(new BigDecimal(150));
        assertEquals(new BigDecimal(150), sale.getNetValue());
    }

    @Test
    public void testSetTaxRate() throws Exception {
        sale.setTaxRate(30);
        assertEquals(30, sale.getTaxRate());
    }

    @Test
    public void testGetProductName() throws Exception {
        assertEquals("Kalafior", sale.getProductName());
    }

    @Test
    public void testGetNetValue() throws Exception {
        BigDecimal netVal = new BigDecimal(100);
        assertEquals(netVal, sale.getNetValue());

    }

    @Test
    public void testGetTaxRate() throws Exception {
        assertEquals(20, sale.getTaxRate());

    }

    @Test
    public void testGetGrossValue() throws Exception {
        BigDecimal grossVal = sale.getNetValue().add(sale.getNetValue().multiply(new BigDecimal(sale.getTaxRate()*0.01)));

        assertEquals(grossVal, sale.getGrossValue());
    }


    @Test
    public void testThrowsExceptionIfProductNameEmptyString() {
        String testName = "";
        assertThrows(IllegalArgumentException.class, ()-> {sale.setProductName(testName);});
    }


    @Test
    public void testThrowsExceptionIfProductNameNull() {
        String testName = null;
        assertThrows(NullPointerException.class, ()-> {sale.setProductName(testName);});
    }


    @Test
    public void testThrowsExceptionIfProperNetValue() {
        BigDecimal testNetValue = new BigDecimal(50.987);
        assertThrows(IllegalArgumentException.class, ()-> {sale.setNetValue(testNetValue);});
    }

    @Test
    public void testThrowsExceptionIfProperTaxRate() {
        int testTaxRate = 150;
        assertThrows(IllegalArgumentException.class, ()-> {sale.setTaxRate(testTaxRate);});
    }

}