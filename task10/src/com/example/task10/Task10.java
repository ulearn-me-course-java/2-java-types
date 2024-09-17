package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.

        if (Float.isInfinite(a) && Float.isInfinite(b)) {
            return a == b;
        }
        if(Double.isNaN(a) && Double.isNaN(b)) return true;
        return Math.abs(a - b) < 0.1 / Math.pow(10, precision - 1);

    }

    public static void main(String[] args) {

    }

}
