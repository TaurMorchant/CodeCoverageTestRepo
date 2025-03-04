package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void plus() {
        assertEquals(5, Calculator.plus(2, 3));
    }

    @Test
    void multiply() {
        assertEquals(6, Calculator.multiply(2, 3));
    }

    @Test
    void divide() {
        assertEquals(2, Calculator.divide(4, 2));
    }
}