package com.example.task14;

public class Task14 {


    public static int reverse(int value)
    {
        String valueAsString = Integer.toString(value);
        String temp = new StringBuilder(valueAsString).reverse().toString();
        return Integer.parseInt(temp);
    }

    public static void main(String[] args)
    {
        int result = reverse(345);
        System.out.println(result);
    }


}
