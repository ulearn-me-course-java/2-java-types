package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    System.out.println("Делать на 0 нельзя"); //обрабатываем исключение при делении на 0
                    return 0;
                } else {
                    return (float) a / b;
                }
        }
        return 0;
    }

    public static void main(String[] args) {
        float result = calculate(-25, 0, "/");
        System.out.println(result);
    }

}
