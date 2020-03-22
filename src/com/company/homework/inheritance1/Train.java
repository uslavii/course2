package com.company.homework.inheritance1;

public class Train extends TransportVehicle {

    public String trainman;

    public Train(int numberOfPassenger, int cost, int speed,String trainman) {
        super(numberOfPassenger, cost, speed);
        this.trainman = trainman;
    }

    public void emergencyStop(boolean emergencyBrake ) {
        if (emergencyBrake) {
            System.out.println("train stopped");
        }
    }
}
