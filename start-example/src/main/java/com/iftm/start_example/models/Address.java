package com.iftm.start_example.models;

import java.util.Objects;

public class Address {
    private String street;
    private int number;

    public Address(){

    }

    public Address(String street, int number){
        this.street = street;
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
}
