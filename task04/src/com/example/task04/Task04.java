package com.example.task04;

public class Task04 {
    static float calculate(int a, int b, String operation) {
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
        throw new IllegalArgumentException("Данная операция выходит за пределы знания текущего метода");
    }

    public static void main(String[] args) {
        float result = calculate(2, 2, "+");
        System.out.println(result);
    }

}
