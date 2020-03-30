package com.company.homework.zoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("пожалуйста выберите кота, собаку, утку либо тигра");
        String input = " ";
        while (!input.matches("")) {
            input = reader.readLine();
            Element element = createObject(input);
            if (element instanceof Climb) {
                ((Climb) element).climb();
            }
            if (element instanceof Fly) {
                ((Fly) element).fly();
            }
            if (element instanceof Run) {
                ((Run) element).run();
            }
        }

    }

    public static Element createObject(String input) {
        switch (input) {
            case "кот":
                return new Cat();
            case "собака":
                return new Dog();
            case "утка":
                return new Duck();
            case "тигр":
                return new Tiger();
            case "":
                System.out.println("спасибо!");
                break;
            default:
                System.out.println("пожалуйста введите правильную строку");
        }
        return new  UnknownAnimal();
    }

}
