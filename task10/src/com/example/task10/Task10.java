package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {
        return (Math.abs(a - b) / Math.pow(10, precision)) < 1 ||
                Double.isNaN(a) && Double.isNaN(b) ||
                Double.compare(Double.NEGATIVE_INFINITY, a) == 0 && Double.compare(Double.NEGATIVE_INFINITY, b) == 0 ||
                Double.compare(Double.POSITIVE_INFINITY, a) == 0 && Double.compare(Double.POSITIVE_INFINITY, b) == 0;

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
