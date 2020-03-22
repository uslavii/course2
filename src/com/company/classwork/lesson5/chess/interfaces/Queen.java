package com.company.classwork.lesson5.chess.interfaces;

public class Queen extends ChessItem {

    public Queen (int value) {
        super(value);
    }

    @Override
    public void draw() {
        System.out.println("draw Queen");
    }
}
