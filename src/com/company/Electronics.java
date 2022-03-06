package com.company;

public class Electronics implements Printable {
    private String name;
    private String brand;
    private String model;
    private String madeIn;

    public Electronics() {
    }

    public Electronics(String name, String brand, String model, String madeIn) {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.madeIn = madeIn;
    }

    public Electronics(String name, String brand, String model) {
        this.name = name;
        this.brand = brand;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getMadeIn() {
        return madeIn;
    }

    @Override
    public void print() {
        System.out.println("You entered wrong class name");
    }
}
