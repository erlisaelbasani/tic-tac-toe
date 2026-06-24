package org.example;

public class TicTacToe {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;

    public TicTacToe() {
        player1 = new Player('X');
        player2 = new Player('O');
        currentPlayer = player1;
        board = new Board();
    }

    public boolean makeMove(int row, int column) {
        if (row < 0 || row > 2 || column < 0 || column > 2) {
            return false;
        }

        if (!board.isCellEmpty(row, column)) {
            return false;
        }

        board.place(row, column, currentPlayer.getMarker());
        return true;
    }

    public void switchCurrentPlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    public boolean hasWinner() {
        char[][] c = board.getCells();
        char m = currentPlayer.getMarker();

        for (int i = 0; i < 3; i++) {
            if (c[i][0] == m && c[i][1] == m && c[i][2] == m) {
                return true;
            }

            if (c[0][i] == m && c[1][i] == m && c[2][i] == m) {
                return true;
            }
        }

        if (c[0][0] == m && c[1][1] == m && c[2][2] == m) {
            return true;
        }

        return c[0][2] == m && c[1][1] == m && c[2][0] == m;
    }

    public boolean isDraw() {
        return board.isFull() && !hasWinner();
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public Board getBoard() {
        return board;
    }
}
