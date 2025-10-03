package com.example.task11;

public class Task11 {

    public static float benefit(float sum, float percent) {
        float totalInterest = 0.0f;
        float current = sum;

        for (int i = 1; i <= 12; i++) {
            float monthlyInterest = current * percent;
            totalInterest += monthlyInterest; //накапливает все проценты отдельно, меньше потерь точности
            current += monthlyInterest;
        }

        return sum + totalInterest; //Одно финальное сложение - вместо 12 операций сложения, только 1 в конце
    }

    public static void main(String[] args) {

        float sum = 500; // 500 руб. на счете
        float percent = 0.00000001f; // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
