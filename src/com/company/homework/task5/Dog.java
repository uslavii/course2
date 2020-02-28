package com.company.homework.task5;

public class Dog {

    public String name;
    public int age;
    public String breed;
    public int strength;
    public int weight;

    private Dog() {

    }

    public Dog(String name, int age, String breed, int strength, int weight) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.strength = strength;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public int getStrength() {
        return strength;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", strength=" + strength +
                ", weight=" + weight +
                '}';
    }
}
