package com.company.classwork.lesson3;

public class Bicycle {
    private int height = 10;
    private String model;

    public void ride() {
        System.out.println("ride");
    }

    public void showModel() {
        System.out.println(model);
    }


    public class SteeringWheel {

        public void left() {
            System.out.println("left");
        }

        public void right() {
            System.out.println("right");
        }

    }

    public class Seat {

        public void up() {
            height++;
            System.out.println("bicycle height: " + height);
            System.out.println("up");
        }

        public void down() {
            System.out.println("bicycle height: " + height);
            System.out.println("down");
        }

    }

}
