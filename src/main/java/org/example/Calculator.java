package org.example;

public final class Calculator {
    public static int plus(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Divide by zero");
        }
        return a / b;
    }

    public static int divide2(int a, int b) {
        return a / b;
    }
}
