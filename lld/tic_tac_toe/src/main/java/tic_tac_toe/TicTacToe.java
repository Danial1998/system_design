package tic_tac_toe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Board board = new Board(3);
        Player currentPlayer = Player.X;

        Scanner scanner = new Scanner(System.in);
        while(board.checkWin() == Player.EMPTY && !board.isFull()){
            board.displayBoard();
            System.out.println("Player "+currentPlayer+", enter your move (row and column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if(board.makeMove(row,col,currentPlayer)){
                currentPlayer = (currentPlayer == Player.X) ? Player.O : Player.X;
            } else {
                System.out.println("Invalid Move, try again");
            }
        }

        board.displayBoard();
        Player winner = board.checkWin();
        if(winner != Player.EMPTY) System.out.println("Player "+winner+" wins!");
        else System.out.println("It's a draw");
    }
}
