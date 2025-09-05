package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                if (b == 0) throw new ArithmeticException("Division by zero is prohibited");
                return (float) a / b;
            case "*":
                return a * b;
            default:
                throw new IllegalArgumentException("Unknown operator - " + operation);
        }

    }

    public static void main(String[] args) {

        float result = calculate(-25, 0, "/");
        System.out.println(result);
    }

}
