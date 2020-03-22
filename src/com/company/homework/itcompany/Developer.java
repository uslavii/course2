package com.company.homework.itcompany;

public class Developer extends AbstractEmployee {

    public Developer() {
        workingHours = 10;
    }

    @Override
    public void information() {
        System.out.println("Work hours: "+workingHours+" , Tasks: software development,program error correction,software support.");
    }
}
