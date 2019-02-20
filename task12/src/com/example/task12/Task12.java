package com.example.task12;
import java.math.BigDecimal;

public class Task12 {
    public static BigDecimal benefit(BigDecimal sum, BigDecimal percent) {
        return sum.multiply(BigDecimal.ONE.add(percent).pow(12)).setScale(9, BigDecimal.ROUND_HALF_UP);
    }

    public static void main(String[] args) {
        BigDecimal balance = new BigDecimal(500).setScale(9, BigDecimal.ROUND_HALF_UP);
        BigDecimal percent = new BigDecimal(0.00000001f).setScale(9, BigDecimal.ROUND_HALF_UP);

        System.out.println("Сумма на счете через год: " + benefit(balance, percent));
    }
}