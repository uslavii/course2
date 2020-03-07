package com.company.classwork.lesson4.telephones;

public class Phone extends AbstractPhone {

    public Phone(int year) {
        super(year);
    }

    @Override
    public void call(int number) {
        System.out.println("вызываю номер " + number);
    }

    @Override
    public void ring(int number) {
        System.out.println("звонит телефон");
    }
}
