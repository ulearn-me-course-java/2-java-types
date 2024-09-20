package com.example.task14;

public class Task14
{
    public static int reverse(int value)
    {
        String strNum = Integer.toString(value);
        String result = "";
        for(int i = strNum.length()-1; i>-1; i--)
        {
            result+=strNum.charAt(i);
        }

        return Integer.parseInt(result);
    }

    public static void main(String[] args)
    {
        int result = reverse(345);
        System.out.println(result);
    }
}
