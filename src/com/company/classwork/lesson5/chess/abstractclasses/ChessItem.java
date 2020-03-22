package com.company.classwork.lesson5.chess.abstractclasses;

public abstract class ChessItem {

    int x,y;
    int value;

    public int getValue() {
        return value;
    }

    public abstract void draw();
}
