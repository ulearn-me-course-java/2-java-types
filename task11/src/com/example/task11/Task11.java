package com.example.task11;

public class Task11 {

    public static float benefit(float sum, float percent) {

        for (int i = 1; i <= 12; i++)
        {
            sum += sum * percent;
        }
        return (float) (sum * Math.pow(1.0 + percent, 12));
    }

    public static void main(String[] args) {

        float sum = 500f;
        float percent = 0.00000001f;

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
