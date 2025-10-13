package com.example.task12;

import java.math.BigDecimal;

public class Task12 {


    public static BigDecimal benefit(BigDecimal sum, BigDecimal percent) {
        int scale = 9;

        sum = sum.setScale(scale, BigDecimal.ROUND_HALF_UP);
        percent = percent.setScale(scale, BigDecimal.ROUND_HALF_UP);

        BigDecimal result = sum;

        for (int i = 1; i <= 12; i++) {
            BigDecimal increment = result.multiply(percent).setScale(scale, BigDecimal.ROUND_HALF_UP);
            result = result.add(increment).setScale(scale, BigDecimal.ROUND_HALF_UP);
        }

        return result;
    }

    public static void main(String[] args) {

        BigDecimal sum = new BigDecimal(500).setScale(9, BigDecimal.ROUND_HALF_UP); // 500 руб. на счете
        BigDecimal percent = new BigDecimal(0.00000001f).setScale(9, BigDecimal.ROUND_HALF_UP); // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
