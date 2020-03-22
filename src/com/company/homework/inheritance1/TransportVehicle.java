package com.company.homework.inheritance1;

public class TransportVehicle {

    public int numberOfPassenger;
    public int cost;
    public int speed;

    public TransportVehicle(int numberOfPassenger, int cost, int speed) {
        this.numberOfPassenger = numberOfPassenger;
        this.cost = cost;
        this.speed = speed;
    }

    public void pickingUpPassengers() {
        System.out.println("this vehicle collects all passengers("+numberOfPassenger+") before departure");
    }
}
