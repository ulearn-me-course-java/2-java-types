package com.example.task11;

public class Task11 {

    public static float benefit(float sum, float percent) {

        // TODO исправьте функцию, чтобы избежать накопления ошибки

        // Считаем проценты за год

        return (float)(sum * Math.pow(percent + 1.0, 12));
    }

    public static void main(String[] args) {

        float sum = 1000; // 500 руб. на счете
        float percent = 1f; // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
