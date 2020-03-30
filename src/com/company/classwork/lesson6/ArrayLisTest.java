package com.company.classwork.lesson6;

import java.util.ArrayList;

public class ArrayLisTest {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }

        list.set(3, 100);

        System.out.println();

        list.add(3, 3);

        for (Integer number: list) {
            System.out.print(number);
        }
    }

}
