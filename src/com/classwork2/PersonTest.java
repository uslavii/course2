package com.classwork2;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.name);
        System.out.println(person.age);

        Person person1 = new Person("With name");
        System.out.println(person1.name);
        System.out.println(person1.age);

        Person person2 = new Person(8);
        System.out.println(person2.age);
        System.out.println(person2.name);

        Person person3 = new Person("With name", 18);
        System.out.println(person3.age);
        System.out.println(person3.name);

        String someName = "Some name";
        int someAge = 12;
        Person person4 = new Person(someName,someAge);
        System.out.println(person4.age);
        System.out.println(person4.name);

    }
}
