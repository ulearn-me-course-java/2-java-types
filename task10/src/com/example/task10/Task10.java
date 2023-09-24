package com.example.task10;

import static java.lang.Math.abs;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.

        return (Float.POSITIVE_INFINITY == a && Float.POSITIVE_INFINITY == b) ||
                (Float.NEGATIVE_INFINITY == a && Float.NEGATIVE_INFINITY == b) ||
                (Float.isNaN(a) && Float.isNaN(b)) ||
                Math.abs(a - b) < Math.pow(10, -precision);


    }

    public static void main(String[] args) {
        float a = 541.162f;
        float b = 541.162f;
        float sum = a + b;

        float c = 2f;

        boolean result = compare(a, b, 0);
        System.out.println(result);

    }

}
