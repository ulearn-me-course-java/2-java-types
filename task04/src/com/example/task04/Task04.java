package com.example.task04;

public class Task04 {
    public static float calculate(int a, int b, String operation) {
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                return (float)a / b;
            case "*":
                return a * b;
        }
        throw new IllegalArgumentException("Invalid operation");
    }

    public static void main(String[] args) {
        System.out.println(calculate(1, 0, "/"));
    }
}