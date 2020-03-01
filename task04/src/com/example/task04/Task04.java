package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        float result = 0;
        float num1 = a;
        float num2 = b;

        switch (operation){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "*":
                result = num1 * num2;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        float result = calculate(-25, 5, "/");
        System.out.println(result);
    }

}
