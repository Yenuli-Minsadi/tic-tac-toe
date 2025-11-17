package edu.tictactoe.service;

public class BoardImpl implements Board {
    private Piece[][] piece = new Piece[3][3];

    public BoardImpl() {
        initializeBoard();
    }

    @Override
    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                piece[i][j]=Piece.EMPTY;
            }
        }
    }

    @Override
    public boolean isLegalMove(int row, int column) {
        return false;
    }

    @Override
    public void updateMove(int row, int column, Piece piece) {

    }

    @Override
    public Winner checkWinner() {
        return null;
    }

    @Override
    public void printBoard() {

    }
}
