package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        float res;
        if (operation == "+") {
            res = a + b;
            return res;
        } else if (operation == "-") {
            res = a - b;
            return res;
        } else if (operation == "*") {
            res = a * b;
            return res;
        } else if (operation == "/") {
            res = (float) a / (float) b;
            return res;
        } else {
            System.out.println("Wrong");
            return 0;
        }
    }

    public static void main(String[] args) {

        float result = calculate(-25, 5, "/");
        System.out.println(result);
    }

}
