package com.example.task10;

import java.lang.Math;


public class Task10 {

    public static boolean compare(float a, float b, int precision) {
        float accurate = (float) Math.pow(10, precision);
        if (Float.isNaN(a) || Float.isNaN(b))
            if (Float.isNaN(a) && Float.isNaN(b))
                return true;
            else return false;
        if ((Float.POSITIVE_INFINITY == a) & (Float.POSITIVE_INFINITY == b))
            return true;
        if ((Float.NEGATIVE_INFINITY == a) & (Float.NEGATIVE_INFINITY == b))
            return true;
        a = (long) (a * accurate);
        b = (long) (b * accurate);
        return b == a;
    }


    public static void main(String[] args) {
        float a = 0.70000005f;
        float b = 0.7f;

        boolean result = compare(a, b, 2);
        System.out.println(result);

    }

}
