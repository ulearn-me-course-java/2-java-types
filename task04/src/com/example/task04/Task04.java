package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation)
    {
        float argument1 = (float) a;
        float argument2 = (float) b;
        switch (operation)
        {
            case "+":
                return argument1 + argument2;
            case "-":
                return argument1 - argument2;
            case "*":
                return argument1 * argument2;
            case "/":
                return argument1 / argument2;
            default:
                return Float.NaN;
        }
    }
        public static void main (String[] args)
        {
            float result = calculate(-25, 5, "/");
            System.out.println(result);
        }

    }

