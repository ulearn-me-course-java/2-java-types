package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {
        if (a == Double.POSITIVE_INFINITY) {
            if (b == Double.POSITIVE_INFINITY)
                return true;
            else if (b == Double.NEGATIVE_INFINITY)
                return false;
        } else if (a == Double.NEGATIVE_INFINITY) {
            if (b == Double.POSITIVE_INFINITY)
                return false;
            else if (b == Double.NEGATIVE_INFINITY)
                return true;
        }
        if (Float.isNaN(a) && Float.isNaN(b))
            return true;
        return Math.abs(a - b) < Math.pow(0.1, precision);

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
