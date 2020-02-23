package com.company.classwork.lesson2;

public class PersonStaticTest {
    public static void main(String[] args) {
        Person.printPersonCount();
        Person person = new Person();
        Person person1 = new Person();
        Person person2 = new Person();
        Person.printPersonCount();
        System.out.println(person.toString());


    }
}
