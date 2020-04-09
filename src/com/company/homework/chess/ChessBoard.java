package com.company.homework.chess;

public class ChessBoard {

    ChessTeam blackChessTeam;
    ChessTeam whiteChessTeam;
    ChessItem[][] cells = new ChessItem[8][8];

    public ChessBoard(ChessTeam blackChessTeam, ChessTeam whiteChessTeam) {
        this.blackChessTeam = blackChessTeam;
        this.whiteChessTeam = whiteChessTeam;
    }

    public void initialPlacement() {
        cells[0][0] = whiteChessTeam.rook1;
        cells[0][1] = whiteChessTeam.horse1;
        cells[0][2] = whiteChessTeam.elephant1;
        cells[0][3] = whiteChessTeam.king;
        cells[0][4] = whiteChessTeam.queen;
        cells[0][5] = whiteChessTeam.elephant2;
        cells[0][6] = whiteChessTeam.horse2;
        cells[0][7] = whiteChessTeam.rook2;
        cells[1][0] = whiteChessTeam.pawn1;
        cells[1][1] = whiteChessTeam.pawn2;
        cells[1][2] = whiteChessTeam.pawn3;
        cells[1][3] = whiteChessTeam.pawn4;
        cells[1][4] = whiteChessTeam.pawn5;
        cells[1][5] = whiteChessTeam.pawn6;
        cells[1][6] = whiteChessTeam.pawn7;
        cells[1][7] = whiteChessTeam.pawn8;


        cells[7][0] = blackChessTeam.rook1;
        cells[7][1] = blackChessTeam.horse1;
        cells[7][2] = blackChessTeam.elephant1;
        cells[7][3] = blackChessTeam.king;
        cells[7][4] = blackChessTeam.queen;
        cells[7][5] = blackChessTeam.elephant2;
        cells[7][6] = blackChessTeam.horse1;
        cells[7][7] = blackChessTeam.rook2;
        cells[6][0] = blackChessTeam.pawn1;
        cells[6][1] = blackChessTeam.pawn2;
        cells[6][2] = blackChessTeam.pawn3;
        cells[6][3] = blackChessTeam.pawn4;
        cells[6][4] = blackChessTeam.pawn5;
        cells[6][5] = blackChessTeam.pawn6;
        cells[6][6] = blackChessTeam.pawn7;
        cells[6][7] = blackChessTeam.pawn8;


    }
}
