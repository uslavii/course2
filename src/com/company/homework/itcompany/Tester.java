package com.company.homework.itcompany;

public class Tester extends AbstractEmployee {

    public Tester() {
        workingHours = 10;
    }

    @Override
    public void information() {
        System.out.println("Work hours: "+workingHours+" , Tasks: software testing,data analysis,Documenting defects" +
                " found");
    }
}
