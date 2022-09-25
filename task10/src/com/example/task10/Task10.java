package com.example.task10;
public class Task10 {

    public static boolean compare(float a, float b, int precision) {
        if (Float.isNaN(a) && Float.isNaN(b) || Float.isInfinite(a) && Float.isInfinite(b) && !Float.isNaN(a+b)) return true;
        return Math.abs(a - b) < Math.pow(10, -1*precision);
    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.4f;
        float sum = 0.0f;
        float c = Float.NaN;
        boolean result = compare(sum, c, 2);
        System.out.println(result);

    }

}
