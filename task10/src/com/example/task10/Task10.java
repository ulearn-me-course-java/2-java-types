package com.example.task10;

public class Task10 {
    public static boolean compare(float a, float b, int precision) {
        return Math.abs(a - b) < Math.pow(0.1, precision) || a == b || Float.isNaN(a) && Float.isNaN(b);
    }

    public static void main(String[] args) {
        float amount = 0.3f + 0.4f;
        System.out.println(compare(amount, 0.7f, 2));
    }
}