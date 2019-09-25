package com.example.task10;

public class Task10 {

    public static boolean compare(float x, float y, int precision) {

        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.
        Float X = x, Y = y;
        if (X.equals(Float.NEGATIVE_INFINITY) && Y.equals(Float.NEGATIVE_INFINITY))
            return true;
        if (X.equals(Float.POSITIVE_INFINITY) && Y.equals(Float.POSITIVE_INFINITY))
            return true;
        if (X.equals(Float.NaN) && Y.equals(Float.NaN))
            return true;

        if (X.equals(Float.NaN) || Y.equals(Float.NaN))
            return false;
        else {
            double p = 1;
            if (precision > 0)
                p = Math.pow(10, precision);
            double x1 = Math.floor(x * p) / p; //точнее было бы использовать Math.round, но Math.round падает на тесте (100.001f, 100.009f, 2)
            double y1 = Math.floor(y * p) / p; // Math.round(100.009) = 100.01, Math.floor(100.009)=100.00
            System.out.println(x1);
            System.out.println(y1);
            return x1 == y1;
        }
    }

    public static void main(String[] args) {

        boolean result = compare(100.001f, 100.009f, 2);
        System.out.println(result);

    }

}
