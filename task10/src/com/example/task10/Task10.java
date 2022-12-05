package com.example.task10;

public class Task10 {

    public static float toFloat(float a, int precision) {
        if (precision != 0) {
            String aTemporary = Float.toString(a);
            for (int i = precision + 1; i > 0; i--) aTemporary = aTemporary.concat("0");
            return Float.parseFloat(aTemporary.substring(0, aTemporary.indexOf(".") + precision + 1));
        }
        return (float) Math.floor(a);
    }

    public static boolean compare(float a, float b, int precision) {

        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.
        if (a == Float.POSITIVE_INFINITY && b != Float.POSITIVE_INFINITY) return false;
        else if (a == Float.POSITIVE_INFINITY && b == Float.POSITIVE_INFINITY) return true;
        if (a == Float.NEGATIVE_INFINITY && b != Float.NEGATIVE_INFINITY) return false;
        else if (a == Float.NEGATIVE_INFINITY && b == Float.NEGATIVE_INFINITY) return true;
        if (a != Float.POSITIVE_INFINITY && b == Float.POSITIVE_INFINITY) return false;
        if (a != Float.NEGATIVE_INFINITY && b == Float.NEGATIVE_INFINITY) return false;
        if (Float.isNaN(a) && Float.isNaN(b)) return true;
        if (!Float.isNaN(a) && Float.isNaN(b)) return false;
        if (Float.isNaN(a) && !Float.isNaN(b)) return false;
        a = toFloat(a, precision);
        b = toFloat(b, precision);
        System.out.println(a);
        System.out.println(b);
        return a == b;

    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;

        boolean result = compare(sum, c, 2);
        System.out.println(result);
        System.out.println(compare(100.001f, 100.009f, 3));
    }

}
