package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void plus() {
        assertEquals(5, Calculator.plus(2, 3));
    }
}