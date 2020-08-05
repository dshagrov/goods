package com.iqoption.domain;

public class Smartphone extends Product{
    private String manufacturer;


    public Smartphone(String name, int id, int price, String manufacturer) {
        super(name, id, price);
        this.manufacturer = manufacturer;
    }

    public Smartphone() {
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
