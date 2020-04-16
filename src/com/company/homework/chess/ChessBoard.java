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
        cells = new ChessItem[][]{
                {whiteChessTeam.rook1, whiteChessTeam.horse1, whiteChessTeam.elephant1, whiteChessTeam.king,
                        whiteChessTeam.queen, whiteChessTeam.elephant2, whiteChessTeam.horse2, whiteChessTeam.rook2},
                {whiteChessTeam.pawn1,whiteChessTeam.pawn2,whiteChessTeam.pawn3,whiteChessTeam.pawn4,
                        whiteChessTeam.pawn5,whiteChessTeam.pawn6,whiteChessTeam.pawn7,whiteChessTeam.pawn8},
                {null,null,null,null,null,null,null,null},
                {null,null,null,null,null,null,null,null},
                {null,null,null,null,null,null,null,null},
                {null,null,null,null,null,null,null,null},
                {blackChessTeam.pawn1,blackChessTeam.pawn2,blackChessTeam.pawn3,blackChessTeam.pawn4,
                        blackChessTeam.pawn5,blackChessTeam.pawn6,blackChessTeam.pawn7,blackChessTeam.pawn8},
                {blackChessTeam.rook1, blackChessTeam.horse1, blackChessTeam.elephant1, blackChessTeam.king,
                        blackChessTeam.queen, blackChessTeam.elephant2, blackChessTeam.horse2, blackChessTeam.rook2}
        };

    }
}
