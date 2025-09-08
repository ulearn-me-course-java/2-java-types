package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;

            case "/":
                if (b == 0) {
                    throw new ArithmeticException("деление на ноль");
                }
                return (float) a / b;
            case "*":
                return a * b;

            default:
                throw new ArithmeticException("нет такого операнда");

        }
    }

    public static void main(String[] args) {

        float result = calculate(-25, 5, "/");
        System.out.println(result);

    }

}
