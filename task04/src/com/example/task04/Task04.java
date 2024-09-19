package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        float res = 0;
        float a2 = a;
        float b2 = b;
        switch (operation) {
            case "+":
                res = a2 + b2;
                break;
            case "-":
                res = a2 - b2;
                break;
            case "*":
                res = a2 * b2;
                break;
            case "/":
                res = a2 / b2;
                break;
        }
        return res;


    }

    public static void main(String[] args) {

    }

}
