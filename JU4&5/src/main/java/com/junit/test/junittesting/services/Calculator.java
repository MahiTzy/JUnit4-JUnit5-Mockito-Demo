package com.junit.test.junittesting.services;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int modulo(int a, int b) {
        return a % b;
    }

    public static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static int squareRoot(int a) {
        return (int) Math.sqrt(a);
    } 

    public static int factorial(int a) {
        if (a == 0) {
            return 1;
        }
        return a * factorial(a - 1);
    }

    public static int absolute(int a) {
        return Math.abs(a);
    }

    public static int sumAll(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
