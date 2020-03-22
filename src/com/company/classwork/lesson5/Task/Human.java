package com.company.classwork.lesson5.Task;

public class Human implements Runnable,Swimmable {
    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void swim() {
        System.out.println("swim");

    }
}
