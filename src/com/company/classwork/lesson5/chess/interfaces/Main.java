package com.company.classwork.lesson5.chess.interfaces;

import com.company.classwork.lesson5.interfaces.Drawable;

public class Main {

    public static void main(String[] args) {
        ChessItem item = new Queen(10);

        System.out.println(item instanceof Queen);
        System.out.println(item instanceof ChessItem);
        System.out.println(item instanceof Drawable);
        System.out.println(item instanceof HasValue);
        System.out.println(item instanceof Element);

    }

    public static void draw(Drawable drawable) {
        drawable.draw();
    }

    public static boolean compareValues(HasValue value1, HasValue value2) {
        return value1.getValue()>value2.getValue();
    }
}
