package com.example.task10;

public class Task10 {
    static boolean compare(float a, float b, int precision) {
        float epsilon = 1f;
        for (int i = 0; i < precision; i++) {
            epsilon *= 0.1;
        }
        return Math.abs(a - b) < epsilon || Double.isNaN(a) && Double.isNaN(b) || a == b;
    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;

        boolean result = compare(sum, c, 2);
        System.out.println(result);
    }
}
