package org.example;

public final class Calculator {
    public static int plus(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int minus(int a, int b) {
        if (a < b) {
            throw new IllegalArgumentException("Oh, no, negative numbers!");
        }
        return a - b;
    }
}
