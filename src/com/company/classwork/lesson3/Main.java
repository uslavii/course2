package com.company.classwork.lesson3;

public class Main {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();

        Bicycle.Seat seat = bicycle.new Seat();

        Bicycle.SteeringWheel steeringWheel = bicycle.new SteeringWheel();

        seat.down();
        seat.up();
        seat.up();

        bicycle.ride();

        steeringWheel.left();
        steeringWheel.right();
    }

    public static class Cat {

    }


}
