package com.company.homework.inheritance1;

public class Plane extends TransportVehicle {

    public String company = "company";

    public Plane(int numberOfPassenger, int cost, int speed,String company) {
        super(numberOfPassenger, cost, speed);
        this.company = company;
    }

    public void registration() {
        System.out.println("an hour before the departure of the "+company+"'s plane, passengers must register");
    }
}
