package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        try{
            switch (operation){
                case "+":
                    return a+b;
                case "-":
                    return a-b;
                case"*":
                    return a*b;
                case"/":
                    return (float)a/b;
                default:
                    System.out.print("Incorrect operation: " + "<"+operation+">" + " ");
                    return 0;
            }
        }
        catch (Exception ex) {
            System.out.print("DivideByZero.");
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(calculate(12, 0, "/"));
        System.out.println(calculate(1, 1, "-"));
        System.out.println(calculate(3, 15, "5"));
        System.out.println(calculate(-2147000000, 2147000000, "*"));
    }
}