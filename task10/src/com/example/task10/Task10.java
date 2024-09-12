package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        if (Float.isNaN(a) && Float.isNaN(b)) {
            return true;
        }

        if (Float.isInfinite(a) && Float.isInfinite(b)) {
            return a == b;
        }

        double diff = Math.abs(a - b);


        double threshold;
        if (precision == 0) {
            threshold = 0;
        } else {
            threshold = Math.pow(10, -precision);
        }
        return diff <= threshold;
    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;

        boolean result = compare(sum, c, 2);
        System.out.println(result);

        float x = 1.0f;
        float y = 2.0f;
        result = compare(x, y, 0);
        System.out.println(result); // Вывод: false
    }

}