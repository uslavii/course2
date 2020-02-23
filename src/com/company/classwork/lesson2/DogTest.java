package com.company.classwork.lesson2;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog("black","mastiff",10,20);
        Dog dog1 = new Dog("black","mastiff1",10,18);
        System.out.println(dog.getColor());
        System.out.println(dog.getBreed());
        dog.setColor("white");
        dog.fight(dog1);
    }
}
