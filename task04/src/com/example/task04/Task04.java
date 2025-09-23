package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        switch(operation){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case"*":
                return a*b;
            case"/":
                if (b==0) throw new ArithmeticException("Division by zero is not possible");
                return (float) a/b;
            default:
                throw new IllegalArgumentException("Unknown symbol" +operation);
        }
    }

    public static void main(String[] args) {

        float result = calculate(-25, 5, "/");
        System.out.println(result);

    }

}
