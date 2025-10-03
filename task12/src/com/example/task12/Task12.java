package com.example.task12;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task12 {

    public static BigDecimal benefit(BigDecimal sum, BigDecimal percent) {

        BigDecimal current = sum;

        // Считаем проценты за год
        for (int i = 1; i <= 12; i++) {
            BigDecimal monthlyInterest = current.multiply(percent);// Вычисляем проценты за месяц


            monthlyInterest = monthlyInterest.setScale(9, RoundingMode.HALF_UP);// Округляем проценты до 9 знаков с математическим округлением

            current = current.add(monthlyInterest);

            current = current.setScale(9, RoundingMode.HALF_UP);// Округляем итоговую сумму до 9 знаков
        }

        return current;
    }

    public static void main(String[] args) {

        BigDecimal sum = new BigDecimal(500).setScale(9, BigDecimal.ROUND_HALF_UP); // 500 руб. на счете
        BigDecimal percent = new BigDecimal(0.00000001f).setScale(9, BigDecimal.ROUND_HALF_UP); // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
