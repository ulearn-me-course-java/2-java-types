package com.example.task06;

public class Task06 {

    public static int solution(int x, int y)
    {
        int sum = x + y;
        int numbDigit = 0;

        do
        {
            numbDigit++;
            sum /= 10;
        }
        while (sum != 0);

        return numbDigit;
    }

    public static void main(String[] args)
    {
        int result = solution(12, 34);
        System.out.println(result);
    }

}