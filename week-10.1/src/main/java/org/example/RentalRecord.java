package org.example;

public class RentalRecord {
    private  Vehicle vehicle;
    private String renterName;
    private int rentalDays;
    private double totalPrice;

    /**
     * Constructs a new RentalRecord
     *
     * @param vehicle               the car being rented
     * @param  renterName       the name of the person rnting the car
     *    @param rentalDays     the number of rental days
     *
     */

    public RentalRecord(Vehicle vehicle,String renterName, int rentalDays){
        this.vehicle = vehicle;
        this.renterName = renterName;
        this.rentalDays = rentalDays;
        this.totalPrice=vehicle.calculateRentalPrice(rentalDays);

    }

    public Vehicle getVehicle() {
        return vehicle;

    }

    public String getRenterName() {
        return renterName;
    }
    public int getRentalDays() {
        return rentalDays;
    }
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * Displays summary of the rental
     */
    public void printSummary() {
        System.out.println("Renter: " + renterName);
        System.out.println("Car: " + vehicle.getBrand() + " " + vehicle.getModel() + " (" + vehicle.getLicensePlate() + ")");
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Price: $" + totalPrice);
    }
}
