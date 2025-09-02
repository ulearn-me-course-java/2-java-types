package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        switch (operation) {
            case "+":
                return (float) a + b;
            case "-":
                return (float) a - b;
            case "*":
                return (float) a * b;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Деление на ноль запрещено");
                }
                return (float) a / b;
            default:
                throw new IllegalArgumentException("Неизвестная операция: " + operation);
        }
    }

    public static void main(String[] args) {
        float result = calculate(-25, 5, "/");
        System.out.println(result);
        // еще раз. почему-то это задание отправилось вместе с task05. push
    }

}
