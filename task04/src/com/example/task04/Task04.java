package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        float c;

        switch (operation) {
            case "+":
                a += b;
                break;
            case "-":
                a -= b;
                break;
            case "*":
                a *= b;
                break;
            case "/":
                c = Float.parseFloat(String.valueOf(a)) / Float.parseFloat(String.valueOf(b));
                return c;
        }
        return Float.parseFloat(String.valueOf(a));
    }

    public static void main(String[] args) {

    }

}

