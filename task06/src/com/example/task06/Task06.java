package com.example.task06;

public class Task06
{
    public static int solution(int x, int y)
    {
        String c = Integer.toString(x + y);
        if (c.contains("-"))
            return c.length() - 1;
        return c.length();
    }

    public static void main(String[] args)
    {
        int result = solution(-111, -222);
        System.out.println(result);
    }
}
