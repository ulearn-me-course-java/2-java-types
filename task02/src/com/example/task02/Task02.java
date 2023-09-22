package com.example.task02;

public class Task02 {

    public  static boolean check(int degree, double num)
    {
        double max = Math.pow(2, degree) - 1;
        double min = -Math.pow(2, degree);
        return num >= min & num <= max;
    }

    public static String solution(String input)
    {
        double num = Double.parseDouble((input));
        if(check(7, num)){
            return "byte";
        }
        else if (check(15, num))
        {
            return "short";
        }
        else if (check(31, num)) {
            return "int";
        }
        else {
            return "long";
        }
    }

    public static void main(String[] args)
    {
        solution("-35000");
    }

}