package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        float result = 0;
        if (operation == "+") {
            result = a + b;
        }
        else if (operation == "-") {
            result = a - b;
        }
        else if (operation == "*") {
            result = a * b;
        }
        else if (operation == "/" && b != 0) {
            result = (float) a / b;
        }
        else System.out.println("Возможно вы делите на 0");
        return result;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        float result = calculate(-36, 5, "/");
        System.out.println(result);
    }

}
