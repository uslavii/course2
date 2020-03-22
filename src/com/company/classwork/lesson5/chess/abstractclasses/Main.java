package com.company.classwork.lesson5.chess.abstractclasses;

public class Main {

    public static void main(String[] args) {

        ChessItem item = new Queen();
        drawChessItem(item);
    }

    public static  void drawChessItem(ChessItem item) {
        item.draw();
    }

}
