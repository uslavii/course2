package com.company.homework.zoo;

public class Cat implements Run,Climb {
    @Override
    public void climb() {
        System.out.println("кот карабкаеться");
    }

    @Override
    public void run() {
        System.out.println("кот бежит");
    }
}
