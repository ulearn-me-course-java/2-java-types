package com.example.task04;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Task04 {
    public static float calculate(int a, int b, String operation) {
        float result;
        switch (operation) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "/":
                result = (float) a / b;
                break;
            case "*":
                result = a * b;
                break;
            default:
                throw new NotImplementedException();
        }
        return result;
    }
}
