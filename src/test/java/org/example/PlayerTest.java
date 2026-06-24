package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void getMarkerShouldReturnX() {
        Player player = new Player('X');

        assertEquals('X', player.getMarker());
    }

    @Test
    void getMarkerShouldReturnO() {
        Player player = new Player('O');

        assertEquals('O', player.getMarker());
    }
}