package com.example.task04;

public class Task04 {


    public static float calculate(int a, int b, String operation) {
        float result;
        switch (operation) {
            case "*":
                result = a * b;
                break;
            case "/":
                result = Float.parseFloat(String.valueOf(a)) / Float.parseFloat(String.valueOf(b));
                break;
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            default:
                result = 0;
        }
        return result;
    }

    public static void main(String[] args) {
    }

}
