package com.example.task12;

import java.math.BigDecimal;

public class Task12 {
    public static BigDecimal benefit(BigDecimal sum, BigDecimal percent) {
        BigDecimal multiplier = percent.add(BigDecimal.ONE);
        for (int i = 0; i < 12; i++) {
            sum = sum.multiply(multiplier);
        }

        return sum.setScale(9, BigDecimal.ROUND_HALF_UP);
    }
}
