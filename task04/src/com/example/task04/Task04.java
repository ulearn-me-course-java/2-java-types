package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        float result;
        if (operation == "+") {
            result = a + b;
            return result;
        } else if (operation == "-") {
            result = a - b;
            return result;
        } else if (operation == "*") {
            result = a * b;
            return result;
        } else if (operation == "/") {
            result = (float) a / (float) b;
            return result;
        } else {
            System.out.println("Wrong operation");
            return 0;
        }
    }

    public static void main(String[] args) {

        float result = calculate(-25, 5, "/");
        System.out.println(result);
    }

}
