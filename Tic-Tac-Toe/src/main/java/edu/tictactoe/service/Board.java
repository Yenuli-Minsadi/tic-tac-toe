package edu.tictactoe.service;

public interface Board {

    void initializeBoard();
    boolean isLegalMove(int row, int column);
    void updateMove(int row, int column, Piece piece);
//    Winner checkWinner();

    Winner checkWinner(int row, int column, Piece piece);

    void printBoard();
    public boolean isBoardFull();

}
