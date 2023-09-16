package com.example.task03;

public class Task03 {

    public static double getMetreFromCentimetre(double centimetre) {

        return centimetre/100;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        double result = getMetreFromCentimetre(345.00);
        System.out.println(result);

    }

}
