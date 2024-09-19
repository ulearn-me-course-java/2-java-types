package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.
        double epsilon = Math.pow(10, -precision);
        if ((Float.isInfinite(a) && Float.isInfinite(b)) &&
                (a > 0 && b > 0) || (a < 0) && (b < 0)) {
            return true;
        } else if ((Float.isNaN(a)) && (Float.isNaN(b))) {
            return true;
        }else if(precision == 0){
            return a==b;
        }
        else {
            double answer = Math.abs(a - b);
            return answer <= epsilon;
        }
    }

    public static void main(String[] args) {
        float a = 1f / 0f;
        float b = 1f / 0f;
        float sum = a + b;
        float c = 1f / 0f;

        boolean result = compare(1.0f, 2.0f, 0);
        System.out.println(result);

    }

}
