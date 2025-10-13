package com.example.task11;

public class Task11 {

    public static float benefit(float sum, float percent) {
        float totalIncrement = 0.0f;
        float current = sum;

        for (int i = 1; i <= 12; i++) {
            float increment = current * percent;
            totalIncrement += increment;
            current += increment;
        }

        return sum + totalIncrement;
    }

    public static void main(String[] args) {

        float sum = 500; // 500 руб. на счете
        float percent = 0.00000001f; // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
