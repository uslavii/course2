package com.company.classwork.lesson5.chess.interfaces;

public abstract class ChessItem implements Element {

    int x,y, value;

    public ChessItem(int value) {

    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

}
