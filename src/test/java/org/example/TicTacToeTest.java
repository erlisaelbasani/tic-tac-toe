package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test
    void switchCurrentPlayerShouldSwitchFromXToO() {
        TicTacToe game = new TicTacToe();

        game.switchCurrentPlayer();

        assertEquals('O', game.getCurrentPlayer().getMarker());
    }

    @Test
    void switchCurrentPlayerShouldSwitchBackToX() {
        TicTacToe game = new TicTacToe();

        game.switchCurrentPlayer();
        game.switchCurrentPlayer();

        assertEquals('X', game.getCurrentPlayer().getMarker());
    }

    @Test
    void hasWinnerShouldReturnFalseAtStart() {
        TicTacToe game = new TicTacToe();

        assertFalse(game.hasWinner());
    }

    @Test
    void hasWinnerShouldReturnTrueForRowWin() {
        TicTacToe game = new TicTacToe();

        game.getBoard().place(0, 0, 'X');
        game.getBoard().place(0, 1, 'X');
        game.getBoard().place(0, 2, 'X');

        assertTrue(game.hasWinner());
    }

    @Test
    void hasWinnerShouldReturnTrueForColumnWin() {
        TicTacToe game = new TicTacToe();

        game.getBoard().place(0, 0, 'X');
        game.getBoard().place(1, 0, 'X');
        game.getBoard().place(2, 0, 'X');

        assertTrue(game.hasWinner());
    }

    @Test
    void hasWinnerShouldReturnTrueForDiagonalWin() {
        TicTacToe game = new TicTacToe();

        game.getBoard().place(0, 0, 'X');
        game.getBoard().place(1, 1, 'X');
        game.getBoard().place(2, 2, 'X');

        assertTrue(game.hasWinner());
    }

    @Test
    void resetGameShouldClearBoard() {
        TicTacToe game = new TicTacToe();

        game.getBoard().place(0, 0, 'X');
        game.resetGame();

        assertTrue(game.getBoard().isCellEmpty(0, 0));
    }

    @Test
    void resetGameShouldSetCurrentPlayerToX() {
        TicTacToe game = new TicTacToe();

        game.switchCurrentPlayer();
        game.resetGame();

        assertEquals('X', game.getCurrentPlayer().getMarker());
    }
}