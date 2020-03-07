package com.company.homework;

public class Task9 {
    public static class Cat {

        public String name;
        public Cat father;
        public Cat mother;

        public Cat(String name) {
            this.name = name;
        }

        public Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {
            if ((mother == null) && (father == null)) {
                return "Cat name is " + name + ". no mother,no father";
            } else if (mother == null) {
                return "Cat name is " + name + ". no mother, father is " + father.name;
            } else if (father == null) {
                return "Cat name is " + name + ". mother is " + mother.name + " , no father ";
            } else {
                return "Cat name is " + name + ". mother is " + mother.name + ", father is " + father.name;
            }
        }
    }

    public static void main(String[] args) {
        Cat catGrandFather = new Cat("barsik");
        Cat catGrandMother = new Cat("pusha");
        Cat catMother = new Cat("murka",null,catGrandMother);
        Cat catFather = new Cat("tiramisu",catGrandFather,null);
        Cat catSon = new Cat("klaksa",catFather,catGrandMother);
        Cat catDaughter = new Cat("la-la",catFather,catGrandMother);
        System.out.println(catGrandFather.toString());
        System.out.println(catGrandMother.toString());
        System.out.println(catMother.toString());
        System.out.println(catFather.toString());
        System.out.println(catSon.toString());
        System.out.println(catDaughter.toString());
    }
}
