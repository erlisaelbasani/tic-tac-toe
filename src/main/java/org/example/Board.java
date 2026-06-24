package org.example;

public class Board {
    private char[][] cells = new char[3][3];

    public Board() {
        this.clear();
    }

    public boolean isCellEmpty(int row, int column) {
        return this.cells[row][column] == ' ';
    }

    public void place(int row, int column, char marker) {
        this.cells[row][column] = marker;
    }

    public boolean isFull() {
        for(int i = 0; i < 3; ++i) {
            for(int j = 0; j < 3; ++j) {
                if (this.cells[i][j] == ' ') {
                    return false;
                }
            }
        }

        return true;
    }

    public void clear() {
        for(int i = 0; i < 3; ++i) {
            for(int j = 0; j < 3; ++j) {
                this.cells[i][j] = ' ';
            }
        }

    }

    public void print() {
        System.out.println("▁▁▁▁▁▁");

        for(int i = 0; i < 3; ++i) {
            char var10001 = this.cells[i][0];
            System.out.println("|" + var10001 + "|" + this.cells[i][1] + "|" + this.cells[i][2] + "|");
        }

        System.out.println("▔▔▔▔▔▔");
    }

    public char[][] getCells() {
        return this.cells;
    }
}
