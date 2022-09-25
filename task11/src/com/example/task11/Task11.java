package com.example.task11;

public class Task11 {

    public static float benefit(float sum, float percent) {

        // TODO исправьте функцию, чтобы избежать накопления ошибки

        // Считаем проценты за год
        float sumPercent = 0.0f, x = 0.0f, sumInaccuracy = 0.0f;
            for (int i = 1; i <= 12; i++) {
                sumPercent = sum *  percent - sumInaccuracy;
                x = sum + sumPercent;
                sumInaccuracy = (x - sum) - sumPercent;
                sum = x;
            }
        return sum;
    }

    public static void main(String[] args) {

        float sum = 500; // 500 руб. на счете
        float percent = 0.0100077f; // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
