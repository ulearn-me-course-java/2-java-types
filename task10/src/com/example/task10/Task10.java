package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {
        if ((Double.isNaN(a) && Double.isNaN(b)) || Math.abs(a - b) < Math.pow(10, -precision))
            return true;
        return a==b;
    }
}
