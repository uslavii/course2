package com.company.homework.zoo;

public class Tiger implements Run, Climb {
    @Override
    public void run() {
        System.out.println("Тигр бежит");
    }

    @Override
    public void climb() {
        System.out.println("Тигр карабкаеться");
    }
}
