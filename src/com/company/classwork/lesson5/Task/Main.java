package com.company.classwork.lesson5.Task;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Please choose: human, ship,duck");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();


    }

    public static Object createObject(String input) {
        switch (input) {
            case "human":
                return new Human();
            case "ship":
                return new Ship();
            case "duck":
                return new Duck();
            default:
                throw new IllegalArgumentException("pls enter correct string");
        }
    }
}
