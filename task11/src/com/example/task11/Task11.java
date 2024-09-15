package com.example.task11;

public class Task11
{
    public static float benefit(float sum, float percent)
    {
        System.out.println((float)(sum*(1 + percent * 12.0)));
        return (float)(sum*Math.pow(1.0 + percent, 12.0));
    }

    public static void main(String[] args)
    {

        float sum = 500.000000000f; //   500 руб. на счете
        float percent = 0.00000001f; // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.printf("Сумма на счете через год: %.10f%n", sum);
    }
}