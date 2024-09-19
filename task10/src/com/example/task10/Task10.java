package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {
    if  (Double.isNaN(a - b)) // a - b == NaN может быть только при Inf - Inf или (a || b == NaN)
        return Double.isNaN(a) && Double.isNaN(b) || Double.isInfinite(a) && Double.isInfinite(b);
    else
        return Math.abs(a - b) <  Math.pow(0.1, Math.max(precision, 1));
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
