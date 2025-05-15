package org.example;

public class EconomyCar extends Vehicle{
    private static final double BASE_PRICE=50.0;
    private static final double HYBRID_PRICE=10.0;

    private boolean isHybrid;

    public EconomyCar(String brand,String model,String licensePlate,boolean isHybrid){
        super(brand,model,licensePlate);
        this.isHybrid=isHybrid;
    }

    public boolean isHybrid(){
        return isHybrid;
    }

    public double calculateRentalPrice(int daysRented){
        double price=BASE_PRICE;

        if(isHybrid){
            price+=HYBRID_PRICE*daysRented;
        }
        return price;
    }
}
