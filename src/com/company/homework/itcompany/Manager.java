package com.company.homework.itcompany;

public class Manager extends AbstractEmployee {

    public Manager() {
        workingHours = 8;
    }

    @Override
    public void information() {
        System.out.println("Work hours: "+workingHours+" ,Tasks: Check project requirements , call to customer," +
                " review new design.");
    }
}
