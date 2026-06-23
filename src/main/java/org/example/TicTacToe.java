package org.example;

public class TicTacToe {
    private char[][] board;
    private char currentPlayer;

    public void start() {
        board = new char[3][3];
        currentPlayer = 'X';

        initializeBoard();
        printBoard();
        makeMove();
        printBoard();
    }

    private void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

    private void printBoard() {
        System.out.println("Aktuelles Spielfeld:");

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    private void makeMove() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Spieler " + currentPlayer + ", Zeile eingeben (0-2): ");
        int row = scanner.nextInt();

        System.out.print("Spieler " + currentPlayer + ", Spalte eingeben (0-2): ");
        int col = scanner.nextInt();

        board[row][col] = currentPlayer;
    }
}