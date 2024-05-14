package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        float num1 = (float) a;
        float num2 = (float) b;

        switch (operation) {
            case "+":
                num1 += num2;
                break;
            case "-":
                num1 -= num2;
                break;
            case "*":
                num1 *= num2;
                break;
            case "/":
                num1 /= num2;
                break;
        }

        return num1;
    }

    public static void main(String[] args) {
        float result = calculate(10_000_000, 0, "/");
        System.out.println(result);
    }

}