package com.example.task10;

public class Task10 {
    public static boolean compare(float a, float b, int precision) {
        return Float.isNaN(a) && Float.isNaN(b)
                || a == b
                || Math.abs(a - b) < Math.pow(0.1, precision);
    }
}
