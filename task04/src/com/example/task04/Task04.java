package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        switch (operation){
            case ("+"):
                return a+b;
            case ("-"):
                return a-b;
            case ("*"):
                return a*b;
            case ("/"):
                return (float)a/b;
            default: return Float.NaN;
        }
    }

    /*
    public static float calculate(int a, int b, String operation) {
        return operation.equals("+") ? a + b :
                operation.equals("-") ? a - b :
                        operation.equals("*") ? a * b :
                                (float) a / b;
    }*/

    public static void main(String[] args) {
        float result = calculate(-25, 5, "/");
        System.out.println(result);
    }

}
