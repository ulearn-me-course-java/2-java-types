package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        float result = 0;

        switch (operation) {
            case "+":
                result = a + b;
                break;

            case "-":
                result = a - b;
                break;

            case "/":
                result = a / b;
                break;

            case "*":
                result = a * b;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        float result = calculate(-25, 10, "+");
        System.out.println(result);
    }
}
