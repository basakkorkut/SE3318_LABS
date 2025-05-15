package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LuxuryCar luxuryCar=new LuxuryCar("BMW","X5","78BSK035",true,true);
        RentalRecord luxuryRental=new RentalRecord(luxuryCar,"Basak",7);
        luxuryRental.printSummary();

        System.out.println();

        EconomyCar economyCar=new EconomyCar("Toyota","Corolla","34BSK078",true);
        RentalRecord economyRental=new RentalRecord(economyCar,"Ahmet",5);
        economyRental.printSummary();
        System.out.println();
    }
}