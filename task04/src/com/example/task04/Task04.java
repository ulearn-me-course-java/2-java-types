package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        float c = a;
        float d = b;

        if (operation == "+") {
            return c + d;
        } else if (operation == "-") {
            return c - d;
        } else if (operation == "*") {
            return c * d;
        }
        return c / d;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*float result = calculate(-25, 5, "/");
        System.out.println(result);*/
    }

}
