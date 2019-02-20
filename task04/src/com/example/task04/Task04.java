package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        switch (operation){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "/":
                return b == 0 ? Float.NaN : (float) a/b;
            case "*":
                return a*b;
            default:
                throw new IllegalArgumentException("Incorrect data");
        }
    }

    public static void main(String[] args) {    }

}
