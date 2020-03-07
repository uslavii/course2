package com.company.classwork.lesson4.telephones;

public class ThomasEdisonPhone extends AbstractPhone {


    public ThomasEdisonPhone(int year) {
        super(year);
    }

    @Override
    public void call(int number) {
        System.out.println("вращайте ручку");
        System.out.println("сообщите номер абонента, сэр");
    }

    @Override
    public void ring(int number) {
        System.out.println("Телефон звонит");

    }
}
