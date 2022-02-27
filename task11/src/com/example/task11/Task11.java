package com.example.task11;

import java.math.BigDecimal;

public class Task11 {

    public static float benefit(float sum, float percent) {

        // TODO исправьте функцию, чтобы избежать накопления ошибки



        // Считаем проценты за год
        return (float)(sum * Math.pow(1.0 + percent, 12));
    }

    public static void main(String[] args) {

        float sum = 1000; // 500 руб. на счете
        float percent = 0f; // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println(sum);

    }

}
