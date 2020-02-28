package com.company.homework.сonstructors;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.print();
        Cat cat1 = new Cat("vasiliy");
        cat1.print();
        Cat cat2 = new Cat("Tom",3,2);
        cat2.print();
        Cat cat3 = new Cat("Jerry", 1) ;
        cat3.print();
        Cat cat4 = new Cat(2,"Black");
        cat4.print();
        Cat cat5 = new Cat(4,"Grey","dom 139");
        cat5.print();

    }

}
