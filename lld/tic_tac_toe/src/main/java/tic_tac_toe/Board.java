package tic_tac_toe;

public class Board {
    private Player[][] grid;
    private int size;

    public Board(int size) {
        this.size = size;
        grid = new Player[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = Player.EMPTY;
            }
        }
    }

    public Player checkWin() {
        //check rows
        for (int i = 0; i < size; i++) {
            if (grid[i][0] != Player.EMPTY && checkRow(i)) {
                return grid[i][0];
            }
        }

        //check columns
        for (int i = 0; i < size; i++) {
            if (grid[0][i] != Player.EMPTY && checkCol(i)) {
                return grid[0][i];
            }
        }

        if (grid[0][0] != Player.EMPTY && checkDiagonal1()) {
            return grid[0][0];
        }

        if (grid[0][size - 1] != Player.EMPTY && checkDiagonal2()) {
            return grid[0][size - 1];
        }

        return Player.EMPTY;

    }

    private boolean checkCol(int col) {
        for (int i = 1; i < size; i++) {
            if (grid[i][col] != grid[0][col]) return false;
        }
        return true;
    }

    private boolean checkRow(int row) {
        for (int i = 1; i < size; i++) {
            if (grid[row][i] != grid[row][0]) return false;
        }
        return true;
    }

    public boolean checkDiagonal1() {
        for (int i = 1; i < size; i++) {
            if (grid[i][i] != grid[0][0]) return false;
        }
        return true;
    }

    public Boolean checkDiagonal2() {
        for (int i = 1; i < size; i++) {
            if (grid[i][size - i - 1] != grid[0][size - 1]) return false;
        }
        return true;
    }

    public boolean isFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (grid[i][j] == Player.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean makeMove(int row, int col, Player player) {
        if (grid[row][col] == Player.EMPTY) {
            grid[row][col] = player;
            return true;
        }
        return false;
    }

    public void displayBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                switch (grid[i][j]) {
                    case X:
                        System.out.print("X ");
                        break;
                    case O:
                        System.out.print("O ");
                        break;
                    default:
                        System.out.print(". ");
                        break;
                }
            }
            System.out.println();
        }
    }
}
