package com.company.classwork.lesson2;

public class Dog {
    private String color;
    private String breed;

    private int weight;
    private int strength;

    private Dog() {

    }

    public Dog(String color, String breed, int weight, int strenght) {
        this.color = color;
        this.breed = breed;
        this.weight = weight;
        this.strength = strenght;
    }

    public String getColor() {
        return this.color;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setColor(String white) {
        this.color = color;
    }

    public void setBreed() {
        this.breed = breed;
    }

    public String fight(Dog dog) {
        if (this.strength> dog.strength) {
            return this.breed;
        }
        return dog.breed;
    }

}
