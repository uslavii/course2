package com.company.homework.itcompany;

public class Designer extends AbstractEmployee {

    public Designer() {
        workingHours = 9;
    }

    @Override
    public void information() {
        System.out.println("Work hours: "+workingHours+" , Tasks: website layout development,design of banners, icons" +
                ", interfaces of mobile and browser applications.");
    }
}
