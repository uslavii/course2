package com.company.homework.сonstructors;

public class Cat {

    public String name = "unknown";
    public float weight = 2.6f;
    public int age = 1;
    public String color = "White";
    public String address = "homeless";

    public Cat() {
        name = "barsik";
        weight = 3;
        age = 1;
        color = "White";
        address = "homeless";


    }


    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.weight);
        System.out.println(this.age);
        System.out.println(this.color);
        System.out.println(this.address);
    }

}
