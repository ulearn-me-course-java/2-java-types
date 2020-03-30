package com.example.task04;

public class Task04 {

    public static float calculate(float a, float b, String operation) {

        if (operation == "+") return a+b;
        else if (operation == "-") return a-b;
        else if (operation == "*") return a*b;
        else if (operation == "/") return a/b;
        else return 0;

    }

    public static void main(String[] args) {

        float result = calculate(-25, 5, "/");
        System.out.println(result);

    }

}
