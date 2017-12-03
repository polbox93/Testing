package com.codecool;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String surname;
    private int birthyear;
    private String gender;
    private List<Sale> sales = new ArrayList<>();


    public Customer() {

    }

    public Customer(String name, String surname, int birthyear, String gender) {
        this.name = name;
        this.surname = surname;
        this.birthyear = birthyear;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        int actualYear = Year.now().getValue();
        int age = actualYear - getBirthyear();
        return age;
    }

    public void setName(String name) {
        if(name.equals("")){
            throw new IllegalArgumentException("Name can't be empty");
        }
        if(name.equals(null)) {
            throw new NullPointerException("Name can't be empty");
        }
        this.name = name;
    }

    public void setSurname(String surname) {
        if(surname.equals("")){
            throw new IllegalArgumentException("Surname can't be empty");
        }
        if(surname.equals(null)) {
            throw new NullPointerException("Surname can't be empty");
        }
        this.surname = surname;
    }

    public void setBirthyear(int birthyear) {
        if(!(birthyear > 1900 && birthyear < Year.now().getValue())) {
            throw new IllegalArgumentException("Birthyear must be bigger than 1900");
        }
        this.birthyear = birthyear;
    }

    public void setGender(String gender) {
        if(!(gender.equals("male") || gender.equals("female"))) {
            throw new IllegalArgumentException("Gender must be male or female");
        }
        this.gender = gender;
    }
}
