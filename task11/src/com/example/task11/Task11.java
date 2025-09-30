package com.example.task11;
import java.math.BigDecimal;

public class Task11 {

    public static float benefit(float sum, float percent) {

        double dSum = sum;
        double dPercent = percent;

        for (int i = 1; i <= 12; i++){
            dSum += dSum * dPercent;
        }
        return (float) dSum;
    }

    public static void main(String[] args) {

        float sum = 500; // 500 руб. на счете
        float percent = 0.00000001f; // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
