package com.example.task11;

public class Task11 {

    public static float benefit(float sum, float percent) {
        float accumulation = 0f;
        for (int i = 1; i <= 12; i++) {
            accumulation += (accumulation + sum) * percent;
        }
        return sum + accumulation;
    }

    public static void main(String[] args) {
    }

}
