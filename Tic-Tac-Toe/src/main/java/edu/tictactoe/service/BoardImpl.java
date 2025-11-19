package edu.tictactoe.service;

public class BoardImpl implements Board {
    private Piece[][] pieces = new Piece[3][3];

    public BoardImpl() {
        initializeBoard();
    }

    @Override
    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                pieces[i][j]=Piece.EMPTY;
            }
        }
    }

    @Override
    public boolean isLegalMove(int row, int column) {
        return pieces[row][column]==Piece.EMPTY;
    }

    @Override
    public void updateMove(int row, int column, Piece piece) {
         pieces[row][column]=piece;
    }

    @Override
    public Winner checkWinner(int row, int column, Piece piece) {
//        for (int i=0; i<3; i++) {
//            if (pieces[i][0] == pieces[i][1] && pieces[i][1] == pieces[i][2] && pieces[i][0] != Piece.EMPTY) {
//                return new Winner(pieces[i][0], i, 0, i, 1, i, 2);
//            }
//            if (pieces[0][i] == pieces[1][i] && pieces[0][i] == pieces[2][i] && pieces[0][i] != Piece.EMPTY) {
//                return new Winner(pieces[0][i], 0, i, 1, i, 2, i);
//            }
//        }
//            if (pieces[0][0]==pieces[1][1] && pieces[0][0]==pieces[2][2] && pieces[0][0] != Piece.EMPTY) {
//                return new Winner(pieces[0][0],0,0,1,1,2,2);
//            }
//            if (pieces[0][2]==pieces[1][1] && pieces[1][1]==pieces[2][0] && pieces[0][2] != Piece.EMPTY) {
//                return new Winner(pieces[0][2],0,2,1,1,2,0);
//            }
//            return null;

        //checking from the last moved row only
        if (pieces[row][0]==piece && pieces[row][1]==piece && pieces[row][2]==piece) {
            return new Winner(piece,row,0,row,1,row,2);
        }

        //checking from the last moved column only
        if (pieces[0][column]==piece && pieces[1][column]==piece && pieces[2][column]==piece) {
            return new Winner(piece,0,column,1,column,2,column);
        }

        //checking diagonal from left to right
        if (row == column) {
            if (pieces[0][0]==piece && pieces[1][1]==piece && pieces[2][2]==piece) {
                return new Winner(piece,0,0,1,1,2,2);
            }
        }

        //checking diagonal from right to left
        if (row + column == 2) {
            if (pieces[0][2]==piece && pieces[1][1]==piece && pieces[2][0]==piece) {
                return new Winner(piece,0,2,1,1,2,0);
            }
        }
        return null;
    }

    @Override
    public void printBoard() {
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.println(pieces[i][j]+" ");
            }
            System.out.println();
        }
    }

    @Override
    public boolean isBoardFull() {
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if (pieces[i][j]==Piece.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
