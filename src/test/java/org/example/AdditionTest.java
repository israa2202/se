package org.example;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    @org.junit.jupiter.api.Test
    void add() {
        int result = Addition.add(2,3);
        int correct = 5;
        assertEquals(correct, result);


    }
}