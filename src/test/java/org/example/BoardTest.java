package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void isCellEmptyShouldReturnTrueForEmptyCell() {
        Board board = new Board();

        assertTrue(board.isCellEmpty(0, 0));
    }

    @Test
    void isCellEmptyShouldReturnFalseForOccupiedCell() {
        Board board = new Board();

        board.place(0, 0, 'X');

        assertFalse(board.isCellEmpty(0, 0));
    }

    @Test
    void isFullShouldReturnFalseForNewBoard() {
        Board board = new Board();

        assertFalse(board.isFull());
    }

    @Test
    void isFullShouldReturnTrueForFullBoard() {
        Board board = new Board();

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                board.place(row, column, 'X');
            }
        }

        assertTrue(board.isFull());
    }

    @Test
    void clearShouldEmptyOccupiedCell() {
        Board board = new Board();

        board.place(1, 1, 'O');
        board.clear();

        assertTrue(board.isCellEmpty(1, 1));
    }

    @Test
    void placeShouldPutMarkerInCell() {
        Board board = new Board();

        board.place(2, 2, 'X');

        assertEquals('X', board.getCells()[2][2]);
    }
}