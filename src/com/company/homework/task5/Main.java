package com.company.homework.task5;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("TRex", 5, "husky", 50, 12);
        System.out.println(dog.toString());
        System.out.println(dog.getAge() + " " + dog.getStrength() + " " + dog.getWeight() + " " + dog.getBreed() + " " +
                dog.getName());
        dog.setAge(1);
        dog.setBreed("Mastiff");
        dog.setName("Kus");
        dog.setWeight(5);
        dog.setStrength(10);
        System.out.println(dog.toString());

    }


}
