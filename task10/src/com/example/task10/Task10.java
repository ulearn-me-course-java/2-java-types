package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.
        
        return Math.abs(a - b) < 1 / Math.pow(10, precision) ||
                Double.isNaN(a) && Double.isNaN(b) ||
                Double.compare(a, Double.NEGATIVE_INFINITY) == 0 && Double.compare(b, Double.NEGATIVE_INFINITY) == 0 ||
                Double.compare(a, Double.POSITIVE_INFINITY) == 0 && Double.compare(b, Double.POSITIVE_INFINITY) == 0;

    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;

        boolean result = compare(sum, c, 2);
        System.out.println(result);

    }

}
