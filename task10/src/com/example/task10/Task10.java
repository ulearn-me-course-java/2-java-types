package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {


        if (Float.isNaN(a) || Float.isNaN(b)){
            return Float.compare(a, b) == 0;
        }
        if (Float.isInfinite(a) || Float.isInfinite(b)) {
            return Float.compare(a, b) == 0;
        }

        return Math.abs(a - b) < Math.pow(0.1, precision);

    }

    public static void main(String[] args) {


    }

}
