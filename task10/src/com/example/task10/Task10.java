package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {
        if (Float.isInfinite(a) && Float.isInfinite(b)) {
            return a == b;
        }
        if(Double.isNaN(a) && Double.isNaN(b)) return true;
        return Math.abs(a - b) < 0.1 / Math.pow(10, precision - 1);


    }

    public static void main(String[] args) {

    }

}
