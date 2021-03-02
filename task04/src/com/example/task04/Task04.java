package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        float res = 0;
        switch (operation) {
            case "+":
                res = a + b;
                break;
            case "-":
                res = a - b;
                break;
            case "*":
                res = a * b;
                break;
            case "/":
                res = (float) a / b;
                break;
        }
        return res;
    }

    public static void main(String[] args) {
        float result = calculate(-25, 5, "/");
        System.out.println(result);
    }

}
