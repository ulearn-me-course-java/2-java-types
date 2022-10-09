package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {
        boolean flag = false;
        float f = 1.0f;
        while (precision != 0) {
            f = f / 10;
            precision--;
        }
        if (a == b)
            flag = true;
        if (Math.abs(a - b) < f)
            flag = true;
        if (Float.isNaN(a) && Float.isNaN(b))
            flag = true;
        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.
        
        return flag;

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
