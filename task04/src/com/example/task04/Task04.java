package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        float number1 = (float)a;
        float number2 = (float)b;
        switch (operation){
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                return number1 / number2;
            default:
                return Float.NaN;
        }
    }

    public static void main(String[] args) {
        float result = calculate(-10, 3, "*");
        System.out.println(result);
    }
}
