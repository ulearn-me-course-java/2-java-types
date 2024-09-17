package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.
        if (Float.isNaN(a) && Float.isNaN(b)) {return true;}
        else if (Float.isInfinite(a) && Float.isInfinite(b) && !Float.isNaN(a+b)) {return true;}
        else if (precision == 0) {return a == b;}
        return Math.abs(a - b) <= Math.pow(10, -precision);

    }

    public static void main(String[] args) {
        float a = 1f;
        float b = 2f;
        float sum = a + b;
        float c = 3f;

        boolean result = compare(a, b, 1);
        System.out.println(result);

    }

}
