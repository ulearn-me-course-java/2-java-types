package com.example.task14;

public class Task14
{
    public static int reverse(int value)
    {
        StringBuilder sb = new StringBuilder(String.valueOf(value));
        return Integer.parseInt(sb.reverse().toString());
    }

    public static void main(String[] args)
    {
        int result = reverse(345);
        String a = String.valueOf(result);
        System.out.println(result);
    }
}
