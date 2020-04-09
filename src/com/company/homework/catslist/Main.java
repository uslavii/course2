package com.company.homework.catslist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        ArrayList<Cat> catArrayList = new ArrayList<>();
        String input = "";

        while (true) {
            System.out.println("print name of cat pls");
            input = reader.readLine();
            if (input.equals("")) {
                break;
            }
            catArrayList.add(method(input));
        }
        for (int i = 0; i <catArrayList.size() ; i++) {
            System.out.println(catArrayList.get(i).toString());
        }
    }

    public static Cat method(String input) throws IOException {
        String name = input;
        System.out.println("print age pls");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("print color pls");
        String color = reader.readLine();
        System.out.println("print weight pls");
        int weight = Integer.parseInt(reader.readLine());
        return new Cat(name, age, color, weight);
    }


}
