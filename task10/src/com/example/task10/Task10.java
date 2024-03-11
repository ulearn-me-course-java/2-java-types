package com.example.task10;

import javax.naming.NameNotFoundException;

import static java.lang.Float.NaN;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.
        if (Float.isNaN(a) && Float.isNaN(b)) {
            return true;
        }
        if (Float.isNaN(a) | Float.isNaN(b)) {
            return false;
        }
        if (Float.isInfinite(a) && Float.isInfinite(b) && !Float.isNaN(a + b)) {
            return true;
        }

        long pow = 1;

        for (int i = 0; i < precision; ++i){
            pow *= 10;
        }
        return Math.floor(a * pow) == Math.floor(b * pow);

    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;

        boolean result = compare(1.0f, 2.0f, 10);
        System.out.println(result);

    }

}
