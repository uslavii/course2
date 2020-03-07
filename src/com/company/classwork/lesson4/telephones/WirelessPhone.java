package com.company.classwork.lesson4.telephones;

public abstract class WirelessPhone extends AbstractPhone {

    private int hours;

    public WirelessPhone(int year,int hours) {
        super(year);
        this.hours = hours;
    }


}
