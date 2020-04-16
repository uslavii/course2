package com.company.homework.chess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    // уверен что сделал я плохо :(

    public static void main(String[] args) throws IOException {
        Pawn pawnWhite1 = new Pawn();
        Pawn pawnWhite2 = new Pawn();
        Pawn pawnWhite3 = new Pawn();
        Pawn pawnWhite4 = new Pawn();
        Pawn pawnWhite5 = new Pawn();
        Pawn pawnWhite6 = new Pawn();
        Pawn pawnWhite7 = new Pawn();
        Pawn pawnWhite8 = new Pawn();
        Horse horseWhite1 = new Horse();
        Horse horseWhite2 = new Horse();
        Elephant elephantWhite1 = new Elephant();
        Elephant elephantWhite2 = new Elephant();
        Rook rookWhite1 = new Rook();
        Rook rookWhite2 = new Rook();
        Queen queenWhite = new Queen();
        King kingWhite = new King();

        ChessTeam chessTeamWhite = new ChessTeam(pawnWhite1, pawnWhite2, pawnWhite3, pawnWhite4, pawnWhite5, pawnWhite6,
                pawnWhite7, pawnWhite8, horseWhite1, horseWhite2, elephantWhite1, elephantWhite2, rookWhite1, rookWhite2,
                queenWhite, kingWhite);

        Pawn pawnBlack1 = new Pawn();
        Pawn pawnBlack2 = new Pawn();
        Pawn pawnBlack3 = new Pawn();
        Pawn pawnBlack4 = new Pawn();
        Pawn pawnBlack5 = new Pawn();
        Pawn pawnBlack6 = new Pawn();
        Pawn pawnBlack7 = new Pawn();
        Pawn pawnBlack8 = new Pawn();
        Horse horseBlack1 = new Horse();
        Horse horseBlack2 = new Horse();
        Elephant elephantBlack1 = new Elephant();
        Elephant elephantBlack2 = new Elephant();
        Rook rookBlack1 = new Rook();
        Rook rookBlack2 = new Rook();
        Queen queenWBlack = new Queen();
        King kingBlack = new King();

        ChessTeam chessTeamBlack = new ChessTeam(pawnBlack1, pawnBlack2, pawnBlack3, pawnBlack4, pawnBlack5, pawnBlack6,
                pawnBlack7, pawnBlack8, horseBlack1, horseBlack2, elephantBlack1, elephantBlack2, rookBlack1, rookBlack2,
                queenWBlack, kingBlack);

        ChessBoard chessBoard = new ChessBoard(chessTeamBlack, chessTeamWhite);

        chessBoard.initialPlacement();
        String input = " ";
        while (!input.equals("")) {
            input = reader.readLine();
            System.out.println(getInformationAndChooseChessFigure(chessBoard,input));
        }
    }

    public static String getInformationAndChooseChessFigure(ChessBoard chessBoard,String input1) throws IOException {
        System.out.println("choose team");
        input1 = reader.readLine();
        switch (input1) {
            case "white":
                System.out.println("choose figure");
                input1 = reader.readLine();
                switch (input1) {
                    case "pawn":
                        System.out.println("choose number of pawn");
                        input1 = reader.readLine();
                        switch (input1) {
                            case "1":
                                return chessBoard.whiteChessTeam.pawn1.getInformation(chessBoard);
                            case "2":
                                return chessBoard.whiteChessTeam.pawn2.getInformation(chessBoard);
                            case "3":
                                return chessBoard.whiteChessTeam.pawn3.getInformation(chessBoard);
                            case "4":
                                return chessBoard.whiteChessTeam.pawn4.getInformation(chessBoard);
                            case "5":
                                return chessBoard.whiteChessTeam.pawn5.getInformation(chessBoard);
                            case "6":
                                return chessBoard.whiteChessTeam.pawn6.getInformation(chessBoard);
                            case "7":
                                return chessBoard.whiteChessTeam.pawn7.getInformation(chessBoard);
                            case "8":
                                return chessBoard.whiteChessTeam.pawn8.getInformation(chessBoard);
                            case "":
                                return "completion of work";
                            default:
                                throw new IllegalArgumentException("no number of pawn");
                        }
                    case "rook":
                        System.out.println("choose number of rook");
                        input1 = reader.readLine();
                        switch (input1) {
                            case "1":
                                return chessBoard.blackChessTeam.rook1.getInformation(chessBoard);
                            case "2":
                                return chessBoard.blackChessTeam.rook2.getInformation(chessBoard);
                            case "":
                                return "completion of work";
                            default:
                                throw new IllegalArgumentException("no number of rook");
                        }
                    case "horse":
                        System.out.println("choose number of horse");
                        input1 = reader.readLine();
                        switch (input1) {
                            case "1":
                                return chessBoard.blackChessTeam.horse1.getInformation(chessBoard);
                            case "2":
                                return chessBoard.blackChessTeam.horse2.getInformation(chessBoard);
                            case "":
                                return "completion of work";
                            default:
                                throw new IllegalArgumentException("no number of horse");
                        }
                    case "elephant":
                        System.out.println("choose number of elephant");
                        input1 = reader.readLine();
                        switch (input1) {
                            case "1":
                                return chessBoard.blackChessTeam.elephant1.getInformation(chessBoard);
                            case "2":
                                return chessBoard.blackChessTeam.elephant2.getInformation(chessBoard);
                            case "":
                                return "completion of work";
                            default:
                                throw new IllegalArgumentException("no number of elephant");
                        }
                    case "queen":
                        return chessBoard.blackChessTeam.queen.getInformation(chessBoard);
                    case "king":
                        return chessBoard.blackChessTeam.king.getInformation(chessBoard);
                    case "":
                        return "completion of work";
                    default:
                        throw new IllegalArgumentException("there is no such figure");
                }
            case "black":
                System.out.println("choose figure");
                input1 = reader.readLine();
                switch (input1) {
                    case "pawn":
                        System.out.println("choose number of pawn");
                        input1 = reader.readLine();
                        switch (input1) {
                            case "1":
                                return chessBoard.blackChessTeam.pawn1.getInformation(chessBoard);
                            case "2":
                                return chessBoard.blackChessTeam.pawn2.getInformation(chessBoard);
                            case "3":
                                return chessBoard.blackChessTeam.pawn3.getInformation(chessBoard);
                            case "4":
                                return chessBoard.blackChessTeam.pawn4.getInformation(chessBoard);
                            case "5":
                                return chessBoard.blackChessTeam.pawn5.getInformation(chessBoard);
                            case "6":
                                return chessBoard.blackChessTeam.pawn6.getInformation(chessBoard);
                            case "7":
                                return chessBoard.blackChessTeam.pawn7.getInformation(chessBoard);
                            case "8":
                                return chessBoard.blackChessTeam.pawn8.getInformation(chessBoard);
                            case "":
                                return "completion of work";
                            default:
                                throw new IllegalArgumentException("no number of pawn");
                        }
                    case "rook":
                        System.out.println("choose number of rook");
                        input1 = reader.readLine();
                        switch (input1) {
                            case "1":
                                return chessBoard.blackChessTeam.rook1.getInformation(chessBoard);
                            case "2":
                                return chessBoard.blackChessTeam.rook2.getInformation(chessBoard);
                            case "":
                                return "completion of work";
                            default:
                                throw new IllegalArgumentException("no number of rook");
                        }
                    case "horse":
                        System.out.println("choose number of horse");
                        input1 = reader.readLine();
                        switch (input1) {
                            case "1":
                                return chessBoard.blackChessTeam.horse1.getInformation(chessBoard);
                            case "2":
                                return chessBoard.blackChessTeam.horse2.getInformation(chessBoard);
                            case "":
                                return "completion of work";
                            default:
                                throw new IllegalArgumentException("no number of horse");
                        }
                    case "elephant":
                        System.out.println("choose number of elephant");
                        input1 = reader.readLine();
                        switch (input1) {
                            case "1":
                                return chessBoard.blackChessTeam.elephant1.getInformation(chessBoard);
                            case "2":
                                return chessBoard.blackChessTeam.elephant2.getInformation(chessBoard);
                            case "":
                                return "completion of work";
                            default:
                                throw new IllegalArgumentException("no number of elephant");
                        }
                    case "queen":
                        return chessBoard.blackChessTeam.queen.getInformation(chessBoard);
                    case "king":
                        return chessBoard.blackChessTeam.king.getInformation(chessBoard);
                    case "":
                        return "completion of work";
                    default:
                        throw new IllegalArgumentException("there is no such figure");
                }
            case "":
                return "completion of work";
            default:
                throw new IllegalArgumentException("no such team");
        }
    }
}
