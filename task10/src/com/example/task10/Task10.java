package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.

        if (Double.isInfinite(a) && Double.isInfinite(b)){
            if(Double.POSITIVE_INFINITY == a && Double.POSITIVE_INFINITY == b)
                return true;
            else if(Double.NEGATIVE_INFINITY == a && Double.NEGATIVE_INFINITY == b)
                return true;
            else
                return false;
        } else if (Double.isNaN(a) && Double.isNaN(b))
            return true;
        else if (Math.abs(a - b) < Math.pow(0.1,precision))
            return true;
        else
            return false;
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
