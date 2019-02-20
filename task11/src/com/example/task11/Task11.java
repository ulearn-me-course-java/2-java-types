package com.example.task11;

public class Task11 {
    public static float benefit(float sum, float percent) {
        return (float)(sum * Math.pow(percent + 1.0d, 12));
    }

    public static void main(String[] args) {
        float balance = benefit(500, 0.00000001f);
        System.out.println("Сумма на счете через год: " + balance);
    }
}