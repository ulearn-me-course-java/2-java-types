package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        float result;
        float x = (float) a;
        float y = (float) b;
        if(operation == "+") result = x + y;
        else if(operation == "-") result = x - y;
        else if(operation == "*") result = x * y;
        else if(operation == "/") result = x / y;
        else result = 0;

        return result;
    }

    public static void main(String[] args) {

        float result = calculate(-25, 5, "/");
        System.out.println(result);

    }

}
