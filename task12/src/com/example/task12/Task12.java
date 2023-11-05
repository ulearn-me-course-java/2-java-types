package com.example.task12;

import java.math.BigDecimal;

import static java.math.BigDecimal.ROUND_HALF_UP;

public class Task12 {

    public static BigDecimal benefit(BigDecimal sum, BigDecimal percent) {

        BigDecimal accrual;

        for (int i = 1; i <= 12; i++) {
            accrual = sum;
            accrual = accrual.multiply(percent);
            sum = sum.add(accrual);
        }
        sum = sum.setScale(9, ROUND_HALF_UP);

        return sum;
    }

    public static void main(String[] args) {

        BigDecimal sum = new BigDecimal(500).setScale(9, BigDecimal.ROUND_HALF_UP); // 500 руб. на счете
        BigDecimal percent = new BigDecimal(0.00000001f).setScale(9, BigDecimal.ROUND_HALF_UP); // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
