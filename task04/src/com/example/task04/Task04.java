package com.example.task04;


public class Task04 {

    public static float calculate(int a, int b, String operation) {
        switch (operation) {
            case "+":
                return ((float)a + (float)b);
            case "-":
                return ((float)a - (float)b);
            case "/":
                return ((float)a / (float)b);
            case "*":
                return ((float)a * (float)b);
            default:
                System.out.println("Некорректные значения");
                return 0;
        }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        float result = calculate(10, 5, "*");
        System.out.println(result);
    }

}
