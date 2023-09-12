package com.example.task11;

public class Task11 {

    public static float benefit(float sum, float percent) {

        // TODO исправьте функцию, чтобы избежать накопления ошибки

        float cleanBenifits = 0f;
        float x = 0f;
        float error = 0f;
        for (int i = 1; i <= 12; i++) {
            cleanBenifits = sum * percent - error;
            x = sum + cleanBenifits;//нужно чтобы получить новое число с ошибкой для его последующего удаления
            error = (x - sum) - cleanBenifits;
            sum = x;
        }
        return sum;
    }

    public static void main(String[] args) {

        float sum = 500; // 500 руб. на счете
        float percent = 0.00000001f; // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
