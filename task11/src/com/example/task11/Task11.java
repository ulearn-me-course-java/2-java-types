package com.example.task11;

public class Task11 {

    public static float benefit(float sum, float percent) {
        // Считаем проценты за год
        float p, x, c = 0.0f;
        for (int i = 1; i <= 12; i++)
        {
            p = sum * percent - c;
            x = sum + p;
            c = (x - sum) - p;
            sum = x;
        }
        return sum;
    }

    public static void main(String[] args) {

        float sum = 500.0f; // 500 руб. на счете
        float percent = 0.000001f; // 0.000001% ежемесячно
        sum = benefit(sum, percent);
        System.out.println("Summ on next year: " + sum);

    }

}
