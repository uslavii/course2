package com.company.homework.chess;

import java.util.Arrays;

public abstract class ChessItem implements Element {

    private static final int[] EMPTY_ARRAY = new int[0];
    String name;
    String value;

    @Override
    public String getInformation(ChessBoard chessBoard) {
        return "name: " + name +
                " value: " + value +
                " coordinates: " + getCoordinates(chessBoard);
    }

    @Override
    public String getCoordinates(ChessBoard chessBoard) {
        int[] coordinatesPrevious = new int[0];
        ChessItem[][] cells = chessBoard.cells;
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                if (cells[i][j] == ChessItem.this ) {
                    coordinatesPrevious = new int[]{i,j};
                    break;
                }
            }
            if (!Arrays.equals(coordinatesPrevious,EMPTY_ARRAY)) {
                break;
            }
        }
        String chessColumn = String.valueOf(coordinatesPrevious[0] + 1);
        String chessLine;
        switch (coordinatesPrevious[1]) {
            case 0 :
                chessLine = "a";
                break;
            case 1:
                chessLine = "b";
                break;
            case 2:
                chessLine = "c";
                break;
            case 3:
                chessLine = "d";
                break;
            case 4:
                chessLine = "e";
                break;
            case 5:
                chessLine = "f";
                break;
            case 6:
                chessLine = "g";
                break;
            case 7:
                chessLine = "h";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + coordinatesPrevious[1]);
        }
        return chessColumn + chessLine;
    }
}
