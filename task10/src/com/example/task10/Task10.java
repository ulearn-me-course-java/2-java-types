package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        return Float.isNaN(a) && Float.isNaN(b) ||
                a == Float.POSITIVE_INFINITY && b == Float.POSITIVE_INFINITY ||
                a == Float.NEGATIVE_INFINITY && b == Float.NEGATIVE_INFINITY ||
                Math.abs(a - b) < Math.pow(0.1, precision);
    }

    public static void main(String[] args) {
        float a = 100.001f;
        float b = 100.009f;
        float sum = a + b;
        float c = 200.010f;

        boolean result = compare(sum, c, 4);
        System.out.println(result);

    }

}
