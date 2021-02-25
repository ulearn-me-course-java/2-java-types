package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {
        if(Float.isNaN(a) || Float.isNaN(b) ) return Float.isNaN(a) == Float.isNaN(b);
        if(Float.isInfinite(a)|| Float.isInfinite(b)) return a == b;
        return Math.abs(a-b)<Math.pow(0.1,precision);
    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.49f;
        float sum = a + b;
        float c = 0.79f;

        boolean result = compare(sum, c, 2);
        System.out.println(result);
    }

}
