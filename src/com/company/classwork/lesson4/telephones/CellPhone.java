package com.company.classwork.lesson4.telephones;

public class CellPhone extends WirelessPhone {


    public CellPhone(int year, int hours) {
        super(year, hours);
    }

    @Override
    public void call(int number) {
        System.out.println("набрать номер " + number);
    }

    @Override
    public void ring(int number) {
        System.out.println("звонит телефон, с номером " + number);

    }
}
