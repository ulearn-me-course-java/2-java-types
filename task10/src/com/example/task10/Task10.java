package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {
        double epsilon = Math.pow(0.1, precision);
        if ((Double.POSITIVE_INFINITY == a && Double.POSITIVE_INFINITY == b) //special cases
                || (Double.NEGATIVE_INFINITY == a && Double.NEGATIVE_INFINITY == b)
                || (Double.isNaN(a) && Double.isNaN(b))) {
            return true;
        }
        return Math.abs(a - b) < epsilon;
    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.0f;
        float sum = a + b;
        float c = 0.7f / 0.0f;

        boolean result = compare(sum, c, 10);
        System.out.println(result);

    }

}
