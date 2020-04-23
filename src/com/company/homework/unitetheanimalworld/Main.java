package com.company.homework.unitetheanimalworld;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        HashSet<Cat> cats = createCats();
        HashSet<Dog> dogs = createDogs();
        HashSet<Animal> pets = join(cats, dogs);
        removeCats(pets, cats);
        printPets(pets);
    }

    public static HashSet<Cat> createCats() {
        HashSet<Cat> cats = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            Cat cat = new Cat();
            cats.add(cat);
        }
        return cats;
    }

    public static HashSet<Dog> createDogs() {
        HashSet<Dog> dogs = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            Dog dog = new Dog();
            dogs.add(dog);
        }
        return dogs;
    }

    public static HashSet<Animal> join(HashSet<Cat> cats,HashSet<Dog> dogs) {
        HashSet<Animal> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats (HashSet<Animal> pets,HashSet<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(HashSet<Animal> pets) {
        for (Animal pet : pets) {
            System.out.println(pet);
        }
    }

}
