package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.
        double y = a + b;
        if (a == a + 1 && b == b + 1)
            if (Double.isNaN(y))
                return false;
            else return true;
        if (Double.isNaN(a) && Double.isNaN(b))
            return true;
        double eps = 0;
        if (precision != 0)
            eps = Math.pow(10, -precision);
        return Math.abs(a - b) <= eps;
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
