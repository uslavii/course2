package com.company.classwork.lesson4.practice;

public class Main {

    public static void main(String[] args) {
        Cow cow = new Whale();
        doAction(cow);

        Cow cow1 = new Cow();
        doAction(cow1);

    }

    public static void doAction(Cow cow) {

        if (cow instanceof Whale) {
            ((Whale) cow).whaleMethod();
        }
    }

}
