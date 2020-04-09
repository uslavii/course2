package com.company.homework.chess;

import java.util.Arrays;

public class Pawn extends ChessItem {

    public Pawn() {
        name = "Pawn";
        value = "1";
    }


    @Override
    public String getInformation() {
        return "name: " + name +
                "value: " + value ;

    }
}
