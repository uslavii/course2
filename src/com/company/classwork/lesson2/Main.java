package com.company.classwork.lesson2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = new Cat();

        System.out.println(cat);
        System.out.println(cat1);
        cat.age = 3;
        cat.name = "Barsik";
        System.out.println(cat.age);
        System.out.println(cat.name);
        cat.run();

        cat1=cat;
        System.out.println(cat);
        System.out.println(cat1);


    }
}
