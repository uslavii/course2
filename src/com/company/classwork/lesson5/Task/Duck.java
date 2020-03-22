package com.company.classwork.lesson5.Task;

public class Duck implements Runnable,Swimmable,Flyable {
    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void swim() {
        System.out.println("swim");
    }
}
