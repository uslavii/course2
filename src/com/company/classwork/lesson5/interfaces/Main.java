package com.company.classwork.lesson5.interfaces;

public class Main {
    public static void main(String[] args) {
        Drawable cup = new Cup();
        Drawable lemon = new Lemon();

        cup.draw();

        if (cup instanceof Cup) {
            ((Cup) cup).cupMethod();
        }

        if (cup instanceof Lemon) {
            ((Lemon) cup).lemonMethod();
        }

        lemon.draw();
    }
}
