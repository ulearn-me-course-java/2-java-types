package com.example.task10;
import jdk.internal.math.FloatingDecimal;

import java.lang.Math;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {
        if (Float.isNaN(a) && Float.isNaN(b)) return true;
        else if (Float.isNaN(a) || Float.isNaN(b)) return false;
        else if (Float.isInfinite(a) && Float.isInfinite(b) && !Float.isNaN(a + b)) return true;

        float multiplier = (float) Math.pow(10, precision);
        return (long) (a * multiplier) == (long) (b * multiplier);
    }

    public static void main(String[] args) {
    }

}
