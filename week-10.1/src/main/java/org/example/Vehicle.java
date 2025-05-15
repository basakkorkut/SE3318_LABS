package org.example;

public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String licensePlate;

    public Vehicle(String brand, String model, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public String getLicensePlate(){
        return licensePlate;
    }

    public abstract double calculateRentalPrice(int daysRented);
}
