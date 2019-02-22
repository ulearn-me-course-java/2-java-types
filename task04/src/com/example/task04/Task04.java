package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        float num1 = (float) a;
        float num2 = (float) b;

        if (operation.equals("+"))
            num1 += num2;
        else if (operation.equals("-"))
            num1 -= num2;
        else if (operation.equals("*"))
            num1 *= num2;
        else if (operation.equals("/"))
            num1 /= num2;

        return num1;
    }

    public static void main(String[] args) {
        System.out.println(calculate(10_000_000, 0, "/"));

    }

}
