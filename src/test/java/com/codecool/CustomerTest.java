package com.codecool;

import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class CustomerTest extends TestCase {

    private Customer customer;

    @BeforeEach
    public void setUp() {
        customer = new Customer("Jan", "Kowalski", 1993, "male");
    }


    @Test
    public void testFirstConstructor() throws Exception {
        Customer newCustomer = new Customer();
        assertNotNull(newCustomer);
    }

    @Test
    public void testSecondConstructor() throws Exception {
        assertNotNull(customer);
    }

    @Test
    public void testGetName() throws Exception {
        assertEquals("Jan", customer.getName());
    }
    @Test
    public void testGetSurname() throws Exception {
        assertEquals("Kowalski", customer.getSurname());
    }

    @Test
    public void testGetBirthyear() throws Exception {
        assertEquals(1993, customer.getBirthyear());
    }

    @Test
    public void testGetGender() throws Exception {
        assertEquals("male", customer.getGender());
    }

    @Test
    public void testGetAge() throws Exception {
        assertEquals(24, customer.getAge());
    }
    @Test
    public void testSetName() throws Exception {
        String newName = "Maciej";
        customer.setName(newName);
        assertEquals(newName, customer.getName());
    }
    @Test
    public void testSetSurname() throws Exception {
        String newSurname = "Zieliński";
        customer.setSurname(newSurname);
        assertEquals(newSurname, customer.getSurname());
    }
    @Test
    public void testSetBirthyear() throws Exception {
        int newDate = 1990;
        customer.setBirthyear(newDate);
        assertEquals(newDate, customer.getBirthyear());
    }
    @Test
    public void testSetGender() throws Exception {
        String newGender = "female";
        customer.setGender(newGender);
        assertEquals(newGender, customer.getGender());
    }

    @Test
    public void testThrowsExceptionIfNameEmptyString() {
        String testName = "";
        assertThrows(IllegalArgumentException.class, ()-> {customer.setName(testName);});
    }

    @Test
    public void testThrowsExceptionIfNameNull() {
        String testName = null;
        assertThrows(NullPointerException.class, ()-> {customer.setName(testName);});
    }


    @Test
    public void testThrowsExceptionIfSurnameEmptyString() {
        String testSurname = "";
        assertThrows(IllegalArgumentException.class, ()-> {customer.setSurname(testSurname);});
    }


    @Test
    public void testThrowsExceptionIfSurnameNull() {
        String testSurname = null;
        assertThrows(NullPointerException.class, ()-> {customer.setSurname(testSurname);});
    }


    @Test
    public void testThrowsExceptionIfProperBirthrear() {
        int testBirthyear = 1800;
        assertThrows(IllegalArgumentException.class, ()-> {customer.setBirthyear(testBirthyear);});
    }

    @Test
    public void testThrowsExceptionIfProperGender() {
        String testGender = "Lamus";
        assertThrows(IllegalArgumentException.class, ()-> {customer.setGender(testGender);});
    }

}